public class MixStart{
	public static void main (String args []){
		boolean result;
		
		if (args.length == 1){
			result = mixStart(args[0]);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static boolean mixStart(String str){
		if (str.length() > 2 && str.substring(1,3).equals("ix")){
			return true;
		}
		return false;
	}
}