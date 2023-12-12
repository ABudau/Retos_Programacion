package Ejercicios2;

import java.util.Arrays;
import java.util.Iterator;

public class BoletinArrays {

	public static void main(String[] args) {
//		ejercicio0();
//		ejercicio1();
//		ejercicio2(20,100,300);
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
		ejercicio6();
	}

	//	Ejercicio 0: Hacer un método que reciba una array de enteros como parámetro
	//	de entrada,	y que devuelva cuántos números pares contiene dicho array 

	private static void ejercicio0() {
		int array[]=rellenarArrayConNumerosAleatorios(20, 1, 50);//relleno el array con numeros del 1 al 50
		Teclado.mostrarArray(array);//muestro el array con los números
		System.out.println("\nEn el array proporcionado hay "+arrayNumerosPares(array)+" números pares");//muestro los numeros pares que hay dentro del array

	}

	/**
	 * Método que recibe un array de enteros y devuelve
	 * cuántos numeros  de los que tiene almacenados son pares
	 * @param array es el array que se le pasa como parámetro
	 * @return devuelve el número de valores pares que hay en el array
	 */
	public static int arrayNumerosPares(int array[]) {
		int pares=0;//declaro un contador
		for (int i = 0; i < array.length; i++) {//declaro un for para ir recorriendo las posiciones del array
			if (array[i]%2==0) {//si el valor de la posicion del array es divisible entre 2
				pares++;//aumento el contador
			}
		}
		return pares;//devuelvo el numero de pares
	}
	/**
	 * Método que rellena un array con números enteros aleatrorios
	 * @param tamanio es el tamaño del array a rellenar
	 * @param numeroMinimo es el número minimo del rango de números aleatorios a generar
	 * @param numeroMaximo es el número máximo del rango de números aleatorios a generar
	 * @return devuelve un array rellenado de números aleatorios
	 */
	public static int[] rellenarArrayConNumerosAleatorios(int tamanio,int numeroMinimo,int numeroMaximo) {
		int array[]=new int[tamanio];//declaro un nuevo array con el tamaño indicado
		for (int i = 0; i < array.length; i++) {
			array[i]=Teclado.genearNumeroAleatorio(numeroMinimo, numeroMaximo);//almaceno en la posicion de array[i] el número aleatorio generado
		}
		return array;//devuelvo el array relleno
	}
	
//	Ejercicio 1:   Implementa un método que dado un array cargado aleatoriamente,
//	genere a partir de él otro array que contenga los elementos pares que se encuentran
//	en el primero.
	
	private static void ejercicio1() {
		int numeros[]=rellenarArrayConNumerosAleatorios(30, 1, 100);//asigno el valor del metodo al array numeros al que le paso como parametro
		//tamañoarray, número minimo y número máximo
		System.out.print("Array principal-> ");
		Teclado.mostrarArray(numeros);//muestro el array generado con numeros aleatorios
		System.out.print("\nArray numeros pares-> ");

		Teclado.mostrarArray(arrayCargadoConNumerosPares(numeros));//muestro el array cargado con los números pares
	}
	
	/**
	 * Método al que se le pasa como parámetro un array cargado con números enteros y devuelve
	 * un array cargado con los números pares que contiene el array que se le pasa
	 * @param array es el array que se le pasa
	 * @return devuelve un array con todos los números pares procedientes del array original
	 */
	
	public static int[] arrayCargadoConNumerosPares(int array[]) {
		int arrayAux[]= new int[arrayNumerosPares(array)];//establezco la longitud del arrayAux acorde a los números pares generados dentro del array
		int j=0;//declaro un contador llamado j para recorrer las posiciones del arrayAux
		for (int i = 0; i < array.length; i++) {//declaro un bucle para recorrer el array
			if (array[i]%2==0) {//si el valor de la posición array[i] el resto de dividirlo entre 2 es o entra en el if
				arrayAux[j]=array[i];//asigno el valor del número a la posición j del arrayAux
				j++;//aumento j para cambiar la posicion dentro del arrayAux ya que la posición de j ya tiene un valor asignado
			}
		}

		return arrayAux;
	}
	//	Ejercicio 2:   Implementa un método que genere un array de 20 elementos, con números aleatorios
	//	comprendidos entre 100 y 300, de forma que no se repita ningún elemento.

