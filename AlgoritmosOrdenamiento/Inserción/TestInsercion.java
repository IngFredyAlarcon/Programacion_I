package co.edu.uptc.test;

import java.util.Random;

import co.edu.uptc.ordenamiento.Insercion;

public class TestInsercion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listado = new int[10];
		int[] listadoOrdenado = new int[10];
		Random rd = new Random();
		Insercion insercion = new Insercion();
		
		System.out.println("Original");
		for(int i=0;i<listado.length;i++) {
			listado[i]=rd.nextInt(10);
			System.out.print(listado[i]);
		}
		System.out.println("\n");
		
		listadoOrdenado = insercion.ordenarInsercion(listado);
		
		System.out.println("Ordenada");
		for(int i=0;i<listado.length;i++) {
			System.out.print(listadoOrdenado[i]);
		}
		
		
	}

}
