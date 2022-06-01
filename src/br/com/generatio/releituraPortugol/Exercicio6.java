package br.com.generatio.releituraPortugol;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		/*
		 * Construa um programa em c que, tendo como dados de entrada dois pontos
		 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A
		 * fórmula
		 * que efetua tal cálculo é:
		 */

		Scanner entrada = new Scanner(System.in);

		double i1, i2, j1, j2;
		double p1, p2;
		double d;

		System.out.println("Digite o valor de i do primeiro ponto:\n");
		i1 = entrada.nextDouble();

		System.out.println("Digite o valor de j do primeiro ponto:\n");
		j1 = entrada.nextDouble();

		System.out.println("Digite o valor de i do segundo ponto:\n");
		i2 = entrada.nextDouble();

		System.out.println("Digite o valor de j do segundo ponto:\n");
		j2 = entrada.nextDouble();

		p1 = i1 - i2;
		p1 = Math.pow(p1, 2.0);
		p2 = j1 - j2;
		p2 = Math.pow(p2, 2.0);
		d = p1 + p2;
		d = Math.pow(d, 2.0);

		System.out.println("A distância entre eles é: " + d);

		entrada.close();
	}

}
