package pilha;

import java.util.Scanner;

// FORMA RECURSIVA, CHAMANDO O PROPRIO METODO
public class fibonacci {
	public static int fibRec(int n) {
		if (n == 1 || n == 2){
			return 1;
		} else {
			return fibRec(n - 1) + fibRec(n - 2);
		}
	}
	
	
	
	public static int fibRec2(int n) {
		if (n != 1  && n !=2){
			return fibRec2(n - 1) + fibRec2(n - 2);
		}
		else 
			return 1;
	}

	
// FORMA ITERATIVA, CHAMANDO O PROPRIO METODO	
	public static void fibIte() {
		Scanner in = new Scanner(System.in);
		System.out.println("'Iterativa' Digite o valor: ");
		int entrada = in.nextInt();
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < entrada; i++ ) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}

