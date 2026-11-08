package actividad01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Actividad01Test {

    @Test
    void pruebaSalidaEsperada() throws Exception {
        assertEquals("Hola mundo", ejecutarMain());
    }

    private String ejecutarMain() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(buffer, true, "UTF-8"));
        try {
            Actividad01.main(new String[0]);
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
