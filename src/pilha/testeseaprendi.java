package pilha;

import java.util.Arrays;
import java.util.List;

public class testeseaprendi {
	public static int[] listadalista(int[] a) {
		
		int[] lista = a;
		System.out.println("Lista normal: " + Arrays.toString(lista));
		int tamanho = lista.length;
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho -1; j++) {
				if (lista[j] > lista[j + 1]) {
					int temporaria = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = temporaria;
					//System.out.println(Arrays.toString(lista));
				}
			}
		}
		return lista;
	}

	
	public static int chamateste() {
		int numero = 5;
		int[] liist = {2,1,4,6,3,5,8,7,9,10};
		int[] resultado = listadalista(liist);
		System.out.println("Lista ordenada: " + Arrays.toString(resultado));
		int tamanho = resultado.length;
		for (int i = 0; i < tamanho; i++) {
			if (liist[i] == numero) {
				System.out.println("O número está no indice: " + i);
				return i;
			}
		}
		System.out.println("Fora");
		return -1;
		
			
		
}
	
	
	//=========================
//	public static void tesste() {
//		listadalista();
	}
//}
