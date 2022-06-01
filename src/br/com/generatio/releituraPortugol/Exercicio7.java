package br.com.generatio.releituraPortugol;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * 7.Escreva um algoritmo que lê os coeficientes a,b,c,d,e e f e calcula e
		 * mostra os valores de x e y:
		 */

		Scanner entrada = new Scanner(System.in);

		double a, b, c, d, e, f, x, y;

		System.out.println("Digite o valor de a: ");
		a = entrada.nextDouble();

		System.out.println("Digite o valor de b: ");
		b = entrada.nextDouble();

		System.out.println("Digite o valor de c: ");
		c = entrada.nextDouble();

		System.out.println("Digite o valor de d: ");
		d = entrada.nextDouble();

		System.out.println("Digite o valor de e: ");
		e = entrada.nextDouble();

		System.out.println("Digite o valor de f: ");
		f = entrada.nextDouble();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("O valor de x é " + x + " e y � " + y);

		entrada.close();
	}

}
