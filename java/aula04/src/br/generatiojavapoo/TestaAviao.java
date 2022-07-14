package br.generatiojavapoo;

public class TestaAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao a1 = new Aviao(); 
		
		a1.setModelo("Avião comercial");
		a1.setTamanho("84m");
		a1.setEmpresa("BoA");
		
		System.out.println("Modelo: " + a1.getModelo());
		System.out.println("Tamanho: " + a1.getTamanho());
		System.out.println("Empresa: " + a1.getEmpresa());
		

		
	}

}
