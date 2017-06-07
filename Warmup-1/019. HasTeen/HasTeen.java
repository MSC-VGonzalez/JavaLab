public class HasTeen{
	public static void main (String args []){
		boolean result;
		int param1 = Integer.parseInt(args[0]);
		int param2 = Integer.parseInt(args[1]);
		int param3 = Integer.parseInt(args[2]);
		
		if (args.length == 1){
			result = hasTeen(param1,param2,param3);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static boolean hasTeen(int a, int b, int c){
		if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
			return true;
		}
		return false;
	}
}