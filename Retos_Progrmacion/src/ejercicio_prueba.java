import java.util.Scanner;

public class ejercicio_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio4();
	}
	public static void ejercicio1() {

		int i;

		for (i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				System.out.println("fizz");

			} else if (i % 5 == 0) {

				System.out.println("buzz");

			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("");

			} else {
				System.out.println(i);
			}
		}
	}

	public static void ejercicio2() {

		System.out.println("Introduce la operacion a realizar");
		Scanner teclado = new Scanner(System.in);

		String operacion = teclado.nextLine().toLowerCase();

		System.out.println("Introduce el primer numero");

		int numero1 = teclado.nextInt();

		System.out.println("Introduce el segundo numero");

		int numero2 = teclado.nextInt();
		double suma;
		double resta;
		double multiplicacion;
		double division;

		switch (operacion) {

		case "suma":

			suma = numero1 + numero2;
			System.out.println("la suma es " + suma);
			break;

		case "resta":

			resta = numero1 - numero2;
			System.out.println("la resta es " + resta);

			break;

		case "multiplicacion":

			multiplicacion = numero1 * numero2;
			System.out.println("la multiplicacion es " + multiplicacion);

			break;
		case "division":
			division = numero1 / numero2;
			System.out.println("la division es " + division);

			break;

		default:

			System.out.println("illo coge la operacion que eh...");

		}

	}

	public static void ejercicio3() {

		System.out.println("introduce un numero entero positivo");
		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();
		int i;
		int factorial = 0;

		for (i = 1; i <= numero; i++) {
			factorial = factorial * i;

		}
		System.out.println("su factorial es " + factorial);
	}

	public static void ejercicio4() {

		System.out.println("introduce la base del rectrangulo");

		Scanner teclado = new Scanner(System.in);

		int base = teclado.nextInt();

		System.out.println("introduce la altura del rectrangulo");

		int altura = teclado.nextInt();
		int i;
		int j;
		int contador=0;
		
		for(j=0;j<altura;j++) {
			
		
		for (i = 0; i<base; i++) {

			if (i < base) {
				System.out.print("*");
				contador++;
			}
		}
		
		}
		System.out.println(contador);
	}
public static void ejercicio5() {
	
	
	
	
	
	
}

}
