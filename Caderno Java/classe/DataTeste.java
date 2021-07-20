package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(2,3,1991);
		Data d2 = new Data(11,07 ,1992);
		Data d3= new Data();
		
		System.out.println("O nascimento de Cláudio é " + d1.obterDataFormatada());		
		System.out.println("O nascimento de Isa é " + d2.obterDataFormatada());		
        System.out.println("O marco zero é " + d3.obterDataFormatada());	
        
		
		/*Data dia1= new Data();
		
		dia1.dia=02;
		dia1.mes=03;
		dia1.ano=1991;
		
		var dia2 = new Data()	;
		
		dia2.dia=11;
		dia2.mes=07;
		dia2.ano=1992;
		
		
		
		/*System.out.printf("Seu nascimento é %d/%d/%d, e o da Isa é %d/%d/%d"
				, dia1.dia,dia1.mes,dia1.ano,dia2.dia,dia2.mes,dia2.ano);
        System.out.println("O aniversário da Isa é " + dia2.obterDataFormatada() + "\nE o do Cláudio é " + dia1.obterDataFormatada());
		*/
		
	}

}
