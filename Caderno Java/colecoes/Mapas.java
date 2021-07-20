package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapas {

	public static void main(String[] args) {
		
		Map<Integer, String>  users =new HashMap<>();
		
		users.put(1," Rocha");
		users.put(2," Pimenta");
		users.put(4," Almodovar");
		users.put(37," Coen");
		
		System.out.println(users.size());
		System.out.println(users.get(37));
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		System.out.println(users.containsKey(2));
		System.out.println(users.containsValue(" Coen"));
		
		//Percorrer valores
		
		for (int chave : users.keySet()) {
			
			System.out.println(chave);
		}
		for (String valor : users.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> mostrarTudo : users.entrySet()) {
			System.out.println(mostrarTudo);
		}
	}
	
	 
	

	
	
}
