package fr.diginamic.immobilier.entites;

import org.junit.Assert;
import org.junit.Test;

public class TestMaison {
	 @Test
	    public void testAjouterPiece() {
	        Maison maison = new Maison();
	  

	        maison.ajouterPiece(new Chambre(2, 22.30));
	        maison.ajouterPiece(new Salon(33, 3.3));

	        Assert.assertEquals(2, maison.nbPieces());
	    }
	 @Test
	    public void testSuperficieEtage() {
	        Maison maison = new Maison();

	        maison.ajouterPiece(new Salon(1, 20.0));
	        maison.ajouterPiece(new Chambre(2, 15.0));

	        Assert.assertEquals(20.0, maison.superficieEtage(1), 0.01);
	        Assert.assertEquals(15.0, maison.superficieEtage(2), 0.01);
	    }
	 
	 @Test
	    public void testSuperficieTypePiece() {
	        Maison maison = new Maison();

	        maison.ajouterPiece(new Salon(1, 30.0));
	        maison.ajouterPiece(new Chambre(2, 15.0));
	        maison.ajouterPiece(new Cuisine(1, 10.0));

	        Assert.assertEquals(30.0, maison.superficieTypePiece("Salon"), 0.01);
	        Assert.assertEquals(15.0, maison.superficieTypePiece("Chambre"), 0.01);
	        Assert.assertEquals(10.0, maison.superficieTypePiece("Cuisine"), 0.01);
	        Assert.assertEquals(0.0, maison.superficieTypePiece("Inconnu"), 0.01);
	    }

	    @Test
	    public void testCalculerSurface() {
	        Maison maison = new Maison();

	        maison.ajouterPiece(new Salon(1, 20.0));
	        maison.ajouterPiece(new Chambre(2, 15.0));
	        maison.ajouterPiece(new Cuisine(1, 10.0));

	        Assert.assertEquals(45.0, maison.calculerSurface(), 0.01);
	    }
}
