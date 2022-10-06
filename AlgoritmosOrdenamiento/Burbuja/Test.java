package co.edu.uptc.test;

import java.util.Random;

import co.edu.uptc.ordenamiento.Burbuja;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burbuja b = new Burbuja();
		int[] listaNumeros = new int[10];
		int[] listaOrdenada = new int[10];
		Random rd = new Random();
			
		//llenar array con números aleatorios
		for(int i=0;i<listaNumeros.length;i++) {
			listaNumeros[i]=rd.nextInt(10);
		}
		
		System.out.println("Sin ordenar");
		for(int i=0;i<listaNumeros.length;i++) {
			System.out.println(listaNumeros[i]);
		}
				
		listaOrdenada=b.ordenarBurbuja(listaNumeros);
		
		System.out.println("Ordenada");
		for(int i=0;i<listaOrdenada.length;i++) {
			System.out.println(listaOrdenada[i]);
		}
		
	}

}
