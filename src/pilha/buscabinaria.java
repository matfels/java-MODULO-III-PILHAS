package pilha;

public class buscabinaria {
	public static int binaria() {
		
		int valorProcurado = 1;
		int[] lista = {1,2,3,4,5,6,7,8,9};
		int esquerda = 0;
		int direita = lista.length;
		int meio;
		while (esquerda <= direita) {
			meio = (esquerda + direita) / 2;
			
			if (lista[meio] == valorProcurado) {
				return lista[meio];
			} else if (lista[meio] < valorProcurado) {
				esquerda = meio + 1;
			} else {
				direita = meio - 1;
			}
		}
		
		
		
		
		return -1;
	}

}
