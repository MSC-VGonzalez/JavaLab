import java.lang.Math;
import  java.util.Scanner;

public class Diff21{
	public static void main(String args[]){
		Integer n = null;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Ingresar el número para hacer diferencia: ");
		n = buffer.nextInt();
		
		System.out.println("La diferencia es: " + diff21(n));
	}
	
	public static int diff21(int n){
		if(n > 21){
			return Math.abs(21 - n) * 2;
		}
		else{
			return 21 - n;
		}
	}
}