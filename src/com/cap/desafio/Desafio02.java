package com.cap.desafio;

import java.util.Collections;
import java.util.List;

public class Desafio02 {
    public int calculaParesVetorDiferencaX(List<Integer> entrada, int x) {

        int pares = 0;
        Collections.sort(entrada, Collections.reverseOrder());
        for (Integer valor1 : entrada) {
            for (Integer valor2 : entrada) {
                if (valor1 - valor2 == x ){
                    pares++;
                }

            }

        }
        return pares;
    }

}
