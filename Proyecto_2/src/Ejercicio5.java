
public class Ejercicio5 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("         *");
//		System.out.println("        * *");
//		System.out.println("       * * *");
//		System.out.println("      * * * *");
//		System.out.println("     * * * * *");
//		System.out.println("    * * * * * *");
//		System.out.println("   * * * * * * * ");
//		System.out.println("  * * * * * * * * ");
//		System.out.println(" * * * * * * * * * ");
				
//		System.out.println("Ejercicio con bucle for: \n");
		
		
		for(int i=0 ;i<=10;i++) {
			String cadena="";
			for (int j = 10; j >0 ; j--) {
				if (i<=j) {
					cadena += " ";
				}else if(i>j) {
					cadena +="* ";
//					System.out.println(" *");
				}
			}

			System.out.println(cadena);
		}
//		
		System.out.println("Piramide invertida \n");
		
		for(int i=10 ;i>0;i--) {
			String cadena="";
			for (int j = 10; j >0 ; j--) {
				if (i<=j) {
					cadena += " ";
				}else if(i>j) {
					cadena +="* ";
//					System.out.println(" *");
				}
			}

			System.out.println(cadena);
//		}
//		System.out.println("\n");
//		for(int i=0 ;i<10;i++) {
//			for (int j = 0; j <9 ; j++) {
//				if (i>j) {
//					
//					System.out.print(" ");
//				}else if(i<=j) {
//					System.out.print(" *");
//				
//			}
//			}
//			System.out.println("");
//
//			
	}
		
		
		
	}
	

}
