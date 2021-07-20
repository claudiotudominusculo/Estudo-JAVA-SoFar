package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome= p -> System.out.println(p.nome);

		
		Produto p1 = new Produto("Mouse", 9.90, 0.15);
		//imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Teclado", 5.6, 0.10);
		Produto p3 = new Produto("Tela", 560, 0.18);
		Produto p4 = new Produto("Notebook", 2500, 0.20);
		Produto p5 = new Produto("Calculadora", 250, 0.35);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		
	}

}
