package Ejercicios2;

import java.util.Iterator;
import java.util.Scanner;

public class Boletin6 {

	public static void main(String[] args) {
//		escribir();//ejercicio 0
		
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		falta7
//		ejercicio8();
//		ejercicio9();
//		ejercicio10();
//		muestraAleatorio(9, 10);
		
		
	}
	
//	Ejercicio 0: Implementa en Java el método escribir, el cual muestra por pantalla “Hola
	
	
	public static void escribir() {
		System.out.println("Hola");
	}
	
//	Ejercicio 1: Implementar en Java un método, que reciba 3 números enteros como entrada,
//	y a continuación devuelva cuál es el mayor de los 3 números con return. 

	public static void ejercicio1() {
		Scanner teclado=new Scanner(System.in);
		int a,b,c,mayor;//declaramos las variables
		System.out.print("Introduce el primer numero: ");//solicitamos que se introduzca el primer número por teclado
		a=teclado.nextInt();//recogemos el número y lo almacenamos en la variable a
		
		System.out.print("Introduce el segundo numero: ");
		b=teclado.nextInt();
		
		System.out.print("Introduce el tercer numero: ");
		c=teclado.nextInt();
		
		mayor=mayorDeTres(a, b, c);//asignamos a la variable mayor el valor del metodo mayorDeTres() que devuelve el mayor de tres números
		System.out.println("El mayor es: "+mayor);//mostramos el número mayor.
		teclado.close();
	}
	
	static int mayorDeTres(int a, int b, int c) {//metodo que devuelve el mayor de tres números
		int mayor;//declaro la variable
		if (a>=b&&a>=c) {//si a es mayor o igual que b y mayor o igual que c
			mayor=a;//asignamos el valor de a a la variable mayor
		}else if (b>=a&&b>=c) {//si b es mayor o igual que a y mayor o igual que c
			mayor=b;//asignamos el valor de b a la variable mayor
		}else {//si  no se cumple ninguna de las dos condiciones anteriores
			mayor=c;//asigno el valor de c a la variable mayor
		}
		return mayor;//devuelvo el valor de la variable mayor
		
	}
	
//	Ejercicio 2: Crear un programa, para el cual, dado el radio de una circunferencia, 
//	calcule según lo que elija el usuario, la longitud de la misma, el área y el volumen
//	de la esfera que determina.
	
	public static void ejercicio2() {
		System.out.println("Introduce un radio:");
		double radio=pedirRadio();//declaro y asigno el valor de lo que devuelve el metodo pedirRadio() a la variable radio
		
//		mostrarMenu();
		int opcion;//=recogerOpcionMenu();//declaro
			mostrarMenu();
			opcion=recogerOpcionMenu(1,3);
			realizarAccionSeleccionada(opcion, radio);
		
	}
	
