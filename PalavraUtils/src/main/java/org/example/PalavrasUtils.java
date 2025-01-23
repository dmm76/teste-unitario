package org.example;

public class PalavrasUtils {
    public static int countPalavras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0; // Retorna 0 para strings vazias ou nulas
        }
        return texto.trim().split("\\s+").length;
    }
}

