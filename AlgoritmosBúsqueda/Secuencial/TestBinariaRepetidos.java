package co.edu.uptc.test;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.uptc.busqueda.BinariaRepetido;
import co.edu.uptc.ordenamiento.Seleccion;

public class TestBinariaRepetidos {
	public static void main(String[] args) {
		int valorBuscado = 0;
		int[] respuesta = new int[0];
		int[] listado = new int[10];
		int[] listadoOrdenado = new int[10];
		Random rd = new Random();
		BinariaRepetido bin = new BinariaRepetido();
		Seleccion sel = new Seleccion();
		// Scanner sc = new Scanner(System.in);
		JOptionPane jp = new JOptionPane();
		ImageIcon icono = new ImageIcon("src/co/edu/uptc/imagenes/icono_busqueda_exitosa.jpg");
		jp.showMessageDialog(null, "Bienvenido al módulo de búsqueda", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);

		
		System.out.println("Arreglo");
		for (int i = 0; i < listado.length; i++) {
			listado[i] = rd.nextInt(10);
			System.out.print(listado[i]);
		}
		
		listadoOrdenado = sel.ordenarSeleccion(listado);
		System.out.println("Arreglo Ordenado");
		for (int j = 0; j < listadoOrdenado.length; j++) {
			System.out.print(listadoOrdenado[j]);
		}
		System.out.println("\n");
		
		// System.out.println("Digite el valor a buscar");
		valorBuscado = Integer.parseInt(jp.showInputDialog(null, "Digite el valor a buscar"));
		// valorBuscado = sc.nextInt();		

		System.out.println("\n");

		respuesta = bin.buscarBinariaRepetido(listadoOrdenado, valorBuscado);
		for (int i = 0; i < respuesta.length; i++) {
			if (respuesta[i] != -1) {
				jp.showMessageDialog(null, "El valor buscado se encuentra en la posición ", "Respuesta",
						JOptionPane.INFORMATION_MESSAGE, icono);
				System.out.println("El valor buscado se encuentra en la posición "+respuesta[i]);
			} else {
				//System.out.println("El valor solicitado (" + valorBuscado + ") no se encuentra en el arreglo");
			}
		}
	}
}
