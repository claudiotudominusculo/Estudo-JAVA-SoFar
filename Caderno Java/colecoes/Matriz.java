package colecoes;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
System.out.println("Quantos alunos ??");
int array1 = entrada.nextInt();
System.out.println("E quantas notas ???");
int array2 = entrada.nextInt();

	double [][] notasTurma = new double [array1][array2];
	double soma = 0;
	
	
	for (int a = 0; a < notasTurma.length; a++) {
		for (int n = 0; n < notasTurma[a].length; n++) {
			System.out.printf("\n Informe a nota %d do aluno %d  ", n+1, a+1 );
			notasTurma[a][n]= entrada.nextDouble();
			soma += notasTurma[a][n];
		}
		
	}
	
	double media = soma / (array1*array2);
	
		System.out.println("\nA média vale " + media );
		
		// Imprimindo o Array notas na Tela
		//O mais instintivo é fazer o seguinte:
		System.out.println("\n\nIsso nao vai funcionar");
		System.out.println(Arrays.toString(notasTurma));
		System.out.println("\n\n");
		
		//No entanto, não funciona...
		//Então criamos uma variável em ForEach (notasAlunos) apenas para impressão:...
		
		for (double [] notasAlunos : notasTurma) {
			System.out.println(Arrays.toString(notasAlunos));
			
		}

		entrada.close();

	}

}
