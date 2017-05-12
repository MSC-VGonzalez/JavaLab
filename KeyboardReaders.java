import java.io.*;
import java.util.Scanner;

public class KeyboardReaders{
	public void readerCharSystem() throws IOException{
		int rbyte = 0;
		
		System.out.println("Ingrese un caracter: ");
		rbyte = System.in.read();
		System.out.println("Caracter ingresado: " + rbyte);
	}
	
	public void readerSystem() throws IOException{
		int index = 0;
		String str = null;
		byte [] buffer = new byte[255];
		
		System.out.println("Ingrese una cadena de caracteres: ");
		System.in.read(buffer);
		str = new String(buffer);
		System.out.println("Cadena ingresada: " + str);
	}
	
	public void readerStream() throws IOException{
		String s = null;
		BufferedReader br = null;
		InputStreamReader strm = null;
		
		try {
			strm = new InputStreamReader(System.in);
			br = new BufferedReader(strm);
			s = new String();
			System.out.println("Ingrese una cadena de caracteres: ");
			s = br.readLine();
			System.out.print(s);
		}finally {
			if (strm != null) {
			   strm.close();
			}
		}
	}
	
	/* Lectura desde teclado de un caracter mediante la clase Scanner */
	public void readerScannerChar() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese un caracter: ");
		buffer = new Scanner(System.in);
		Character character = buffer.next().charAt(0);
		System.out.println("El caracter ingresado fue: " + character);
	}
	
	/* Lectura desde teclado de una cadena mediante la clase Scanner*/
	public void readerScannerString() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese una cadena de caracteres: ");
		buffer = new Scanner(System.in);
		String string = buffer.nextLine();
		System.out.println("La cadena ingresada fue: " + string);
	}
	
	/* Lectura desde teclado de un entero mediante la clase Scanner */
	public void readerScannerInt() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese un número entero: ");
		buffer = new Scanner(System.in);
		Integer number = buffer.nextInt();
		System.out.println("El número entero ingresado fue: " + character);
	}
	
	/* Lectura desde teclado de un decimal mediante la clase Scanner */
	public void readerScannerInt() throws IOException{
		Scanner buffer = null;
		
		System.out.println("Ingrese un número entero: ");
		buffer = new Scanner(System.in);
		Integer number = buffer.nextInt();
		System.out.println("El número entero ingresado fue: " + character);
	}
}