package tarefa13;
import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite o número:");
        int num = scanner.nextInt();

        boolean nprimo = nprimo (num);
        System.out.println("O número " + num + " é primo? " + nprimo);
    }
   
    public static boolean nprimo (int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}