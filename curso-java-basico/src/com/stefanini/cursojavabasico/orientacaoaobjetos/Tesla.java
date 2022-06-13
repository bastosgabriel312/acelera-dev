package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Tesla extends Carro {

	private boolean dirigeSozinho;

	public Tesla() {
		super();
		
	}
	
	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}
	
	@Override
	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return ""+ velocidadeFinal * tempoFinal;
	}
	
	@Override
	public void piscarAlerta() {
		System.out.println("Tesla Piscando alerta...");
		
	}


	
}
