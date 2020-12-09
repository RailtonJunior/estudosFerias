package biblioteca;

import java.util.Scanner;

public class CadastrarLivro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Livro b = new Livro();
		
		System.out.println("Qual o nome do livro? ");
		b.setNome(sc.next());
		
		System.out.println("Qual o autor do livro? ");
		b.setAutor(sc.next());
		
		System.out.println("Qual edição do livro? ");
		b.setEdicao(sc.nextInt());
		sc.close();
		System.out.println(b.toString());
		
	}

}

//o que compõe um metodo?
//diferença de "private", "protected", "public"?
//Faça um algoritmo que leia um número inteiro e escreva seu sucessor e seu antecessor Fornecidos 
//separadamente o nome e o sobrenome pelo usuário, Elabore um algoritmo que exiba o nome e o sobrenome concatenados.
//(Criar um Objeto Pessoa q contenha Nome e Sobrenome. Método q retorne nome e sobrenome juntos) Oq compoe um método? 
//Diferença de private, protected e public? Quais são os operadores lógicos?
//Fornecidos separadamente o nome e o sobrenome pelo usuário, Elabore um algoritmo que
//exiba o nome e o sobrenome concatenados?
//quais são os operadores lógicos?
