package desafioModulo;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com um n�mero:");
		double num = entrada.nextDouble();
		if(num == 2 || num ==3 || num ==5) {
			System.out.println("� primo");
			}
		 else if (num==1||num%2 ==0 || num %3 == 0 || num %5 == 0) {
		
			System.out.println("N�o � primo");
		}else
			System.out.println("� primo");

		entrada.close();

	}


}
