package model;

public class Motocicleta extends Automovel {
	
	private String carenagem;

	public String getCarenagem() {
		return carenagem;
	}

	public void setCarenagem(String carenagem) {
		this.carenagem = carenagem;
		
		
	}

	@Override
	public String toString() {
		return super.toString() + "\nA moto tem Carenagem -> " +this.carenagem;
	}
	

}
