package DesafioModulo5;

public class Pessoas {

	String nome;
	double peso;
	
	Pessoas (String nome, double peso){
		this.nome= nome;
		this.peso = peso;
		
	}
	Pessoas(){
		
	}
	
	
	void comer (DesafioModulo5.Comida comida ) {
		if(comida != null) {
			this.peso +=  comida.pesoPrato ;
			}
	}
		
	String apresentar(){
		return "Olá, eu sou " + nome +" e tenho " + peso + " Kgs";
	}

}
