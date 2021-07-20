package desafioModulo;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);

		System.out.println("Nota 1:");
		int nota1 = entrada.nextInt();
		System.out.println("Nota2");
		int nota2 = entrada.nextInt();
		int media = (nota1+nota2)/2;
		
		if (media >=7 && media <10) {
			System.out.println("Aprovado");
		}else if (media >4 && media <7) {
			System.out.println("Recuperação");
		}else if (media >=0 && media <=4) {
			System.out.println("Reprovado");
		}
			
		
		

		entrada.close();
System.out.println("FIM");
	}

}
