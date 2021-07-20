package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	//Suprimindo avisos 
	
	
	public static void main(String[] args) {
	
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //Tipos primitivos serão convertidos para Classe 
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
	
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
	
		/*
		//Uniao entre dois conjuntos
		
		conjunto.addAll(nums);     	
		System.out.println(conjunto);
		 */

		
		/*
		 * Interseção dos conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		 */
		
		// Limpar conjunto
		
		conjunto.clear();
		System.out.println(conjunto);
}
}
