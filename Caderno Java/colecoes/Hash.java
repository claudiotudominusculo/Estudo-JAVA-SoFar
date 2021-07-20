package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash {
public static void main(String[] args) {
	
	HashSet <Usuario> usuarios = new HashSet<Usuario>();
	
	usuarios.add(new Usuario("Carlos Antonio"));
	usuarios.add(new Usuario("Maria Izabel"));
	usuarios.add(new Usuario("Ana Vitoria"));
	
	System.out.println(usuarios.contains(new Usuario("Ana Vitoria")));
	
	System.out.println(usuarios.toString());
	

}
}
