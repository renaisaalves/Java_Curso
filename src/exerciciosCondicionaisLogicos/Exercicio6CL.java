package exerciciosCondicionaisLogicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6CL {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// 6) Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		double value = scan.nextDouble();
		
		if (value >= 0 && value <= 25) {
			System.out.println("Intervalo [0, 25]");
		} else if (value > 25 && value <= 50) {
			System.out.println("Intervalo [25, 50]");
		} else if (value > 50 && value <= 75) {
			System.out.println("Intervalo [50, 75]");
		} else if (value > 75 && value <= 100) {
			System.out.println("Intervalo [75, 100]");
		} else {
			System.out.println("Fora de intervalo.");
		}
		
		scan.close();

	}
}
