package defecto;

import java.util.Scanner;

public class EjerciciosGenericosJava {

	public static void main(String[] args) {

		// Ejercicio numero 1
		// Escribir un programa donde se muestren los 10 primeros números enteros

		/*
		 * for (int i = 0; i <= 10; i++) { System.out.println(i); }
		 */

		// Ejercicio numero 2
		// Escribir un programa donde se muestren los 50 primeros números pares

		/*
		 * for (int i = 1; i < 100; i++) { if (i % 2 == 0) { System.out.println(i); } }
		 */

		// Ejercicio numero 3
		// Escribir un programa donde se muestren los 5 primeros números múltiplos de
		// uno dado por el usuario (se introducirá por teclado)
		// se refiere a que pongas un numero y que eso lo multiplique hasta por 5, x1,
		// x2, x3, x4, x5

		Scanner teclado = new Scanner(System.in);
		//int numero;
		//int multiplo = 5;

		System.out.println("Introduzca un número: ");
		/*numero = teclado.nextInt();
		for (int i = 1; i <= 5; i++) {
			System.out.println(numero * i);
		} */

		// Ejercicio numero 4
		// Escribir un programa donde se muestren todos los números divisibles por 7 menores a 10000
		// crear con for y dentro de llave meter un IF
		//numero = teclado.nextInt();
		for (int i = 1; i <= 10000; i++) {
			if(i%7 == 0 )
				System.out.println(i);
			}

	}

}
