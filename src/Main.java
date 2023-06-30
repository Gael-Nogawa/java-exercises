
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)	{
		
		
		/*
		------------ Exercicio 01 ----------- 
		
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		 * mensagem explicativa, conforme exemplos.

		 
		 
		Scanner sc = new Scanner(System.in);
		
		int valorA, valorB, soma;
		
		valorA = sc.nextInt();
		valorB = sc.nextInt();
		
		soma = valorA + valorB;
		
		System.out.printf("Qual o primeiro valor: %d%n", valorA);
		System.out.printf("Qual o segundo valor: %d%n", valorB);
		System.out.printf("O valor total é de: %d%n", soma);
		
		sc.close();
		
		
		
		//----------- Exercicio 02 ----------
		 *	Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		 *	casas decimais conforme exemplos.
		 *	Fórmula da área: area = π . raio 2
		 *	Considere o valor de π = 3.14159 
		 *
		
		Scanner sc = new Scanner(System.in);
		
		double area, raioQuad, pi;
		
		pi = 3.14159;
		area = sc.nextDouble();
		raioQuad = pi * (Math.pow(area, 2.00));
		
		System.out.printf("O valor da area é %.4f%n", area );
		System.out.printf("O valor da raio ao quadrado * pi é : %.4f%n", raioQuad);
		
		
		sc.close();
	
		----------- Exercicio 03 -----------
		
		* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		* de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		*
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = (A * B) - (C * D);
		
		System.out.printf("O valor de A e B: %d e %d %n", A, B);
		System.out.printf("O valor de C e D: %d e %d %n", C, D);
		System.out.printf("A diferença é: %d%n", dif);
		
		sc.close();
		
		----------- Exercicio 04 -----------
		
		* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		* hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		* decimais.
		
		Scanner sc = new Scanner(System.in);
		
		int numFunc;
		double horasTrab, valorHora, salario;
		
		numFunc = sc.nextInt();
		horasTrab = sc.nextDouble();
		valorHora = sc.nextDouble();
		salario = horasTrab * valorHora;
		
		System.out.printf("Número do funcionário: %d%n", numFunc);
		System.out.printf("Salário: R$ %.2f%n", salario);
		
		
		
		sc.close();
		
		
		
		----------- Exercicio 05 -----------
		
		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
		double valorUnit1, valorUnit2, soma;
		
		codPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorUnit1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorUnit2 = sc.nextDouble();
		
		soma = (qtdPeca1 * valorUnit1)+(qtdPeca2 * valorUnit2);
		
		System.out.printf("-----//-----//-----//-----");
		System.out.printf("O código do produto 1: %d%n", codPeca1);
		System.out.printf("Quantidade da peça 1: %d%n", qtdPeca1);
		System.out.printf("Valor unitário 1: R$ %.2f%n", valorUnit1);
		
		System.out.printf("O código do produto 2: %d%n", codPeca2);
		System.out.printf("Quantidade da peça 2: %d%n", qtdPeca2);
		System.out.printf("Valor unitário 2: R$ %.2f%n%n", valorUnit2);
		
		
		System.out.printf("O valor total a pagar: R$ %.2f%n", soma);
		
		sc.close();
		
		
		
		
		------------ Exercicio 06 -----------
		
		* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		* mostre:
		* a) a área do triângulo retângulo que tem A por base e C por altura.
		* b) a área do círculo de raio C. (pi = 3.14159)
		* c) a área do trapézio que tem A e B por bases e C por altura.
		* d) a área do quadrado que tem lado B.
		* e) a área do retângulo que tem lados A e B.
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, tri, circ, trap, quad, ret, pi;
		
		pi = 3.14159;
		
		System.out.println("Informe os dados: ");
		
		
		System.out.println("O valor de A: ");
		A = sc.nextDouble();
		System.out.println("O valor de B: ");
		B = sc.nextDouble();
		System.out.println("O valor de C: ");
		C = sc.nextDouble();
		
		
		tri = (A * C)/2;
		circ = (C * C)* pi;
		trap = ((A + B )* C)/2;
		quad = B * B;
		ret = A * B;
		
		System.out.printf("Triângulo retêngulo: %.3f%n", tri);
		System.out.printf("Circulo : %.3f%n", circ);
		System.out.printf("Trapézio: %.3f%n", trap);
		System.out.printf("Quadrado: %.3f%n", quad);
		System.out.printf("Retângulo: %.3f%n", ret);
		
		sc.close();
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		double ret, valorConta, conta = 0;
		
		System.out.println("Digite o valor da retirada.");
		ret = sc.nextDouble();
		
		System.out.println("Digite o valor da que está na sua conta.");
		valorConta = sc.nextDouble();
		
		if (ret <= valorConta) {
			conta += ret - valorConta;
			System.out.printf("O valor da conta será: R$ %.2f%n", conta);
		} else {
			System.out.println("A retirada é maior que o valor que você possui");
		}
				
		sc.close();
		
		*/
		
		String[] paises = { "Brasil", "Russia","India", "China", "Africa do sul" };
		
		System.out.println(paises[0]); // Brasil
		System.out.println(Arrays.toString(paises));
		
		int posicao = Arrays.binarySearch(paises, "BRASIL");//index
		System.out.println(posicao); // Quando não existe, retorna -2 ou -1(se tiver em letra com formato diferente);
		
		Arrays.sort(paises, 0, paises.length); // ordenando a partir do índice ZERO.
		System.out.println(Arrays.toString(paises));
		//Acentos, não utilizar, pois o código é gerado de maneira errada.
		
		
		String[][] duasDim = { { "Carlos", "M", "SP" }, { "Lidiane", "F", "MG"}};
		
		System.out.println(duasDim[1][2]); // MG
		System.out.println(duasDim[0][2]); // SP
		
	}

}
