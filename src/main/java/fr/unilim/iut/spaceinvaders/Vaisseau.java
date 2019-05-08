package fr.unilim.iut.spaceinvaders;

public class Vaisseau {
	Position origine;
	Dimension dimension;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.dimension = new Dimension(longueur, hauteur);
		this.origine = new Position (x,y);
	}

	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	public boolean estOrdonneeCouverte(int y) {
		return ordonneeLaPlusBasse(y) && ordonneeLaPlusHaute(y);
	}

	public boolean ordonneeLaPlusBasse(int y) {
		return this.origine.ordonnee() - this.dimension.hauteur()+ 1 <= y;
	}

	public boolean ordonneeLaPlusHaute(int y) {
		return y <= this.origine.ordonnee();
	}

	public boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse() + this.dimension.longueur() - 1;
	}

	public void seDeplacerVersLaDroite() {
	    this.origine.changerAbscisse(this.origine.abscisse()+1);
   }

	 public void seDeplacerVersLaGauche() {
		    this.origine.changerAbscisse(this.origine.abscisse()-1);
	  }

	public int abscisseLaPlusAGauche() {
		return this.origine.abscisse();
	}

	public void positionner(int x, int y) {
		  this.origine.changerAbscisse(x);
		  this.origine.changerOrdonnee(y);
    }

}
