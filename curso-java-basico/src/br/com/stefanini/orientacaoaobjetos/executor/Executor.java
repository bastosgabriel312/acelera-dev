package br.com.stefanini.orientacaoaobjetos.executor;

import br.com.stefanini.orientacaoaobjetos.Carro;
import br.com.stefanini.orientacaoaobjetos.Mercedes;
import br.com.stefanini.orientacaoaobjetos.entidade.BMW;

public class Executor {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		carro1.setMarca("BMW");
		carro1.setModelo("320i");
		carro1.setChassi(9999);
		carro1.setPlaca("AAA9599");
		carro1.setBancos(5);
		carro1.setRoda(20);
		carro1.setVelocidade(280);

		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getBancos());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getRoda());
		System.out.println(carro1.getChassi());

		System.out.println(carro1.acelerar());

		Carro carro2 = new Carro("Mercedes");
		System.out.println(carro2.getMarca());

		System.out.println(soma(1, 2));
		System.out.println(soma(1, 2, 3));

		BMW bmw = new BMW();

		bmw.setVelocidade(100);
		System.out.println(bmw.acelerar());
		
		Mercedes mercedes = new Mercedes();
		mercedes.setVelocidade(200);
		System.out.println(mercedes.acelerar());

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int soma(int a, int b, int c) {
		return a + b + c;
	}

}