	private static void ejercicio2(int tamanio,int min,int max) {
		
		int numerosAleatorios[]=new int[tamanio];//declaro un array con una longitud de 20 
		Teclado.mostrarArray(rellenarArrayNumerosNoRepetidos(numerosAleatorios,min,max));


	}
	
	/**
	 * Método que rellena un array con números generados aleatoriamente que no se repiten
	 * @return devuelve un array relleno con valores numéricos de tipo entero generados de forma aleatoria
	 */
	
	public static int[] rellenarArrayNumerosNoRepetidos(int numerosAleatorios[],int min,int max) {
		for (int i = 0; i < numerosAleatorios.length; i++) {//declaro un bucle for para recorrer las posiciones del array

			numerosAleatorios[i]=generarNumeroNoRepetido(numerosAleatorios,min,max);//almaceno el número generado dentro de la posición i

		}
		return numerosAleatorios;//devuelvo el array relleno de los números generados

	}
	
	/**
	 * Método que comprueba la existencia de un número entero dentro de un array
	 * @param numero es el número a buscar dentro del array
	 * @param array es el array que le pasamos para buscar dentro el número
	 * @return devuelve true si encuentra el número y devuelve false si no lo encuentra
	 * @author Budau
	 * @version 1.0
	 */
	
	public static boolean comprobarNumeroDentroDeArray(int numero,int array[]) {

		boolean contains=false;//declaro una variable 
		for (int i = 0; i < array.length&&contains!=true&&array[i]!=0; i++) {//declaro un bucle y le pongo como condición que se ejecute
			//hasta que llegue al final de la extensión del array y
			//que se ejecute mientras que contains tenga un valor false
			//y que el valor de la posicion del array sea distinta de 0
			if (array[i]==numero) {//si la posicion i dentro del array coincide con el número que busco
				contains=true;//contains vale true
			}else {//si la posicion i dentro del array no coincide con el número que busco
				contains=false;//contains vale false
			}
		}
		return contains;//devuelvo el valor de contains
	}
	
	/**
	 * Método que genera un número aleatorio y lo almacena dentro de un array y comprueba
	 * que ese número no esté almacenado en ninguna posición, si está almacenado genera otro número
	 * aleatorio de forma que el ciclo se repite hasta que se genera un número que no esté almacenado
	 * @param numerosAleatorios es el array que se le pasa para buscar dentro el número
	 * @param min es el número minimo desde el que parte el rango de números a generar
	 * @param max es el número máximo hasta el que llega el rango de números a generar
	 * @return devuelve el número generado
	 * @author Budau
	 * @version 1.0
	 */
	
	public static int generarNumeroNoRepetido(int numerosAleatorios[],int min,int max) {
		int numero;//declaro las variables
		boolean contains;
		do {//ejecuto el do hasta que contains tenga un valor false
			numero=Teclado.genearNumeroAleatorio(min, max);//genero el número aleatorio y almaceno el valor en la variable
			contains=comprobarNumeroDentroDeArray(numero, numerosAleatorios);//compruebo si el número que se ha generado
		}while(contains!=false);												//está almacenado en el array
		return numero;
	}

	//	Ejercicio 3:   Implementa un método que genere un array de 20 elementos, con números
	//	aleatorios comprendidos entre 200 y 400, de forma que no se repita ningún elemento.
	
	private static void ejercicio3() {
		
		ejercicio2(20, 200, 400);
	}
	
	//	Ejercicio 4:   Implementa un método que reciba como parámetro de entrada, un array,
	//	y devuelva otro array (return), con los elementos del primer array al revés (orden inverso).
	
