package tarefa13;
import java.util.Scanner;
public class Exe04 {

    public static float calcularMedia(int numero1, int numero2, int numero3) {
        return (numero1 + numero2 + numero3) / 3.0f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int numero3 = scanner.nextInt();
        
        float media = calcularMedia(numero1, numero2, numero3);
        System.out.println("A média dos números " + numero1 + ", " + numero2 + " e " + numero3 + " é " + media + ".");
        scanner.close();
    }
}
