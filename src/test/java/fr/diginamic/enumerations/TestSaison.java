package fr.diginamic.enumerations;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestSaison {
	
	@Test 
	public void  testValueOfLibelle() {
		 assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
	     assertEquals(Saison.ETE, Saison.valueOfLibelle("Ete"));
	     assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
	     assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
	}
	
	 @Test
	 public void testValueOfLibelleCasLimite() {
	        // Vérifiez le cas où le libellé est null
	        assertNull(Saison.valueOfLibelle(null));

	        // Vérifiez le cas où le libellé n'existe pas
	        assertNull(Saison.valueOfLibelle("USHJD"));
	    }
	 
	 @Test
	    public void testToString() {
	        assertEquals("1. Printemps", Saison.PRINTEMPS.toString());
	        assertEquals("2. Ete", Saison.ETE.toString());
	        assertEquals("3. Automne", Saison.AUTOMNE.toString());
	        assertEquals("4. Hiver", Saison.HIVER.toString());
	    }
}
