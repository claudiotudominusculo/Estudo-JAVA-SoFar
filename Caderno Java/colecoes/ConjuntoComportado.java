package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
	//	Set <String> lista = new HashSet<>();
	// Indexando a lista atraves da árvore
		
		SortedSet <String> lista = new TreeSet<>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Lucca");
		lista.add("Pedro");
		
		System.out.println(lista);
		//Imprimindo pelo ForEach
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
	}

}
