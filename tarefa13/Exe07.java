package tarefa13;

import java.util.Scanner;

public class Exe07 {
public static boolean Palindromo(String nome) {

int a = 0, b = nome.length() - 1;

while (a < b) {
	if (nome.charAt(a) != nome.charAt(b))
		return false;
	a++;
	b--;
	}
return true;
	}
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in); 
	System.out.println("Digite o nome:");
	String nome = scanner.next();


	if (Palindromo(nome)) {
		System.out.println("A string " + nome + " é um palíndromo.");
	} else {
		System.out.println("A string " + nome + " não é um palíndromo.");
	}
	scanner.close();
	}
}