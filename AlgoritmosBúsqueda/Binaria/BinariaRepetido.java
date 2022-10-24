package co.edu.uptc.busqueda;

public class BinariaRepetido {
	public int[] buscarBinariaRepetido(int[] listado, int valor) {
		int firstIndex = 0;
	    int lastIndex = listado.length - 1;
	    int[] encontrados = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

	    // termination condition (element isn't present)
	    while(firstIndex <= lastIndex) {
	        int middleIndex = (firstIndex + lastIndex) / 2;
	        // if the middle element is our goal element, return its index
	        if (listado[middleIndex] == valor) {
	        	int i,j = 0;
	        	i=middleIndex;
	        	j=middleIndex;
	            while(i<listado.length && listado[i] == valor) {
	            	encontrados[i]=i;
	            	i++;
	            }
	            while(j>=0 && listado[j] == valor) {
	            	encontrados[j]=j;
	            	j--;
	            }
	        	return encontrados;
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
	    return encontrados;
	}
}
