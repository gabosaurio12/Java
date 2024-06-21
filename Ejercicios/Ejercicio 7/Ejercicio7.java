// Escriba un programa que reciba como entrada el radio de un círculo y entregue como salida su perímetro y su área //

import java.util.Scanner;

class Ejercicio7 {
	public static void main (String args []) {
		float radio, perimetro, area, pi;
		pi = 3.14159f;
		Scanner scn = new Scanner(System.in);

		System.out.println("Ingrea el radio: ");
		radio = scn.nextFloat();

		area = pi * (radio * radio);
		perimetro = pi * (radio * 2);

		System.out.println("El perímetro es: " + perimetro);
		System.out.println("El área es: " + area);
	}
}