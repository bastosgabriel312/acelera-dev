package br.com.stefanini.vetores;

public class Vetores {

	public static void main(String[] args) {
		int[] notas = new int[10];
		notas[0] = 5;
		notas[3] = 9;
		
		int[][] matriz = new int[5][5];
		matriz[0][1] = 5;
		matriz[2][4] = 10;
		matriz[3][2] = 15;
		
		for (int[] m : matriz) {
			for (int v : m) {
				System.out.println(v);
			}
		}
		
		
		
		String[] meses = new String[] {"Janeiro","Fevereiro","Março","Abril","Maio"};
		
		for (int i=0; i<=9; i++) {
			System.out.println(notas[i]);
		}
		
		
		for (String string : meses) {
			System.out.println(string);
		}
		
		
	}
	
}
