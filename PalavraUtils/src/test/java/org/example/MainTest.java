package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void test(){
        String saudacao = Main.saudacao();
        System.out.println("Saudacao retornada: " + saudacao);
        Assert.assertEquals("Hello, World!", saudacao);
    }
}