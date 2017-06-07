public class IcyHot{
	public static void main (String args []){
		boolean result;
		int temp1 = Integer.parseInt(args[0]);
		int temp1 = Integer.parseInt(args[1]);
		
		if (args.length == 1){
			result = icyHot(temp1,temp2);
			System.out.println(result);
		}
		else{
			System.out.println("Número de parámetros incorrectos");
		}
	}
	
	public static boolean icyHot(int temp1, int temp2){
		if(temp1 < 0 && temp2 < 0){ return false;}
		if(temp1 > 100 && temp2 > 100){ return false;}
		if((temp1 >= 0 && temp1 <= 100) || (temp2 >= 0 && temp2 <= 100)){
			return false;
		}
		return true;
	}
}