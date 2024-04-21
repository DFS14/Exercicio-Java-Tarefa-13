package tarefa13;

import java.util.Scanner;

public class Exe09 {
public static void main(String[] args) {
 
 Scanner scanner = new Scanner(System.in); 

    System.out.println("Digite a base:");
    int base = scanner.nextInt();
    System.out.println("Digite a altura:");
    int altura = scanner.nextInt();
    int area = calcularAreaRetangulo(base, altura);
    System.out.println("A área do retângulo é: " + area);
}

public static int calcularAreaRetangulo(int base, int altura) {
    return base * altura;
    
	}
}