	public static double pedirRadio() {//función que pide un número positivo
		Scanner teclado=new Scanner(System.in);
		double radio;//declaro las variables
		boolean positivo=false;
		do {
//			System.out.println("Introduce un valor: ");//pido que se introduzca el radio
			radio=teclado.nextDouble();//recojo el valor y lo almaceno en la variable radio
			if (radio<=0) {//si el radio es menor o igual a 0 
				System.out.println("Error. El valor tiene que ser mayor que 0");//muestro el mensaje
			}else {//si el radio es mayor que 0 
				positivo=true;//modifico el valor de positivo y el bucle terminaria.
			}
		}while(!positivo);

		return radio;//devuelvo el valor de radio
	}
	public static void mostrarMenu() {//metodo que muestra el menu
		System.out.println("Elige qué quieres hacer: ");
		System.out.println("1. Calcular longitud circunferencia");
		System.out.println("2. Calcular área de la circunferencia");
		System.out.println("3. Calcular volumen esfera");
	}
	public static int recogerOpcionMenu(int n1,int n2) {//metodo que recoge la opcion del menu y la devuelve
		Scanner teclado=new Scanner(System.in);
		int opcion;//declaro la variable
		boolean valido=false;
		do {//inicio del bucle

			opcion=teclado.nextInt();//recojo el valor introducido por teclado y lo almaceno en la variable opcion
			if (opcion<n1||opcion>n2) {//si la opcion es menor que 1 
				System.out.println("Error1 Escoge una opción correcta: ");//muestro el mensaje

			}else {//si la opcion esta entre el 1 o el 3 
				valido=true;//asigno el valor true a valido y el bucle para
			}
		}while(!valido);
		return opcion;
//		teclado.close();
		
		
	}
	public static void realizarAccionSeleccionada(int opcion,double radio) {

			switch (opcion) {//dependiendo de la opcion escogida 
			case 1://si la opción es 1 
				System.out.print("La longitud de la circunferencia de radio "+radio+" es: ");
				System.out.printf("%.2f",longitudCircunferencia(radio));//mostramos la longitud de la circunferencia

				break;
			case 2://si la opción es 2
				System.out.print("El área de la circunferencia de radio "+radio+" es: ");
				System.out.printf("%.2f",areaCircunferencia(radio));//mostramos el área de la circunferencia

				break;
			case 3://si la opción es 3
				System.out.print("El volumen de la esfera de radio "+radio+" es: ");
				System.out.printf("%.2f",volumenEsfera(radio));//muestro el volumen de la esfera
				break;
			default:
				System.out.println("Error. Escoge una opción correcta: ");
				break;
			}
		
		
	}
	public static double longitudCircunferencia(double radio) {//funcion que devuelve la longitud de la circunferencia
		double circunferencia;
		circunferencia=2*(Math.PI*radio);//aplico la formula para averiguar la longitud de la circunferencia
		return circunferencia;//devuelvo el resultado
	}
	public static double areaCircunferencia(double radio) {//funcion que devuelve el area de la circunferencia y se le pasa como parametro el radio
		double area;
		area=Math.PI*Math.pow(radio, 2);//aplico la formula del area y almaceno el valor en area
		return area;//devuelvo el area de la circunferencia
	}
	public static double volumenEsfera(double radio) {//funcion que devuelve el volumen de una esfera
		double volumen;
		volumen=4*(Math.PI*Math.pow(radio, 3)/3);//aplico la formula del volumen de una esfera 
		//v=4/3*PI*r^3==4*(PI*r^3)/3
		return volumen;//devuelvo el resultado.
	}
	
//	Ejercicio 3: Diseñar un programa que nos permita calcular áreas y volúmenes de distintas
//	figuras geométricas, como conos y cilindros, según elija el usuario.
	
	public static void ejercicio3() {
		int opcion;//declaro las variables
		double altura,radio;
		//muestro por pantalla los mensajes
		System.out.println("Vamos a calcular el área y el volumen de varias figuras geométricas, para ello solicitaré la insercción de dos datos");
		System.out.println("Introduce un radio: ");
		radio=pedirRadio();//llamo al metodo pedir radio y almaceno el valor en la variable radio//este método se encarga de recoger un número mayor que 0

		System.out.println("Introduce la altura del lado: ");//pido que se introduzca la alura
		altura=pedirRadio();//recojo la altura y la almaceno en la variable altura	

		menuOperacion();//llamo al metodo que me muestra un menú con las operaciones que puedo hacer
		opcion=recogerOpcionMenu(1,2);//llamo al metodo que solicita y recoge la opcion escogida del menu

		realizarAccion(opcion,radio,altura);//llamo al metodo que realiza una accion u otra en funcion de la opcion escogida//a este metodo le pasamos como parámetros la opcion, el radio y la altura


	}
	public static void realizarAccion(int opcion,double radio,double altura) {//este metodo realiza una accion en funcion u otra en funcion de los parametros de entrada que tiene
		switch (opcion) {//opciones menu operación que si la opción es 1 calcula el área de unas figuras geométricas y si la opción es 2 calcula el volumen de unas figuras geométricas
		case 1://area
				mostrarArea(altura, radio);//muestro el area a partir de dos parámetros de entrada
			break;
		case 2://volumen cono
			mostrarVolumen(altura, radio);//muestro el volumen a partir de dos parámetros de entrada

			break;
		}
	}
	
