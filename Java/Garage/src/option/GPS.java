package option;

import java.io.Serializable;

public class GPS implements Option, Serializable{

	private static final long serialVersionUID = 1L;
	
	public GPS() {
		this.getNom();
		this.getPrix();
	}
	
	
	public String toString() {
		String str = this.getNom() + " (" + this.getPrix() + "€) ";
		return str;
	}

	@Override
	public Double getPrix() {
		return 113.5;
	}

	@Override
	public String getNom() {
		return "GPS";
	}
		
}
