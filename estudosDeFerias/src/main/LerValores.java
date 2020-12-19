package main;

import java.util.Scanner;

public class LerValores {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado.
		
		Scanner sc = new Scanner(System.in);
		
		int maiorValor = 0;
		int menorValor = 1000000;
		int i;
		int cont;
		
		for ( cont = 0; cont < 6; cont++) {							
			System.out.println("Informer um valor: ");
			i = sc.nextInt();	
			
			if (i > maiorValor) {
				maiorValor = i;
				
			}
			
			else if (i < menorValor) {
				menorValor = i;
			}
		}
		
		System.out.println("O maior é: " +maiorValor);
		System.out.println("O menor é: " +menorValor);
		

	}

}
