package fr.diginamic.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestStringUtils {
	@Test 
	public void testLevenshteinDistanceNominal() {
        // Cas nominal : les chaînes sont identiques
        assertEquals(0, StringUtils.levenshteinDistance("abc", "abc"));

        // Cas nominal : une insertion
        assertEquals(1, StringUtils.levenshteinDistance("abc", "abcd"));

        // Cas nominal : une substitution
        assertEquals(1, StringUtils.levenshteinDistance("abc", "axc"));

        // Cas nominal : une suppression
        assertEquals(1, StringUtils.levenshteinDistance("abc", "ab"));

        // Cas nominal : chaînes de longueurs différentes
        assertEquals(2, StringUtils.levenshteinDistance("abc", "abcdx"));
    }
	
//	@Test
//    public void testLevenshteinDistanceRobustesse() {
//        // Cas de robustesse : l'une des chaînes est null
//        assertNull(StringUtils.levenshteinDistance(null, "abc"));
//        assertNull(StringUtils.levenshteinDistance("abc", null));
//        assertNull(StringUtils.levenshteinDistance(null, null));
//    }
}
