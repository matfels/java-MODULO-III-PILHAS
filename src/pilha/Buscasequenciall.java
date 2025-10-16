package pilha;

public class Buscasequenciall {
	

	public static String buscaSequencial() {
		int resultado = 11;
		int[] lista = {63, 34, 25, 22, 11, 90};
		int len = lista.length;

		for (int i = 0; i < len; i++) {
			if (resultado == lista[i]) {
				return  "está no indice: " + toString(i) ;
			}
		}

		return "-1";
	}

	private static String toString(int i) {
		// TODO Auto-generated method stub
		String ret = String.valueOf(i);
		return ret;
	}

}
