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
		
		System.out.println("Qual edi��o do livro? ");
		b.setEdicao(sc.nextInt());
		sc.close();
		System.out.println(b.toString());
		
	}

}

//o que comp�e um metodo?
//diferen�a de "private", "protected", "public"?
//Fa�a um algoritmo que leia um n�mero inteiro e escreva seu sucessor e seu antecessor Fornecidos 
//separadamente o nome e o sobrenome pelo usu�rio, Elabore um algoritmo que exiba o nome e o sobrenome concatenados.
//(Criar um Objeto Pessoa q contenha Nome e Sobrenome. M�todo q retorne nome e sobrenome juntos) Oq compoe um m�todo? 
//Diferen�a de private, protected e public? Quais s�o os operadores l�gicos?
//Fornecidos separadamente o nome e o sobrenome pelo usu�rio, Elabore um algoritmo que
//exiba o nome e o sobrenome concatenados?
//quais s�o os operadores l�gicos?
