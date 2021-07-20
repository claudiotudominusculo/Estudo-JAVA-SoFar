package desafioModulo;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Numero, meu querido...");
		int fat =entrada.nextInt();
		
		switch (fat) {
		case 2: case 3: case 5: case 7:{
			System.out.println("É primo");
		}
			break;
			
			case 1: case 0:{
				System.out.println("Não é primo");
				break;
				
			}
			default:
				if (fat %2 == 0 || fat%3 ==0 ) {
					System.out.println("Não é primo");
				}else
					System.out.println("É primo");
				
					break;
					
		}

		entrada.close();

	}

}
