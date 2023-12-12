
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) 
	{	
		/****************************************************************
		 * 		Declaración e inicialización de variables	(1 Punto)
		 ****************************************************************/
		Scanner teclado=new Scanner(System.in);	// Completar											// Declaración objeto scanner
		int comodines=5;	// Completar											// Declaración de variable entera "comodines"
		String palabraSecreta;                                                                    // Declaración de String "palabraSecreta"
		char letra;
		// Se inicializa la palabra secreta llamando al método seleccionarPalabra();
		// Completar
		palabraSecreta=seleccionarPalabra();
		// Se crea un array de caracteres "palabraAdivinada" con la longitud de la palabra secreta.
		// Completar
		char []palabraAdivinada=new char[palabraSecreta.length()];
		// Se inicialia la palabra adivinada con "_" (de momento vacía)
		// Completar
		palabraAdivinada=rellenarPalabraAdivinada(palabraAdivinada,'_');
		/****************************************************
		 * 		Mensaje de interfaz
		 ****************************************************/
		// MEnsaje de presentación
		System.out.println("¡Bienvenido al juego del ahorcado! Trata de adivinar la palabra secreta.");
		System.out.println("Dispones de " + comodines + " comodines que se gastarán en caso de error.");
		System.out.println("Si aciertas la palabra o pierdes todos los comodines el juego habrá terminado.");

		// Se muestra palabra vacía para que el jugador sepa la longitud. Llamada a mostrarPalabra
		// Completar
//		System.out.println(palabraSecreta);
		mostrarPalabra(palabraAdivinada);
		/********************************************************************************************************
		 * 		Lógica de juego   (2 Puntos)
		 * 	
		 * 	- Se realiza un bucle que se recorrerá mientras haya comodines 
		 * 		- Pedimos una letra por teclado
		 * 		- Recogemos esta letra
		 * 		- Llamamos al método "descubierta"
		 * 			- Si está descubierta esa letra ya, mensaje por pantalla y saltamos a la siguiente iteración.
		 * 			- Si es una letra no descubierta, seguimos con el siguiente paso.
		 * 		- Llamamos a comprobarAcierto
		 * 			- Si no hemos acertado, decrementamos el valor de "comodines".
		 * 		- Llamamos a "mostrarPalabra".
		 * 		- Comprobamos si palabraAdivinada es igual a palabraSecreta. Si es igual, mensaje ganador y el 
		 * 		  juego ha terminado.
		 * 
		 * 	- Si los comodines se han agotado, se termina el bucle, se muestra mensaje de "has perdido" y 
		 *    la palabra secreta. El juego ha terminado.
		 * 		
		 ********************************************************************************************************/
		// Mientras tenga comodines se vuelve a permitir intentos
		while(comodines>0){// Completar) 
		
			// Se pide una letra por teclado. En caso de introducir cadena, nos con el primer caracter (posición 0).
			letra=pedirLetra();
			// Completar

			// Comprobamos que no la hayan descubierto ya (comprobación de errores)
			if(descubierta(letra, palabraAdivinada)){// Completar) {
				System.out.println("Esa letra ya está descubierta");
				mostrarPalabra(palabraAdivinada);
					// Mensaje de que esa letra ya está descubierta
					//Utilizamos continue para que no siga haciendo esta vuelta del bucle y vuelva a pedir nueva letra.
					continue;
		}

		// Se comprueba si hubo acierto y se destapa la letra si es correcta.
		if (comprobarAcierto(letra, palabraSecreta, palabraAdivinada)==false){// Completar) 
				comodines--;
					// En caso de fallo se resta un intento
				System.out.println("Quedan "+comodines+" restantes");
					// Informo de los comodines que quedan.
				}

				// Se muestra el estado actual de la palabra
				mostrarPalabra(palabraAdivinada);
				// Completar

				// Si la palabra está completa, se termina el juego
				if (comprobarPalabraRellena(palabraSecreta, palabraAdivinada)){
					// Mensaje de éxito
					System.out.println("\nEnhorabuena has adivinado la palabra");
					// Completar

					// Se termina el programa.
					System.exit(0);
				}
	}

	// Ya no se dispone de comodines, se ha perdido. Se muestra mensaje.
		System.out.println("\nYa no se dispone de comodines, se ha perdido");
	// Completar 

	// Cerramos el escaner de teclado
		teclado.close();
	// Completar
}

    
    /************************************************************************************
     * 	Este método devuelve una palabra secreta	(2 Puntos)
     * 
     * 	En este método se pasa de entrada:
     * 	- Ningún parámetro
     * 	
     * 	Funcionamiento:
     * 	- Se define un array de tipo String y se inicializa con palabras de tu elección.
     * 	- Se obtiene un número entre 0 y el número de palabras -1 que tengas. 
     * 	  Si has añadido 5 palabras, debes obtener un número aleatorio entre 0 y 4.
     * 	- Retorna la palabra que había en esa posición.
     *  
     *  Ejemplo:
     *  palabraAdivinada[0] = _;
     *  palabraAdivinada[1] = a;
     *  palabraAdivinada[2] = _;
     *  palabraAdivinada[3] = a;
     *  
     *  Para la palabra java en la que solo hay descubierta la letra "a" imprime: "_ a _ a"
     * 
     ***********************************************************************************/
    private static String seleccionarPalabra(){
    	// Definimos un array con palabras
    	String [] palabra= {"java","programacion","ordenador","comentario","metodo","clase"};
        // Seleccionamos un número aleatorio del tamaño del array
    	int num=(int)(Math.random()*5);
        // Devolvemos la palabra elegida
    	return palabra[num].toUpperCase();
    }

    /************************************************************************************
     * 	Este método muestra la palabra adivinada	(1 Puntos)
     * 
     * 	En este método se pasa de entrada:
     * 	- Array de caracteres con la palabra adivinada.
     * 	
     * 	Funcionamiento:
     * 	- Se recorre el array con un bucle, mostrando por pantalla el contenido
     *  de cada una de las posiciones (pueden contener letra o guión bajo)
     *  - Se recomienda utilizar un caracter espacio como separador entre letras.
     *  
     *  Ejemplo:
     *  palabraAdivinada[0] = _;
     *  palabraAdivinada[1] = a;
     *  palabraAdivinada[2] = _;
     *  palabraAdivinada[3] = a;
     *  
     *  Para la palabra java en la que solo hay descubierta la letra "a" imprime: "_ a _ a"
     * 
     ***********************************************************************************/
    private static void mostrarPalabra(char[] palabraAdivinada) 
    {	
    	// Mostramos la palabra por pantalla
//    	System.out.println(Arrays.toString(palabraAdivinada));
    	for (int i = 0; i < palabraAdivinada.length; i++) {
			System.out.print(palabraAdivinada[i]+" ");
		}

    }

    /***********************************************************************************
     * 
     * 	Este método comprueba que no se intenta una letra descubierta anteriormente (2 Puntos)
     * 
     * 	En este método se pasan de entrada:
     * 	- La letra que queremos comprobar
     * 	- La palabra adivinada parcialmente
     * 
     * 	Funcionamiento:
     * 	- Debemos recorrer el array de caracteres "palabraAdivinada" comparando cada 
     * 	posición con la letra.
     * 	- Si coincide, return true.
     *  - Si el bucle acaba todas las vueltas y no coincide, return false
     *  
     *  Ejemplo:
     *  La palabra secreta es "java", han adivinado anteriormente la letra "a",
     *  por lo que tenemos como palabra adivinada "_a_a". Si vuelven a intentar 
     *  la letra "a" de nuevo, comprobamos que ya está desvelada, y retornamos true.
     *  Si hubieran intentado la letra "j" retornamos false, ya que no esta en "_a_a"
     * 
     **********************************************************************************/
    private static boolean descubierta(char letra, char[] palabraAdivinada){
    	boolean coincide=false;
    	// Se recorre el array en busca de la letra dentro de la palabra
    	for (int i = 0; i < palabraAdivinada.length; i++) {
			if (palabraAdivinada[i]==letra) {// ¿Coincide la letra con la posición de palabraAdivinada?
				coincide=true;
			}
		}
    			// Return letra adivinada
    		return coincide;
    	// Return letra no adivinada

    }

    /********************************************************************************
     * 
     * 	Este método comprueba que hemos acertado con la letra, y la desvela.	(2 Puntos)
     * 
     * 	En este método se pasan de entrada:
     * 	- La letra que queremos comprobar
     * 	- La palabra secreta
     *  - La palabra parcialmente adivinada (puede contener guiones bajos y letras)
     *  
     *  Funcionamiento:
     *  - Debemos establecer un boolean a false, ya que partimos de que no se ha realizado la comprobación,
     *  y por tanto, de momento no hemos acertado.
     *  - Hacemos un bucle FOR, recorriendo la palabra secreta. Letra a letra comprobamos si esa letra está
     *  en la palabra secreta.
     *  - En el caso de coincidir la letra dentro de la palabra secreta, desvelamos esa letra en la misma
     *  posición de la palabra adivinada.
     *  
     *  Ejemplo:
     *  Letra "a", palabra secreta "casa", palabra adivinada "c _ _ _"
     *  Recorremos casa, comprobando si la a se encuentra ahí.
     *  Al ver que en la posición [1] está la "a", sustituimos la posición [1] por una "a" en palabra adivinada
     *  De esta forma tendremos que palabra adivinada es "c a _ a"
     *  Seguimos recorriendo la palabra secreta en el FOR.
     *  Sustituimos también para la posición [3], con la letra, obteniendo palabra adivinada "c a _ a".
     *  Retornamos un true, en caso de haber hecho sustituciones, false en caso de no haber coincidencias.
     * 
     ********************************************************************************/
    private static boolean comprobarAcierto(char letra, String palabraSecreta, char[] palabraAdivinada) 
    {
    	boolean acierto=false;// Partimos de la base de que no se ha acertado
    	for (int i = 0; i < palabraSecreta.length(); i++) {
			if (palabraSecreta.charAt(i)==letra) {// Comprobamos letra a letra si se ha acertado
				acierto=true;
				palabraAdivinada[i]=letra;// En caso de acierto se realiza el cambio del símbolo "_" por la letra descubierta (en su posición)
			}
			
		}     
        // Se devuelve un booleano que informa de la situación de acierto/error
    	return acierto;
    }
    /**
     * Método que rellena un array con un caracter
     * @param array es el array que se rellena
     * @param letra es el caracter con el que se rellena el array
     * @return devuelve un array relleno con el caracter
     */
    public static char[] rellenarPalabraAdivinada(char array[],char letra) {
    	for (int i = 0; i < array.length; i++) {
			array[i]=letra;//relleno el array con el caracter
		}
    	return array;
    }
    /**
     * Metodo que pide un carácter por teclado 
     * @return devuelve el carácter introducido
     */
    public static char pedirLetra() {
    	Scanner teclado1=new Scanner(System.in);
    	System.out.println("\nIntroduce una letra");
    	char letra=teclado1.next().toUpperCase().charAt(0);//cojo la primera letra introducida y la convierto a mayúscula
    	return letra;
    }
    /**
     * Método que comprueba que una palabra y el contenido de un array de caracteres sea el mismo
     * @param palabraSecreta es la palabra a comparar
     * @param palabraAdivinada es el array donde estan contenidos los datos
     * @return devuelve true o false en funcion de si las palabras son iguales o no
     */
    public static boolean comprobarPalabraRellena(String palabraSecreta, char [] palabraAdivinada) {
    	boolean relleno=false;
    	
    	if (palabraSecreta.equals(String.valueOf(palabraAdivinada))) {
    		relleno= true;
    	}

    	return relleno;
    }
    
}