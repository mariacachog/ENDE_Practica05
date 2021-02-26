package ejemplos;

public class Ejemplo01 {

	public static void main(String[] args) {
		//Declaramos un array
		/*El código donde se puede producir el error lo vamos a encerrar dentro de una 
		 * estructura try catch	 */
		try {
			double array[] = new double [1000000000];
		}
		
		catch (OutOfMemoryError Error) {
			System.err.println("ERROR: Memoria insuficiente.");
		}
	
		try {
			double array2[] = new double [2000000000];
		}
		
		catch (OutOfMemoryError Error) {
			System.out.println("ERROR: Memoria insuficiente.");
		}
	}
}
