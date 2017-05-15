import java.io.*;
import java.util.Scanner;

public class MonkeyTrouble{
	public static void main (String args[]){
		Boolean aSmile  = false;
		Boolean bSmile  = false;
		Boolean trouble = false;
		Scanner buffer  = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de sonrisa del mono A: ");
		aSmile = buffer.nextBoolean();
		System.out.println("Ingrese el valor de sonrisa del mono B: ");
		bSmile = buffer.nextBoolean();
		
		trouble = monkeyTrouble(aSmile,bSmile);
		
		if (trouble == true){
			System.out.println("Estamos en problemas.");
		}else{
			System.out.println("No estamos en problemas.");
		}
	}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
		if (aSmile == true && bSmile == true){
			return true;
		}
		else if (aSmile == false && bSmile == false){
			return true;
		}
		else{
			return false;
		}
	}
}