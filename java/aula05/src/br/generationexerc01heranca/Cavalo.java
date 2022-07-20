package br.generationexerc01heranca;

public class Cavalo extends Animal {
	
	private String velocidade; //atributos
	private String forca ;
	
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	public String getForca() {
		return forca;
	}
	public void setForca(String forca) {
		this.forca = forca;
	}
	public void somAnimal() {
		System.out.println ("relincho...");
		
	}
	
	
	
	
	
	
	
	

}
