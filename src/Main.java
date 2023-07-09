import java.util.Scanner;

public class Main {
	/*
	public static void main(String[] args) {
	
    	Funções matemáticas do Java;
		 A = Math.sqrt(x) => A = raiz quadrada de x
		 A = Math.pow(x, y) => A = x elevado a y
		 A= Math.abs(x) => A = o valor absoluto de x
		
		Exemplo de valor de delta:
		delta = Math.pow(b, 2.0) - 4 *a * c;
		x1 = (-b + Math.sqrt(delta))/(2.0 * a);
		x2 = (-b + Math.sqrt(delta))/(2.0 * a);
		
		//Procurar por mais informações de calculo= java.lang.Math
	*/
		
	/*	
		
		System.out.println("Olá, mundo!!!");
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		
		A = Math.pow(x, y);
		B = Math.pow(x,  2.0);
		C = Math.pow(5.0,  2.0);
		System.out.println(x + " elevado a " +y+ " = " + A);
		System.out.println(x + "elevado ao quadrado = "+B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de "+ y + " = " + A);
		System.out.println("Valor absoluto de "+ z + " = " + B);
		
		*/
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 valores:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		
		if (A > B && A > C) {
			System.out.printf("O maior valor é "+A);
		} else if ( B > C ){
			System.out.printf("O maior valor é : "+ B);
		} else {
			System.out.println("O maior valor é: " +C);
		}
		
		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int maior = max(A, B, C);
		
		mostrarResult(maior);
				
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if ( y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void mostrarResult(int value) {
		System.out.println("O maior valor é :"+ value);
	
	}
	*/
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triângulo X:");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		
		// Fórmula de Heron
		double p = (xA + xB + xC) /2.00;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) /2.00;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		System.out.printf("Triângulo X, área: %.2f%n", areaX);
		System.out.printf("Triângulo Y, área: %.2f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área: X");
		} else {
			System.out.println("A maior área: Y");
		}

		sc.close();
		
		
		
	}
}