	private static void ejercicio4() {
		
		int numerosAleatorios[]=new int[20];//declaro un array con una longitud de 20 
		
		System.out.print("Array principal-> " );//muestro el mensaje
		Teclado.mostrarArray(rellenarArrayNumerosNoRepetidos(numerosAleatorios,100,300));//muestro el array generado
		System.out.println();//inserto un salto de línea

		System.out.print("Array inverso-> " );//muestro el mensaje
		Teclado.mostrarArray(rellenarArrayInverso(numerosAleatorios));//muestro el array
	}
	
	/**
	 * Método al que le pasas un array y devuelve un array con los valores en orden inverso
	 * @param numerosAleatorios
	 * @return devuelve el array con los números en orden inverso
	 */
	
	public static int[] rellenarArrayInverso(int numerosAleatorios[]) {
		int arrayInverso[]=new int[numerosAleatorios.length];//declaro un array con la misma longitud que el array original
		int j=0;
		for (int i = arrayInverso.length-1; i >= 0; i--) {//empiezo el array numerosAleatorios por el final y voy decrementando las posiciones
			arrayInverso[j]=numerosAleatorios[i];//voy asignando el valor de numerosAleatorios a arrayInverso comenzando por la posición 0 e incrementando dicha posición
			j++;
		}
		return arrayInverso;//devuelvo el array cargado
	}
	
	
//	Ejercicio 5: Deseamos realizar un programa para el cálculo de ciertos valores con las
//	notas de la clase. Queremos calcular la nota media, la nota más alta, la más baja, 
//	cuántos alumnos tienen una nota superior a la media y cuántos tienen una nota inferior
//	a la media. El programa debe presentar un menú de opciones para que el usuario elija lo
//	que desee hacer y también se presentarán los resultados. El array de notas se generará
//	aleatoriamente con notas de 1 a 10.
//	Ejemplo del menú principal:
//	¿Qué desea hacer?
//	Calcular nota media
//	Ver la nota más alta
//	Ver la nota más baja
//	Número de alumnos por encima de la media
//	Número de alumnos por debajo de la media
	
	private static void ejercicio5() {
		int opcion;

		int notas[]=Teclado.rellenarArrayConNumerosAleatorios(15, 1, 10);//declaro un array y lo relleno con 15 números aleatorios del 1 al 10

		Teclado.mostrarArray(notas);//Muestro las notas generadas para los 15 alumnos
		System.out.println();
		
		boolean repetir=false;
		mostrarMenu();//Muestro el menú
		do {//declaro un bucle 
			opcion=Teclado.recogerOpcionMenu(1, 6);//recojo las opciones válidas del Menú que en este caso van del 1 al 6
			if (opcion==6) {//si la opción escogida es el 6 
				repetir=true;//a la cariable repetir se le asigna un valor true y el bucle finalizaria
			}
			realizarAccionSeleccionada(opcion, notas);//dependiendo de la opción escogida se realizará una acción u otra
		}while(!repetir);
		
	}
	
