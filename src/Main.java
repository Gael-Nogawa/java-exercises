
import java.util.Scanner;

public class Main {

	public static void main(String[] args)	{
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int valorA, valorB, soma;
		
		valorA = sc.nextInt();
		valorB = sc.nextInt();
		
		soma = valorA + valorB;
		
		System.out.printf("Qual o primeiro valor: %d%n", valorA);
		System.out.printf("Qual o segundo valor: %d%n", valorB);
		System.out.printf("O valor total é de: %d%n", soma);
		
		sc.close();
		
		*/
		
		//----------- Exercicio 02 ----------
		
		Scanner sc = new Scanner(System.in);
		
		double area, raioQuad, pi;
		
		pi = 3.14159;
		area = sc.nextDouble();
		raioQuad = pi * (Math.pow(area, 2.00));
		
		System.out.printf("O valor da area é %.4f%n", area );
		System.out.printf("O valor da raio ao quadrado * pi é : %.4f%n", raioQuad);
		
		
		sc.close();
	}

}
