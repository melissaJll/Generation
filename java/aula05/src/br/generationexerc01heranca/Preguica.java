package br.generationexerc01heranca;

public class Preguica extends Animal {
	
	private String lerdeza; //atributos
	private int garras;
	
	public String getLerdeza() {
		return lerdeza;
	}
	public void setLerdeza(String lerdeza) {
		this.lerdeza = lerdeza;
	}
	public int getGarras() {
		return garras;
	}
	public void setGarras(int garras) {
		this.garras = garras;
	}
	public void somAnimal() {
		System.out.println ("som de preguiça...");
		
	}

	
	
	
	

}
