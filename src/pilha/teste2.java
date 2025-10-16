package pilha;

import java.util.LinkedList;


public class teste2 {
	public static void teste() {
		LinkedList<String> lista1 = new LinkedList<>();
		lista1.push("Primeiro item = 1");
		lista1.push("Segundo item = 2");
		lista1.push("Terceiro item = 3");
		int tam = lista1.size();
		for (int i = 0; i < tam; i++) {
			System.out.println("tirando o " + lista1.pop());
		}
	}

}
