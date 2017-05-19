import java.util.Scanner;

public class PosNeg{
	
	public static void main(String args[]){
		Integer a = 0;
		Integer b = 0;
		boolean negative;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Ingrese el número a: ");
		a = buffer.nextInt();
		
		System.out.println("Ingrese el número b: ");
		b = buffer.nextInt();
		
		System.out.println("Ingrese el valor de la bandera: ");
		negative = buffer.nextBoolean();
		
		if (posNeg(a,b,negative)){
			System.out.println("Verdadero.");
		}
		else{
			System.out.println("Falso.");
		}
	}
	
	public static boolean posNeg(int a, int b, boolean negative){
		if (negative){
			if (a < 0 && b < 0){
				return true;
			}
		}
		else{
			if ((a < 0 && b > 0) || (a > 0 && b < 0)){
				return true;
			}
		}
		return false;
	}
}