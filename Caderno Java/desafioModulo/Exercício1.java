package desafioModulo;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		if (num <0 || num >10) {
			;
			
		}else  {
			System.out.println("Está entre 0 e 10");
		}
if (num %2 == 0) {
	System.out.println("É par");
	
}else {
	System.out.println("É impar");
}
		entrada.close();
System.out.println("FIM");
	}

}
