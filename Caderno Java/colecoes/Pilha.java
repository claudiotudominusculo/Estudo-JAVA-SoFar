package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		
		//Seguindo exatamente a mesma l�gica da fila
		// E ainda tendo as mesmas fun��es ponto;
		//livros.size();
		//livros.clear();
		//livros.isEmpty();
		//livros.contains();
		
	}

}
