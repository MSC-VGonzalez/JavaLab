import java.io.*;

public class Readers{
	public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         String s = new String();
         s = (String) cin.read();
         System.out.print(s);
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
  }
}