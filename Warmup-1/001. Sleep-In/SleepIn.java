import java.io.*;
import java.util.Scanner;

public class SleepIn{
	public static void main (String args[]){
		Boolean weekday   = false;
		Boolean vacation  = false;
		Boolean rest_flag = false;
		Scanner buffer  = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la variable día de la semana: ");
		weekday  = buffer.nextBoolean();
		System.out.println("Ingrese el valor de la variable vacaciones: ");
		vacation = buffer.nextBoolean();
		
		rest_flag = sleepIn(weekday,vacation);
		
		if (rest_flag){
			System.out.println("Es posible dormir un poco más.");
		}else{
			System.out.println("No es posible dormir un poco más.");
		}
	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation){
		if (vacation == true){
			return true;
		}
		else if (weekday == false){
			return true;
		}
		else{
			return false;
		}
	}
}