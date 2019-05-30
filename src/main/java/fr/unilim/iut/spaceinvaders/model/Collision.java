package fr.unilim.iut.spaceinvaders.model;

public class Collision {

	public static boolean detecterCollision(Sprite sprite1, Sprite sprite2) {
		
		if(spriteNonNull(sprite1, sprite2)) {
			if(abscisseLaPlusADroiteSprite1EstInclusDansAbscisseDeSprite2(sprite1, sprite2)) {
				if(ordonneeLaPlusBasseSprite1EstInclusDansOrdonneeSprite2(sprite1, sprite2)) {
					return true;					
				}
				if(origineOrdonneeSprite1EstInclusDansOrdonneeSprite2(sprite1, sprite2)) {
					return true;					
				}
			}
			if(abscisseSprite1EstInclusDansAbscisseDeSprite2(sprite1, sprite2)) {
				if(ordonneeLaPlusBasseSprite1EstInclusDansOrdonneeSprite2(sprite1, sprite2)) {
					return true;					
				}
				if(origineOrdonneeSprite1EstInclusDansOrdonneeSprite2(sprite1, sprite2)) {
					return true;					
				}
			}
		}
		return false;
	}

	public static boolean abscisseSprite1EstInclusDansAbscisseDeSprite2(Sprite sprite1, Sprite sprite2) {
		return (sprite1.origine.x <= sprite2.abscisseLaPlusADroite() && sprite1.origine.x >= sprite2.abscisseLaPlusAGauche());
	}

    public static boolean origineOrdonneeSprite1EstInclusDansOrdonneeSprite2(Sprite sprite1, Sprite sprite2) {
		return (sprite1.origine.y >= sprite2.ordonneeLaPlusBasse() && sprite1.origine.y <= sprite2.ordonneeLaPlusHaute());
	}

	public static boolean ordonneeLaPlusBasseSprite1EstInclusDansOrdonneeSprite2(Sprite sprite1, Sprite sprite2) {
		return (sprite1.ordonneeLaPlusBasse() >= sprite2.ordonneeLaPlusBasse() && sprite1.ordonneeLaPlusBasse() <= sprite2.ordonneeLaPlusHaute());
	}

	public static boolean abscisseLaPlusADroiteSprite1EstInclusDansAbscisseDeSprite2(Sprite sprite1,
			Sprite sprite2) {
		return (sprite1.origine.x <= sprite2.abscisseLaPlusADroite() 
				&& sprite1.origine.x >= sprite2.abscisseLaPlusAGauche());
	}

	public static boolean spriteNonNull(Sprite sprite1, Sprite sprite2) {
			 return (null != sprite1 && null!= sprite2); 
} 
}
