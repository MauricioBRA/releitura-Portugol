package br.com.generatio.releituraPortugol;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		/*
		 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo
		 * ao consumidor.
		 */

		Scanner entrada = new Scanner(System.in);

		double custofab, custoconsu, distribuidor;

		System.out.println("Digite o custo da f�brica: ");
		custofab = entrada.nextDouble();

		distribuidor = custofab + (custofab * 0.28);
		custoconsu = distribuidor + (distribuidor * 0.45);

		System.out.println("O custo do consumidor é de: " + custoconsu);

		entrada.close();
	}

}
