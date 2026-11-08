package actividad20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class Actividad20Test {

    @Test
    void pruebaSalidaEsperada() throws Exception {
        assertEquals("Nombre: Laura\nEdad: 22", ejecutarMain());
    }

    @Test
    void pruebaUsaConcatenacion() throws Exception {
        String codigo = leerCodigoFuente();
        assertTrue(Pattern.compile("\\+\\s*nombre\\b").matcher(codigo).find(),
                "Concatena la variable nombre con el operador +");
        assertTrue(Pattern.compile("\\+\\s*edad\\b").matcher(codigo).find(),
                "Concatena la variable edad con el operador +");
    }

    private String leerCodigoFuente() throws Exception {
        Path ruta = Paths.get("src", "main", "java", "actividad20", "Actividad20.java");
        return new String(Files.readAllBytes(ruta), StandardCharsets.UTF_8);
    }

    private String ejecutarMain() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(buffer, true, "UTF-8"));
        try {
            Actividad20.main(new String[0]);
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