	public static void menuOperacion() {//método que muestra el menu
		System.out.println("¿Qué quieres hacer?");
		System.out.println("1.- Calcular área ");
		System.out.println("2.- Calcular volumen");
	}
	
	public static void menuFiguras() {//método que muestra el menu
		System.out.println("1.- Cono ");
		System.out.println("2.- Cilindro");
	}
	/***
	 * Método que calcula el área del cono a partir de dos parámetros de entrada
	 * @param lado es la generatriz del cono 
	 * @param radio es el radio de la base
	 * @return devuelve el area del cono calculada a partir de los parámetros de entrada
	 */
	public static double areaCono(double lado,double radio) {
		double area;//declaro la variable
		area=(Math.PI*radio)*(lado+radio);//asigno a la variable el resultado de las operaciones
		return area;//devuelvo el area
	}
	/***
	 * Método que calcula el volumen del cono a partir de dos parámetros de entrada
	 * @param altura es la altura del cono
	 * @param radio es el radio de la base
	 * @return devuelve el volumen del cono calculado a partir de los parámetros de entrada
	 */
	public static double volumenCono(double altura,double radio) {
		double volumen;//declaro la variable
		volumen=(areaCircunferencia(radio)*altura)/3;//asigno a la variable el valor de la operación
		//V=1/3*PI*r^2*h
		return volumen;
	}
	
	/***
	 * Método que calcula el área del cilindro a partir de dos parametros de entrada
	 * @param altura corresponde a la altura del cilindro
	 * @param radio corresponde al radio de la circunferencia de la base
	 * @return devuelve el valor del área del cilindro calculada a partir de los parámetros de entrada
	 */
	public static double areaCilindro(double altura,double radio) {
		double area;//declaro la variable
		area=longitudCircunferencia(radio)*(altura+radio);//asigno a la variable el valor de la operación
		//A=2*PI*r*h+r
		return area;
	}
	/***
	 * Método que devuelve el volumen del cilindro a partir de dos parámetros de entrada
	 * @param altura corresponde a la altura del cilindro
	 * @param radio corresponde al radio de la circunferencia de la base
	 * @return devuelve el valor del volumen del cilindro calculado a partir de los parámetros de entrada
	 */
	public static double volumenCilindro(double altura,double radio) {
		double volumen;//declaro la variable
		volumen=(areaCircunferencia(radio)*altura);//asigno a la variable el valor de la operación
		//v=PI*r^2*altura
		return volumen;
	}
	
	/**
	 * 
	 * @param altura
	 * @param radio
	 */
	public static void mostrarArea(double altura,double radio) {
		menuFiguras();//muestro las figuras disponibles
		int opcionMenuArea=recogerOpcionMenu(1,2);//recojo la opcion selecionada de las figuras
		switch (opcionMenuArea) {//opcion menu figura area
		case 1://si la opción es 1
			// area cono	
			System.out.print("El área de un cono con radio "+radio+" y generatriz "+altura+" es: ");//muestro los datos de entrada
			System.out.printf("%.2f",areaCono(altura, radio));//muestro el resultado del area del cono
			break;
		case 2:
			// area cilindro
			System.out.print("El área de un cilindro con radio "+radio+" y altura "+altura+" es: ");//muestro los datos de entrada
			System.out.printf("%.2f",areaCilindro(altura,radio));//muestro el resultado del area del cilindro
			break;
		}
	}
	
