package Pokemons;

public class Pokemon {
	Integer numero;
	String nome;
	Integer ataque;
	Integer defesa;
	Integer saude;
	Integer ataqueEspecial;
	Integer defesaEspecial;
	Integer velocidade;
	String genero;
	private String golpe1;
	private String golpe2;
	private String golpe3;
	
	public void restaurarVida() {
		saude = 10;
		System.out.println("Vida restaurada: "+ saude);
	}
	
	public String getGolpe1() {
		return golpe1;
	}

	public void setGolpe1(String golpe1) {
		this.golpe1 = golpe1;
	}

	public String getGolpe2() {
		return golpe2;
	}

	public void setGolpe2(String golpe2) {
		this.golpe2 = golpe2;
	}

	public String getGolpe3() {
		return golpe3;
	}

	public void setGolpe3(String golpe3) {
		this.golpe3 = golpe3;
	}

	String golpe4;
	
	
	public void golpear(Integer golpe) {
		if(golpe == 1) System.out.println("Golpe: "+ golpe1);
		if(golpe == 2) System.out.println("Golpe: "+ golpe2);
		if(golpe == 3) System.out.println("Golpe: "+ golpe3);
		if(golpe == 4) System.out.println("Golpe: "+ golpe4);
	}
	
	public void defender() {
		System.out.println("Defendido!!!");
	}

}
