package actividad1;
import java.util.Scanner;

public class Ejercicio_03 {
	
	/* Realizá un programa que permita ingresar un número entero. Debe mostrarse el número ingresado:
		a. Multiplicado por 5.
		b. Dividido por 2. */

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		int entero, multiplicado, dividido;
		
		System.out.println("Ingrese un numero entero: ");
		entero = Integer.parseInt(input.nextLine());
		
		// a. Multiplicado por 5
		multiplicado = entero * 5;
		
		// b. Dividido por 2
		dividido = entero / 2;
		
		System.out.println("El numero " + entero + " multiplicado por 5 es: " + multiplicado);
		System.out.println("El numero " + entero + " dividido por 2 es: " + dividido);
		
		input.close();
	}

}
