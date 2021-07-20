package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
	
	Aluno aluno1 = new Aluno ("Cl�udio");
	Aluno aluno2 = new Aluno ("Isabella");
	Aluno aluno3 = new Aluno ("Paulo");
	
	Curso curso1 = new Curso ("F�sica");
	Curso curso2 = new Curso ("Matem�tica");
	Curso curso3 = new Curso ("Hist�ria");

	curso1.adicionarAluno(aluno1);
	curso1.adicionarAluno(aluno2);
	
	curso2.adicionarAluno(aluno1);
	curso2.adicionarAluno(aluno3);
	
	aluno1.adicionarCurso(curso3);
	aluno2.adicionarCurso(curso3);
	aluno3.adicionarCurso(curso3);
	
	System.out.println("Est�o matriculados no curso de " + curso1.nome);
	for(Aluno aluno : curso1.alunos) {
		System.out.println(aluno.nome);
	}
System.out.println();
	System.out.println("Est�o matriculados no curso de " + curso2.nome);
	for(Aluno aluno : curso2.alunos) {
		System.out.println(aluno.nome);
	}
System.out.println();		
		
		System.out.println("Est�o matriculados no curso de " + curso3.nome);
	for(Aluno aluno : curso3.alunos) {
		System.out.println(aluno.nome);
	}

	System.out.println();	
	System.out.println("O aluno(a) " +aluno1.nome + " est� matriculado(a) nos cursos");
	for(Curso curso : aluno1.cursos) {
		System.out.println(curso.nome);
	}
	System.out.println();	
	System.out.println("O aluno(a) " +aluno2.nome + " est� matriculado(a) nos cursos");
	for(Curso curso : aluno2.cursos) {
		System.out.println(curso.nome);
	}
	
	}
	
}
