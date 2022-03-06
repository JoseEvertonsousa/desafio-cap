package com.cap.desafio;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Desafio01Test {


    @Test
    void mediana() {
        Desafio1 desafio1= new Desafio1();

        int mediana1 = desafio1.mediana(Arrays.asList(9,2,1,4,6));
        int mediana2 = desafio1.mediana(Arrays.asList(7,14,3));
        int mediana3 = desafio1.mediana(Arrays.asList(4,12,1,25,33,15,45,61,44));

        assertEquals(4,mediana1);
        assertEquals(7,mediana2);
        assertEquals(25,mediana3);

    }
}