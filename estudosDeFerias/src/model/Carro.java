package model;

public class Carro extends Automovel {
	
	private String cambio;

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
		
		
	}

	@Override
	public String toString() {
		return super.toString() + " \nTipo de cambio -> "  +this.cambio;
	}
	

}