	/**
	 * Método que muestra un menú
	 */
	public static void mostrarMenu() {
		System.out.println("¿Qué desea hacer?"
				+ "\n\t1. Calcular nota media"
				+ "\n\t2. Ver la nota más alta"
				+ "\n\t3. Ver la nota más baja"
				+ "\n\t4. Número de alumnos por encima de la media"
				+ "\n\t5. Número de alumnos por debajo de la media"
				+ "\n\t6. Salir");

	}
	/**
	 * Método que realiza una determinada acción en función del valor de la opción que se le pase
	 * @param opcion es el parámetro que se le pasa para realizar una acción u otra
	 * @param array es el array que se le pasa como parámetro y es dónde están almacenados los datos 
	 * con los cuáles se relaizarán las acciones que escojamos
	 */
	public static void realizarAccionSeleccionada(int opcion,int array[]) {
			switch (opcion) {//declaro un switch
			case 1->{//si la opción es 1 calculo y muestro la media
				System.out.println("La nota media es: "+calcularNotaMedia(array));
			}
			case 2->{//si la opción es 2 muestro la nota más alta
				System.out.println("La nota más alta es: "+obtenerNotaMasAlta(array));
			}
			case 3->{//Si la opción es 3 muestro la nota más baja
				System.out.println("La nota mas baja es: "+ obtenerNotaMasBaja(array));
			}
			case 4->{//Si la opción es 4 muestro el número de alumnos superior a la media
				System.out.println("El número de alumnos superior a la media es: "+obtenerNumeroAlumnosSuperiorMedia(array));
			}

			case 5->{//Si la opción es 5 muestro el número de alumnos inferior a la media
				System.out.println("El número de alumnos inferior a la media es: "+obtenerNumeroAlumnosInferiorMedia(array));
			}
			}
	}
	/**
	 * Método que calcula la media de los números que contiene un array de enteros
	 * @param array es el array que contiene los valores 
	 * @return devuelve el valor de la media de los valores del array
	 */
	public static double calcularNotaMedia(int array[]) {
		int suma=0;
		double media;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];//recorro el array y voy sumando sus valores
		}
		media=(double)suma/array.length;//asigno a media el valor de la suma/la extensión del array
		return media;//devuelvo el valor de la media
	}
	/**
	 * Método que devuelve el valor más alto de un array de enteros
	 * @param array es el array donde están almacenados los valores a comparar
	 * @return devuelve el valor más alto
	 */
	public static int obtenerNotaMasAlta(int array[]) {
		 Arrays.sort(array);//ordeno el array de menor a mayor
		 return array[array.length-1];//devuelvo el valor de la última posición del array(Que corresponderá con el número más grande)
	}
	/**
	 * Método que devuelve el valor más bajo  de un array de enteros
	 * @param array es el array donde están almacenados los valores a comparar
	 * @return devuelve el valor más bajo
	 */
	public static int obtenerNotaMasBaja(int array[]) {
		 Arrays.sort(array);//ordeno el array de menor a mayor
		 return array[0];//devuelvo el valor de la primera posición del array (que corresponderá con el valor más bajo)
	}
	
	/**
	 * Método que devuelve el número de valores superiores a la media de los valores de un array
	 * @param array es el array donde se encuentran almacenados los valores
	 * @return devuelve el número de valores superiores a la media
	 */
	public static int obtenerNumeroAlumnosSuperiorMedia(int array[]) {
		int contador=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>calcularNotaMedia(array)) {//recorro el array comparando los valores del array con la media obtenida
				contador++;//Si el valor del array es superior al de la media aumento el contador
			}
		}

		return contador ;//devuelvo el valor del contador
	}
	/**
	 * Método que devuelve el número de valores inferiores a la media de los valores de un array
	 * @param array es el array donde se encuentran almacenados los valores
	 * @return devuelve el número de valores inferiores a la media
	 */
	public static int obtenerNumeroAlumnosInferiorMedia(int array[]) {
		int contador=0;
		for (int i = 0; i < array.length; i++) {//recorro el array comparando los valores del array con la media obtenida
			if (array[i]<calcularNotaMedia(array)) {
				contador++;//Si el valor del array es inferior al de la media aumento el contador
			}
		}
		
		return contador ;
	}
	
