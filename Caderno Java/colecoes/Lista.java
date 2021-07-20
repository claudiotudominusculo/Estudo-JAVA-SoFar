package colecoes;

import java.util.ArrayList;

public class Lista {
public static void main(String[] args) {
	
	ArrayList<Usuario> lista = new ArrayList<Usuario>();
	
	Usuario u1 = new Usuario("Isabella Pimenta");
	
	lista.add(u1);
	lista.add(new Usuario("Cláudio Rocha"));
	lista.add(new Usuario("Lays Oliveira"));
	lista.add(new Usuario("Robledo Barbosa"));
	lista.add(new Usuario("Ozzy Osbourne"));
	
	System.out.println(lista.get(1)); //Acessar pelo indice da lista;
	System.out.println("");
	System.out.println(">>>>>>" + lista.remove(4)); //Remover pelo print, ele printa o excluído
	System.out.println("");
	System.out.println(lista.remove(new Usuario ("Robledo Barbosa"))); 
	// Só funciona pelo fato de loadar Equals() HashCode()
	//Retorna valor booleano
	
	for (Usuario list : lista) {
		
		System.out.println(list.nome);
	}
	System.out.println(lista.contains(new Usuario ("Lays Oliveira")));
}
}
