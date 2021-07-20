package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	
	Queue<String> fila = new LinkedList<>();

		//Add e Offer adicionam itens na lista;
		// Diferença é o comportamento quando a fila está cheia;
	
	fila.add("Joana"); // Em caso falho de add -> false
	fila.offer("Antonio"); // Em caso falho de offer -> erro de compilação
	fila.add("Cristina");
	fila.offer("Andressa");

		//Peek e Element obter próximo itens na lista sem remover;
		// Diferença é o comportamento quando a fila está vazia;
	
	
	System.out.println(fila.peek());  // Em caso falho de peek -> null
	System.out.println(fila.element());  // Em caso falho de element -> erro de compilação
	System.out.println(fila.peek());
	System.out.println(fila.element());
	
		//Poll e Remove obter próximo itens na lista removendo-o;
		// Diferença é o comportamento quando a fila está vazia;
	
	
	System.out.println(fila.remove());	//Em caso de fila vazia -> Erro de compilação
	System.out.println(fila.poll());			//Em caso de fila vazia -> null
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.size());

	//Outras funções 
	//fila.size();
	//fila.clear();
	//fila.isEmpty();
	//fila.contains();
	
}
}
