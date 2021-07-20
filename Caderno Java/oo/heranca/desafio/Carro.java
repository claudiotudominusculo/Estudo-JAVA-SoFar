package oo.heranca.desafio;

public class Carro {
	
	public int velocidade;
	final int VELOCIDADE_MAXIMA  ;
	int delta =5;
	
	
		
	
	public  Carro (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
		
	}
	public void  acelerar () {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA ;
		}else {
			velocidade+= delta;
		}
	}
	public void frear () {
		if (velocidade >= 5) {
			velocidade -= 5;
		}else {
			velocidade = 0;
		}
			
	}

}
