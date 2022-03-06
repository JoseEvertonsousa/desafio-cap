package com.cap.desafio;

public class Desafio03 {
    public String encriptarTexto(String texto) {
        String textoSemEspaço = texto.replace(" ", "");
        char[] arraytexto = textoSemEspaço.toCharArray();
        Double raizTamanhoTexto = Math.ceil(Math.sqrt(textoSemEspaço.length()));
        int tamanhoMatrix = raizTamanhoTexto.intValue();
        int linha = 0;
        int coluna = 0;
        char[][] grid = new char[tamanhoMatrix][tamanhoMatrix];
        StringBuilder saida = new StringBuilder();
        for (int f = 0; f < arraytexto.length; f++) {

            grid[linha][coluna] = arraytexto[f];
            coluna++;
            if (coluna == tamanhoMatrix) {
                coluna = 0;
                linha++;

            }


        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                //Verificar se o Char é vazio.
                if(grid[j][i] != 0){
                    saida.append(grid[j][i]);
                }

            }
            saida.append(" ");


        }
        return saida.toString().trim();
    }
}
