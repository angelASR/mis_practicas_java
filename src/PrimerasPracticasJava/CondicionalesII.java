package PrimerasPracticasJava;
import java.util.*;
import javax.swing.*;
public class CondicionalesII {
//EJERCICIO DE FIGURAS GEOMETRICAS
	public static void main(String[] args) {
	
		Scanner entrada= new Scanner(System.in);
/*
 * la parte donde esta escrito "\n" es para que de 
 * un salto para que no se cargue en la misma linea
 * o sea da un salto hacia abajo
 * al poner "\n1" asi es para que muestre de la siguiente manera
 * Elige una opcion : 
1: Cuadrado 
2:Rectangulo 
3:Trinagulo 
4: Circulo

 */
		System.out.println("Elige una opcion : \n1: Cuadrado \n2:Rectangulo \n3:Trinagulo \n4: Circulo");
	int figura=entrada.nextInt();
// en el parentesis de "switch" se pone lo que se desea almacenar
// en este caso figura 
// en la parte donde dice "int figura=entrada.nextInt();" estamos diciendo que figura es = al que
//el usuario registra en el Scanner
	switch(figura){
	case 1:
		int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
	
		System.out.println("El Area de cuadrado es "+ Math.pow(lado, 2));
		break;
//el case deve siempre ir acompañado por break;
	case 2:
		int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base"));
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura"));
		System.out.println("El area del rentangulo es "+ base*altura);
	
		break;	
	}
	}

}
