package tarefa13;
import java.util.Scanner;
public class Exe03 {
public static String verificarNumero(int numero) {
	if (numero > 0) {
		return "O número " + numero + " é positivo.";
	} else if (numero < 0) {
		return "O número " + numero + " é negativo.";
	} else {
		return "O número é zero.";
	}
}

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite um número");
	int numero = scanner.nextInt();
	String resultado = verificarNumero(numero);
	System.out.println(resultado);
	
	scanner.close();
	}
}

