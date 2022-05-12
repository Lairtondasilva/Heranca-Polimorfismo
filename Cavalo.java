package atividade;

public class Cavalo extends Animal {
	
	private double tamanho;
	
	public Cavalo (String nome, int idade, double tamanho) {
		super(nome,idade);
		this.tamanho = tamanho;
	}
	
	public void correr() {
		System.out.println("tu tu tu tu tu tu...");
	}
	
	public void emitirSom () {
		System.out.println(this.getNome()+" diz: hiin in in hinir");
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
}
