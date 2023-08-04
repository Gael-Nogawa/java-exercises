package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.AumentoSalario;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		List<AumentoSalario> lista = new ArrayList<>();
		
		System.out.println("Quantas pessoas você colocará na lista? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("\n\nEmploye #"+ (i+1)+": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(existeId(lista, id)) {
				System.out.println("usuário já existe. Tente novamente: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			AumentoSalario emp = new AumentoSalario(id, nome, salario);
			
			lista.add(emp);
			
			
		}
		
		System.out.print("\n\nQual o numero do colaborador que receberá o aumento? ");
		int idSalario = sc.nextInt();
		
		Integer posit = posicaoId(lista, idSalario);
		
		if ( posit == null) {
			System.out.println("Id não encontrado.");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			
			lista.get(posit).aumento(percent);
		}
		
		System.out.println();
		System.out.println("Listas de funcionários: ");
		
		for (AumentoSalario colab : lista) {
			System.out.println(colab);
		}
		
		
		/*
		
		//Encontrando o ID que seja igual ao do colaborador da lista.
		AumentoSalario colab = lista.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		
		// Possibilidade de usar está função, que segue no fim do programa.
		Integer posit = temId(lista, idSalario);
		
		*/
		
		
		
		sc.close();

	}
	
	/* 
	 * 	Usando a função static, porque o programa principal está sendo usada como static.
	 *  E está com a wrapper class Integer, por se caso, não tiver, ele retorna NULL, o que no tipo primitivo
	 *  não é possível.
	 *	Mas se caso usar o int, e se retornar falso, precisa ser número, como o -1.
     *	
	 *	Continuação da procura pelo ID do colaborador, mas não foi necessário por usar as funções lambdas.
	 *
	 */
	
	 
	
	// Achar o ID do empregado para dar aumento, se não achar, retorna NULL.
	public static Integer posicaoId(List<AumentoSalario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null; 
		
	}
	
	public static boolean existeId(List<AumentoSalario> lista, int id) {
		AumentoSalario emp = lista.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
		return emp != null;
	}
	
	

}