	public static void mostrarVolumen(double altura,double radio) {
		menuFiguras();//muestro el menu con las figuras
		int opcionMenuVolumen=recogerOpcionMenu(1,2);//recojo la opción y la almaceno en la variable

		switch (opcionMenuVolumen) {//opcion menu figura volumen
		case 1:	//si la opción es 1 muestro el volumen del cono
			System.out.print("El volumen de un cono con radio "+radio+" y altura "+altura+" es: ");
			System.out.printf("%.2f",volumenCono(altura, radio));
			break;
		case 2://si la opcion es 2 muestro el volumen del cilindro
			//volumen cilindro
			System.out.print("El volumen de un cilindro con radio "+radio+" y altura "+altura+" es: ");
			System.out.printf("%.2f",volumenCilindro(altura,radio));

			break;
		}
	}
	
//	Ejercicio 4: Realizar un método que tenga como parámetro de entrada dos cadenas,
//	y muestre por pantalla,	la concatenación de ambas cadenas.
	
	public static void ejercicio4() {
		System.out.println("Introduce la cadena1");//pido que se introduzca la cadena 1
		String cadena1=pedirCadena();//recojo el valor y lo almaceno en la variable
		System.out.println("Introduce la cadena2");//pido que se introduzca la cadena 2
		String cadena2=pedirCadena();//recojo el valor y lo almaceno en la variable
		muestraCadena(cadena1, cadena2);//muestro las dos cadenas concatenadas
	}
	
	public static String pedirCadena() {//método que recoje una cadena introducida por teclado y la almacena en una variable
		Scanner teclado=new Scanner(System.in);
		String cadena=teclado.nextLine();//declaro una variable y almaceno en ella el valor introducido por teclado
		return cadena;//devuelvo el valor
	}
	
	public static String concatenaCadena(String cadena1,String cadena2) {
		return cadena1+cadena2;//devuelvo la concatenación de dos cadenas
	}
	
	public static void muestraCadena(String cadena1,String cadena2) {
		System.out.println(concatenaCadena(cadena1, cadena2));//muestro el valor del metodo concatena cadena
	}
	
//	Ejercicio 5: Crear un método que reciba dos números como parámetros de entrada, y devuelva un número
//	aleatorio que se encuentre entre ambos números. Utilizar para ello el método Math.random()
//	(investigar como funciona el método).
	
	public static void ejercicio5() {
		int min,max;//declaro dos variables
		System.out.println("Introduce el número mínimo");//pido que se introduzca un mínimo
		min=(int)pedirRadio();//almaceno el valor el la variable
		System.out.println("Introduce el número máximo");
		max=(int)pedirRadio();
		muestraAleatorio(min, max);//muestro el valor 
	}
	
	public static int genearAleatorio(int min,int max) {//metodo que genera un número aleatrio entre un mínimo y un máximo
		int numAux;
		if (min>max) {//si el numero minimo es mayor que el numero mayor
			numAux=min;//guardo el valor de min en la variable aux
			min=max;//guardo el valor de max en la variable min
			max=numAux;//guardo el valor de numAux en max es decir intercambio los valores
		}
		int numero=(int)(Math.random()*(max - min+1) + min);//declaro una variable y almaceno el valor de las operaciones
		return numero;//devuelvo el número generado
	}
	
	public static void muestraAleatorio(int min,int max) {
		System.out.println(genearAleatorio(min,max));//muestro el número generado entre el mínimo y el máximo
	}
	
//	Ejercicio 6: Modifica el ejercicio 20 del tema 3, boletín 5, utilizando
//	el método desarrollado en el ejercicio 5, para que en lugar de introducir
//	el número el primer jugador al inicio, el número entre 1 y 50 se generé
//	automáticamente.
	
