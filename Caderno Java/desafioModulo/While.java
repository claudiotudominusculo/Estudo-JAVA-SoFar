package desafioModulo;

import java.util.Scanner;

public class While {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Diga Jovem: ");
			valor = entrada.next();
			
		}
		entrada.close();
	}
}
