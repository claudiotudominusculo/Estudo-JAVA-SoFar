package classe;

public class Usuario {
	String nome;
	String email;
	
	//Condicionando o .equals para checar se um objeto genério 
	//pode ser classificado como uma instancia do tipo Usuario
	//e aí sim retornar verdadeiro ou falso!!
	
	public boolean equals(Object objeto ) {
		
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
			
		}else {
			return false;
		}
				
		
	}

}
