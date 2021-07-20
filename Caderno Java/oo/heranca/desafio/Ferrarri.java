package oo.heranca.desafio;

public class Ferrarri  extends Carro {

	
	public  Ferrarri (){
		this(315);
	}
	
	public Ferrarri (int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 8;
	}
	
	/*
	void  acelerar () {
		if (velocidade < 100) {
			velocidade += 8 ;
		}
	}
	 
	 */

}
