package co.edu.uptc.ordenamiento;

public class Insercion {
	int actual = 0, pos = 0;

	public int[] ordenarInsercion(int[] lista) {
		System.out.println("Prueba");
		for (int i = 0; i < lista.length; i++) {
			pos = i;
			actual = lista[i];
			while ((pos > 0) && (lista[pos - 1] > actual)) {
				lista[pos] = lista[pos - 1];
				pos--;
			}			
			lista[pos] = actual;
			imprimirListado(lista);
			System.out.println("\n");
		}
		return lista;
	}

	public void imprimirListado(int[] listado) {
		for (int i = 0; i < listado.length; i++) {
			System.out.print(listado[i]);
		}
	}
}
