import java.io.*;

public class Readers{
	public static void main(String args[]) throws IOException {
		InputStreamReader cin = null;
		BufferedReader br = null;
		
		try {
			cin = new InputStreamReader(System.in);
			br = new BufferedReader(cin);
			String s = new String();
			System.out.println("Ingrese una línea: ");
			s = br.readLine();
			System.out.print(s);
		}finally {
			if (cin != null) {
			   cin.close();
			}
		}
	}
}