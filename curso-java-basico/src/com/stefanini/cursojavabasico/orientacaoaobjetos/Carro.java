package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Carro {

	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitro;

	/*
	 * default - Não tem palavra chave, é acessivel somente no mesmo pacote public -
	 * Acessível própria classe, classe mesmo pacote, demais classes, subclasses.
	 * private - Acessível somente dentro da própria classe. protected - acessível
	 * somente na classe e subclasses.
	 * 
	 */

	public Carro() {

	}

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		
	}

	public void acelerar() {
		System.out.println("Acelerando...");

	}

	public void freiar() {
		System.out.println("Freiando...");

	}

	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal,
			double tempoInicial) {
		return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
	}

	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return "" +(velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) throws NegocioException{
		if (velocidadeMaxima < 0) {
			throw new NegocioException("Valor é inválido");
		} else {
			this.velocidadeMaxima = velocidadeMaxima;

		}
	}

	public int getTaxaAceleracao() {
		return taxaAceleracao;
	}

	public void setTaxaAceleracao(int taxaAceleracao) {
		this.taxaAceleracao = taxaAceleracao;
	}

	public double getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}

	public void setQuilometrosPorLitro(double quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}

}
