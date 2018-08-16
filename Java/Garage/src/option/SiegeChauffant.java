package option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public Double getPrix() {
		return 562.9;
	}

	@Override
	public String getNom() {
		return "Siege Chauffant";
	}
	
	public String toString() {
		String str = this.getNom() + " (" + this.getPrix() + "€) ";
		return str;
	}

}
