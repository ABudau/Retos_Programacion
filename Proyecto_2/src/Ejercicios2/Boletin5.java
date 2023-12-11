package Ejercicios2;

import java.util.Iterator;
import java.util.Scanner;

public class Boletin5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
//		ejercicio8();
//		ejercicio9();
//		ejercicio10();
//		ejercicio11();
//		ejercicio12();
//		ejercicio13();
//		ejercicio14(8, 13, 122);
//		ejercicio14();
//		ejercicio15();
//		ejercicio16();
//		ejercicio17();
		ejercicio18();
//		ejercicio19();
//		ejercicio20();

	}
	static void ejercicio1() {
		//		Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
		int multiplo;//Declaro la variable
		multiplo=5;//inicializo la variable
		for(int i=0;i*multiplo<=100;i++) {//como nos pide los multiplos desde 0 a 100 ponemos esa condición y mostramos el resultado
			System.out.println(multiplo*i);//muestro la multiplicación
		}


	}

	static void ejercicio2() {
//		Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
		int multiplo,contador;//Decalro las variables
		multiplo=5;//Inicializo y asigno a la variable un valor
		contador=0;//inicializo la variable
		while(multiplo*contador<=100) {//ejecuto el bucle hasta que el contador por el multiplo sea 100
			System.out.println(multiplo*contador);//muestro la multiplicación
			contador++;//Aumento el contador
		}
	}
	
	static void ejercicio3() {
//		Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle dowhile.
		
		int multiplo,contador;//definimos las variables
		multiplo=5;//asignamos el valor 5 a la variable multiplo
		contador=0;//asignamos el valor 0 al contador ya que nos pide los multiplos de 5 del 0 al 100
		do {
			System.out.println(multiplo*contador);//mostramos el resultado, la primera vez que se ejecute mostrará un 0
			contador++;//incrementamos en 1 el contador
		}while(multiplo*contador<=100);//aqui se comprueba la condición
	}
	
	
	static void ejercicio4() {
//		Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
//		utilizando un bucle for
		
		for(int i=320;i>=160;i-=20) {//Declaramos el indice que en este caso es la i que va a tomar un valor de 320
									//ponemos la condición de que el bucle finalice cuando el indice sea mayor o igual a 160 
									//y decrementamos en 20 el indice cada vez que se ejecute el bucle
			
			System.out.print(" "+i);//Mostramos el indice
		}
		
		
		
	}
	static void ejercicio5() {
//		Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
//		utilizando un bucle while.
		
		int contador;//declaramos el contador
		contador=320;//le asignamos el valor de 320 al contador
		
		while(contador>=160) {//aquí especificamos que el bucle se ejecute mientras que el contador sea mayor o igual que 160
			
			System.out.println(contador);//mostramos el contador
			contador-=20;//decrementamos eb -20 el contador por cada ciclo que se ejecute el bucle
		}
		
	}
	
	
	static void ejercicio6() {
//		Muestra los números del 320 al 160, contando de 20 en 20 utilizando un
//		bucle do-while.
		
		int contador;//declaro la variable contador
		contador=320;//asigno el valor de 320 al contador
		do {
			System.out.println(contador);//Muestro el contador
			contador-=20;//Decremento en -20 el contador en cada ciclo de ejecución del bucle
		}while(contador>=160);//El bucle se ejecutará hasta que el contador sea igual a 160
	}
	
	
	static void ejercicio7() {
//		Realiza el control de acceso a una caja fuerte. La combinación será un
//		número de 4 cifras que estará guardado en una variable.
//		El programa nos pedirá la combinación para abrirla. Si no acertamos, se
//		nos mostrará el mensaje “Lo siento, esa no es la combinación” y si
//		acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
//		Tendremos cuatro oportunidades para abrir la caja fuerte.
		Scanner teclado= new Scanner(System.in);
		
		int combinacion,contador,combinacionAux;//definimos las variables
		combinacion=1997;//asigno un valor a la combinación
		contador=0;//inicializpo el contador
		do {
			System.out.println("Introduce la combinación para abrir la caja fuerte: ");//pedimos que se introduzca la combinación para abrir la caja fuerte
			combinacionAux=teclado.nextInt();//recojo la combinación introducida por teclado y la almacenamos en la variable cominacionAux
			if (combinacionAux!=combinacion) {//compruebo que si la combinación que introducimos por teclado es distinta de la combinaciión
				System.out.println("Lo siento, esa no es la combinación");//muestra el mensaje
				contador++;//y aumenta el contador en 1
			}else {//si la combinación que introducimos por teclado coincide con la combinación entomces:
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");//muestra el mensaje
			}
		}while(combinacionAux!=combinacion&&contador<=3);//aqui digo que el bucle se repita siempre que la combinacionAux sea distinta de la combinacion
														//y el contador sea menor o igual que 3, como el contador empieza en 0 y se ejecuta el do una vez
														//y luego comprueba la condición se ejecutaria 4 veces.	
		teclado.close();
	}
	static void ejercicio8() {
//		Muestra la tabla de multiplicar de un número introducido por teclado.
//		Formatea la salida de la siguiente manera:
		
		Scanner teclado = new Scanner(System.in);
		int numero,resultado,i;//declaro las variables incluido el índice del bucle
		
		System.out.println("Introduce el número");//pedimos que se introduzca un numero
		numero =teclado.nextInt();//almaceno el número introducido por teclado
		teclado.close();
		for (i = 1; i <=10; i++) {//ejecuto el bucle 10 veces
			resultado=numero*i;//almaceno en la variable resultado el resultado de multipolicar el numero por el indice
			System.out.println(numero+" x "+i+" = "+resultado);//muestro la tabla de multiplicar en el formato deseado.
		
		}
		
		
	}
	static void ejercicio9() {
//		Realiza un programa que nos diga cuántos dígitos tiene un número
//		introducido por teclado. Hacer uso de while o do-while
		
		Scanner teclado= new Scanner(System.in);
		//DECLARAMOS LAS VARIABLES
		long numero,numeroAux;
		long contador;
		
		//Asigno un valor al contador
		contador=1;
	
		System.out.println("introduce un número");
		numero=teclado.nextLong();//almaceno el número que pedimos por teclado
		numeroAux=numero;//almaceno en una variable auxiliar el valor del numero que hemos introducido
		
//		do {
//			if (numeroAux<10) {//si el numero que hemos introducido es menor que 10 mostramos el mensaje
//				
//				System.out.println("El número "+ numero+ " tiene "+contador+" digito");
//			}else{//si es mayor que 10 
//				contador++;	//aumentamos el contador
//				
//				numeroAux/=10;	//divido entre 10 el numero introducido y aumentamos el contador por cada ciclo de bucle que se ejecute
//			}
//			
//		}while(numeroAux>10);//el bucle se ejecuta hasta que la división del número auxiliar entre 10
//								//haga que la condición se deje de cumplir y termine el bucle.
//		
//		if (numero>=10) {//si el numero que hemos introducido es mayor que 10 
//			System.out.println("El número "+ numero+ " tiene "+(++contador)+" digitos");//mostramos el mensaje después de haber ejecutado el bucle.
//		}															//aumento el contador en 1 antes de mostrar
		
		while(numeroAux>=10) {//ejecuto el bucle si el numero es mayor que 10
				contador++;	//aumento el contador
				
				numeroAux/=10;	//divido entre 10 el numero introducido y aumentamos el contador por cada ciclo de bucle que se ejecute
			}
		if (numero<10) {//si el numero es menor que 10 mostramos el mensaje
			System.out.println("El número "+ numero+ " tiene "+contador+" digito");
		}else {//si el número es mayor muestro el mensaje 
			System.out.println("El número "+ numero+ " tiene "+contador+" digitos");
		}
		teclado.close();
	}
	
	static void ejercicio10() {
//		Escribe un programa que calcule la media de un conjunto de números
//		positivos introducidos por teclado. A priori, el programa no sabe cuántos
//		números se introducirán. El usuario indicará que ha terminado de
//		introducir los datos cuando meta un número negativo
		Scanner teclado= new Scanner(System.in);
		//Declaro las variables
		double numeros,numerosAux,media;
		int contador;
		
		//Inicializo las variables
		numeros=0;
		numerosAux=0;
		contador=0;
		
		while(numeros>=0) {//el bucle se ejecutará siempre que el número sea positivo
			
			System.out.println("Introduce un número");//pido que se introduzca el número por teclado
			numeros=teclado.nextInt();//almaceno el número que introducimos por teclado
			if (numeros>=0) {//si el número es mayor o igual a cero 
				contador++;//aumento el contador
				numerosAux+=numeros;//almaceno y sumo el valor de números en la variable numerosAux
			}
		}
		media=numerosAux/contador;//calculo la media
		System.out.printf("La media de los números introducidos es: %.2f",media);//muestro la media con dos decimales
		teclado.close();
	}
	
	static void ejercicio11() {
//		Escribe un programa que muestre en tres columnas, el cuadrado y el cubo
//		de los 5 siguientes números enteros a partir de uno que se introduce por
//		teclado.
//		Ejemplo: numero 13
//		Numero Cuadrado Cubo
		Scanner teclado= new Scanner(System.in);
		
		int numero,numeroAux,indice,numeroCuadrado,numeroCubo;
		indice=0;//asigno un valor al indice
		System.out.println("Introduce un número");//pido que se introduzca el número por teclado
		numero=teclado.nextInt();//almaceno el número introducido por teclado
		numeroAux=numero;//almaceno el numero en una variable auxiliar
		System.out.println("Número \tCuadrado \t Cubo");
				
		while(indice<5) {//almaceno el bucle hasta que se cumpla la condición
			numeroCuadrado=(int) Math.pow(numeroAux, 2);//Hago la potencia del cuadrado al numeroAux y la almacenamos en la variable
			numeroCubo=(int) Math.pow(numeroAux, 3);//Hago la potencia del cubo al numeroAux y la almacenamos en la variable
			System.out.println(numeroAux+"  \t "+numeroCuadrado+"  \t \t "+ numeroCubo);//Mostramos los datos en el formato deseado);
			numeroAux++;//Aumento el numero auxiliar en 1 cada vez que se ejecute el bucle
			indice++;//Aumento en 1 el indice cada vez que se ejecute el bucle
		}
		teclado.close();
		

	}
	static void ejercicio12() {
//		Visualiza por pantalla la suma de los números pares y la suma de los
//		impares desde 1 hasta 100.
		
		int contador,sumaPares,sumaImpares;//Declaro las variables
		contador=1;//inicializo el contador a 1
		sumaImpares=0;
		sumaPares=0;
		do {
			if (contador%2==0) {//si el contador es par
				sumaPares+=contador;//se suma y se almacena en la variable sumaPares el valor del número par
			}else {//si el contador no es par 
				sumaImpares+=contador;//se suma y se almacena en la variable sumaImpares el valor del número impar
			}
			contador++;//aumento el contador
		}while(contador<=100);
			
		System.out.println("La suma de numeros pares del 1 al 100 corresponde a la cifra de: "+sumaPares);//muestro la suma de los números pares
		System.out.println("La suma de numeros impares del 1 al 100 corresponde a la cifra de: "+sumaImpares);//muestro la suma de los números impares

	}
	
	static void ejercicio13() {
//		Escribe un programa que lea una lista de diez números y determine
//		cuántos son positivos, y cuántos son negativos.
		
		Scanner teclado=new Scanner(System.in);
		int numeros,positivos,negativos,contador;//Declaro las variables
		
		//inicializo las variables
		contador=1;
		positivos=0;
		negativos=0;
		
		System.out.println("Introduce 10 números y al final te diré cuántos han sido positivos y cuantos negativos.");//muestro el mensaje
		do {
			System.out.println("Introduce el número "+contador);//Muestro el mensaje con el número de datos que lleva introducidos
			numeros=teclado.nextInt();//Recojo los números
			if (numeros<0) {//Si el número es negativo
				negativos++;//Aumento el contador
			}else {//Si es positivo 
				positivos++;//Aumento el contador de positivos
			}
			contador++;//Aumento el contador para que se cumpla la condición del bucle.
		}while(contador<=10);//cuando el contador llegue a diez termina el bucle
		
		System.out.println("De los 10 números que has introducido "+positivos+" son positivos y "+negativos+" son negativos");//Muestro el mensaje con el número de positivos y negativos
		teclado.close();
	}
	
