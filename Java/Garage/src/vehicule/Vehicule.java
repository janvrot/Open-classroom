package vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import moteur.Moteur;
import option.Option;

public class Vehicule implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double prix;
	private String nom;
	private Marque nomMarque;
	private Moteur moteur;

	private List<Option> options = new ArrayList<Option>();

	public Vehicule() {

	}

	public String toString() {
		String str = "+ Voiture " + this.getMarque() + " : " + this.getNom();
		str += this.getMoteur().toString();
		for (Option option : options) {
			str += option.toString();
		}
		str += " d'une valeur de " + this.getPrix() + "€\n";
		return str;
	}

	public void addOption(Option opt) {
		this.options.add(opt);
	}

	public Marque getMarque() {
		return this.nomMarque;
	}

	public List<Option> getOptions() {
		return options;
	}

	public Double getPrix() {
		Double prix = 0.0;
		prix += this.getMoteur().getPrix();
		for (Option option : this.getOptions()) {
			prix += option.getPrix();
		}
		return prix;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void setMarque(Marque marque) {
		this.nomMarque = marque;
	}

	public Moteur getMoteur() {
		return this.moteur;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}
}
