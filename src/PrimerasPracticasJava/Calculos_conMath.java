package PrimerasPracticasJava;

public class Calculos_conMath {
/*
 * en el parentesis de sqrt deve irse siempre un tipo de datos duble o sino muetsra error
 * los datos tipos float deven de llevar una "F"mayuscula al final
 *
 *##########################################
 *#####  REFUNDICION   ###############################
 * EJ: int raiz=(int)Math.round(num1);
 * en el parentesis donde dice int se van el tipo de dato
 * al cual se desea convertir 
 * 
 */
	public static void main(String[] args) {
	
//	saber la raiz cuadrada	
//		double raiz=Math.sqrt(9);
	
// Ej: de Refuncion
//		double num1=5.85;
//		int resultado =(int)Math.round(num1);
	
	//se pasa al int para no utilizar mucha memoria
	// metodo pow eleva a la potencia
		double base=5;
		double exponente=3;
		int resultado=(int)Math.pow(base, exponente);
	System.out.println("pratica math resultado " + resultado);
	}

}
