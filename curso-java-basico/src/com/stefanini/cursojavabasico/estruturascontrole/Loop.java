package com.stefanini.cursojavabasico.estruturascontrole;

public class Loop {

	public static void main(String[] args) {
		int count = 101;
		
		while (count<100) {
		System.out.println("count: " +count);
		count++;
		}
		
		int count2 = 101;
		do {
			System.out.println("count2: " + count2);
			count2++;
		}while(count2<100);
		
//		for normal
		for(int i=0; i<100;i++) {
			System.out.println("i: "+ i);
		}
//		for com areas ausentes
		int i = 0;
		for(;i <100 ;) {
			System.out.println("i: "+ i);
			i++;
		}
//		for com todas areas ausentes
		for(;;) {
			System.out.println("for infinito");
		}
		
//		foreach
		

	}

}
