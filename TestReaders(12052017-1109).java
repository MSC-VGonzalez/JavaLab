import java.io.*

public class TestReaders{
	public static void main (String args[]){
		KeyboardReaders reader = new KeyboardReaders();
		try{
			reader.readerSystem();
		}catch (IOException ex){
			System.out.println("Erro en la lectura");
		}
	}
}