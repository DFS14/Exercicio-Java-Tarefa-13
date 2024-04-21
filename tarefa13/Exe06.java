package tarefa13;
import java.util.Scanner;
public class Exe06 {

public static int maximo(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in); 
	 System.out.println("Digite o primeiro número");
     int num1 = scanner.nextInt();
     System.out.println("Digite o segundo número");
     int num2 = scanner.nextInt();


     int maximo = maximo(num1, num2);
        
        System.out.println("O maior entre " + num1 + " e " + num2 + " é " + maximo + ".");
        
        scanner.close();
    }
}