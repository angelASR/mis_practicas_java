package PrimerasPracticasJava;

public class cadenaString {
	/*
	 * La clase String se puede utilizar para saber la longitud de los textos
	 * String no es un tipo de dato primitivo
	 * 
	 * ##############################################
	 * los tipos de datos String mas comunes son:
	 
	 * #length(); "devuelve longitud de una cadena de caracteres"
	 * #charAt(n);"devuelve la posicion de un caracter dentro de una cadena(las posiones empiezan de 0)"
	 * #substring(x,y);devuelve una sub cadena dentro de la cadena
	 * #equals(cadena);devuelve "true" si dos cadenas que se comparan son iguales y false si no lo son distingue mayuscula y minuscula
	 * #equalssignoreCase(cadena);igual al anterior sintener en cuenta mayusculas ni minusculas
	 * 
	 */
	public static void main(String[] args) {
//ejemplos:
		String nombre="Angel";
		
		System.out.println("mi nombre es "+ nombre);
	
		
		
		//si quieres imprimir con mas opciones agregar "." al final de la variable a imprimir
		//estamos viendo cantidad de letras en la palabra
		//para hacer es agragar ej: nombre.length();
		System.out.println("mi nombre tiene "+ nombre.length() + " letras");
	
		
		
		
		//aqui estamos viendo que letra es que esta en el indise
		// estamos imprimiendo la primera letra de mi nombre en el parentesis se va el
		//numero recordar que empieza de "0"
		System.out.println("mi nombre es "+ nombre.charAt(0));
		
		
		
		// esto se utiliza para saber la ultima letra de mi nombre
		//se utiliza xq la variable puede ser cambiada
		// y vamos a imprimir
		int ultimaLetra;
		ultimaLetra = nombre.length();
		System.out.println("la ultima letra es "+ nombre.charAt(ultimaLetra -1));
		
	}

}
