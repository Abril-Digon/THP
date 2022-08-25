package actividad1;
import java.util.Scanner;

public class Ejercicio_07 {
	
	/* Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el valor del metro cuadrado de tierra. 
	 * Debe mostrarse el valor total del terreno y la cantidad de metros de alambre para cercarlo completamente a tres alturas distintas.*/

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		double ancho, largo, metroCuadrado, valorTerreno, metrosAlambre;
		
		System.out.println("Ingrese el Ancho del Terreno: ");
		ancho = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el Largo del Terreno: ");
		largo = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el Valor del Metro Cuadrado de Tierra: ");
		metroCuadrado = Double.parseDouble(input.nextLine());
		
		valorTerreno = (ancho * largo) * metroCuadrado;
		System.out.println("El Valor Total del Terreno es de: $" + valorTerreno);
		
		metrosAlambre = ((ancho + largo) * 2) * 3;
		System.out.println("La cantidad de metros de alambre para cercarlo completamente es de: " + metrosAlambre);
		
		input.close();
	}

}