//	static void ejercicio14(int a,int b,int c) {
////		Haz una función que dados 3 números a, b y c introducidos por teclado devuelva
////		cuál es el mayor
//		
//		if (a>b&&a>c) {
//			System.out.println("El mayor es: "+a);
//		}else if (b>c&&b>a) {
//			System.out.println("El mayor es: "+b);
//		}else {
//			System.out.println("El mayor es: "+c);
//		}
//		
//	}
	static void ejercicio14() {
//		Haz una función que dados 3 números a, b y c introducidos por teclado devuelva
//		cuál es el mayor
		Scanner teclado=new Scanner(System.in);
		int a,b,c;//Declaro las variables
		
		System.out.println("Introduce el primer número");//Pido que se introduzca el número
		a=teclado.nextInt();//Almaceno el número en la variable
		
		System.out.println("Introduce el primer segundo");
		b=teclado.nextInt();
		
		System.out.println("Introduce el primer tercer");
		c=teclado.nextInt();
		
		if (a>=b&&a>=c) {//si la condición se cumple
			System.out.println("El mayor es: "+a);//Muestro el mensaje
		}else if (b>=c&&b>=a) {//si la condición se cumple
			System.out.println("El mayor es: "+b);//Muestro el mensaje
		}else {//Si no se cumplen ninguna de las dos condiciones anteriores 
			System.out.println("El mayor es: "+c);//Muestro el mensaje
		}
		
		teclado.close();
		
	}
	static void ejercicio15() {
		
//		Un ordenador se deprecia cada año un 40% sobre el valor del año
//		anterior. Obtener un listado de la depreciación a lo largo de los años,
//		suponiendo que por debajo de 300 euros no se deprecia. La salida podría
//		ser:
//		PRECIO ADQUISICIÓN 2000
//		AÑOS VALOR_ORDENADOR
//		1 1200
//		2 720
//		3 432
//		4 259,2
//		El ordenador se depreció en 4 años.
		
		
		Scanner teclado = new Scanner(System.in);
		//Declaro las variables
		double precioAdquisicion;
		final int PRECIO_DEPRECIACION;
		final double DEPRECIACION;
		
		//inicializo las variables
		int contador=1;
		
		 PRECIO_DEPRECIACION=300;
		 DEPRECIACION=0.6;//QUE CORRESPONDE A LA DEPRECIACIÓN DEL 40%
		
		 System.out.println("INTRODUCE EL PRECIO DE ADQUISICÓN DEL ORDENADOR");
		precioAdquisicion=teclado.nextDouble();
		
		System.out.println("PRECIO ADQUISICIÓN "+precioAdquisicion);//muestro el precio de adquisición
		System.out.println("AÑOS \t VALOR_ORDENADOR");
		
		while(precioAdquisicion>PRECIO_DEPRECIACION) {//Aqui indico que el bucle se ejecute mientras que el precio de adquisición sea mayor que el precio de depreciación
			precioAdquisicion*=DEPRECIACION;//calculo el precio, restandole el 40% al precio de adquisición y almacenamos el valor en la variable valorAdquisicion
			System.out.println(contador+" \t "+ precioAdquisicion);//muestro el contador que corresponderia a los años y el valor del precio después de cada año.
			if (precioAdquisicion>PRECIO_DEPRECIACION) {//aumento el contador siempre que el precio de adqusicion sea mayor que el precio de depreciación
				contador++;
			}
			
		}
		System.out.println("El ordenador se depreció en: "+contador+" años");//Al salir del bucle mostrará el mensaje con los años transcurridos hasta que el ordenador se ha depreciado
	teclado.close();
	}
	
	static void ejercicio16() {
//		Programa que visualice todos los años bisiestos comprendidos entre 2000
//		y 2100, ambos inclusive.
//		Un año es bisiesto si es divisible entre 4 y no es divisible entre 100 o si es
//		divisible entre 400.
//		Un número es divisible por otro si el resto de la división es 0
		
		int anio;//declaro el año
		anio=2000;//inicializo el año.
		do {
			if ((anio%4==0) && (anio%100!=0)||(anio%400==0)) {//si el año es divisible entre 4 y no divisible entre 100 o divisible entre 400
				System.out.println(anio);//muestro el año
			}
			
			anio++;//Aumento el año/contador
		}while (anio<=2100);//el bucle finaliza cuando el año sea menor o igual a 2100
		
		
	}
	static void ejercicio17() {
//		Escribe un programa que diga si un número introducido por teclado es o
//		no primo. Un número primo es aquel que sólo es divisible entre él mismo
//		y la unidad. Por ejemplo el 7. Pues recorriendo desde el 1 hasta el 7 veo
//		que 7 solo es divisible por 1 y por 7  es primo.
		
		Scanner teclado=new Scanner(System.in);
		int numero,contador,contadorCeros;//Declaro las variables
		contador=1;//asigno un valor al contador
		numero=0;//inicializo la variable
		contadorCeros=0;//Inicializo el contador de ceros con un valor 0
		boolean positivo=true;
		
		do {
			System.out.println("Introduce un número: ");//pido que se introduzca el número
			numero=teclado.nextInt();//R
			if (numero<0) {//Si el número es negativo
				System.out.println("ERROR.El número no puede ser negativo ");//Muestro el mensaje
			}else {//si el numero es positivo
				positivo=false;//asigno un valor false a positivo y terminaría el bucle
			}
		}while(positivo);//Se ejecuta siempre que positivo sea true
		
		
		while(positivo!=true) {//ejecuto el bucle hasta que se cumpla la condicion
			
			if (numero%contador==0) {//si el resto del número dividido entre el contador es cero
				contadorCeros++;//Incremento el contador de ceros
			}
			if (contadorCeros>=2) {
				positivo=true;
			}
			contador++;//Aumento el contador
		}
		if (contadorCeros>2||numero<=1) {//Si el número introducido es divisible por más de dos números o el número introducido es 0 
			System.out.println("El número no es primo");//mostramos el mensaje
		}else {//Si el número introducido es divisible por dos numeros es decir por sí mismo o la unidad
			System.out.println("El número es primo");//Muestro el mensaje
		}
		teclado.close();		
	}
	static void ejercicio18() {
//		Realiza un programa que pinte una pirámide por pantalla. La altura de la
//		pirámide se debe pedir por teclado. El carácter con el que se pinta la
//		pirámide también se debe pedir por teclado
		
		Scanner teclado= new Scanner(System.in);//Declaro los Scanners que voy a usar
		Scanner teclado1= new Scanner(System.in);
		
		//Declaro las variables
		String caracter;
		int altura,alturaAux;
		
		//Controlo la entrada de datos en este caso es la altura de la pirámide
		do {
			System.out.println("¿Qué altura quieres que tenga la pirámide?");//pido que se introduzca la altura de la pirámide
			altura=teclado1.nextInt();//recojo la altura y la almaceno en la variable
			if(altura<2) {//Si la altura es inferior a 2 el mensaje se muestra
				System.out.println("ERROR.La altura debe ser mínimo de 2");
			}
		}while(altura<2);//Si la altura es inferior a 2 el bucle se repite
		
		alturaAux=altura;//asigno el valor de altura a alturaAux
		do {
			
			System.out.println("¿Con qué carácter quieres rellenar la pirámide?");//Pregunto con qué caracter se quiere rellenar la pirámide
			caracter=teclado.nextLine();//Recojo el caracter y lo almaceno en la variable caracter
			
			if (caracter.length()>1||caracter.equals(" ")||caracter.isEmpty()) {//Aqui compruebo con length()que solo se introduce un caracter.
				//También, compruebo que ese caracter no sea un espacio en blanco
				//Y tambíen compruebo que se introduzca algun caracter y no se deje en blanco con isEmpty()
			System.out.println("ERROR. Debes introducir un caracter; No puedes introducir más de un carácter ni un espacio en blanco.");

			
			}
		}while(caracter.length()>1||caracter.equals(" ")||caracter.isEmpty());//Si la cadena que se introduce mide más de 1 caracter o el carácter es un espacio en blanco o el carácter está vacío el bucle se vuelve a ejecutar.
		
		for(int i=1 ;i<=altura;i++) {//Este bucle se usa para crear las filas de la pirámide
			String cadena="";
			for (int j = alturaAux; j >0 ; j--) {//Este bucle se usa para rellenar las filas de la pirámide
				if (i==j) {
					cadena += " "+caracter;//Mientras se cumpla la condición la cadena se rellena con un espacio en blanco y un carácter
				}else if(i<j){
					cadena += " ";//Mientras se cumpla la condición la cadena se rellena con espacios en blanco
				}else if(i>j) {
					cadena +=" "+caracter;//cuando se cumpla la condición la cadena se rellena con el carácter elegido más un espacio
				}
			}
		

			System.out.println(cadena);//Mostramos la cadena que correspondería a la pirámide
		}
		teclado.close();
		teclado1.close();
	}
	static void ejercicio19() {
//		Programa que pida por teclado:
//			• Un valor inicial (inicial).
//			• Un factor de incremento (incremento).
//			Los dos valores deben ser mayores que cero y de tipo entero. Si son
//			menores o iguales que cero se pedirán de nuevo.
//			Se desea:
//			Visualizar una serie de 5 números, comenzando en inicial e
//			incrementando según el factor de incremento.
//			Visualizar el resultado de sumar los 5 números.
		
		Scanner teclado=new Scanner(System.in);
		//Declaro las variables
		int valorInicial,incremento,contador,suma;
		valorInicial=0;
		incremento=0;
		suma=0;
		boolean positivo=true;//inicializo la variable con un valor true
		contador=1;
		
		
		while(positivo) {//ejecuto el bucle siempre que positivo sea true
			System.out.println("Introduce un valor");//pido que se introduzca un valor
			valorInicial=teclado.nextInt();//recojo el valor y lo almaceno en la variable valorInicial
			if (valorInicial<=0) {//si el valor es menor o igual que 0 muestro el mensaje
				System.out.println("Error el número tiene que ser mayor que 0");
			}else {//si el valor es mayor que 0 
				positivo=false;//le asigno el valor false a positivo y el bucle termina
			}
		}
		while(!positivo) {//aquí la variable positivo tiene un valor de false así que ejecutamos el bucle mientras que positivo sea false
			System.out.println("Introduce un incremento");//pido que se introduzca un valor 
			incremento=teclado.nextInt();//recojo ese valor y lo almaceno en la variable
			if (incremento<=0) {//Si incremento es menor que 0 muestro el mensaje 
				System.out.println("ERROR.El número tiene que ser mayor que 0");
			}else {//si incremento es mayor que 0
				positivo=true;//asigno el valor true a la variable positivo y el bucle terminaria.
			}
			
		}
		
		do {
			System.out.print(valorInicial+" ");//muestro el valor inicial
			suma+=valorInicial;//sumo y almaceno el valor de valorInicial en suma
			valorInicial+=incremento;//sumo y almaceno en valor inicial el incremento
			
			contador++;//aumento el contador
		}while(contador<=5);//el bucle finaliza cuando el contador llegue a 5
		System.out.println("\nLa suma de los 5 números es: "+suma);//muestro la suma de los números
		teclado.close();
	}
	static void ejercicio20() {
//		Programa que permita el siguiente juego: Un primer jugador teclea un
//		número entre 1 y 50 (debe comprobarse que sea correcto). El segundo
//		jugador intentará adivinarlo.
//		Para ello tendrá como máximo 5 intentos y el programa irá sacando
//		mensajes indicando si el número a adivinar es mayor o menor al número
//		introducido por el jugador 2. Al final se indicará si el jugador ganó o
//		perdió. Si se adivina el número antes de que finalicen los 5 intentos el
//		programa finaliza
		
		Scanner teclado=new Scanner (System.in);
		int numero,intentos,respuesta;//declaro las variables
		
		boolean numeroCorrecto=true;//declaro e inicializo la variable 
		intentos=1;
		numero=0;
		respuesta=0;
		
		while(numeroCorrecto) {//ejecuto el bucle siempre que numeroCorrecto sea true
			System.out.println("Jugador N1, introduce un número entre 1 y 50");//pido que se introduzca un valor entre 1 y 50
			numero=teclado.nextInt();//recojo el valor y lo almaceno en la variable 
			if (numero<1||numero>50) {//si el numero es inferior a 1 o mayor de 50
				System.out.println("Error el número tiene que ser entre 1 y 50");
			}else {//si el valor es mayor que 0 
				numeroCorrecto=false;//le asigno el valor false a positivo y el bucle termina
			}
		}
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
			
			
			if (intentos==5) {//si los intenros son igual a 5 muestro el mensaje
				System.out.println("Lo siento no has adivinado el número");
			}
			intentos++;//aumento los intentos
			
		}while(intentos<=5&&!numeroCorrecto);//el bucle finaliza cuando los intentos llegan a 5 o numeroCorrecto pasa a valer true
	teclado.close();
			
	}
	
}
