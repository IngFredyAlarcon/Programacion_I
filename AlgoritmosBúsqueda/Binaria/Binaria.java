package co.edu.uptc.busqueda;

public class Binaria {
	public int buscarBinaria(int[] listado, int valor) {
		int firstIndex = 0;
	    int lastIndex = listado.length - 1;

	    // termination condition (element isn't present)
	    while(firstIndex <= lastIndex) {
	        int middleIndex = (firstIndex + lastIndex) / 2;
	        // if the middle element is our goal element, return its index
	        if (listado[middleIndex] == valor) {
	            return middleIndex;
	        }

	        // if the middle element is smaller
	        // point our index to the middle+1, taking the first half out of consideration
	        else if (listado[middleIndex] < valor)
	            firstIndex = middleIndex + 1;

	        // if the middle element is bigger
	        // point our index to the middle-1, taking the second half out of consideration
	        else if (listado[middleIndex] > valor)
	            lastIndex = middleIndex - 1;

	    }
	    return -1;
	}
}
