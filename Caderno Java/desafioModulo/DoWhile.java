package desafioModulo;

import java.util.Scanner;

public class DoWhile {
	
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
double total = 0;
double nota = 0;
int notasValidas = 0;

while (nota != -1) {
	System.out.println("--------------------");
	System.out.println("-----NOTA-----");
	System.out.println("--------------------");
	nota = entrada.nextDouble();
	 if(nota <0 || nota>10) {
	 System.out.println("Nota Inválida"); }
	 else {
		 total += nota; 
		 notasValidas++;
	 }
}

System.out.println("Total: " + total);
System.out.println("Média " + (total/notasValidas));
System.out.println("Notas válidas " + notasValidas);

if ((total/notasValidas) >=7) {
	System.out.println("Turma sensacional.");
	
}else {
	System.out.println("Turma Fraca!!!");
	
}

entrada.close();

}
}

