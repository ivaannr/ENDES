package mipackage;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int input = -1;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Dime un número: (0 para salir del bucle)");
			input = sc.nextInt();
			HolaMundoENDES(input);
			
			if (input == 0)
				return;
			
		}
	}
	
	public static void HolaMundoENDES(int numero) {
		
		if (numero != 0)
			System.out.println("Hola, Mundo!");
		else
			System.out.println("Adiós, Mundo!");
		
	}
	
}
