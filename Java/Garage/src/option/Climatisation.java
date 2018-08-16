package option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public Double getPrix() {
		return 347.3;
	}

	@Override
	public String getNom() {
		return "Climatisation";
	}
	
	public String toString() {
		String str = this.getNom() + " (" + this.getPrix() + "€) ";
		return str;
	}

}
