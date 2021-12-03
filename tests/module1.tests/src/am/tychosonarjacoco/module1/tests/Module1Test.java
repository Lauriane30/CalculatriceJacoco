package am.tychosonarjacoco.module1.tests;

import org.junit.Assert;
import org.junit.Test;

import am.tychosonarjacoco.module1.Module1ClassA;
import am.tychosonarjacoco.module1.Module1ClassB;

public class Module1Test {

	 @Test
	 public void testAjouter() {
		// données d'entrées
		Module1ClassA calc = new Module1ClassA(4, 5);
		// résultat attendu
		int resultatAttendu = 9;
		// résultat effectif
		int resultatEffectif = calc.ajouter();
		// vérification
		assertEquals(resultatAttendu, resultatEffectif);
	    }

	    @Test
	    public void testSoustraire() {
		// données d'entrées
		Module1ClassA calc = new Module1ClassA(5, 4);
		// résultat attendu
		int resultatAttendu = 1;
		// résultat effectif
		int resultatEffectif = calc.soustraire();
		// vérification
		assertEquals(resultatAttendu, resultatEffectif);
	    }

	    @Test
	    public void testMultiplier() {
		// données d'entrées
		Module1ClassA calc = new Module1ClassA(4, 5);
		// résultat attendu
		int resultatAttendu = 20;
		// résultat effectif
		int resultatEffectif = calc.multiplier();
		// vérification
		assertEquals(resultatAttendu, resultatEffectif);
	    }

	    @Test
	    public void testDiviser() {
		// données d'entrées
		Module1ClassA calc = new Module1ClassA(20, 4);
		// résultat attendu
		int resultatAttendu = 5;
		// résultat effectif
		int resultatEffectif = calc.diviser();
		// vérification
		assertEquals(resultatAttendu, resultatEffectif);
	    }
	  @Test
	  public void testModule1A() {
		  final String expected = "1A";
		  final String name = new Module1ClassA().getName();
		  Assert.assertEquals(expected, name);
	  }
	  @Test
	  public void testModule1B() {
		  final String expected = "1B";
		  final String name = new Module1ClassB().getName();
		  Assert.assertEquals(expected, name);
	  }
}
