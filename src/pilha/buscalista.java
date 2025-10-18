package pilha;

public class buscalista {
	
	int[] lista =  {0,1,2,3,4,6,7,8,9};
	int valorindicado = 5;
	int tamanholista = lista.length;
	


	
	public static int busca(int[] lista, int valorindicado) {
		
		for (int i = 1; i < lista.length; i++ ) {
			if (valorindicado == lista[i] ) {
				System.out.println("Achooou: " + valorindicado + " esta no indice "+ i );
				return( 1);
			} else if (lista[i] > valorindicado){ // PARA LISTA ORDENADA CRESCENTE
				System.out.println("Valor não localizado" + "Loop parou no indice: " + i);
				return (-1);
			}
			
		}
		
		return 100;
	}

}
