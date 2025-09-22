package defecto;

import java.util.Scanner;


public class HolaMundo { // clase principal

	public static void main(String[] args) {
		//System.out.println("Hola mundo");
		/*int edad = 56;
		int curso = 1;
		int edadSegunda = 57;
		edad = 51;
		curso = 1 + 1;
		edadSegunda = edad + 2;
		curso = curso + 3;
		curso += 3;
		double precio = 4.5;
		//float iva = (float)12.5;
		System.out.println(5.0/2);
		System.out.println(5%2);
		*/
		/*int x = 5;
		int y = 3;
		x++;
		 x = x + 1;
		 x += 1;
		y--;
		 y = y - 1;
		 y -= 1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x++);
		System.out.println(++x);
		*/
		/*String texto = "";
		texto = "Hola" + " " + "mundo";
		System.out.println(texto);
		boolean acertado = true;
		boolean encontrado = false;
		
		 */
		//int sueldo = 1000;
		/*if(edad >= 18) {
			System.out.println("Eres mayor de edad");
			System.out.println("Ya puedes votar");} */
		/*if(edad < 18) {
			System.out.println("No eres mayor de edad");
			System.out.println("No puedes votar"); } */
		/*if(edad == 18)
			System.out.println("Bienvenido!"); */
		/*if(edad > 18)
			System.out.println("Tienes más de 18 años"); */
		/*if(sueldo <= 2500)	
			System.out.println("Pagas 10% impuestos"); */
		/*if(edad == 18)
			System.out.println("Tienes 18 años clavados");*/
		/*else if(sueldo >= 10000)
			System.out.println("Pagas 50% impuestos");
		else if(sueldo <= 9999)
			System.out.println("Pagas 50% impuestos");
		else if(sueldo <= 1000) {
			System.out.println("No pagas impuestos");
		} */
		/*System.out.println("");
		int edad = 25;
		if(edad == 18)
			System.out.println("Tienes 18 clavados");
		else if(edad >=100)
			System.out.println("Como sigues vivo");
		else if(edad > 18)
			System.out.println("Tienes más de 18 años");

		else {
			System.out.println("Eres menor de edad");
		} */

	/*	double sueldo = 1700;
		double neto = 0;
		if(sueldo <= 1000) {
			System.out.println("Tu sueldo es menor a 1000");
			System.out.println("No pagas impuestos");
			
		}
		else if(sueldo < 10000){
			System.out.println("Tu sueldo es mayor a 1000 pero menor a 10000");
			System.out.println("Pagas un 10% de impuestos");
			neto = sueldo - (sueldo *10/100);
			System.out.print("Vas a cobrar: ");
			System.out.println(neto);
		}
		else {
			System.out.println("Tu sueldo es mayor a  10000");
			System.out.println("Pagas un 50% de impuestos");
			neto = sueldo - (sueldo *50/100);
			System.out.print("Vas a cobrar: ");
			System.out.println(neto);
		} */
		
		/*char letra = 'X';
		String otraLetra = "X";
		System.out.println(letra);*/
		
		/*System.out.println("");
		System.out.println("");
		System.out.println("Fin del programa.");*/
		/*for(int i=0; i<10; i++) {
			System.out.println(i);
		} */
		
		// Esto es del ejercicio de sacar los dividendos de 3 hasta 100

		/*for(int i=3; i<100; i+=3) {
			System.out.println(i);
		} */
		
		/*for(int i=1; i<100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		} */
		
		// Lectura de teclado:
		
		/*Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Tu nombre es: " + nombre);
		
		System.out.println("Ingrese su edad:");
		String edad = teclado.nextLine();
		System.out.println("Tienes:" + " " + edad + " " + "años");
		teclado.close(); */
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Escribe un número: ");
		numero = teclado.nextInt();
		//System.out.println(numero);
		if(numero % 2 == 0)
			System.out.println("El número " + numero + " es par.");
		else {
			System.out.println("El número " + numero + " es impar.");
		}

		
		teclado.close();
		
		/*if(edad >= 18) {
			System.out.println("Bienvenido");
		} */
		
		// Scanner teclado = new Scanner(System.in);
		
		/*int edad;
		edad = 56; */
		// int edad = 56;
		
		
	}

}