	public static void ejercicio6() {
		
		Scanner teclado=new Scanner (System.in);
		int numero,intentos,respuesta;//declaro las variables
		
		boolean numeroCorrecto=false;//declaro e inicializo la variable 
		intentos=1;
		numero=genearAleatorio(1, 50);
//		System.out.println(numero);
		respuesta=0;
		
		System.out.println("Te toca jugador N2, intenta adivinar el número, para ello dispones de 5 intentos");
		
		do {
			System.out.println("Intento número: " +intentos);//muestro el número de intentos
			respuesta=teclado.nextInt();//Recojo la respuesta y la almaceno
			if (respuesta<numero) {//comparo la respuesta con el número si es inferior muestro el mensaje
				System.out.println("El número es más alto");
			}else if (respuesta==numero) {//si el número es igual a la respuesta muestro el mensaje
				System.out.println("Enhorabuena has adivinado el número");
				numeroCorrecto=true;//asigno el valor true a la variable numero correcto y el bucle finalizaría
			}else {//si la respuesta es mayor muestro el mensaje
				System.out.println("El número es más bajo");
			}
			
			
			if (intentos==5&&respuesta!=numero) {//si los intenros son igual a 5 muestro el mensaje
				System.out.println("Lo siento no has adivinado el número");
			}
			intentos++;//aumento los intentos
			
		}while(intentos<=5&&!numeroCorrecto);//el bucle finaliza cuando los intentos llegan a 5 o numeroCorrecto pasa a valer true
	teclado.close();
			
	}
	
//	Ejercicio 8: Desarrollar un método que tenga como parámetro de entrada, la altura y base de un cuadrado. El método debe mostrar por pantalla un cuadrado pintado con asteriscos con dichas dimensiones. Por ejemplo para 3 y 5 sería. 
//	*****
//	*****
//	*****
//
//	Utiliza para ello un método que pinte una línea, cuya cabecera sea la siguiente:
	
	public static void ejercicio8(){
		int altura;
		int base;
		System.out.println("Introduce la altura del cuadrado:");//pido que se introduzca la altura
		altura=(int)pedirRadio();//recojo y almaceno el valor en la variable
		System.out.println("Introduce la base del cuadrado:");//pido que se introduzca la base 
		base=(int)pedirRadio();//almaceno el valor en la variable
		pintaCuadrado(base, altura);//llamo al metodo y le paso como parametro los valores recogidos anteriormente
		
	}

	public static void pintaLinea(int longitudLinea){//método que pinta una linea de asteriscos
		String cadena="";//declaro una variable 
		for (int i = 1; i <= longitudLinea; i++) {//hago un bucle cuyo indice empieza en 1 y termina cuando el indice sea igual a la longitud de la linea que se le pasa como parámetro
			cadena+="*";//voy sumando asteriscos a la cadena por cada ciclo de ejecución del bucle
			if (i==longitudLinea) {//cuando la i sea igual a la longitud de la linea 
				System.out.print(cadena);//muestro la cadena con el número de asteriscos que se han ido sumando por cada ciclo
			}
		}
		
		
	}
	public static void pintaCuadrado(int longitudLinea,int altura){//metodo que pinta un cuadrado a raiz de dos parámetros que se le pasa
		for (int i = 1; i <= altura; i++) {//hago un bucle que su indice empieza en 1 y termina cuando el indice sea igual a la altura que se le pasa como parámetro
			pintaLinea(longitudLinea);//muestro las lineas tantas veces como ciclos de ejecución tenga el bucle
			System.out.println();
		}
	}

	
//	Ejercicio 9: Determina qué calcula la siguiente función recursiva escrita en pseudocódigo. Piensa en que trazá tendría con varios casos de prueba, e implementa una función iterativa que realice la misma tarea en Java.
//
//	entero  funciónMisteriosa (entero m, entero n)
//	Inicio
//
//	entero resultado; 
//	SI (n == 0)
//	resultado = 0;
//	EN OTRO CASO
//	SI (n == 1)
//	              resultado = m; 
//	EN OTRO CASO
//	  resultado=m+funciónMisteriosa(m,n-1); 
	public static void ejercicio9() {
		int m,n;
		System.out.println("Introduce la base(m):");//pido que se introduzca el valor de m
		m=(int)pedirRadio();//recojo el valor y lo almaceno en la variable
		System.out.println("Introduce el coeficiente(n):");//pido que se introduzca el valor de n
		n=(int)pedirRadio();//recojo el valor y lo almaceno en la variable
		
		
		System.out.println(funcionMisteriosa(m, n));//llamo a la funcion y le paso como parámetro m y n e imprimo el resultado

	}

