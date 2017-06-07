public class Front3{
	public static void main (String args []){
		String result;
		
		if (args.length == 1){
			result = front3(args[0]);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static String front3(String str){
		if (str.length() < 3){
			return str + str + str;
		}
		else{
			return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
		}
	}
}