package actividad1;
import java.util.Scanner;

public class Ejercicio_02 {
	
	/* Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos 
	 * para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. */

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		double nota1, nota2, nota3, promedio;
		
		System.out.println("Ingrese la Nota del Primer Trimestre: ");
		nota1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese la Nota del Segundo Trimestre: ");
		nota2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese la Nota del Tercer Trimestre: ");
		nota3 = Double.parseDouble(input.nextLine());
		//constante de notas
		promedio = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("El promedio entre los tres trimestres es de: " + promedio);
		input.close();
	}

}
