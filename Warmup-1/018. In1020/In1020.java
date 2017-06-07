public class In1020{
	public static void main (String args []){
		boolean result;
		int temp1 = Integer.parseInt(args[0]);
		int temp1 = Integer.parseInt(args[1]);
		
		if (args.length == 1){
			result = in1020(temp1,temp2);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static boolean in1020(int a, int b){
		if((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
			return true;
		}
		return false;
	}
}