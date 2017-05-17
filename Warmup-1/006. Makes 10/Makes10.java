import java.util.Scanner;

public class Makes10{
	
	public static void main(String args[]){
		Integer a = 0;
		Integer b = 0;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Primer número: ");
		a = buffer.nextInt();
		
		System.out.println("Segundo número: ");
		b = buffer.nextInt();
		
		if (makes10(a,b)){
			System.out.println("Cumple las condiciones.");
		}
		else{
			System.out.println("No cumple las condiciones.");
		}
	}
	
	public static boolean makes10(int a, int b){
		if(a == 10 || b == 10){
			return true;
		}
		else if((a + b) == 10){
			return true;
		}
		else{
			return false;
		}
	}
}