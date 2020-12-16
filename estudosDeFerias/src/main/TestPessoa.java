package main;

import java.util.Scanner;

import modal.Pessoa;

public class TestPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Qual o nome da primeira pessoa? ");
		pessoa.setNome1(sc.next());
		System.out.println("Idade da primeira pessoa?? ");
		pessoa.setIdade1(sc.nextInt());
		
		System.out.println("Qual o nome da segunda pessoa? ");
		pessoa.setNome2(sc.next());
		System.out.println("Idade da segunda pessoa?? ");
		pessoa.setIdade2(sc.nextInt());
		
		if (pessoa.getIdade1() > pessoa.getIdade2()) {
			System.out.println(pessoa.getNome1());
			int result = pessoa.getIdade1() - pessoa.getIdade2();
			System.out.printf("\nDiferença de idade é: %d anos ", result);
			
		}else {
			System.out.println(pessoa.getNome2());
			int result = pessoa.getIdade2() - pessoa.getIdade1();
			System.out.printf("\nDiferença de idade é: %d anos ", result);
		}
		
		
		

		
		

	}

}
