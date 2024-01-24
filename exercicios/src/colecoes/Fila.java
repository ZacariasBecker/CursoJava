package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		fila.add("Ana"); // Gera erro caso não consiga add
		fila.offer("Bia"); // Retorna false caso não consiga add
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		System.out.println(fila);

		System.out.println(fila.peek()); // peek pega o primeiro elemento sem tirar da fila
		System.out.println(fila.peek()); // Fila vazia -> null
		System.out.println(fila.element()); // element pega o primeiro elemento sem tirar da fila
		System.out.println(fila.element()); // fila vazia -> erro

		// fila.clear(); // limpa fila

		System.out.println(fila.size()); // retorna tamanho da fila
		System.out.println(fila.isEmpty()); // retorna se fila é vazia
		System.out.println(fila.contains("Gui")); // se contém elemento

		System.out.println(fila.poll()); // pool pega o primeiro elemento tirarando da fila, se vazio retorna null
		System.out.println(fila.remove()); // remove pega o primeiro elemento tirarando da fila, se vazio retorna erro
	}
}
