public class Front22{
	public static void main (String args []){
		String result;
		
		if (args.length == 1){
			result = front22(args[0]);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public statics String front22(String str){
		if (str.length() >= 2){
			String sstr = str.substring(0,2);
			return sstr + str + sstr;
		}
		return str + str + str;
	}
}