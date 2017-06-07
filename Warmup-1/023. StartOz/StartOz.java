public class StartOz{
	public static void main (String args []){
		boolean result;
		
		if (args.length == 1){
			result = startOz_1(args[0]);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	/* Mi solución */
	public String startOz_1(String str){
		int size = str.length();
		
		if(size == 0){
			return "";
		}
		
		if (size == 1 && str.charAt(0) == 'o'){
			return "o";
		}
		
		if (str.length() > 1){
			if(str.charAt(0) == 'o' && str.charAt(1) == 'z'){ return "oz";}
			if(str.charAt(0) == 'o' && str.charAt(1) != 'z'){ return "o";} 
			if(str.charAt(0) != 'o' && str.charAt(1) == 'z'){ return "z";} 
		}
		return "";
	}
	
	/*Solución pagina*/
	public String startOz_2(String str) {
		String result = "";
		
		if (str.length() >= 1 && str.charAt(0)=='o') {
			result = result + str.charAt(0);
		}
		
		if (str.length() >= 2 && str.charAt(1)=='z') {
			result = result + str.charAt(1);
		}
		
		return result;
	}
}