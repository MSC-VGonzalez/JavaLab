import java.lang.String;

public class Close10{
	public static void main (String args []){
		int result;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if (args.length == 2){
			result = close10(a,b);
			System.out.println(result);
		}
		else{
			System.out.println("Parámetros incorrectos");
		}
	}
	
	public static int close10(int a, int b){
		int nearest_1 = Math.abs(10-a);
		int nearest_2 = Math.abs(10-b);
		
		if (nearest_1 < nearest_2){
			return a;
		}
		
		if (nearest_1 > nearest_2){
			return b;
		}
		
		return 0;
	}
}
