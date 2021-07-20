package oo.heranca.tester;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
	
		Heroi  heroi = new Heroi();
		heroi.x=10;
		heroi.y=10;
	
		Monstro monstro= new Monstro();
		monstro.x=10;
		monstro.y=11;
	
	 // Para andar:	
	/*j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
    	j1.andar(Direcao.LESTE);
    	j1.andar(Direcao.LESTE);
	*/
    	System.out.println(heroi.x);		
    	System.out.println(heroi.y);		
    	
    // Para atacar:
    	
    	System.out.println("Herói tem -> " + heroi.vida);	
    	System.out.println("Monstro tem -> " + monstro.vida);	
    	
    	
			
    	heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Herói tem -> " + heroi.vida);	
		System.out.println("Monstro tem -> " + monstro.vida);	
			
		
	}

}
