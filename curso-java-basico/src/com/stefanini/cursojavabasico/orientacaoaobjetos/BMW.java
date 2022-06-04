package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class BMW extends Carro {

	@Override
	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return ""+ velocidadeFinal / tempoFinal;
	}

}
