package br.generationexerc01heranca;

public class Cachorro extends Animal{
	
	private String pelo; //atributos
	private String dono;
	
	
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public void somAnimal() {
		System.out.println ("au au...");
		
	}

	

}
