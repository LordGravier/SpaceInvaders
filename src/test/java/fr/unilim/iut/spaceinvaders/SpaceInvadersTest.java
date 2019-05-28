    package fr.unilim.iut.spaceinvaders;

    import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;
	
    public class SpaceInvadersTest {
    	
    	private SpaceInvaders spaceinvaders;
    	@Before
 	    public void initialisation() {
 		    spaceinvaders = new SpaceInvaders(15, 10);
 	    }
    	 
	   @Test
	   public void test_AuDebut_JeuSpaceInvaderEstVide() {
		    
		    assertEquals("" + 
		    "...............\n" + 
		    "...............\n" +
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" , spaceinvaders.toString());
	        }
    }