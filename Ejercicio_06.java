package actividad1;
import java.util.Scanner;

public class Ejercicio_06 {
	
	static int sueldo = 44000;
	 
	/* Realizá un programa que permita ingresar el monto total de las ventas realizadas por un vendedor 
	 * durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16% del monto total vendido. 
	 * Con tales datos debes calcular y mostrar el importe a cobrar por el vendedor. */

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		double montoTotal, comision;
		
		System.out.println("Ingrese el monto total de las ventas realizadas durante el mes: ");
		montoTotal = Double.parseDouble(input.nextLine());
		
		// sacar 16% del montoTotal
		
		comision = (montoTotal / 100) * 16;
		
		System.out.println("El importe a cobrar es de: " + (sueldo + comision) + "$.");
		
		input.close();
	}

}
