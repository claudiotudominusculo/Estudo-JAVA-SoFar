package colecoes;

public class ForEach {
	public static void main(String[] args) {
		
		// Percorrer o Array de forma mais simples
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4};
		
		//Percorrer por incremento
		
		for (int i =0 ; i<notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
	
		System.out.println();
		
		
		//Percorrer por ForEach
		
		for (double nota: notas) {
			System.out.print(nota + " ");
		}
	
	
	}
	

}
