package co.edu.uptc.ordenamiento;

public class Burbuja {
	
	int temp;
	public int[] ordenarBurbuja(int[] lista) {
		for(int i=0;i<lista.length;i++) {
			for(int j=0;j<lista.length-1;j++) {
				if(lista[j]>lista[j+1]) {
					temp=lista[j];
					lista[j]=lista[j+1];
					lista[j+1]=temp;
				}
			}
		}
		return lista;
	}
}
