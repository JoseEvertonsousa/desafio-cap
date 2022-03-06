package com.cap.desafio;

import java.util.Collections;
import java.util.List;

public class Desafio1 {


    public int mediana(List<Integer> arrays) {

        //Ordenando a lista.
        Collections.sort(arrays);
        //Pegando a posiçao do meio do array.
        int meio = (arrays.size() / 2);

        return arrays.get(meio);

    }
}
