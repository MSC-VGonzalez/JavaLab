import java.util.Scanner;

public class FrontBack{
	
	public static void main(String args[]){
		String string = null;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de caracteres: ");
		string = new String (buffer.nextLine());
		
		System.out.println("Cadena devuelta: " + frontBack(string));
	}
	
	public static String frontBack(String str){
		Integer length = str.length();
		
		if (length == 0 || length == 1){
			return str;
		}
		else{
			return str.charAt(length - 1) + str.substring(1,length - 1) + str.charAt(0);
		}
	}
}