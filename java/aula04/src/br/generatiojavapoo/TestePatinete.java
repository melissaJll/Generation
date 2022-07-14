package br.generatiojavapoo;

public class TestePatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patinete p1 = new Patinete();
		
		p1.setCor("Roxo");
		p1.setTamanho("70cm");
		
		System.out.println("cor: "+ p1.getCor());
		System.out.println("Tamanho: "+p1.getTamanho());

	}

}
