/**
 * Programa para determinar si un alumno a aprobado o supsendido en función de sus notas
 * @author Héctor
 * @version 26.03.2023
 */

package practica1;

import java.util.Scanner;

public class notas {
	/**
	 * Notas de las tres primeras UF
	 */
	double uf1, uf2, uf3;
	
	/**
	 * Notas acumuladas y definitiva
	 */
	double acu1, acu2, acu3, def;
	
	/**
	 * Utilizames scanner para poder introducir datos
	 */
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * Solicita las notas al usuario por consola y las almacena en variables
	 */
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
	}
	
	/**
	 * Método para comprobar bien la introducción de notas
	 */
	public void ComprobacionNotas(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	
	/**
	 * Método para calcular nota 
	 */
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		def = acu1 + acu2+ acu3;
		//hasta aqui la tenemos calculada pero no la mostramos
	}
	
	/**
	 * Método para imprimir las notas por consola 
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
	}

	/**
	 * Método para imprimir la nota en formato texto 
	 */
	public void aprobado() {
		if(def<5 && def>=0) {
			System.out.println("suspendio");
		}else {
			if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
			}else {
				System.out.println(" error en la notas");
			}
		}
	}
	
	/**
	 * Método para llamar a todos los demás
	 * @see IngresaNotas() 
	 * @see comprobacion() 
	 * @see Calculonotas() 
	 * @see Mostrar() 
	 * @see aprobado() 
	 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.ComprobacionNotas();
		
		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
	}
}
