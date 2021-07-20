package oo.heranca.tester;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrarri;
import oo.heranca.desafio.Fusca;

public class Dirigir {
	
	public static void main(String[] args) {
		
		Ferrarri ferrari = new Ferrarri();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		Carro c1 = new Carro(200);
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		Fusca fusca = new Fusca();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();
		fusca.frear();

		System.out.println(ferrari.velocidade);		
		System.out.println(c1.velocidade);		
		System.out.println(fusca.velocidade);		
	}

}
