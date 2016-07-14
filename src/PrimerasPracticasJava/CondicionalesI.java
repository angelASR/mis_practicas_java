package PrimerasPracticasJava;

import java.util.*;
public class CondicionalesI {
/*
 * flujo de ejecucion son las lineas de codigos que van dentro del main
 * para utilizar el "Scanner"se necesita utilizar un constructor
 como del EJ
 */
	public static void main(String[] args) {
		//Estamos declarando que el escaner sera = a la variable "entrada"
		Scanner entrada=new Scanner (System.in);
		
		System.out.println("introduce tu edad");
		
		int edad=entrada.nextInt();
//EXTRUCTURA IF para saber si es mayor de edad o no
			//if (edad>=18)
		//	{
				//System.out.println("Eres mayor de edad");
			//}else{
				//System.out.println("Eres menor de edad");
			//}
		
// EXTRUCTURA IF con varias condicionales
		if (edad < 18){
			System.out.println("Eres un adolesente");
		}
		
		else if(edad<40){
			System.out.println("Eres joven");
		}
		
		else if (edad>=65){
			System.out.println("Eres maduro");
		}
		
		else{
			System.out.println("cuidate");
		}
		
	}

}
