package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	public final int VELOCIDADE_MAXIMA;
	private int delta = 5;

	protected Carro(int VELOCIDADE_MAXIMA) {
		this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
	}

	public int getDelta() {
		return getDelta();
	}

	public void setDelta(int delta) {
		this.delta = getDelta();
	}

	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {

		}
		this.velocidadeAtual += getDelta();
	}

	public void frear() {
		if (this.velocidadeAtual >= delta) {
			this.velocidadeAtual -= delta;
		} else {
			this.velocidadeAtual = 0;
		}
	}

	public String toString() {
		return "Velocidade atual " + velocidadeAtual + "km/h";
	}
}
