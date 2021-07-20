package fundamentos;

public class relacionais {

	
	public static void main(String[] args) {
	boolean trab1 = false;
	boolean trab2 = false;
			
	boolean compraTV32 = trab1 ^ trab2 ;
	boolean compraTV50 = trab1 && trab2;
	boolean compraSorvete = trab1 || trab2;
	boolean saudavel = !compraSorvete; 
	
	System.out.println("Vai comprar tv de 32\"? " + compraTV32);
	System.out.println("Vai comprar tv de 50\"?  " + compraTV50);
	System.out.println("Vai comprar Sorvete? " + compraSorvete);
	System.out.println("Vai ficar mais saudável? " + saudavel);
	
	System.out.println("2" =="2");
	
	
		
		
}
}
