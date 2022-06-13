package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class BMW extends Carro implements Conversivel, Utilitario {

	public BMW() {
		super();
	}

	@Override
	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return "" + velocidadeFinal / tempoFinal;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("BMW Piscando alerta...");

	}

	@Override
	public void acionarTurbo() {
		System.out.println("BMW Acionando Turbo...");

	}

	@Override
	public void passear() {
		System.out.println("BMW Passeando...");
		
	}

}
