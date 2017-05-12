public class WMP1_001{
	public boolean sleepIn(boolean weekday, boolean vacation){
		if (vacation == true){
			return true;
		}
		else if (weekday == false){
			return true;
		}
		else{
			return false;
		}
	}
}