package actividad1;
import java.util.Scanner;

public class Ejercicio_01 {

	/*  Realizá un programa que permita que el usuario ingrese su nombre. 
	 * El programa debe emitir una salida con un mensaje de bienvenida que incluya el nombre ingresado. */
	
	public static void main(String[] args) {
	final Scanner input = new Scanner(System.in);
		
		String nombreUsuario;
	
		System.out.println("Ingrese su nombre: ");
		nombreUsuario = input.nextLine();
		System.out.println("Bienvenidx " + nombreUsuario + "!");
		input.close();

	}

}
