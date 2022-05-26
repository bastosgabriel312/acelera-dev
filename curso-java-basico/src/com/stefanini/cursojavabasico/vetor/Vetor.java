package com.stefanini.cursojavabasico.vetor;

public class Vetor {
	
	public static void main(String[] args) {
		int[] notas = new int[10];
		
		notas[2] = 5;
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;
		
		String[] carro = new String[] {"Fiat Uno", "Mercedes", "Classic", "Tesla"};
	
		for (String string2 : carro) {
			System.out.println(string2);
		}
		
//		for (int i = 0 ; i < notas.length;i++) {
//			System.out.println(notas[i]);
//		}
	}

}
