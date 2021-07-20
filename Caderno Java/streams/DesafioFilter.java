package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	
	public static void main(String[] args) {
		
		Instrumento i1 = new Instrumento ("Cavaco", "Cordas", false);
		Instrumento i2 = new Instrumento ("Violão", "Cordas", false);
		Instrumento i3 = new Instrumento ("Bateria", "Percussão", true);
		Instrumento i4 = new Instrumento ("Saxofone", "Sopro", true);
		Instrumento i5 = new Instrumento ("Cello", "Cordas", true);
		Instrumento i6 = new Instrumento ("Piano", "Percussão", true);
		Instrumento i7 = new Instrumento ("Gaita", "Sopro", false);
		Instrumento i8 = new Instrumento ("Guitarra", "Cordas", false);
		Instrumento i9 = new Instrumento ("Marimba", "Percussão", true);
		Instrumento i10 = new Instrumento("Flauta", "Sopro", true);
		
		List<Instrumento> insts = Arrays.asList(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10);
		Predicate<Instrumento> tipoInst = i -> i.tipo == "Sopro";
		Predicate<Instrumento> temOrq = i -> i.temOrquestra;
		Function<Instrumento, String> constatacao = i -> "Existe " + i.nome + " na orquestra!";
				
		insts.stream()
			.filter(tipoInst)
			.filter(temOrq)
			.map(constatacao)
			.forEach(System.out::println);
		
		
		
		
	}
}
