package application;

import java.util.Scanner;



public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você tirar a média de altura? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		double media = soma / n;
		
		System.out.printf("A média é de : %.2f", media);
		
		
		sc.close();
		
		-------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores e nome gostaria de colocar? ");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];

		System.out.println("Qual o nome do produto e valor? ");
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			
			vect[i] = new Produto(nome, preco); 
			
			
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		double precoMedio = soma / vect.length;
		
		System.out.printf("A media dos valores é de : %.2f", precoMedio);
	
		
		sc.close();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Quantos numero vai digitar?");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o seu número: ");
			vetor[i]= sc.nextInt();  
		}
		
		for (int i = 0; i < vetor.length; i++) {
			
			
			if ( vetor[i] < 0) {
				System.out.printf("Os valores negativos: %d\n, vetor[i]);
				
			} 
		}
		
		sc.close();
		
		-------------------------------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros você vai dgitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for ( int i =0; i < vetor.length; i++) {
			System.out.println("Digite o número: ");
			vetor[i] = sc.nextDouble();
		}
		
		
		System.out.print("Valores: ");
		for (int i = 0; i <vetor.length; i++) {
			System.out.printf("[%.1f ]", vetor[i]);
			
		}
		
		System.out.println();
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += (double)vetor[i];
		}
				
		System.out.printf("A soma dos valores é de : %.1f", soma);
		
		
		
		System.out.println();
		double media = soma / vetor.length;
		
		System.out.printf("\nA média dos valores é de: %.1f", media);
		
		
		--------------------------------------------------------
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int n, nMenores;
		double somaAltura, mediaAltura, percentualMenores;
		
		
		System.out.println("Quantas pessoas serão digitadas: ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		
		for (int i =0; i < n; i++) {
			
			sc.nextLine();
			System.out.printf("Qual o dado da "+ (i+1) + " pessoa%n%n");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
	
		somaAltura = 0.0;
		for (int i = 0; i < n; i++) {
			somaAltura += altura[i];
		}
		
		mediaAltura = somaAltura / n;
		
		System.out.println();
		System.out.printf("A média das alturas é: %.2f\n\n", mediaAltura);
		
		System.out.println();
		System.out.print("Percentual das pessoas com menos de 16: ");
		
		nMenores = 0;
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				nMenores++;
				
			}
			
		}
		
		percentualMenores = ((double)nMenores / n) * 100.00;
		
		System.out.println();
		System.out.printf("%.1f", percentualMenores);
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			if ( idade[i] < 16 ){
				System.out.printf("Os nomes são: %s\n", nome[i]); 
			}
			
		}
		
		
		sc.close();
		
		
		
		
	}

}
