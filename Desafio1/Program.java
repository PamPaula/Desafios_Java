import java.io.IOException;
import java.util.Scanner;

public class Program{
  
    public static void main(String[] args) throws IOException {
      Scanner entrada = new Scanner(System.in);
      var numero = 0;
      numero = entrada.nextInt();

    	for (int i = 0; i <= numero; i++) {
    		if (i % 2 == 0 && i != 0) System.out.println(i);
    	}
    }
	
}