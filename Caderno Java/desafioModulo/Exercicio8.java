package desafioModulo;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int tamanho = 0;
	System.out.println("Escreva uma palavra qualquer");
	String quotation = entrada.next();
	quotation.toUpperCase();
	tamanho = quotation.length();
	
	tamanho = tamanho -1 ;
	while (tamanho >=0) {
		
		System.out.println(quotation.charAt(tamanho));
		tamanho -- ;
	}
	

	entrada.close();

}
}
