import java.util.Scanner;

public class NotString{
	
	public static void main(String args[]){
		String  string = null;
		Scanner buffer = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de caracteres: ");
		string = new String (buffer.nextLine());
		
		System.out.println("Cadena devuelta: " + notString(string));
	}
	
	public static String notString(String str){
		if (str.contains("not")){
			return str;
		}
		else{
			String str2 = new String("not ");
			return str2.concat(str);
		}
	}
}