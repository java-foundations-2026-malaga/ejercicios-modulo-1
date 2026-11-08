package actividad16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class Actividad16Test {

    @Test
    void pruebaSalidaEsperada() throws Exception {
        assertEquals("Hola\nAdiós", ejecutarMain());
    }

    @Test
    void pruebaComentariosDeUnaLinea() throws Exception {
        Matcher comentarios = Pattern.compile("//(?!\\s*TODO)[^\\n]*\\S").matcher(leerCodigoFuente());
        int total = 0;
        while (comentarios.find()) {
            total++;
        }
        assertTrue(total >= 2, "Añade al menos dos comentarios de una línea (//) propios, sin TODO");
    }

    private String leerCodigoFuente() throws Exception {
        Path ruta = Paths.get("src", "main", "java", "actividad16", "Actividad16.java");
        return new String(Files.readAllBytes(ruta), StandardCharsets.UTF_8);
    }

    private String ejecutarMain() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(buffer, true, "UTF-8"));
        try {
            Actividad16.main(new String[0]);
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
