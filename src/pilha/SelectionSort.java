package pilha;

import java.util.Arrays;

public class SelectionSort {
	public static void sekectSort() {
		int[] lista = {64,34,25,12,22,11,90};
		System.out.println("Lista antes da ordenação: ");
		System.out.println("Lista original" + Arrays.toString(lista));
		int tmp;
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j ++) {
				if (lista[j] < lista[j + 1]) {
				tmp = lista[j];
				lista[j] = lista[j + 1];
				lista[j+1] = tmp;
				
				
				
				}
				System.out.println(Arrays.toString(lista));
				
		
			}
			//System.out.println(Arrays.toString(lista));
			
		}
	}

}
