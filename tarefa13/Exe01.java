package tarefa13;

import java.util.Scanner;

public class Exe01 {

    public static boolean intnumero(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        if (intnumero(numero)) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        scanner.close();
    }
}