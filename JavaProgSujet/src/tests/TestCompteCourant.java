package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.Compte_Courant;

public class TestCompteCourant {

	@Test
	public void test() {
		
		Compte_Courant cc = new Compte_Courant(235);
		cc.Crediter(10);
		
		assertEquals(cc.getSolde(),245,0);
		
	}

}
