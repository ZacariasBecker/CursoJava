package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe");
		livros.add("Don Quixote ");
		livros.add("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		System.out.println(livros.size());
		System.out.println(livros.contains("hehe"));
		System.out.println(livros.isEmpty());
		livros.clear();		
	}
}
