package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Rose", 9.5);
		Aluno a2 = new Aluno("C�sar", 7.8);
		Aluno a3 = new Aluno("Teixeira", 8.3);
		Aluno a4 = new Aluno("Ivone", 6.3);
		Aluno a5 = new Aluno("Maria", 6);
		Aluno a6 = new Aluno("Jo�o", 8.5);
		
		List<Aluno> alunosLista = Arrays.asList(a1,a2,a3,a4,a5,a6);
		Predicate<Aluno> aprovado = a-> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabens " + a.nome +", vc foi aprovado(a)!!";
		
		alunosLista.stream()
			.filter(aprovado)
			.map( saudacaoAprovado)
			.forEach(System.out::println);
		
	}

}
