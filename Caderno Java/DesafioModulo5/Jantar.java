package DesafioModulo5;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida ("Feijoada", 0.560);
		Comida c2 = new Comida ("Churrasco", 0.480);
		
		Pessoas p1 = new Pessoas ("Cláudio", 80 );
		Pessoas p2 = new Pessoas ("Isabella", 54 );
		
		System.out.println(p2.apresentar());
		p2.comer(c1);		
		System.out.println(p2.apresentar());
		p2.comer(c2);		
		System.out.println(p2.apresentar());
		
		System.out.println(p1.apresentar());
		
		
		
	}

}
