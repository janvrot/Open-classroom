package option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public Double getPrix() {
		return 212.35;
	}

	@Override
	public String getNom() {
		return "Vitre electrique";
	}
	
	public String toString() {
		String str = this.getNom() + " (" + this.getPrix() + "€) ";
		return str;
	}

}
