package co.edu.uptc.busqueda;

public class Secuencial {
	public int buscarSecuencial(int[] listado, int valor) {
		for(int i=0;i<listado.length;i++) {
			if(listado[i]==valor) {
				return i;//devolvemos solo la posición donde se encuentra
			}
		}
		return -1;
	}
}
