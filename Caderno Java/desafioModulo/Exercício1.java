package desafioModulo;

import java.util.Scanner;

public class Exerc�cio1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int num = entrada.nextInt();
		if (num <0 || num >10) {
			;
			
		}else  {
			System.out.println("Est� entre 0 e 10");
		}
if (num %2 == 0) {
	System.out.println("� par");
	
}else {
	System.out.println("� impar");
}
		entrada.close();
System.out.println("FIM");
	}

}
