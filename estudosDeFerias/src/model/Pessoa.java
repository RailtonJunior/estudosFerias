package model;

public class Pessoa {
	//Fa�a um algoritmo que leia o nome (nome1 e nome2) e a idade (idade1 e idade2) de duas pessoas,
	//informando quem � maior e quem � menor de idade, 
	//quem � a pessoa mais velha e quem � a mais nova, bem como a diferen�a de idade entre elas.
	
	private String nome1;
	private String nome2;
	private int idade1;
	private int idade2;
	
	public String getNome1() {
		return nome1;
	}
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	public String getNome2() {
		return nome2;
	}
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	public int getIdade1() {
		return idade1;
	}
	public void setIdade1(int idade1) {
		this.idade1 = idade1;
	}
	public int getIdade2() {
		return idade2;
	}
	public void setIdade2(int idade2) {
		this.idade2 = idade2;
	}
	
	
}
