package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSaudacao() {
        // Testando se o método saudacao pode ser chamado sem erros.
        assertDoesNotThrow(() -> Main.saudacao());
    }
}