package Ejercicios2;

public class Boletin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
	}
	
	public static void ejercicio1() {
//		Un alumno desea saber cuál será su calificación final en la materia de
//		Programación. Dicha calificación se compone de los siguientes
//		porcentajes:
//		• 55% del promedio de sus tres calificaciones parciales.
//		• 30% de la calificación del examen final.
//		• 15% de la calificación de un trabajo final.
//		Asigna las calificaciones que creas conveniente (entre 1 y 10) e imprime
//		los valores de todas las notas, así como la calificación final.
		
		double parcial1,parcial2,parcial3,promedioParciales,examenFinal,trabajoFinal;//Declaración de las variables.
		
		double valorExamenFinal,valorTrabajoFinal;//Segundo grupo de variables
		
		parcial1=7.4;
		parcial2=8.8;
		parcial3=9.3;
		
		examenFinal=8;
		trabajoFinal=9.5;
		
		promedioParciales=(parcial1+parcial2+parcial3)/3*0.55;//aquí se calcula el 55% del promedio de
																//las notas de los tres parciales.
		valorExamenFinal=examenFinal*0.3;//Aquí se calcula el valor del examen final que corresponde al 30% de la nota final.												
		
		valorTrabajoFinal=trabajoFinal*0.15;//Aquí se calcula el valor del trabajo final que corresponde al 15% de la nota final
		
		System.out.println(" La nota obtenida en el primer examen parcial es de: "+parcial1
				+"\n La nota obtenida en el segundo examen parcial es de: "+ parcial2
				+"\n La nota obtenida en el tercer examen parcial es de: "+ parcial3 
				+"\n Las notas obtenidas en los parciales tendran un valor de: "
				+ promedioParciales+" para la calificación final"
				+"\n La nota obtenida en el examen final es de: "+examenFinal
				+" que tendrá un valor de: "+valorExamenFinal+" para la calificación final"
				+ "\n La nota obtenida en el trabajo final es de: "+ trabajoFinal
				+" que tendrá un valor de: "+valorTrabajoFinal+" para la calificación final "
				+ "\n Por lo tanto teniendo en cuenta lo anterior la calificación final es de: "+ (promedioParciales+valorExamenFinal+valorTrabajoFinal));//Aqui se suman las notas para obtener la nota final
		
		//También se podría hacer de la siguiente manera sin almacenar todos los datos en memoria comentando el segundo grupo de variables 
		
//		System.out.println("La nota obtenida en el primer examen parcial es de: "+parcial1
//				+"\n La nota obtenida en el segundo examen parcial es de: "+ parcial2
//				+"\n La nota obtenida en el tercer examen parcial es de: "+ parcial3 
//				+"\n Las notas obtenidas en los parciales tendran un valor de: "
//				+ promedioParciales+" para la calificación final"
//				+"\n La nota obtenida en el examen final es de: "+examenFinal
//				+" que tendrá un valor de: "+(examenFinal*=0.3)+" para la calificación final"
//				+ "\n La nota obtenida en el trabajo final es de: "+ trabajoFinal
//				+" que tendrá un valor de: "+(trabajoFinal*=0.15)+" para la calificación final "
//				+ "\n Por lo tanto teniendo en cuenta lo anterior la calificación final es de: "+ (promedioParciales+examenFinal+trabajoFinal));
		
		
		
		
		
		
	}
	
	public static void ejercicio2() {
		
//		Un profesor desea saber el porcentaje de hombres y el porcentaje de
//		mujeres hay en un grupo de estudiantes, sabiendo que hay 3 mujeres y 22
//		hombres. Imprime ambos porcentajes por pantalla
		
		int mujeres=3, hombres=22;
		int estudiantes=mujeres+hombres;//Calculamos el número total de estudiantes.
		
		mujeres*=100/estudiantes;//calculamos el porcentaje de mujeres dentro del grupo de estudiantes
		hombres*=100/estudiantes;
		System.out.println("El porcentaje de mujeres que hay en el grupo de estudiantes es del "+ mujeres
				+"% y el porcentaje de hombres es del: "+hombres+"%" );	
		
		
	}
	
	
	public static void ejercicio3() {
//		
//		En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología.
//		El presupuesto anual del hospital se reparte conforme a la siguiente tabla:
//			
		//Ginecologia----------40%
		//Traumatología--------30%
		//Pediatría------------30%	
		
//		Obtener la cantidad de dinero que recibirá cada área, teniendo en cuenta
//		que su presupuesto es de 120000 euros.
		
		int presupuestoTotal=120000;
		double ginecologia=presupuestoTotal*0.4;
		double traumatologia=presupuestoTotal*0.3;
		double pediatria=presupuestoTotal*0.3;
		System.out.println("Del presupuesto anual que corresponde a la cantidad de: "+presupuestoTotal+" € \n El área de ginecología recibirá la cantidad de "+ginecologia+" € "
				+ "\n El área de traumatología recibirá la cantidad de: " +traumatologia+" € "
						+ "\n El área de pediatría recibirá la cantidad de: "+pediatria+" €");
	}
	
	
	public static void ejercicio4() {
//		El dueño de una tienda compra un artículo a un precio determinado.
//		Obtener el precio a que lo debe vender para obtener una ganancia del
//		30%. Asigna el precio que creas conveniente, e intenta realizarlo
//		utilizando operadores con asignación (*=, +=, -=...)
	
		double precioArticulo=199.99;
		precioArticulo*=1.3;
		System.out.println("Para obtener una ganancia del 30% sobre el valor de compra de 199.99 debe vender el "
				+ "artículo al precio de "+precioArticulo+" €");
	}
	
	
	public static void ejercicio5() {
		
//		Desarrolla un programa que calcule el sueldo líquido a percibir por un
//		vendedor sabiendo que el sueldo total incluye los siguientes conceptos:
//		• Sueldo fijo.
//		• Comisión: 5% sobre el importe de las ventas.
//		• Kilometraje: 1 euro por Kilómetro.
//		• Dietas: 60 euros por día de desplazamiento.
//		A la suma de estos conceptos se le debe descontar:
//		• La retención de la Seguridad social (150 euros).
//		Al sueldo fijo se le debe descontar:
//		• La retención del IRPF: 18%.
//		Declara las variables necesarias y asigna los valores que consideres
//		convenientes (importe de ventas, número de km realizados, días de
//		desplazamiento).
		
		double sueldoFijo,importeDeVentas,sueldoAPercibir;
		int diasDeDesplazamiento,kilometrosRealizados;
		
		sueldoFijo=1048.52;
		importeDeVentas=832.69;
		kilometrosRealizados=2500;
		diasDeDesplazamiento=8;
		
		importeDeVentas*=0.05;//Aquí se calcula el 5% de las comisiones
		kilometrosRealizados*=1;//Aquí se calcula el kilometraje que en este caso es 1€ por kilómetro.
		diasDeDesplazamiento*=60;//Aquí se calculan las dietas de los días de desplazamiento
		sueldoFijo*=0.82;//Aquí se calcula el sueldo con la retención del IRPF del 18%
		
		sueldoAPercibir=importeDeVentas+kilometrosRealizados+diasDeDesplazamiento+sueldoFijo;
		sueldoAPercibir-=150;//Aquí se descuentan los 150 euros de retención a la Seguridad Social.
		System.out.println("Después de sumar la comisión de ventas: "+importeDeVentas
				+"€ \n Los kilómetros realizados "+kilometrosRealizados+"€ "
				+ "\n Las dietas de los días de desplazamiento "+diasDeDesplazamiento+
				"€ \n El sueldo fijo con el IRPF ya aplicado de "+sueldoFijo
				+"€ \n Y quitándole los 150€ de retención a la Seguridad Social "
				+ "\n El sueldo total a pecibir es de: "+sueldoAPercibir+"€");
		
		
		
		
		
		
		
		
		
	}

}
