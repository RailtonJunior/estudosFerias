package main;

import java.util.Scanner;

import model.Automovel;
import model.Carro;
import model.Motocicleta;

public class TestaAutomovel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Automovel auto;
		
		String res;
		System.out.println("Qual tipo de automovel? digite C para carro ou M para moto ");
		res = sc.next();
		
		if (res.equals("c") ) {
			Carro carro = new Carro();
			System.out.println("Informe o nome do automovel? ");
			carro.setNome(sc.next());
			System.out.println("Qual tipo de motor? ");
			carro.setMotor(sc.nextDouble());
			System.out.println("Qual a cor do automovel? ");
			carro.setCor(sc.next());
			System.out.println("Qual o ano do automovel? ");
			carro.setAno(sc.nextInt());
			System.out.println("Qual cambio do carro? ");
			carro.setCambio(sc.next());
			
			System.out.println(carro.toString());
			
		}else if (res.equals("m")) {
			Motocicleta motocicleta = new Motocicleta();
			System.out.println("Informe o nome do automovel? ");
			motocicleta.setNome(sc.next());
			System.out.println("Qual tipo de motor? ");
			motocicleta.setMotor(sc.nextDouble());
			System.out.println("Qual a cor do automovel? ");
			motocicleta.setCor(sc.next());
			System.out.println("Qual o ano do automovel? ");
			motocicleta.setAno(sc.nextInt());
			System.out.println("A moto tem carenagem? ");
			motocicleta.setCarenagem(sc.next());
			
			System.out.println(motocicleta.toString());
			
		}
		
		
		
		sc.close();

	}

}
