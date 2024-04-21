package tarefa13;

import java.util.Scanner;

public class Exe05 {
public static boolean AnoBissexto(int ano) {
	
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o ano:");
	        int ano = scanner.nextInt();
		
		if (AnoBissexto(ano)) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else {
			System.out.println("O ano " + ano + " não é bissexto.");
		}
		scanner.close();
	}
}