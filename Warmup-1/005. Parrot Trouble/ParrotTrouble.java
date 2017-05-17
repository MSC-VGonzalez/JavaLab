import java.util.Scanner;

public class ParrotTrouble{
	
	public static void main(String args[]){
		Integer hour = 0;
		boolean talk = false;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("¿El perico esta hablando?: ");
		talk = buffer.nextBoolean();
		
		System.out.println("¿Que hora es?: ");
		hour = buffer.nextInt();
		
		if (parrotTrouble(talk, hour)){
			System.out.println("Estamos en problemas.");
		}
		else{
			System.out.println("Estamos a salvo.");
		}
	}
	
	public static boolean parrotTrouble(boolean talking, int hour){
		if (talking && (hour < 7 || hour > 20)){
			return true;
		}
		else{
			return false;
		}
	}
}