package desafioModulo;

import java.util.Scanner;


public class Exercicio6 {
	
	public static void main(String[] args) {
		
		
		
	int loteria = 75;
		int tent = 0;
		int shots = 10;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Voce tem 10 tentativas pra ganhar na loteria");
		

		while ( tent !=  loteria ||  shots <= 0) {
			System.out.println("Tente um número");
			tent = entrada.nextInt();
			shots--;
			System.out.println("Tentativa " + shots );
			if (tent > loteria ) {
				System.out.println("O número real é menor");
			} else if (tent == loteria) {
			System.out.println("Acertou carai");	
			}else {
					System.out.println("O número real é maior");
			}
				
			
			}
		
		System.out.println("FIM");
		

		
		entrada.close();

				
	}

}
