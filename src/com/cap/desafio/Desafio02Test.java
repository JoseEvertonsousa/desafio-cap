package com.cap.desafio;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Desafio02Test {

    @Test
    void calculaParesVetorDiferencaX() {
        Desafio02 desafio02 = new Desafio02();
        List<Integer> entrada = Arrays.asList(1, 5, 3, 4, 2);;
        int x1= 2;
        int x2 = 1;
        int quantidadeDePares1 = desafio02.calculaParesVetorDiferencaX(entrada, x1);
        int quantidadeDePares2 = desafio02.calculaParesVetorDiferencaX(entrada, x2);

        assertEquals(3,quantidadeDePares1);
        assertEquals(4,quantidadeDePares2);


    }
}