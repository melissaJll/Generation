package br.generationexerc01heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		Cavalo cv1 = new Cavalo();
		cv1.setNome("Açucar");
		cv1.setIdade(5);
		
		cv1.setForca("sim");
		cv1.setVelocidade(" 70,76 km/h");
		
		System.out.println("Dados do cavalo");
		System.out.println("Nome: " + cv1.getNome());
		System.out.println("Idade: " + cv1.getIdade());
		System.out.println("velocidade: " + cv1.getVelocidade());
		cv1.somAnimal();
		
		Preguica p1 = new Preguica();
		p1.setNome("larry");
		p1.setIdade(3);
		p1.setLerdeza("sempre");
		p1.setGarras(8);
		
		System.out.println("\nDados da preguiça");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: "+p1.getIdade());
		System.out.println("Garras: "+p1.getGarras());
		p1.somAnimal();
		
		Cachorro dog = new Cachorro();
		 
		dog.setNome("Mocha");
		dog.setIdade(1);
		dog.setDono("Nay");
		dog.setPelo("Branco e cinza");
		
		System.out.println("\nDados do cachorro");
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: "+dog.getIdade());
		System.out.println("Dona: "+ dog.getDono());
		dog.somAnimal();
		
		
	}

}
