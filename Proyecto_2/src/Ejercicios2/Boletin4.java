package Ejercicios2;

import java.util.Scanner;

public class Boletin4 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
		ejercicio8();
//		ejercicio9();
//		ejercicio10();
	}
	
	static void ejercicio1() {
		Scanner teclado = new Scanner(System.in);
//		Escribe un programa que pida por teclado un día de la semana y que
//		imprima por pantalla qué asignatura toca a primera hora ese día.
		String diaSemana;
		

	do {//En este bucle se ejecuta todo lo que haya dentro del "do" mientras se cumpla la condición dentro del while 
		

		System.out.println("Introduce un dia de la semana");
		
		diaSemana=teclado.nextLine().toUpperCase();//Los días que se introduzcan por teclado se pasan a mayúsculas
		
		if (diaSemana.equals("LUNES")||diaSemana.equals("VIERNES")) {
			System.out.println("Base de Datos");
		}else if (diaSemana.equals("MARTES")||diaSemana.equals("JUEVES")) {
			System.out.println("Programación");
		}else if (diaSemana.equals("MIÉRCOLES")||diaSemana.equals("MIERCOLES")) {
			System.out.println("Empresas e Iniciativa Emprendedora");
		}else {
			System.out.println("ERROR. Los dias de la semana corresponden de Lunes a Viernes");
		}
	}while(!(diaSemana.equals("SALIR")));	//esta condición quiere decir que el bucle se ejecutará de forma infinita mientras que no se introduzca una "S" por teclado
	
	teclado.close();//Cerramos el teclado
	
}
	
	
	static void ejercicio2() {
//		Realiza un programa que pida una hora por teclado y que muestre luego
//		buenos días, buenas tardes o buenas noches según la hora. Se utilizarán
//		los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se
//		tienen en cuenta las horas, los minutos no se deben introducir por
//		teclado.
		Scanner teclado = new Scanner(System.in);
		
		
		int hora;
		System.out.println("Introduce una hora");//Pedimos que se introduzca una hora por teclado
		hora=teclado.nextInt();//recogemos el valor y lo almacenamos en la variable hora
		do {
			if (hora<0||hora>24) {
				System.out.println("ERROR.Las horas van desde 0 a 24");
				System.out.println("Vuelve a introducir una hora");
				hora=teclado.nextInt();
			}
		}while(hora<0||hora>24);//El bucle se ejecutará siempre y cuando la hora introducida sea un valor negativo o mayor de 24
		
		switch (hora) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Buenos días");//Si la hora coincide con el valor 6-12 muestra el mensaje
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			System.out.println("Buenas tardes");//Si la hora coincide con el valor 13-20 muestra el mensaje
			break;
		case 21:
		case 22:
		case 23:
		case 24:
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Buenas noches");//Si la hora coincide de 21-24 y de 0-5 muestra el mensaje
			break;
		}
		
		teclado.close();
	}
	
	static void ejercicio3() {
//		Escribe un programa en que dado un número del 1 a 7 escriba el
//		correspondiente nombre del día de la semana.
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un número del 1 al 7");
		
		numero=teclado.nextInt();
		
		do {
			 if (numero<=0||numero>7) {
				 System.out.println("ERROR.Los numeros válidos van del 1 al 7");
				 System.out.println("Vuelve a introducir un número del 1 al 7");
					numero=teclado.nextInt();
			}
			
		
			switch (numero) {//Aquí se compara el numero con los distintos case, el case que coincida con el número 
								//realizará la acción que corresponda.
			case 1:
				System.out.println("Lunes");//En el case 1 por ejemplo mostrará por pantalla: Lunes
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
	
//			default:
//				System.out.println("ERROR.Introduce un número del 1 al 7");//Si no se introduce un número correspondiente al intervalo del 1 al 7 mostrará el mensaje en pantalla.
//				break;
			}
		}while((numero<=0||numero>7));//El bucle se repetirá hasta que se introduzca un 7 por teclado.
							//Ya que la condición del while es que se repita mientras que número sea distinto de 7
		
		teclado.close();
		
		
	}
	
	static void ejercicio4() {
//		Escribe un programa que calcule el salario semanal de un trabajador
//		teniendo en cuenta que las horas ordinarias (40 primeras horas de
//		trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
//		euros la hora.
		 
		Scanner teclado = new Scanner(System.in);
		
		int salarioSemanal,numeroHoras;//Declaración de las variables
		final int HORAS_JORNADA_LABORAL;
		HORAS_JORNADA_LABORAL=40;//Asignación de un valor a la variable
		
		
		System.out.println("¿Cuántas horas has trabajado esta semana?");//muestro el mensaje para que introduzcan las horas trabajadas
		numeroHoras= teclado.nextInt();//Recojo el valor introducido por teclado y lo almaceno en la variable
		

		do {//Todo lo que esté dentro del do se ejecutará tantas veces hasta que no se cumpla la condición, en este caso se ejecutará siempre que el numero sea 0 o inferior a 0.
			if (numeroHoras<=0) {//Compruebo que las horas no sean 0 ni negativas
				
				System.out.println("ERROR. El número de horas no puede ser 0 ni negativas.");//Si son negativas ó 0 muestro el mensaje de error
				System.out.println("¿Vuelve a introducir las horas que has trabajado esta semana?");//muestro el mensaje para que vuelvan a introducir las horas correctamente
				numeroHoras= teclado.nextInt();
			
			}
		}while(numeroHoras<=0);//El bucle se ejecutará hasta que el número de horas sea positivo.
		
			if(numeroHoras<=HORAS_JORNADA_LABORAL) {//Si el número de horas es inferior o igual a 40 horas
			
				salarioSemanal=numeroHoras*12;//Aquí se calcula el salario semanal si las horas no superan 40
				
				System.out.println("El salario semanal es: "+salarioSemanal);//Mostramos el salario
			
			}else if(numeroHoras>HORAS_JORNADA_LABORAL) {//Si el número de horas supera 40 horas  entra aquí
				
				salarioSemanal=HORAS_JORNADA_LABORAL*12;//Aqui se calcula el salario de la jornada de 40 horas
				
				numeroHoras-=HORAS_JORNADA_LABORAL;//Aqui se calculan las horas extra realizadas.
				numeroHoras*=16;//Aquí se calcula el dinero que corresponderia a las horas extra
				
				salarioSemanal+=numeroHoras;//Aqui se suma el dinero de la jornada normal 40 horas mas el dinero de las horas extra.
			
				System.out.println("El salario semanal es: "+salarioSemanal +"€ del cuál "+numeroHoras+"€ corresponden a las horas extra");//muestro el salario semanal y lo correspondiente de las horas extras.
			
			}	
		teclado.close();
	}
	
	static void ejercicio5() {
	//	Realiza un programa que pida 3 notas y calcule su media. El programa ha
	//	de indicar la nota en formato boletín (insuficiente, suficiente, bien,
	//	notable o sobresaliente)
		Scanner teclado = new Scanner(System.in);
		
		
		double nota1,nota2,nota3,media;
		
		
		//CONTROL DE LA ENTRADA DE DATOS
		
		System.out.println("Vamos a calular la nota del boletin. Introduzca la primera nota");
		nota1= teclado.nextDouble();//pedimos que se introduzca el numero por teclado
		do {
			
			if (nota1>10||nota1<0) {//Si la nota1 cumple la condicion de que sea mayor que 10 o menor que 0
				
				System.out.println("Error la nota debe ser del 0 al 10"); //Si se introduce un numero negativo o mayor que 10 muestra el mensaje.
				System.out.println("Vuelve a introducir la primera nota");//Se vuelve a pedir que se introduzca un valor
				nota1= teclado.nextDouble();//pedimos que se vuelva a introducir el número por teclado
				
				
			}
			
		}while(nota1>10||nota1<0);
		
		do {			
			System.out.println("Introduce la segunda nota");
			nota2= teclado.nextDouble();
			
			if (nota2>10||nota2<0) {//Aquí la condición sería igual que en la primera nota
				
				System.out.println("Error la nota debe ser del 0 al 10");
				System.out.println("Vuelve a introducir la segunda nota");
				nota2= teclado.nextDouble();
				
			}

		}while(nota2>10||nota2<0);
		
		do {
			
			System.out.println("Introduce la tercera nota");
			nota3= teclado.nextDouble();
			
			if (nota3>10||nota3<0) {//Aquí la condición seria igual que en las dos notas anteriores
				
				System.out.println("Error la nota debe ser del 0 al 10");
				System.out.println("Vuelve a introducir la tercera nota");
				nota3= teclado.nextDouble();
				
				
			}
			
		}while(nota3>10||nota3<0);	
		
		//					FIN DEL CONTROL DE LA ENTRADA DE DATOS
		
		
			
			media=(nota1+nota2+nota3)/3;//Si las notas son correctas calculamos la media
			
			if (media<5) {//Aquí se comprueba el valor de la media y dependiendo del valor muestra un mensaje u otro.
				System.out.println(media);
				System.out.println("La nota obtenida es: insuficiente");//En este caso si la media es inferior a 5 mostará ese mensaje.
			}
			if(media>=5&&media<6) {
				System.out.println(media);
				System.out.println("La nota obtenida es: suficiente");
			}
			if(media>=6&&media<7) {
				System.out.println(media);
				System.out.println("La nota obtenida es: bien");
			}
			if(media>=7&&media<9) {
				System.out.println(media);
				System.out.println("La nota obtenida es: notable");
			}
			if(media>=9&&media<=10) {
				System.out.println(media);
				System.out.println("La nota obtenida es: sobresaliente");
			}
			
			teclado.close();
			
		}
		
	static void ejercicio6() {
//		Escribe un programa que nos diga el horóscopo a partir del día (número)
//		y el mes de nacimiento (String). Por ejemplo: Dime tu mes de nacimiento:
//		enero  hay que trabajar en el programa con la cadena “enero”.
		
		Scanner teclado = new Scanner(System.in);
		String mesNacimiento;
		int diaNacimiento;
		
		
		System.out.println("Introduce tu día de nacimiento");
		diaNacimiento= teclado.nextInt();teclado.nextLine();//CORRECCIÓN ERROR SCANNER NO RECONOCE LA LINEA
		
		do {
			if (diaNacimiento<=1||diaNacimiento>31) {
				System.out.println("ERROR.El dia no puede ser negativo y/o mayor que 31");
				System.out.println("Vuelve a introducir tu día de nacimiento");
				diaNacimiento= teclado.nextInt();teclado.nextLine();
			}
		}while(diaNacimiento<=1||diaNacimiento>31);
		
		
		

		System.out.println("Introduce tu mes de nacimiento");

		mesNacimiento= teclado.nextLine().toLowerCase();//AQUÍ EL PROGRAMA ME DA UN FALLO Y ES QUE NO ME HACE EL SCANNER

		
		//Justo debajo se comprueban el rango de fechas correspondiente a cada signo del zodíaco.
		
		if ((diaNacimiento>=21&&diaNacimiento<=31&&mesNacimiento.equals("marzo"))||(diaNacimiento>=1&&diaNacimiento<=19&&mesNacimiento.equals("abril"))) {
			System.out.println("Tu signo del zodíaco es: Aries");
		}else if ((diaNacimiento>=20&&diaNacimiento<=30&&mesNacimiento.equals("abril"))||(diaNacimiento>=1&&diaNacimiento<=20&&mesNacimiento.equals("mayo"))) {
			System.out.println("Tu signo del zodíaco es: Tauro");
		}else if ((diaNacimiento>=21&&diaNacimiento<=31&&mesNacimiento.equals("mayo"))||(diaNacimiento>=1&&diaNacimiento<=20&&mesNacimiento.equals("junio"))) {
			System.out.println("Tu signo del zodíaco es: Géminis");
		}else if ((diaNacimiento>=21&&diaNacimiento<=30&&mesNacimiento.equals("junio"))||(diaNacimiento>=1&&diaNacimiento<=22&&mesNacimiento.equals("julio"))) {
			System.out.println("Tu signo del zodíaco es: Cáncer");
		}else if ((diaNacimiento>=23&&diaNacimiento<=31&&mesNacimiento.equals("julio"))||(diaNacimiento>=1&&diaNacimiento<=22&&mesNacimiento.equals("agosto"))) {
			System.out.println("Tu signo del zodíaco es: Leo");
		}else if ((diaNacimiento>=23&&diaNacimiento<=31&&mesNacimiento.equals("agosto"))||(diaNacimiento>=1&&diaNacimiento<=22&&mesNacimiento.equals("septiembre"))) {
			System.out.println("Tu signo del zodíaco es: Virgo");
		}else if ((diaNacimiento>=23&&diaNacimiento<=30&&mesNacimiento.equals("septiembre"))||(diaNacimiento>=1&&diaNacimiento<=22&&mesNacimiento.equals("octubre"))) {
			System.out.println("Tu signo del zodíaco es: Libra");
		}else if ((diaNacimiento>=23&&diaNacimiento<=31&&mesNacimiento.equals("octubre"))||(diaNacimiento>=1&&diaNacimiento<=21&&mesNacimiento.equals("noviembre"))) {
			System.out.println("Tu signo del zodíaco es: Escorpio");
		}else if ((diaNacimiento>=22&&diaNacimiento<=30&&mesNacimiento.equals("noviembre"))||(diaNacimiento>=1&&diaNacimiento<=21&&mesNacimiento.equals("diciembre"))) {
			System.out.println("Tu signo del zodíaco es: Sagitario");
		}else if ((diaNacimiento>=22&&diaNacimiento<=31&&mesNacimiento.equals("diciembre"))||(diaNacimiento>=1&&diaNacimiento<=19&&mesNacimiento.equals("enero"))) {
			System.out.println("Tu signo del zodíaco es: Capricornio");
		}else if ((diaNacimiento>=20&&diaNacimiento<=31&&mesNacimiento.equals("enero"))||(diaNacimiento>=1&&diaNacimiento<=18&&mesNacimiento.equals("febrero"))) {
			System.out.println("Tu signo del zodíaco es: Acuario");
		}else if ((diaNacimiento>=19&&diaNacimiento<=29&&mesNacimiento.equals("febrero"))||(diaNacimiento>=1&&diaNacimiento<=20&&mesNacimiento.equals("marzo"))) {
			System.out.println("Tu signo del zodíaco es: Piscis");
		}else {
			System.out.println("ERROR. La fecha introducida no es correcta");
		}
		teclado.close();
		
	}
	static void ejercicio7(){
//		Realiza un minicuestionario con 3 preguntas tipo test sobre la asignatura
//		de programación. Cada pregunta tiene 3 respuestas, pero solo una válida.
//		Cada pregunta acertada sumará un punto. El programa mostrará al final la
//		calificación obtenida.
//		Ejemplo de pregunta tipo test.
//		Cúal de estas sentencias genera un error:
//		1 – int i = “1”;
//		2 – int i = -1;
//		3 – int i = (int)2.2;
//		Respuesta: (el usuario tendría que responder aquí)
		
		
		Scanner teclado =new Scanner(System.in);
		
		int respuesta,puntuacion;
		puntuacion=0;
		
		
		
		System.out.println("¿Cúal de estas sentencias genera un error?\n"
				+ "1 - int i = \"1\"\n"
				+ "2 - int i = -1; \n"
				+ "3 - int i = (int)2.2");
		
		System.out.println("Respuesta: ");
		respuesta=teclado.nextInt();
		
		
		do {
			if (respuesta<1||respuesta>3) {
				System.out.println("ERROR.Las respuestas van del 1 al 3");
				System.out.println("¿Cúal de estas sentencias genera un error?\n"
						+ "1 - int i = \"1\"\n"
						+ "2 - int i = -1; \n"
						+ "3 - int i = (int)2.2");
				
				System.out.println("Respuesta: ");
				
				respuesta=teclado.nextInt();
			}
			if (respuesta==1) {//Si la respuesta es correcta
				puntuacion++;//La puntuación aumenta en 1
			}
		}while(respuesta<1||respuesta>3);
		
		
		System.out.println("¿Cúal de estas opciones se usa para el tipo de datos de una cadena?\n"
				+ "1 - int \n"
				+ "2 - double \n"
				+ "3 - String ");
		
		System.out.println("Respuesta: ");
		respuesta=teclado.nextInt();
		
		
		do {
			if (respuesta<1||respuesta>3) {
				System.out.println("ERROR.Las respuestas van del 1 al 3");
				System.out.println("¿Cúal de estas opciones se usa para el tipo de datos de una cadena?\n"
						+ "1 - int \n"
						+ "2 - double \n"
						+ "3 - String ");
				
				System.out.println("Respuesta: ");
				respuesta=teclado.nextInt();
			}
			if (respuesta==3) {//Si la respuesta es correcta
				puntuacion++;//La puntuación aumenta en 1
			}
		}while(respuesta<1||respuesta>3);

		System.out.println("¿Cúal es la forma correcta de declarar una variable?\n"
				+ "1 - float PRIMERO=1.75 \n"
				+ "2 - double primerNumero=3.5 \n"
				+ "3 - String 2Cadena=\"Hola\" ");
		
		System.out.println("Respuesta: ");
		respuesta=teclado.nextInt();
		
		do {
			if (respuesta<1||respuesta>3) {
				System.out.println("ERROR.Las respuestas van del 1 al 3");
				System.out.println("¿Cúal es la forma correcta de declarar una variable?\n"
						+ "1 - float PRIMERO=1.75 \n"
						+ "2 - double primerNumero=3.5 \n"
						+ "3 - String 2Cadena=\"Hola\" ");
				
				System.out.println("Respuesta: ");
				respuesta=teclado.nextInt();
			}
			if (respuesta==2) {//Si la respuesta es correcta
				puntuacion++;//La puntuación aumenta en 1
			}
		}while(respuesta<1||respuesta>3);
		
		
		System.out.println("La puntuación del usuario es: "+puntuacion);
		
		teclado.close();
	}
	
	
	static void ejercicio8() {
//		Calcula el salario neto que percibirá un trabajador, teniendo en cuenta
//		que al salario bruto tenemos que descontarle las retenciones. Éstas
//		dependerán del número de hijos de acuerdo con la siguiente tabla:
//		Datos de entrada: salario bruto de tipo float y número de hijos de tipo int.
		
//		Numero Hijos			Retenciones %
//		2 o menos-------------------20
//		Entre 3 e 5(incluido)--------15
//		Entre 5 e 7(incluido)--------10
//		Entre 7 e 9(incluido)--------5
//		10 o más --------------------0
		
//		Visualizar: salario bruto, descuento en euros y salario neto.
		
		Scanner teclado= new Scanner(System.in);
		
		
		float salarioBruto;
		int numeroHijos=0;
		
		System.out.println("Introduce el salario bruto");
		salarioBruto=teclado.nextFloat();
		do {
			if (salarioBruto<=0) {//si el salario es negativo o 0 sale el mensaje de error y vuelve a pedir que se introduzca el salario
				System.out.println("Error el salario no puede ser ni 0 ni negativo");
				System.out.println("Vuelve a introducir el salario bruto");//Si es
				salarioBruto=teclado.nextFloat();
			}
			
		}while(salarioBruto<=0);//Aquí se controla que el salario no sea ni 0 ni un número negativo.
		
		System.out.println("Introduce el número de hijos");
		numeroHijos =teclado.nextInt();
		do {
			
			if (numeroHijos<0) {
				System.out.println("ERROR.El número de hijos no puede ser negativo");
				System.out.println("Introduce el número de hijos");
				numeroHijos =teclado.nextInt();
			}
		}while(numeroHijos<0);
		
		

		
		if (numeroHijos<3&&numeroHijos>=0) {
			//Salario neto si tiene 2 hijos o menos
			System.out.print("El salario bruto es: "+salarioBruto);
			System.out.printf("€ el descuento es de: %.2f",(salarioBruto*0.2));//con printf se formatea el resultado y lo pone con 2 decimales con la formula %.2f 
			System.out.printf("€ y el salario neto si tienes menos de 3 hijos es de: %.2f",(salarioBruto*0.8));
			System.out.print("€");
		}else if(numeroHijos>=3&&numeroHijos<=5) {
			//Salario neto si tiene entre 3 y 5 hijos
			
			System.out.print("El salario bruto es: "+salarioBruto);
			System.out.printf("€ el descuento es de: %.2f",(salarioBruto*0.15));
			System.out.printf("€ y el salario neto si tienes entre 3 y 5 hijos es de: %.2f",(salarioBruto*0.85));
			System.out.print("€");
			
			
		}else if (numeroHijos>5&&numeroHijos<=7) {
			//Salario neto si tiene más de 5 y 7 hijos
			
			System.out.print("El salario bruto es: "+salarioBruto);
			System.out.printf("€ el descuento es de: %.2f",(salarioBruto*0.1));
			System.out.printf("€ y el salario neto si tienes entre 6 y 7 hijos es de: %.2f",(salarioBruto*0.9));
			System.out.print("€");
			
		}else if (numeroHijos>7&&numeroHijos<=9) {
			//Salario neto si tiene más de 7 y menos o igual que 9
			
			System.out.print("El salario bruto es: "+salarioBruto);
			System.out.printf("€ el descuento es de: %.2f",(salarioBruto*0.05));
			System.out.printf("€ y el salario neto si tienes entre 8 y 9 hijos es de: %.2f",(salarioBruto*=0.95));
			System.out.print("€");
			
		}else if (numeroHijos>=10) {
			System.out.println("El salario bruto es: "+ salarioBruto+"€ como tiene 10 hijos o más no tiene"
					+ " retenciones y por tanto el salario bruto coincide con el salario neto");
			
		}else {
			System.out.println("ERROR el numero de hijos no puede ser negativo");
		}
		teclado.close();
	}
		
	
	static void ejercicio9() {
//		Escribe un programa que pinte una pirámide rellena con un carácter
//		introducido por teclado que podrá ser una letra, un número o un símbolo
//		como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un
//		menú elegir si el vértice de la pirámide está apuntando hacia arriba o
//		hacia abajo.
//		Pistas:
//		El programa: Como qué carácter quieres rellenar la pirámide?
//		El usuario contesta:
//		El programa: Hacia dónde quieres que apunte la pirámide:
//		1. Hacia arriba
//		2. Hacia abajo
//		Respuesta: (el usuario contestaría aquí con 1 o con 2)
//		Podeis usar un String para guardar un carácter. Si quereis usar el tipo de
//		dato char para guardar el carácter teneis que usar el siguiente método:
//		String s;
//		Char c = s.charAt(0); // con esto se obtiene el primer character de s.
		
		Scanner teclado= new Scanner(System.in);
		
		String caracter;
		int opcion;
		
		System.out.println("¿Con qué carácter quieres rellenar la pirámide?");
		caracter=teclado.nextLine();
		
		do {
			if (caracter.length()>1||caracter.equals(" ")||caracter.isEmpty()) {//Aqui compruebo con length()que solo se introduce un caracter.
				//También, compruebo que ese caracter no sea un espacio en blanco
				//Y tambíen compruebo que se introduzca algun caracter y no se deje en blanco con isEmpty()
			System.out.println("ERROR. Debes introducir un caracter; No puedes introducir más de un carácter ni un espacio en blanco.");

			System.out.println("¿Con qué carácter quieres rellenar la pirámide?");
			caracter=teclado.nextLine();
			}
		}while(caracter.length()>1||caracter.equals(" ")||caracter.isEmpty());
		
		
		
		System.out.println("¿Hacia dónde quieres que apunte la pirámide?\n"
				+ "1. Hacia arriba\n"
				+ "2. Hacia abajo");
		
		
		opcion = teclado.nextInt();//Se introduce la opción por teclado
		
		switch (opcion) {
		case 1:
			
			for(int i=0 ;i<=10;i++) {//Este bucle se usa para crear las filas de la pirámide
				String cadena="";
				for (int j = 10; j >0 ; j--) {//Este bucle se usa para rellenar las filas de la pirámide
					if (i<=j) {
						cadena += " ";//Mientras se cumpla la condición la cadena se rellena con espacios en blanco
					}else if(i>j) {
						cadena +=caracter+" ";//cuando se cumpla la condición la cadena se rellena con el carácter elegido más un espacio
					}
				}

				System.out.println(cadena);//Mostramos la cadena
			}
			
			
			break;
		case 2:
			for(int i=10 ;i>0;i--) {//Este bucle se usa para crear las filas
				String cadena="";
				for (int j = 10; j >0 ; j--) {//Este se usa para rellenar dichas filas
					if (i<=j) {//Mientras se cumpla la condición se va rellenando la cadena con espacios
						cadena += " ";
					}else if(i>j) {//Cuando se cumpla esta condicón se rellena la cadena con el caracter elegido
						cadena +=caracter+" ";
					}
				}	
				System.out.println(cadena);//Mostramos la cadena 
			}
			break;
		default:
			System.out.println("ERROR.Introduce una opción correcta");
			break;
		}
		
		teclado.close();
	}
	static void ejercicio10() {
//		Realiza un programa que diga si un número introducido por teclado es
//		par y/o divisible entre 5.
		
		int numero;
		
		Scanner  teclado= new Scanner(System.in);
		
		System.out.println("Introduce un número");
		numero = teclado.nextInt();
		
		
		if(numero%2==0&&numero%5==0) {//un numero es divisible entre 5 si termina en 0 o 5
			System.out.println("El numero es par y es divisible entre 5");
			
		}else if(numero%2==0) {
			System.out.println("El numero es par");
			
		}else if (numero%5==0) {
			System.out.println("El numero es divisible entre 5");
		}

		teclado.close();
		
		
	}
		
	}


