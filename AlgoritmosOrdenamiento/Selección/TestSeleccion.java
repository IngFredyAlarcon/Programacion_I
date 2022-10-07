package co.edu.uptc.test;

import java.util.Random;

import co.edu.uptc.ordenamiento.Seleccion;

public class TestSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seleccion s = new Seleccion();
		int[] listaNumeros = new int[10];
		int[] listaOrdenada = new int[10];
		Random rd = new Random();
			
		//llenar array con números aleatorios
		for(int i=0;i<listaNumeros.length;i++) {
			listaNumeros[i]=rd.nextInt(10);
		}
		
		System.out.println("Sin ordenar");
		for(int i=0;i<listaNumeros.length;i++) {
			System.out.print(listaNumeros[i]);
		}
		System.out.println("\n");		
		listaOrdenada=s.ordenarSeleccion(listaNumeros);
		
		System.out.println("Ordenada");
		for(int i=0;i<listaOrdenada.length;i++) {
			System.out.print(listaOrdenada[i]);
		}
	}

}
