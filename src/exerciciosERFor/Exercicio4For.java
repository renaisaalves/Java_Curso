package exerciciosERFor;

import java.util.Scanner;

public class Exercicio4For {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 4) Fazer um programa para ler um número N. Depois leia N pares de números e
		// mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		// mostrar a mensagem "divisao impossivel".

		int n = scan.nextInt();

		for (int i=0; i<n; i++) {
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			double divisao = n1 / n2;
			if (divisao == 0) {
				System.out.println("Divisão impossível");
				}
			System.out.println(divisao);
		}
		
		
		
		scan.close();
	}

}