//	Ejercicio 6: (Sistema de Reserva de Vuelos). Una pequeña compañía aérea acaba
//	de comprar un ordenador para su sistema de reserva de vuelos. Escribir un 
//	programa que asigne asientos para cada vuelo del único avión de la compañía
//	(capacidad: 20 asientos). El programa debe contemplar zona de fumadores y no
//	fumadores. Los no fumadores ocuparan los asientos 1-15 y los fumadores el resto.
//	Utiliza un array de una dimensión para representar los asientos del avión. 
//	Utiliza 0 para indicar asiento vacío y 1 asiento ocupado.
//	El programa nunca debe hacer "overbooking", es decir, reasignar un asiento que ya está ocupado. Si la sección de fumadores se llena, el programa debe preguntar al pasajero si desea un asiento en la zona de no fumadores, y viceversa. Si acepta, entonces has de realizar la asignación de asiento correspondiente. Si no acepta, avise de la salida del próximo vuelo.

	private static void ejercicio6() {
		int opcion;
		int array[]= new int[20];
		
		do {
			mostrarMenuPrincipal();
			opcion=Teclado.recogerOpcionMenu(1, 5);
			realizarAccionMenuVuelos(opcion, array);
		}while(opcion!=5);


	}
	/**
	 * Método que muestra el menú principal del programa
	 */
	public static void mostrarMenuPrincipal() {
		System.out.println("1. Mostrar valores array");
		System.out.println("2. Elegir asiento");
		System.out.println("3. Rellenar asientos normales");
		System.out.println("4. Rellenar asientos fumadores");
		System.out.println("5. Salir");
	}
	/**
	 * Método que recibe dos parametros de entrada y realiza una acción con los valores de un array
	 * en función de la opción escogida
	 * @param opcion es la opción que se le pasa como parámetro
	 * @param array es el array sobre el cuál vamos a trabajar en fución de la opción escogida
	 */
	public static void realizarAccionMenuVuelos(int opcion,int array[]) {
		switch (opcion) {
		case 1 ->{//Si la opción es 1
			System.out.println(Arrays.toString(array)); //Uso la clase Arrays.toString y muestro el contenido del array
		}
		case 2->{//Si la opción es 2
			if (!comprobarAvionLLeno(array)) {
				escogerAsiento(array);//llamo al método de escoger asiento
			}else {
				System.out.println("Lo siento el avión está lleno, el próximo vuelo saldrá mañana");
				System.exit(0);//Muestro el mensaje y cierro el programa
			}
		}
		case 3 ->{//si la opción es 3
			rellenarAsientosNormales(array);//relleno los asientos normales
		}
		case 4 ->{//Si la opción es 4 
			rellenarAsientosFumadores(array);//relleno los asientos de los fumadores
		}
		}
	}
	/**
	 * Método que muestra una pregunta con dos opciones
	 */
	public static void preguntarFumar() {
		System.out.println("¿Eres fumador?");
		System.out.println("1. Si");
		System.out.println("2. No");
	}
	/**
	 * Método que muestra las posiciones del array incrementadas en 1 si en el valor de la posición 
	 * se encuentra almacenado un 0
	 * @param array es el array que recorremos y mostramos las posiciones cuyo valor contenido 
	 * sea un 0
	 */
	public static void mostrarAsientosDisponibles(int[] array){
		System.out.print("Elija el número de asiento -> ");
		for (int i = 0; i < array.length-6; i++) {//recorro la i desde el 1 al 14
			if (array[i]==0) {//compruebo el valor de la posición
				System.out.print(i+1+" ");//muestro la posición incrementandola en 1
			}
		}
		System.out.println();
	}
	/**
	 * Método que muestra las posiciones del array incrementadas en 1 si en el valor de la posición 
	 * se encuentra almacenado un 0 desde las posiciones de la extension del array menos 5 hasta el final del array
	 * @param array es el array que recorremos y mostramos las posiciones cuyo valor contenido 
	 * sea un 0
	 */
	public static void mostrarAsientosDisponiblesFumadores(int[] array){
		System.out.print("Elija el número de asiento -> ");
		for (int i = array.length-5; i < array.length; i++) {//recorro el array desde la posicion 15 a la 19 
			if (array[i]==0) {//compruebo que el valor de la posicion sea 0 
				System.out.print(i+1+" ");//muestro la posición incrementando el valor de la misma en 1
			}
		}
	}
	
	/**
	 * Método que comprueba un valor dentro de un rango de posiciones que va desde la 
	 * extension del array menos 5 hasta la poscion final del array
	 * @param array es el array que contiene los datos
	 * @return devuelve true o false en función de si el valor está almacenado en todas las posiciones del rango
	 */
	public static boolean comprobarAsientosFumadores(int array[]) {
		int contador=0;
		boolean relleno=false;
		for (int i = array.length-5; i < array.length; i++) {//ejecuto el bucle desde la posicion de la extensión del bucle menos 5 hasta que finalice el bucle o hasta que se encuentre el valor 0
			if (array[i]==1) {//si la posicion es mayor o igual a la extensión del array menos 5 y el valor de cada posición es 1 
				contador++;//aumento el contador
				if (contador==5) {//si el contador es igual a 5
					relleno=true;//relleno vale true
				}
			}
		}
		return relleno;//devuelvo el valor de la variable relleno
	}
	/**
	 * Método que comprueba un valor dentro de un rango de posiciones que va desde la posición 0 del 
	 * array hasta la extension del array menos 5
	 * @param array es el array que contiene los datos
	 * @return devuelve true o false en función de si el valor está almacenado en todas las posiciones del rango
	 */
	public static boolean comprobarAsientos(int array[]) {
		int contador=0;
		boolean relleno=false;
		for (int i = 0; i < array.length-5; i++) {//el bucle se ejecuta hasta llegar a la extensión del array menos 5 ó encuentre una posición con un valor 0
			if (array[i]==1) {//si la i es mayor o igual que 0 y la i es menor que la extensión del array menos 5 y todas las posiciones tienen un valor 1
				contador++;//aumento el contador
				if (contador==15) {//si el contador es igual a 15
					relleno=true;//relleno vale true
				}
			}
		}
		return relleno;//devuelvo el valor de relleno
	}

	/**
	 * Método que recibe un array y una opcion y realiza una asignación de un
	 * valor (1) si la posición escogida vale 0
	 * @param array es el array donde se almacenan los valores
	 * @param opcion es el parámetro que recibe
	 */
	public static void recogerValorAsiento(int[] array,int opcion) {
		int asiento;
		boolean vacio=false;
		do {//ejecuto el bucle hasta que vacío valga true
			if (opcion==1) {//Si el pasajero fuma
				asiento=Teclado.recogerValorValido(array.length-4, array.length)-1;//recojo el asiento introducido por teclado con los valores válidos del 16 al 20
			}else {//si el pasajero no fuma
				asiento=Teclado.recogerValorValido(1, array.length-5)-1;//recojo el valor válido entre los rangos
			}
			
			if (array[asiento]!=1) {//si la posición del array vale 0
				
				array[asiento]=1;//asigno el valor 1 a la posicion
				vacio=true;//valido coge el valor de true y el bucle terminaria
			}else {//si la posicion del array vale 1
				System.out.println("Error. El asiento escogido ya está reservado");//muestro el mensaje
				System.out.println("Vuelva a seleccionar un asiento:");
			}
			
		}while(!vacio);//el bucle se ejecuta hasta que la variable vacío sea true
	}
	/**
	 * Método que añade un valor a un array en una determinada posición en función de
	 * la pregunta que se le hace al comprador
	 * @param array es el array donde estarán almacenados los datos
	 */
	public static void escogerAsiento(int[]array) {
		
			int opcionFumar;
			preguntarFumar();//muestro la pregunta
			opcionFumar=Teclado.recogerOpcionMenu(1, 2);//recojo el valor valido entre 1 y 2 y lo almaceno en la variable
			if (opcionFumar==1) {//si fuma
				gestionReservaAsientoSiFuma(array, opcionFumar);//llamo a este método
			}else {//si no fuma 
				gestionReservaAsientoNoFuma(array, opcionFumar);//llamo a este método
			}
		
	}
	/**
	 * Método que asigna un valor a una posición del array si el valor del array no contiene un 1
	 * @param array es el array donde estan almacenados los datos
	 * @param opcionFumar es donde se almacena la respuesta de si el pasajero fuma o no
	 */

	public static void gestionReservaAsientoNoFuma(int[] array, int opcionFumar) {
		int opcion;
		if (comprobarAsientos(array)) {//comprobamos si los asientos de los no fumadores estan completos
			mostarMensajeAsientosCompletos();//si estan completos muestro el mensaje
			opcion=Teclado.recogerOpcionMenu(1, 2);//recojo la opcion valida entre 1 y 2
			if (opcion==1) {//si el pasajero  quiere un asiento para fumadores
				mostrarAsientosDisponiblesFumadores(array);//muestro los asientos disponibles
				recogerValorAsiento(array,1);//recojo el valor y lo inserto en el array y le paso como opción un 1 para validar las posiciones del 16 al 20
			}else {//si el pasajero no quiere el asiento de fumadores 
				System.out.println("El próximo vuelo saldrá mañana");//muestro el mensaje
			}
		}else {//si hay asientos disponibles
			mostrarAsientosDisponibles(array);//los muestro
			recogerValorAsiento(array,opcionFumar);//y recojo el valor y lo inserto en el array
		}
	}
	/**
	 * Método que asigna un valor a una posición del array si el valor del array no contiene un 1
	 * @param array es el array donde estan almacenados los datos
	 * @param opcionFumar es donde se almacena la respuesta de si el pasajero fuma o no
	 */
	public static void gestionReservaAsientoSiFuma(int[] array, int opcionFumar) {
		int opcion;
		if (comprobarAsientosFumadores(array)) {//compruebo si hay asientos disponibles, si no los hay
			mostrarMensajeAsientosCompletosFumadores();//muestro el mensaje 
			opcion=Teclado.recogerOpcionMenu(1, 2);//recojo la opcion valida entre 1 y 2
			if (opcion==1) {//Si quiere asiento normal
				mostrarAsientosDisponibles(array);//muestro los asientos
				recogerValorAsiento(array,2);//recojo e inserto el valor 1 en la posicion especificada,y le paso como opcion un 2 para validar los asientos del 1 al 15
			}else {//si no quiere asiento normal
				System.out.println("El próximo vuelo saldrá mañana");//muestro el mensaje
			}
		}else {//si hay asientos disponibles
			System.out.println("Escoge un asiento");//muestro el mensaje
			mostrarAsientosDisponiblesFumadores(array);//muestro los asientos
			recogerValorAsiento(array,opcionFumar);//recojo e inserto en la posicion especificada el valor 1
		}
	}

