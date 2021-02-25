package cuadSuma;

import java.util.Scanner;

public class CuadradoSuma {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		float sum1, sum2, cuadrado;
		
		System.out.println("Digita un número");
		sum1=entrada.nextFloat();
		
		System.out.println("Digita otro número");
		sum2=entrada.nextFloat();
		
		cuadrado = (float) Math.pow(sum1+sum2, 2);
		
		System.out.println("El cuadrado de la suma es: " + cuadrado);
			
		
	}

}
