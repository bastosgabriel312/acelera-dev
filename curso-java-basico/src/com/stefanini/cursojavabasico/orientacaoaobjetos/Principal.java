package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Principal {

	public static void main(String[] args) {
		Carro bmw = new Carro();
		bmw.setMarca("BMW");
		bmw.setModelo("M3");
		bmw.setQuilometrosPorLitro(7.5);
		bmw.setVelocidadeMaxima(200);
		
		BMW bmw2 = new BMW();
		Carro mercedes = new Carro("Mercedes","c180");
		
		System.out.println(bmw2.calcularTaxaAceleracao(100, 10));
		System.out.println(mercedes.getMarca());
		System.out.println(mercedes.getModelo());
		
		System.out.println(bmw.getModelo());
		System.out.println(bmw.getMarca());
		System.out.println(bmw.getQuilometrosPorLitro());
		System.out.println(bmw.getVelocidadeMaxima());
		
		bmw.acelerar();
		bmw.freiar();
		
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
		System.out.println(bmw.calcularTaxaAceleracao(100,5));
		
	}
}
