package defecto;

import java.util.Scanner;



public class BuclesForYWhile {

	public static void main(String[] args) {
	
	/*for(int i=0; i<5; i++)
		System.out.println(i); */
	
	/*int i=0;
	while(i<5) {
		System.out.println(i);
		i++;
	} */
	
	
	Scanner teclado = new Scanner(System.in);
	/*int numero;
	System.out.println("Escriba un numero: ");
	numero = teclado.nextInt();
	int i = numero;
	while(i==0) {
		System.out.println(numero);
		i++;
	}*/

	//int tecla = 9;
	int tecla;
	do {
	//while(tecla !=0) {
		System.out.println("Escribe un entero. 0 para salir: ");
		tecla = teclado.nextInt();
		System.out.println(tecla);
	}while(tecla!=0);
		
	System.out.println("");
	System.out.println("Fin del programa.");
	// Que no muestre los numeros que metemos por teclado hasta cuando el usuario meta el numero 0
	
	
	
	
	
	
	}
}
