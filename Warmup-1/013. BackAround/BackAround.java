public class BackAround{
	public static void main (String args []){
		String result;
		
		if (args.length == 1){
			result = backAround(args[0]);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static String backAround(String str){
		if(str.length() >= 1){
			int length = str.length()-1;
			char buffer = str.charAt(length); 
			return buffer + str + buffer;
		}
		return "";
	}
}