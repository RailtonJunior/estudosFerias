package main;

import java.util.Scanner;

import model.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		int result;
		
		System.out.println("Escolha a operação que deseja realizar! ");
		System.out.println("1 - SOMAR: ");
		System.out.println("2 - SUBTRAIR: ");
		System.out.println("3 - DIVIDIR: ");
		System.out.println("4 - MULTIPLICAR: ");
		
		int op = sc.nextInt();
		switch(op) {
		
			case 1:
				System.out.println("Qual o primeiro numero? ");
				int n1 = sc.nextInt();
				System.out.println("Qual o segundo numero?? ");
				int n2 = sc.nextInt();
				result = calculadora.somar(n1, n2);
				System.out.printf("\nO resultado da operação é: %d", result);
				break;
				
			case 2:
				System.out.println("Qual o primeiro numero? ");
				 n1 = sc.nextInt();
				System.out.println("Qual o segundo numero?? ");
				 n2 = sc.nextInt();
				result = calculadora.subtrair(n1, n2);
				System.out.printf("\nO resultado da operação é: %d", result);
				break;
			
			case 3:
				System.out.println("Qual o primeiro numero? ");
				n1 = sc.nextInt();
				System.out.println("Qual o segundo numero?? ");
				n2 = sc.nextInt();
				result = calculadora.dividir(n1, n2);
				System.out.printf("\nO resultado da operação é: %d", result);
				break;	
				
			case 4:
				System.out.println("Qual o primeiro numero? ");
				n1 = sc.nextInt();
				System.out.println("Qual o segundo numero?? ");
				n2 = sc.nextInt();
				result = calculadora.multiplicar(n1, n2);
				System.out.printf("\nO resultado da operação é: %d", result);
				break;	
				
					
		}
			

	}

}
