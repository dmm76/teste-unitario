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
}
