import java.util.Iterator;
import java.util.Scanner;

public class EjerciciosReto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fizzBuzz();
//		calculadoraSimple();
//		calculadoraFactorial();
//		generadorPatronesEstrella();
//		serieFibonacci();

	}
	static void fizzBuzz() {
		
		for (int i = 1; i <=100 ; i++) {//Ienicializamos el bucle para que se ejecute del 1 al 100
			if (i%3==0&&i%5!=0) {//si el número es divisible entre 3 pero no es divisible entre 5 //mostramos fizz
				System.out.println("fizz");
	
			}else if (i%5==0&&i%3!=0) {//Si el número es divisible entre 5 y no es divisible entre 3 mostramos buzz
				System.out.println("buzz");
				
			}else if (i%3==0&&i%5==0) {//Si el número es divisible entre 3 y entre 5 no mostramos nada, un espacio en blanco
				System.out.println("");
			}else {
				System.out.println(i);
			}
			
		}
	}
	
	static void calculadoraSimple() {
		Scanner teclado=new Scanner(System.in);
		
		int n1,n2,opcion;//Declaramos las variables
		double resultado;
		resultado=0;//Inicializamos la variable a 0
		
		System.out.println("Introduce el primer número");//Pedimos que se introduzca el primer número
		n1=teclado.nextInt();//Almacenamos el primer número en la variable n1
		System.out.println("Introduce el segundo número");//Pedimos que se itroduzca el segundo número
		n2=teclado.nextInt();//Almacenamos el segundo número en la variable n2
		
		System.out.println("Elige la operación a realizar: ");//Mostramos el menú con las opciones
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACIÓN");
		System.out.println("4. DIVISIÓN");
		
		opcion=teclado.nextInt();//recogemos el valor de la variable opcion
		switch (opcion) {//comparamos el valor de la variable opcion con los distintos case
		case 1://Si la opcion es 1 suma
			resultado=n1+n2;
			break;
		case 2://Si la opcion es 2 resta
			resultado=n1-n2;
			break;
		case 3://Si la opcion es 3 multiplica
			resultado=n1*n2;
			break;
		case 4://Si la opcion es 4 divide 
			resultado=(double)n1/n2;//hacemos un casting para almacenar en la variable resultado el resultado "decimal" de la operación
			break;
		default://si el usuario no introduce ninguna de las opciones anteriores muestra el mensaje de error
			System.out.println("ERROR. ELIGE UNA OPCIÓN CORRECTA");
			break;
		}
		if (opcion==4) {//si la opción escogida es la división (como puede dar decimales) 
			System.out.printf("El resultado es: %.3f",resultado);//mostramos el resultado limitado a tres decimales
		}else if (opcion>0&&opcion<4) {//si las opciones son sumar restar o multiplicar 
			System.out.println("El resultado es: "+resultado);//mostramos el resultado
		}	
		teclado.close();
	}
	
	static void calculadoraFactorial() {
		Scanner teclado=new Scanner(System.in);
		
		int n1,suma,multiplicacion;//declaramos las variables
		suma=0;//inicializamos las variables
		multiplicacion=0;
		
		do {//ejecutamos el do hasta que se cumpla la condición del while
			System.out.println("Introduce un número entero positivo para calcular su factorial:");//pedimos que se introduzca un número
			n1=teclado.nextInt();//almacenamos en la variable n1 el valor introducido por teclado
			if (n1<0) {//si el número es negativo mostramos el mensaje y pedimos que se introduzca el número nuevamente
				System.out.println("Error. El número tiene que ser mayor que 0");
				System.out.println("Vuelve a introducir el número:");
				n1=teclado.nextInt();
			}
			
		}while(n1<0);
		
		System.out.print(n1+" =");//mostramos el número
		for (int i = n1-1; i >=1; i--) {//el indice i es igual al número -1, ejecutamos el bucle hasta que la i sea igual a 1
			suma+=n1*i;//almacenamos el resultado de la multiplicación en la variable suma y sumamos el resultado
			multiplicacion=n1*i;//almacenamos el valor de la multiplicacion
			System.out.print(" "+n1+"x"+i+"="+multiplicacion+",");//mostramos el resultado en el formato deseado
		}
		System.out.println("\n El resulado del factorial de "+n1+" es: "+suma);//mostramos el valor del factorial
		
		teclado.close();
	}
	
	
	static void generadorPatronesEstrella() {
		Scanner teclado=new Scanner(System.in);
		
		
		int base,altura;
		
		String rectangulo="";
		
		do {//ejecutamos el do hasta que se cumpla la condición del while
			System.out.println("Introduce la base del rectángulo:");//pedimos que se introduzca la base
			base=teclado.nextInt();//almacenamos en la variable base el valor introducido por teclado
			if (base<0) {//si el número es negativo mostramos el mensaje y pedimos que se introduzca el número nuevamente
				System.out.println("Error. La base tiene que ser mayor que 0");
				System.out.println("Vuelve a introducir la base:");
				base=teclado.nextInt();
			}
			System.out.println("Introduce la altura del rectángulo:");//pedimos que se introduzca la altura
			altura=teclado.nextInt();//almacenamos en la variable n1 el valor introducido por teclado
			if (altura<0) {
				System.out.println("Error. La altura tiene que ser mayor que 0");
				System.out.println("Vuelve a introducir la altura:");
				altura=teclado.nextInt();
			}
			
		}while(base<0&&altura<0);
		
		for (int i = base; i >=1 ; i--) {//este bucle lo usamos para generar las columnas/la base del rectángulo
			rectangulo+="*";//dentro de rectangulo almacenamos la cadena "*" tantas veces como ciclos tenga el bucle
			for (int j = altura; j>=1; j--) {//este bucle lo usamos para generar las filas/altura del rectángulo
				if(i==1) {//si la base del rectangulo se ha rellenado 
					System.out.println(rectangulo);//mostramos la base tantas veces como numero de ciclos tenga el bucle 

				}

			}
		}
		teclado.close();

	}
	
	static void serieFibonacci() {

		Scanner teclado=new Scanner(System.in);
		int n1,numero,suma;
		String cadena="0";
		suma=1;
		numero=1;
		do {//ejecutamos el do hasta que se cumpla la condición del while
			System.out.println("Introduce un número entero positivo :");//pedimos que se introduzca un número
			n1=teclado.nextInt();//almacenamos en la variable n1 el valor introducido por teclado
			if (n1<1) {//si el número es negativo mostramos el mensaje y pedimos que se introduzca el número nuevamente
				System.out.println("Error. El número tiene que ser mayor que 0");
				System.out.println("Vuelve a introducir el número:");
				n1=teclado.nextInt();
			}

		}while(n1<1);
		
		if (n1==2) {//si el número que se introduce por teclado es 2
			cadena+=","+suma;//0,1//asigno a la cadena el valor mostrado
		}else if (n1>=3) {//Si el número que se introduce por teclado es 3 o mayor que 3 entra en este if
			if (n1==3) {//si el número es 3 entra en este if 
				cadena+=","+suma+","+numero;//0,1,1//asigna a la cadena el valor mostrado
			}else {//si el número es mayor que 3
				cadena+=","+suma+","+numero+",";//0,1,1,//asigno a la cadena el valor mostrado
			}
			
		}
		n1-=3;//decremento en 3 el número ya que llegados a este punto la cadena/serie ya tendría tres números.
		
		for (int i = 1; i <=n1&&!(n1==1&&n1==2&&n1==3); i++) {//ejecutamos el bucle mientras que la i sea menor o igual que el n1 ó n1 sea distinto de 1 2 ó 3 
			suma+=numero;//en la primera ejecución del bucle suma valdrá 2//en la segunda ejecución del bucle suma valdrá 2+1=3
			if (i==n1) {//si es la última ejecución del bucle 
				cadena+=suma;//asignamos a la cadena el valor de suma
			}else {
				cadena+=suma+",";//en la primera ejecucción inserto el número 2 en la cadena junto con una ","//en la segunda ejecución inserto el número 3 junto con una ","
			}

			numero=suma-numero;//calculo el número que se le sumará a la cadena, en la primera ejecución será numero= 2-1 //por lo que numero valdrá 1
		}
		System.out.print(cadena);//muestro la cadena/serie
	}

}
