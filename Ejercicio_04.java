package actividad1;
import java.util.Scanner;

public class Ejercicio_04 {
	
	/* Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la cantidad de horas 
	 * trabajadas por día por un trabajador. Debes mostrar el valor del salario semanal, sabiendo que trabaja todos
	 * los días hábiles y la mitad de las horas del día hábil los sábados. (Todas las horas valen lo mismo.)*/

	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		int valorHora, horasTrabajadas; 
		 
		double salarioSemanal;
		
		System.out.println("Ingrese el valor monetario de una hora de trabajo: ");
		valorHora = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la cantidad de horas trabajadas por dia: ");
		horasTrabajadas = Integer.parseInt(input.nextLine());
		
		/* Version mejor del ej:
		 
		int diasTrabajados;
		
		System.out.println("Ingrese la cantidad de dias que trabaja por semana: ");
		diasTrabajados = Integer.parseInt(input.nextLine());
		
		salarioSemanal = (valorHora * horasTrabajadas) * diasTrabajados; */		
		
		salarioSemanal = (valorHora * horasTrabajadas) * 5.5;
	
		System.out.println("El salario semanal sera de: " + salarioSemanal);
		
		input.close();
	}

}
