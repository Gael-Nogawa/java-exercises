package application;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome do produto: ");
		String nome = sc.nextLine();
		System.out.println("Qual o preço: ");
		Double price = sc.nextDouble();
		
		Produto p = new Produto(nome, price);
		System.out.println(p);
		
		
		sc.close();
		
	}

}
