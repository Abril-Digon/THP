package actividad1;
import java.util.Scanner;

public class Ejercicio_10 {

	/* Realizá un programa que permita resolver el siguiente problema: Tres personas aportan diferente capital a una sociedad 
	 * y desean saber el valor total aportado y qué porcentaje aportó cada una (indicando nombre y porcentaje). 
	 * Solicitar la carga por teclado del nombre de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido previamente. */
	
	final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		String persona1, persona2, persona3;
		double sueldo1, sueldo2, sueldo3, valorTotalAportado;
		
		System.out.println("Ingrese el nombre del primer socio: ");
		persona1 = input.nextLine();
		System.out.println("Ingrese el capital aportado por " + persona1 + ": ");
		sueldo1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el nombre del segundo socio: ");
		persona2 = input.nextLine();
		System.out.println("Ingrese el capital aportado por " + persona2 + ": ");
		sueldo2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el nombre del tercer socio: ");
		persona3 = input.nextLine();
		System.out.println("Ingrese el capital aportado por " + persona3 + ": ");
		sueldo3 = Double.parseDouble(input.nextLine());
		
		valorTotalAportado = (sueldo1 + sueldo2 + sueldo3);
		
		System.out.println("El capital aportado a la sociedad por " + persona1 + " fue de un " + ((sueldo1 * 100) / valorTotalAportado) + "%");
		System.out.println("El capital aportado a la sociedad por " + persona2 + " fue de un " + ((sueldo2 * 100) / valorTotalAportado) + "%");
		System.out.println("El capital aportado a la sociedad por " + persona3 + " fue de un " +((sueldo3 * 100) / valorTotalAportado) +  "%");

	}

}
