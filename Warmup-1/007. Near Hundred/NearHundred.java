import java.util.Scanner;

public class NearHundred {
	
	public static void main(String args[]){
		Integer n = 0;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		n = buffer.nextInt();
		
		if (nearHundred(n)){
			System.out.println("El número esta dentro de los primeros 10 números más cercanos a 100 o 200.");
		}
		else{
			System.out.println("El número no esta dentro de los primeros 10 números más cercanos a 100 o 200.");
		}
	}
	
	public boolean nearHundred(int n){
		if(0 <= Math.abs(100 - n) && Math.abs(100 - n) <= 10){
			return true;
		}
		else if(0 <= Math.abs(200 - n) && Math.abs(200 - n) <= 10){
			return true;
		}
		else{
			return false;
		}
	}
}