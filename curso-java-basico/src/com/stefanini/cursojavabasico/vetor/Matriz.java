package com.stefanini.cursojavabasico.vetor;

import java.util.Random;

public class Matriz {
	public static void main(String[] args) {
		// usando random para preencher notas
		Random gerador = new Random();
		// Pesquisa utilizando Matrizes

		// nomeMatriz [índiceLinha] [índiceColuna]
		int[][] notas = new int[3][3]; // matriz com 3 linhas e 3 colunas
		notas[0][0] = 1; // preenchendo celula da primeira linha e primeira coluna
		notas[1][0] = 4; // preenchendo celula da segunda linha e primeira coluna
		notas[2][2] = 9; // preenchendo celula da ultima linha e ultima coluna
		
		// listando matriz
		for (int[] is : notas) {
			for (int is2 : is) {
				//usando print para maior entendimento
				System.out.print(is2 + " ");
				
			}
				// quebra de linha
				System.out.println(" ");
		}
	}
}
