public class IntMax{
	public static void main (String args []){
		int result;
		int param1 = Integer.parseInt(args[0]);
		int param2 = Integer.parseInt(args[1]);
		int param3 = Integer.parseInt(args[2]);
		
		if (args.length == 1){
			result = intMax(param1,param2,param3);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static int intMax(int a, int b, int c){
		int max;
		
		if(a > b){
			max = a;
		}
		else{
			max = b;
		}
		
		if(c > max){
			max = c;
		}
		
		return max;
	}
}