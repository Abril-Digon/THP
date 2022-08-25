package actividad1;
import java.util.Scanner;

public class Ejercicio_05 {

	/* Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y num2. 
	 * Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores (que lo cargado en num1 
	 * quede en num2, y viceversa) y volvé a mostrarlas actualizadas */
	
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		int num1, num2, aux;

		System.out.println("Ingrese el valor del Primer Numero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el valor del Segundo Numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Valores ingresados originalmente: " + num1 + " | " + num2);
		
		aux = num1;		// espacio vacio toma valor de num1, // aux y num2
		num1 = num2;	// num1 toma valor de num2, // aux y num1
		num2 = aux;		// num2 toma valor del num1 // num2 y num1
		
		System.out.println("Valores ingresados al intercambiarlos: " + num1 + " | " + num2);
		
		input.close();
	}

}
