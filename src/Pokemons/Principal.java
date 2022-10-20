package Pokemons;

public class Principal {

	public static void main(String[] args) {
		Pokemon bubasauro = new Pokemon();
		bubasauro.numero = 1;
		bubasauro.nome = "Bubasauro";
		bubasauro.defesa = 10;
		bubasauro.ataque = 10;
		bubasauro.ataqueEspecial = 10;
		bubasauro.defesaEspecial = 10;
		bubasauro.genero = "M";
		bubasauro.saude = 9;
		bubasauro.velocidade = 8;
		bubasauro.setGolpe1("Chute");
		bubasauro.setGolpe2("Soco");
		bubasauro.setGolpe3("Chicote");
		bubasauro.golpe4 = "Tiro de folhas";
		
		System.out.println("O pokemon é: "+bubasauro.nome);
		bubasauro.restaurarVida();
	
		
		System.out.println("Golpe1: "+bubasauro.getGolpe1());
		
		
		Pokemon kakuna = new Pokemon();
		kakuna.numero = 14;
		kakuna.nome = "Kakuna";
		kakuna.defesa = 9;
		kakuna.ataque = 9;
		kakuna.ataqueEspecial = 9;
		kakuna.defesaEspecial = 9;
		kakuna.genero = "F";
		kakuna.saude = 8;
		kakuna.velocidade = 9;
		kakuna.setGolpe1("Golpe 1");
		kakuna.setGolpe2("Golpe 2");
		kakuna.setGolpe3("Bug bite");
		kakuna.golpe4 = "Return";

		System.out.println("O pokemon é: "+kakuna.nome);
		kakuna.golpear(3);
	
		System.out.println("Golpe: " + kakuna.getGolpe1());
		
		kakuna.restaurarVida();
		
		Lendario mewtwo = new Lendario();
		mewtwo.numero = 150;
		mewtwo.nome = "Mewtwo";
		mewtwo.defesa = 9;
		mewtwo.ataque = 9;
		mewtwo.ataqueEspecial = 10;
		mewtwo.defesaEspecial = 10;
		mewtwo.saude = 10;
		mewtwo.genero = "M";
		mewtwo.velocidade = 10;
		mewtwo.setGolpe1("Confusion");
		mewtwo.setGolpe2("Pisiquico");
		mewtwo.setGolpe3("Pystrike");
		mewtwo.golpe4 = "Psycho cut";
		mewtwo.habilidadeExtra = "Habilidade Extra";
		
		System.out.println("O pokemon é: "+mewtwo.nome);
		
		mewtwo.restaurarVida();
		
	}

}
