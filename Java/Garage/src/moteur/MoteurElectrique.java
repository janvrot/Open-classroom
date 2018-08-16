package moteur;

public class MoteurElectrique extends Moteur{

	public MoteurElectrique(String cilindre, Double prix) {
		super(cilindre, prix);
		this.setType(TypeMoteur.ELECTRIQUE);
	}

}
