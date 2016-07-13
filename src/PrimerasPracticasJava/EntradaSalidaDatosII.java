package PrimerasPracticasJava;
import javax.swing.*;
public class EntradaSalidaDatosII {

	public static void main(String[] args) {
	
		
		String nombreUser=JOptionPane.showInputDialog("Introduce el nombre");
		String edad=JOptionPane.showInputDialog("Introduce la edad");
		
		/*
		 * El metodo de abajo se utiliza para pasar los String a tipos enteros
		 * por que el jPane solo devuelve valores en String
		 * y puede cuasar problemas en la hora de hacer sumar o otras cosas que llevan los operadores
		 */
		int edadUser= Integer.parseInt(edad);
		System.out.println("hola " + nombreUser + " tienes " + edad + " Años ");
	}

}
