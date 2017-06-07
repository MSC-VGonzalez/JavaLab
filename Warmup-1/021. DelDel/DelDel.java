public class DelDel{
	public static void main (String args []){
		String result;
		
		if (args.length == 1){
			result = delDel(args[0]);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static String delDel(String str){
		if(str.length() >3 && str.substring(1,4).equals("del")){
			return str.charAt(0) + str.substring(4);
		}
		return str;
	}
}