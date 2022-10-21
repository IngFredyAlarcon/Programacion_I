package co.edu.uptc.test;

import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.uptc.busqueda.Secuencial;

public class TestSecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorBuscado = 0, respuesta=0;
		int[] listado = new int[10];
		Random rd = new Random();
		Secuencial sec = new Secuencial();
		//Scanner sc = new Scanner(System.in);
		JOptionPane jp = new JOptionPane();
		ImageIcon icono = new ImageIcon("src/co/edu/uptc/imagenes/icono_busqueda_exitosa.jpg");
		jp.showMessageDialog(null, "Bienvenido al módulo de búsqueda", "BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
		
		//System.out.println("Digite el valor a buscar");
		valorBuscado=Integer.parseInt(jp.showInputDialog(null, "Digite el valor a buscar"));
		//valorBuscado = sc.nextInt();
		
		System.out.println("Arreglo");
		for(int i=0;i<listado.length;i++) {
			listado[i]=rd.nextInt(10);
			System.out.print(listado[i]);
		}
		System.out.println("\n");
		
		respuesta = sec.buscarSecuencial(listado, valorBuscado);
		if(respuesta!=-1) {
			jp.showMessageDialog(null, "El valor buscado se encuentra en la posición ", "Respuesta",JOptionPane.INFORMATION_MESSAGE, icono);
			System.out.println("El valor buscado se encuentra en la posición "+respuesta);
		}
		else {
			System.out.println("El valor solicitado ("+valorBuscado+") no se encuentra en el arreglo");
		}
	}

}
