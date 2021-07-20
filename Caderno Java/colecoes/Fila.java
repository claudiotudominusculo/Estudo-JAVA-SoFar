package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	
	Queue<String> fila = new LinkedList<>();

		//Add e Offer adicionam itens na lista;
		// Diferen�a � o comportamento quando a fila est� cheia;
	
	fila.add("Joana"); // Em caso falho de add -> false
	fila.offer("Antonio"); // Em caso falho de offer -> erro de compila��o
	fila.add("Cristina");
	fila.offer("Andressa");

		//Peek e Element obter pr�ximo itens na lista sem remover;
		// Diferen�a � o comportamento quando a fila est� vazia;
	
	
	System.out.println(fila.peek());  // Em caso falho de peek -> null
	System.out.println(fila.element());  // Em caso falho de element -> erro de compila��o
	System.out.println(fila.peek());
	System.out.println(fila.element());
	
		//Poll e Remove obter pr�ximo itens na lista removendo-o;
		// Diferen�a � o comportamento quando a fila est� vazia;
	
	
	System.out.println(fila.remove());	//Em caso de fila vazia -> Erro de compila��o
	System.out.println(fila.poll());			//Em caso de fila vazia -> null
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.size());

	//Outras fun��es 
	//fila.size();
	//fila.clear();
	//fila.isEmpty();
	//fila.contains();
	
}
}
