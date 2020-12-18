package main;

import java.util.Scanner;

public class TrocarNumeros {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Informe o primeiro numero: ");
		n1 = sc.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		n2 = sc.nextInt();
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("primeiro numero "  +n1);
		System.out.println("segundo numero "  +n2);
		
		
		sc.close();
	}

}
