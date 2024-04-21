package tarefa13;
import java.util.Scanner;

public class Exe02 {
public static int quadrado(int numero) {
return numero * numero;
	}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite um número");

	int numero = scanner.nextInt();
	int resultado = quadrado(numero);
	
System.out.println("O quadrado do número " + numero + " é " + resultado + ".");
	

scanner.close();
	}
}