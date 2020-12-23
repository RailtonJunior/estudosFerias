package model;

public class Automovel {
	
	private double motor;
	private String nome;
	private String cor;
	private int ano;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Motor -> " +this.motor+ " \nNome -> " +this.nome+ " \nCor do automovel -> " +this.cor+ " \nAno de fabricação -> " +this.ano + "";
	}
	
	
	
	
	
	
	

}
