
import java.util.Scanner;

public class Main {

	public static void main(String[] args)	{
		
		Scanner sc = new Scanner(System.in);
		
		int valorA, valorB, soma;
		
		valorA = sc.nextInt();
		valorB = sc.nextInt();
		
		soma = valorA + valorB;
		
		System.out.printf("Qual o primeiro valor: %d%n", valorA);
		System.out.printf("Qual o segundo valor: %d%n", valorB);
		System.out.printf("O valor total é de: %d%n", soma);
		
		sc.close();
	}

}
