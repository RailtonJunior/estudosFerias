package main;

import java.util.Scanner;

public class Eleicao {

//Em uma eleição presidencial existem quatro candidatos.
//Os votos são informados através de códigos. 
//Os dados utilizados para a contagem dos votos obedecem à 
//seguinte codificação:  
//- 1,2,3,4 = voto para os respectivos candidatos; 
//- 5 = voto nulo; 
//- 6 = voto em branco;
//Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva: 
//- total de votos para cada candidato; 
//- total de votos nulos; 
//- total de votos em branco;
//Como finalizador do conjunto de votos, tem-se o valor 0.	
	
	public static void main(String[] args) {
		
		int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
		int voto, votoNulo = 0, votoBranco = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Para sair, digite 0 ");
		
		while (true) {
			System.out.println("MENU PARA VOTOS!!\n");
			System.out.println(" 1 - Candidato1: ");
			System.out.println(" 2 - Candidato2: ");
			System.out.println(" 3 - Candidato3: ");
			System.out.println(" 4 - Candidato4: ");
			System.out.println(" 5 - Votos nulos: ");
			System.out.println(" 6 - Votos em branco: ");
			System.out.println("\n Informe o codigo do seu candidato: ");
			
			voto = sc.nextInt();
			if(voto == 0)
				break;
			
			switch (voto) {
			case 1:
				candidato1 = candidato1 +1;
				break;
				
			case 2:
				candidato2 = candidato2 +1;
				break;
				
			case 3:
				candidato3 = candidato3 +1;
				break;
				
			case 4:
				candidato4 = candidato4 +1;
				break;
				
			case 5:
				votoNulo = votoNulo +1;
				break;
				
			case 6:
				votoBranco = votoBranco +1;
				break;
			
			default:	
			System.out.println("Voto inválido: ");	
																			
			
			}
		}
		
		System.out.println("Quantidade de votos: ");
		System.out.println("Candidato 1: " +candidato1);
		System.out.println("Candidato 2: " +candidato2);
		System.out.println("Candidato 3: " +candidato3);
		System.out.println("Candidato 4: " +candidato4);
		System.out.println("Votos nulos: " +votoNulo);
		System.out.println("Votos em branco: " +votoBranco);

	}

}
