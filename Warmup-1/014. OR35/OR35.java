public class OR35{
	public static void main (String args []){
		boolean result;
		
		if (args.length == 1){
			result = or35(Integer.parseInt(args[0]));
			System.out.println(result);
		}
		else{
			System.out.println("N�mero de par�metros incorrectos");
		}
	}
	
	public static boolean or35(int n){
		if((n%3 == 0 || n%5 == 0) && n>0){
			return true;
		}
		return false;
	}
}