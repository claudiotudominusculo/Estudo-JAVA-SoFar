package colecoes;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double [4];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 3.9;
		notasAlunoA[2] = 8;
		notasAlunoA[3] = 5.5;
		
		
		//Opção 1
		String valor1 = Arrays.toString(notasAlunoA);
		System.out.println(valor1);
		
		//Opção 2

		System.out.println(Arrays.toString(notasAlunoA));
		
		//Percorrendo o Array
		//Notação ponto Array length...
		
		double totalA = 0;
		for (int i = 0 ; i < notasAlunoA.length ; i++) {
			totalA += notasAlunoA[i];
		}
		System.out.print( totalA / notasAlunoA.length );
		
		//Outro modo de iniciar array já assimilando valores		
		
		double[] notasAlunoB = { 7.3 , 5.3 , 6.6 , 7};
		
		double totalB=0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
			
		}
		System.out.println("\n\n");
			System.out.println( totalB / notasAlunoB.length);
			System.out.println(Arrays.toString(notasAlunoB));
		
		
		
		
	}

}
