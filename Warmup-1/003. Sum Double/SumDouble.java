import java.util.Scanner;

public class SumDouble{
	public static void main(String args[]){
		Integer a = null;
		Integer b = null;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Ingresar el primer n�mero: ");
		a = buffer.nextInt();
		System.out.println("Ingresar el segundo n�mero: ");
		b = buffer.nextInt();
		
		System.out.println("El resultado devuelto es: " + sumDouble(a,b));
	}
	
	public static int sumDouble(int a, int b){
		if (a != b){
			return a+b;
		}
		else{
			return (a+b)*2;
		}
	}
}