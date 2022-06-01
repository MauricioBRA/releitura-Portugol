package br.com.generatio.releituraPortugol;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * 4. Escreva um sistema que leia trás números inteiros e positivos (A, B, C) e
		 * calcule a seguinte expressão: r = (a+b) * (a+b) s = (b+c) * (b+c) d = (r +
		 * s)/2
		 */

		Scanner entrada = new Scanner(System.in);

		int a, b, c, d, r, s;

		System.out.println("Digite o n�mero A: ");
		a = entrada.nextInt();

		System.out.println("Digite o n�mero B: ");
		b = entrada.nextInt();

		System.out.println("Digite o n�mero C: ");
		c = entrada.nextInt();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);

		d = (r + s) / 2;
		System.out.println("O valor de d é: " + d);

		entrada.close();
	}

}
