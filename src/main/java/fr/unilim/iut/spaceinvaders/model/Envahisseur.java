package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {
	
	private boolean SeDeplaceVersLaDroite;

	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		this.SeDeplaceVersLaDroite=true;
	}

	public boolean SeDeplaceVersLaDroite() {
		return SeDeplaceVersLaDroite;
	}
	public void changerDirectionHoziontale() {
		this.SeDeplaceVersLaDroite = !this.SeDeplaceVersLaDroite;
}

}

	
	
