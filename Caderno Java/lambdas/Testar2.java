package lambdas;

public class Testar2 {
	public static void main(String[] args) {
		
		// usando par de chaves e return
		Calculo calc = (x,y)->{return x+y;};
		System.out.println(calc.executar(2, 3));
		
		
		// sem par de chaves, return é implícito
		calc = (x , y) -> x*y;
		System.out.println(calc.executar(2, 3));
		
		
	}

}
