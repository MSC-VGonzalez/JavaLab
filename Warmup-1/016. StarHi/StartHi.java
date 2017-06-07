public class StartHi{
	public static void main (String args []){
		boolean result;
		
		if (args.length == 1){
			result = startHi_1(args[0]);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	/*Solución 1: Con función estandar*/
	public static boolean startHi_1(String str){
		if (str.startsWith("hi")){
			return true;
		}
		return false;
	}
	
	/*Solución 2: Tratando la cadena */
	public boolean startHi_2(String str){
		if (str.length() > 1){
			String prefix = str.substring(0,2);
			if (prefix.compareTo("hi") == 0){
				return true;
			}
		}
		return false;
	}
}