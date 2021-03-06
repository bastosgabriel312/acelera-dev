package com.stefanini.cursojavabasico.orientacaoaobjetos;

import com.stefanini.cursojavabasico.orientacaoaobjetos.entidades.BMW;
import com.stefanini.cursojavabasico.orientacaoaobjetos.entidades.Tesla;

public class Principal {
	static int valor = 10;
	static void print() {
		System.out.println(valor);
	}
	public static void main(String[] args) {
		print();
		
//		Carro bmw = new Carro();
//		bmw.setMarca("BMW");
//		bmw.setModelo("M3");
//		bmw.setQuilometrosPorLitro(7.5);

//		try {
//			bmw.setVelocidadeMaxima(10);
//		} catch (NegocioException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("Passou aqui");
//		}

		BMW bmw2 = new BMW();
//		Carro mercedes = new Carro("Mercedes", "c180");
		BMW bmw3 = null;
		Tesla tesla = new Tesla();
		Carro tesla2 = new Tesla();
		System.out.println(tesla.isDirigeSozinho());
		bmw2.piscarAlerta();
		tesla.piscarAlerta();
		
		// cast
		((Tesla) tesla2).setDirigeSozinho(true);
		System.out.println(((Tesla) tesla2).isDirigeSozinho());

		Carro[] carros = new Carro[] { bmw2, tesla, tesla2 };

		for (Carro carro : carros) {
			if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
				System.out.println("Carro de marca famosa");
			}
			if (carro instanceof Tesla) {
				System.out.println(((Tesla) carro).isDirigeSozinho());
			}
		}
		
		Calcular.soma(1,1);
		

//		Constantes.MARCA_FAMOSA = "Porshe";
		
		System.out.println(bmw2.calcularTaxaAceleracao(50, 2));
		System.out.println(tesla.calcularTaxaAceleracao(50, 2));
//		bmw3.acelerar();

//		System.out.println(bmw2.calcularTaxaAceleracao(100, 10));
//		System.out.println(mercedes.getMarca());
//		System.out.println(mercedes.getModelo());
//		
//		System.out.println(bmw.getModelo());
//		System.out.println(bmw.getMarca());
//		System.out.println(bmw.getQuilometrosPorLitro());
//		System.out.println(bmw.getVelocidadeMaxima());
//		
//		bmw.acelerar();
//		bmw.freiar();
//		
//		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
//		System.out.println(bmw.calcularTaxaAceleracao(100,5));
//		
	}
}
