package br.generationexerc01heranca;

public class Animal {
	
	private String nome; //atributos
	private int idade;
	protected String som;
	
	/*public void somAnimal() {
		System.out.println("Animal...");
	}*/
		
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


	
}
