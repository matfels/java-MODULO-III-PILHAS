package pilha;

import java.util.Scanner;

public class fatorial {
	public static void entrada() {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int valor = in.nextInt();
		int resultado = fatorial.fatoriaal(valor);
		System.out.println("Resultado: " + resultado);
	}

	
	public static int fatoriaal(int n) {
		int resultado = 1;
		for(int i = 1; i <= n; i++){
			resultado *= i;
			System.out.println(resultado);
			
		}
		return resultado;		
	}
}
