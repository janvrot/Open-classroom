package moteur;

public class MoteurDiesel extends Moteur{

	public MoteurDiesel(String cilindre, Double prix) {
		super(cilindre, prix);
		this.setType(TypeMoteur.DIESEL);
	}
}
