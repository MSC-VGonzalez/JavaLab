import java.io.*;

public class TestReaders{
	public static void main (String args[]){
		KeyboardReaders reader = new KeyboardReaders();
		try{
			reader.readerScannerChar();
		}catch (IOException ex){
			System.out.println("Error en la lectura");
		}
	}
}