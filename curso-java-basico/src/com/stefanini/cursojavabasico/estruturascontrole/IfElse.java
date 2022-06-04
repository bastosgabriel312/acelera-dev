package com.stefanini.cursojavabasico.estruturascontrole;

public class IfElse {

	public static void main(String[] args) {
		int idade = 17;

		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Não é maior de idade");
		}

		if (idade >= 100) {
			System.out.println("Pessoa virou uma múmia");
		} else if (idade >= 18) {
			System.out.println("é maior de idade");
		} else {
			System.out.println("Não é maior de idade");
		}
//
//		if (idade >= 18)
//			System.out.println("Maior de idade");
//		System.out.println("Sua idade é " + idade);
	}
}
