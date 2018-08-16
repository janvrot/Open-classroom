package moteur;

public class MoteurHybride extends Moteur{

	public MoteurHybride(String cilindre, Double prix) {
		super(cilindre, prix);
		this.setType(TypeMoteur.HYBRIDE);
	}

}