	public static int funcionMisteriosa(int m,int n) {//función que recibe dos parametros de entrada y devuelve un resultado
		int resultado;
		if (n==0) {//si la n es igual a 0
			resultado=0;//la función devuelve un o
		}else if (n==1) {//si la n es igual a 1
			resultado=m;//la función devuelve el valor de m
		}else {//para cualquier otro valor de n
			resultado=m+funcionMisteriosa(m,n-1);//la función devuelve el valor de resultado donde se realiza una llamada
												//recursiva a la función con n disminuido en 1 y el resultado se suma a m
												//esto se repite hasta que la n vale 1 y el resultado final es la suma de m
												//repetida n veces que es lo mismo que multiplicar m y n
		}
//		System.out.println(resultado);
		return resultado;
		
	}
	
//	Ejercicio 10: Realizar un método que dibuje un cuadrado como el de la figura.
//	El usuario elegirá el número de filas de la pirámide. En el caso de la figura 
//	de ejemplo se ha seleccionado 4. Los bordes se rellenarán con asteriscos para 
//	disponer de una forma cuadrada.

	private static void ejercicio10() {
		System.out.println("Introduce el número de filas de la pirámide");
		int filas=(int)pedirRadio();
		pintaCuadradoNumeros(filas, filas);

	}
	
	public static void pintaCuadradoNumeros(int longitudLinea,int altura){//metodo que pinta un cuadrado a raiz de dos parámetros que se le pasa
		int contador=1;
		int contadorAux=1,longitudLineaAux;
		String cadena="";
		String cadenaAux="";
		if (longitudLinea<10) {
			longitudLineaAux=(2*longitudLinea)+1;//aqui calculo el doble de la longitud de la linea mas 1
		}else {
			longitudLineaAux=(2*longitudLinea)+2;//aqui calculo el doble de la longitud de la linea mas 2
		}
		
		for (int i = altura; i >= 1; i--) {//hago un bucle que su indice empieza en 1 y termina cuando el indice sea igual a la altura que se le pasa como parámetro
			if (i==altura) {
				pintaLinea(longitudLinea);//muestro las lineas tantas veces como ciclos de ejecución tenga el bucle
				cadena+=contador;
				System.out.print(cadena);
				pintaLinea(longitudLinea);
				System.out.println();
			}else if (i<longitudLinea) {
				longitudLinea-=1;
				if (longitudLinea>=1) {
					contadorAux=contador-1;
					
					cadenaAux=contadorAux+cadenaAux;
				}else {
					cadenaAux=contadorAux+cadenaAux;
				}
				pintaLinea(longitudLinea);
				cadena+=contador;
				
//				System.out.print(concatenaCadena(cadena, cadenaInvertida(cadenaAux)));
				System.out.print(concatenaCadena(cadena, cadenaAux));
				pintaLinea(longitudLinea);
				System.out.println();
			}
			contador++;	
		}
		pintaLinea(longitudLineaAux);
	}
	
	
	
	public static String cadenaInvertida(String cadena) {//método que devuelve una cadena invertida
		StringBuilder stringBuilder = new StringBuilder(cadena);//declaro un StringBuilder que es una clase que me permite almacenar cadenas de caracteres mediante la creacion de un objeto y me permite mutar los caracteres de la cadena de texto
		String invertida = stringBuilder.reverse().toString();//declaro una variable nueva a la que le asigno el valor de la cadena revertida y con toString la paso a cadena de texto.
		return invertida;//devuelvo la cadena invertida.

	}
	
}
