package PrimerasPracticasJava;

import java.util.Scanner;
/*
 * tenemos que importar la libreria de java util para usar el scanner
 * Ej:import java.util.Scanner;
 *  para utilizar el "Scanner"se necesita utilizar un constructor
 *como del EJ: Scanner entrada = new Scanner(System.in);
 */
public class EntradaSalidaDatosI {

	public static void main(String[] args) {
		//Estamos declarando que el escaner sera = a la variable "entrada"
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre ");
		
		//salta un mensaje para introducir el valor la cual
		//almacenara en la variable "nombreUser"
		//de tipo String nextLine es string
		String nombreUser=entrada.nextLine();
		
		
		//salta un mensaje para introducir el valor la cual
				//almacenara en la variable "edad"
				//de tipo String nexInt es int
		System.out.println("introduce edad ");
		int edad=entrada.nextInt();
		
		
		
		System.out.println("hola "+ nombreUser + " otro año tendras "+ (edad+1) + " Años ");
	
	}

}
