package pilha;

import java.util.Scanner;

public class fatorialrecursivo {
	public static void fatrecu() {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int valor = in.nextInt();
		int resultado = calculo.calcular(valor);
		System.out.println("Resultado: "+ resultado);
		
	}
}


class  calculo{
	public static int calcular(int n){
		if (n == 0){
			return 1;
		} else {
			return n * calcular(n -1);
			
		}
		
	}
}