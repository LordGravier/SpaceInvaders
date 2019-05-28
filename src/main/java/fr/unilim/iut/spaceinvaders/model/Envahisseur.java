package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {
	
	private boolean envahisseurSeDeplaceVersDroite;

	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		this.envahisseurSeDeplaceVersDroite=true;
	}

	public boolean getEnvahisseurSeDeplaceVersDroite() {
		return envahisseurSeDeplaceVersDroite;
	}

	public void setEnvahisseurSeDeplaceVersDroite(boolean envahisseurSeDeplaceVersDroite) {
		this.envahisseurSeDeplaceVersDroite = envahisseurSeDeplaceVersDroite;
	}

}

	
	
