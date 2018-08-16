package moteur;

import java.io.Serializable;

public class Moteur implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private TypeMoteur type;
	private String cilindre;
	private Double prix;
	
	
	public Moteur(String cilindre, Double prix) {
		this.cilindre = cilindre;
		this.prix = prix;
	}
	
	public String toString() {
		String str = "Moteur " + this.getType() + " " + this.getCilindre() + " (" + this.getPrix() + "€)";
		return str;
		
	}
	
	public Double getPrix() {
		return prix;		
	}

	public String getCilindre() {
		return cilindre;
	}

	public TypeMoteur getType() {
		return this.type;
	}

	public void setType(TypeMoteur type) {
		this.type = type;
	}
	
}
