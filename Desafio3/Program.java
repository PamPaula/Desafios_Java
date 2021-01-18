import java.io.IOException;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int notaAluno = leitor.nextInt();
        if (notaAluno == 0){
            System.out.println("E");
        }
        else if (notaAluno >= 1 && notaAluno <= 35){
            System.out.println("D");
        }
        else if (notaAluno >= 36 && notaAluno <= 60){
            System.out.println("C");
        }
        else if (notaAluno >= 61 && notaAluno <= 85){
            System.out.println("B");
        }
        else if (notaAluno >= 86 && notaAluno <= 100){
            System.out.println("A");
        }
    }	
}