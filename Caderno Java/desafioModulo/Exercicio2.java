package desafioModulo;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("Em que ano estamos?");
	int ano = entrada.nextInt();
	if(ano %4 ==0) {
		System.out.println("É ano bissexto");
	}

	entrada.close();
System.out.println("FIM");
}
}
