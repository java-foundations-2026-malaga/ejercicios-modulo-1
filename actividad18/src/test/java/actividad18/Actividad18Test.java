package actividad18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class Actividad18Test {

    @Test
    void pruebaSalidaEsperada() throws Exception {
        assertEquals("Pedro", ejecutarMain());
    }

    @Test
    void pruebaUsaVariableString() throws Exception {
        String codigo = leerCodigoFuente();
        assertFalse(codigo.contains("___"), "Sustituye los guiones bajos por el valor de la variable");
        assertTrue(Pattern.compile("String\\s+nombre\\b").matcher(codigo).find(),
                "Declara la variable String nombre");
        assertTrue(Pattern.compile("print(ln|f)?\\s*\\([^;]*\\bnombre\\b").matcher(codigo).find(),
                "Muestra la variable nombre por pantalla");
    }

    private String leerCodigoFuente() throws Exception {
        Path ruta = Paths.get("src", "main", "java", "actividad18", "Actividad18.java");
        return new String(Files.readAllBytes(ruta), StandardCharsets.UTF_8);
    }

    private String ejecutarMain() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(buffer, true, "UTF-8"));
        try {
            Actividad18.main(new String[0]);
        } finally {
            System.setOut(original);
        }
        return normalizar(buffer.toString("UTF-8"));
    }

    private String normalizar(String salida) {
        String[] lineas = salida.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1);
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < lineas.length; i++) {
            if (i > 0) {
                resultado.append('\n');
            }
            resultado.append(lineas[i].strip());
        }
        return resultado.toString().strip();
    }
}
