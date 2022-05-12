package atividade;

public class TestaAnimal {
	public static void main(String[]args) {
		
		Animal doguinho = new Cachorro("Sam",4,"Alaranjado","Vira-lata");
		Animal cavalo = new Cavalo ("Pé de Pano",6,2.1);
		Animal preguica = new Preguica ("Peguichia",2,"Ásia");
		
		doguinho.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
	}
}
