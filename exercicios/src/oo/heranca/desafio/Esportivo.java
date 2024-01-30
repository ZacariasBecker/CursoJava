package oo.heranca.desafio;

public interface Esportivo {

//todo metodo de interface é public e abstract

	public abstract void ligarTurbo();

	void desligarTurbo();

	default int velocidadeDoAr() {
		return 1;
	};
}
