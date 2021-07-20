package desafioModulo;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		int soma1 =0;
		int  tent  = 0;
				
				Scanner entrada = new Scanner(System.in);
while (tent >= 0) {
				System.out.println("Digite um número");
				tent = entrada.nextInt();
				soma1 += tent;
				if (tent < 0) {
					soma1 -= tent;
						} 
				System.out.println("A soma total vale: " + soma1);
}

System.out.println("FIM!!");
				entrada.close();

	}

}
