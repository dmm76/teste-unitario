package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PalavrasUtilsTeste {

    @Test
    public void testContarPalavrasTextoNenhumPalavraSucesso() {
        String texto = "";
        int palavras = PalavrasUtils.countPalavras(texto);
        Assert.assertEquals(0, palavras);
        System.out.println(palavras);
    }
    @Test
    public void testContarPalavrasTextoPalavraSucesso() {
        String texto = "Ola, mundo maravilhoso";
        int palavras = PalavrasUtils.countPalavras(texto);
        Assert.assertEquals(3, palavras);
        System.out.println(palavras);
    }

    @Test
    public void testContarPalavrasTextoEspacosPalavraSucesso() {
        String texto = "Ola, mundo    maravilhoso";
        int palavras = PalavrasUtils.countPalavras(texto);
        Assert.assertEquals(3, palavras);
        System.out.println(palavras);
    }

    @Test
    public void testContarPalavrasNumerosPalavraSucesso() {
        String texto = "1, 2, 3, 4, 5, 6, 7, 8, 9  10";
        int palavras = PalavrasUtils.countPalavras(texto);
        Assert.assertEquals(10, palavras);
        System.out.println(palavras);
    }

}
