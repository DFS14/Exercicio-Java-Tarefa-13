package tarefa13;
import java.util.Scanner;
public class Exe08 {
public static long fatorial(int numero) {
long resultado = 1;
for (int a = 2; a <= numero; a++) {
		resultado *= a;
	}
	return resultado;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
System.out.println("Digite um número:");
int numero = scanner.nextInt();	
long fatorial = fatorial(numero);

System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
        
        scanner.close();
    }
}	
