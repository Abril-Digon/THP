package actividad1;
import java.util.Scanner;

public class Ejercicio_08 {

	/* Realizá un programa que permita ingresar dos números naturales. 
	 * Debes mostrar los resultados para las 4 operaciones matemáticas básicas con los números ingresados */
	
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		int num1, num2;
		double suma, resta, division, multiplicacion;
		
		System.out.println("Ingresa el primer numero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresa el segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		// Las 4 operaciones matemáticas básicas:
		suma = num1 + num2;
		
		resta = num1 - num2;
		
		division = num1 / num2;
		
		multiplicacion= num1 * num2;
		
		System.out.println("La suma entre " + num1 + " y " + num2 + " es de: " + suma);
		
		System.out.println("La resta entre " + num1 + " y " + num2 + " es de: " + resta);
		
		System.out.println("La division entre " + num1 + " y " + num2 + " es de: " + division);
		
		System.out.println("La multiplicacion entre " + num1 + " y " + num2 + " 2es de: " + multiplicacion);
		
		input.close();
	}

}