/**
 * Método que muestra un mensaje con dos opciones
 */
	public static void mostarMensajeAsientosCompletos() {
		System.out.println("Lo sentimos, todos los asientos de la zona normal están ocupados"
				+ "\n¿Quiere elegir un asiento para fumadores?"
				+ "\n 1. Si"
				+ "\n 2. No");
	}
	/**
	 * Método que muestra un mensaje con dos opciones
	 */

	public static void mostrarMensajeAsientosCompletosFumadores() {
		System.out.println("Lo sentimos, todos los asientos de la zona de fumadores están ocupados. "
				+ "\n¿Quiere elegir un asiento normal?"
				+ "\n 1. Si"
				+ "\n 2. No");
	}
	/**
	 * Método que rellena con el valor 1 desde la posicion 0 hasta la posicion final menos 5
	 * @param array es el array donde se rellenan los datos
	 */
	public static void rellenarAsientosNormales(int[] array){
		for (int i = 0; i < array.length-5; i++) {
			array[i]=1;
		}
	}
	/**
	 * Método que rellena con el valor 1 desde la posicion final menos 5 hasta la posicion final
	 * @param array es el array donde se rellenan los datos
	 */
	public static void rellenarAsientosFumadores(int[] array){
		for (int i = array.length-5; i < array.length; i++) {
			array[i]=1;
		}
	}
	/**
	 * Método que comprueba si todas las posicioes de un array están rellenas(en este caso con un valor de 1)
	 * @param array es el array donde comprobamos los valores
	 * @return devuelve true o false en función de si se cumple o no la condición
	 */
	public static boolean comprobarAvionLLeno(int[] array) {
		boolean lleno=false;
		if (comprobarAsientos(array)&&comprobarAsientosFumadores(array)) {//llamo a dos métodos que comprueban las posiciones del array
			//el primer método comprueba desde la posicion 0 a la posicion 14 y el segundo metodo comprueba desde la posicion 15 a la 19
			lleno=true;//si ambos métodos devuelven true lleno coge el valor de true
		}
		return lleno;//devuelvo el valor
	}
}
