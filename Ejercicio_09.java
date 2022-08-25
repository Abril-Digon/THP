package actividad1;
import java.util.Scanner;

public class Ejercicio_09 {

	/* Realizá un programa que permita ingresar dos números que representan las medidas en grados de dos ángulos interiores de cierto triángulo. 
	 * A partir de los valores de estos dos ángulos el programa debe mostrar el valor en grados del ángulo restante. 
	 * Recordá que la suma de los ángulos interiores de todo triángulo es de 180º. */
	 
	public static final int VALOR_TOTAL = 180;
	
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		int angulo1, angulo2, anguloRestante;
		
		System.out.println("Ingresa el valor del primer ángulo: ");
		angulo1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresa el valor del segundo ángulo: ");
		angulo2 = Integer.parseInt(input.nextLine());
		
		anguloRestante = VALOR_TOTAL - angulo1 - angulo2;
		
		System.out.println("El valor del ángulo restante es de: " + anguloRestante + " grados.");
		
		input.close();
	}

}
