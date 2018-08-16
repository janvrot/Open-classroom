package moteur;

public class MoteurEssence extends Moteur{

	public MoteurEssence(String cilindre, Double prix) {
		super(cilindre, prix);
		this.setType(TypeMoteur.ESSENCE);
	}

}
