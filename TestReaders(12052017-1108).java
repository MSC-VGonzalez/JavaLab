public class TestReaders{
	public static void main (String args[]) throws IOException{
		KeyboardReaders reader = new KeyboardReaders();
		try{
			reader.readerSystem();
		}catch (IOException ex){
			System.out.println("Erro en la lectura");
		}
	}
}