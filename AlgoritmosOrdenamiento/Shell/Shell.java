package co.edu.uptc.ordenamiento;

public class Shell {
	public int[] ordenarShell(int[] lista) {
		System.out.println("Prueba");
		int salto, aux,j,k;
		salto = lista.length/2;
		while(salto>0) {
			for(int i=salto;i<lista.length;i++) {
				j=i-salto;
				while(j>=0){
					k=j+salto;
					if(lista[j]<=lista[k]) {
						j=-1;
					}
					else {
						aux = lista[j];
						lista[j]=lista[k];
						lista[k]=aux;
						j-=salto;
					}
				}
			}
			imprimirListado(lista);
			System.out.println("\n Salto = "+salto);
			salto=salto/2;
		}
		return lista;
	}
	
	public void imprimirListado(int[] listado) {
		for (int i = 0; i < listado.length; i++) {
			System.out.print(listado[i]);
		}
	}
}
