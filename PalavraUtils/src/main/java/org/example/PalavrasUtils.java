package org.example;

public class PalavrasUtils {
    public static int countPalavras(String texto) {
        return texto.trim().split("\\s+").length;
    }
}
