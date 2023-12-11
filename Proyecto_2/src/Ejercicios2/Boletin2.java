package Ejercicios2;

public class Boletin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
		ejercicio7();
		
	}
	
	
	public static void ejercicio1() {
//		Desarrolla un programa que calcule la media de 3 números enteros, e
//		imprima el resultado por pantalla. Ojo, los tres números iniciales son
//		enteros, pero el resultado puede no serlo.
		
		int numero1=2, numero2=4, numero3=8;
		double resultado;
		resultado= (numero1+numero2+numero3)/3;
		System.out.println(resultado);
		
	}
	
	public static void ejercicio2() {
//		Desarrolla un programa que calcule la media de 3 números reales, e
//		imprima el resultado por pantalla.
		
		
		
		double numero1=2.5, numero2=4.8, numero3=8.3;
		double resultado;
		resultado= (numero1+numero2+numero3)/3;
		System.out.println(resultado);
	}
	
	public static void ejercicio3() {
//		Desarrolla un programa que calcule a área y el perímetro de un cuadrado
//		de lado 5 metros, e imprima el resultado por pantalla.
//		Buscar las fórmulas de área y perímetro por Internet.
		
		int lado=5;
		
		int area=lado*lado;
		int perimetro= lado*4;
		
		System.out.println("El área de un cuadrado de lado: "+lado +" metros es de: " +area+" metros\n"
				+ "El périmetro de ese cuadrado es de: "+perimetro+" metros");
		
		
	}
	
	public static void ejercicio4() {
//		Suponiendo que ingresamos 5000 euros en un banco que nos paga el 6%
//		de intereses, calcula el dinero que tendremos después de un año. Imprima
//		el resultado por pantalla.
		
		int dineroIngresado=5000;
		double dineroConInteres=dineroIngresado*1.06;
		System.out.println("El dinero que tendremos después de un año supomiendo que la cantidad ingresada es de: "+dineroIngresado +" "
				+ "con un interés del 6% es "+dineroConInteres);
		
		
		
	}
	
	public static void ejercicio5() {
//		Desarrolla un programa que transforme 86 grados Fahrenheit a Celsius y
//		33 grados Celsius a Fahrenheit. Imprima el resultado por pantalla.
		
		double gradosCelsius=33,gradosFahrenheit=86;
		
		double calcularCelsius= (gradosFahrenheit-32)/9*5;
		double calcularFahrenheit=(gradosCelsius*9)/5+32;
		System.out.println(gradosFahrenheit+" grados Fahrenheit a grados Celsius son "+calcularCelsius+" ºC");
		System.out.println(gradosCelsius+" grados Celsius a grados  Fahrenheit son: "+ calcularFahrenheit+ " grados Fahrenheit");
		
		
	}
	
	public static void ejercicio6() {
		
//		Desarrolla un programa que escriba en la pantalla cuánto le costará
//		comprar unas zapatillas deportivas cuyo precio de catálogo es de 85€, si
//		se sabe que puede conseguir una rebaja del 15%.
		
		double precio=85;
		
		double rebaja=precio*15/100;
		double precioConRebaja=precio-rebaja;
//		double precioConRebaja=precio*0.85;
		System.out.println("El precio final de las zapatillas es de: "+precioConRebaja+"€");
	}
	
	public static void ejercicio7() {
//		Desarrolla un programa que calcula como aumentaría el valor de una
//		inversión de 10000 euros a un 10% el primer año, pierde un valor de 500
//		euros durante el segundo y aumenta un 12% durante el tercero. Utiliza
//		operadores de asignación ampliada para realizar los cálculos.
		
		int valorInversion=10000;
		valorInversion*=1.1;

		System.out.println("El valor de la inversión al finalizar el primer año es de: "+valorInversion);
		valorInversion-=500;
		System.out.println("El valor de la inversión al finalizar el segundo año es de: "+valorInversion);
		valorInversion*=1.12;
		System.out.println("El valor de la inversión al finalizar el tercer año es de: "+valorInversion);

		

		
	}

}
