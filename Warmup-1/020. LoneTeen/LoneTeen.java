public class LoneTeen{
	public static void main (String args []){
		boolean result;
		int param1 = Integer.parseInt(args[0]);
		int param2 = Integer.parseInt(args[1]);
		
		if (args.length == 1){
			result = loneTeen(param1,param2);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public boolean loneTeen(int a, int b){
		if(((a >= 13 && a <= 19) && (b < 13 || b > 19)) ||
		   ((b >= 13 && b <= 19) && (a < 13 || a > 19))){
			return true;
		}
		return false;
	}
}