package lambdas;

import java.util.Iterator;

public class Trabalho1 implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Tarefa #1 - " + i);
		}
	}
}
