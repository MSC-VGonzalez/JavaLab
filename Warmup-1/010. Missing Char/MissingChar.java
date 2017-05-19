import java.util.Scanner;

public class MissingChar{
	
	public static void main(String args[]){
		Integer index = 0;
		String string = null;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de caracteres: ");
		string = new String (buffer.nextLine());
		
		System.out.println("Ingrese el índice el caracter a eliminar: ");
		index = buffer.nextInt();
		
		System.out.println("Cadena devuelta: " + missingChar(string, index));
	}
	
	public static String missingChar(String str, int n) {
		Integer i = 0;
		String str2 = new String();
		
		for(i = 0; i < str.length(); i++){
			if (i != n){
				str2 += str.charAt(i);
			}
		}
		
		return str2;
	}
}
