package co.edu.uptc.ordenamiento;

public class Seleccion {
	int mayor;
	public int[] ordenarSeleccion(int[] lista) {
		for(int i=0;i<lista.length-1;i++) {
			for(int j=i+1;j<lista.length;j++) {
				if(lista[j]<lista[i]) {
					mayor=lista[i];
					lista[i]=lista[j];
					lista[j]=mayor;
				}
				//System.out.print(lista[j]);
			}
			//System.out.println("********");
			
			//System.out.println("\n");
		}		
		return lista; 
	}
}
