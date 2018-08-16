package option;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Double getPrix() {
		return 29.9;
	}

	@Override
	public String getNom() {
		return "Barre de toit";
	}
	
	public String toString() {
		String str = this.getNom() + " (" + this.getPrix() + "€) ";
		return str;
	}

}
