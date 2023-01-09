package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.Compte_Epargne;


public class TestCompteEpargne {

	@Test
	public void test() {
		Compte_Epargne ce=new Compte_Epargne(0);
		ce.Crediter(100);
		assertEquals(ce.getSolde(),100,0);
		ce.Remunerer();
		assertEquals(ce.getSolde(),103.4,0.1);
		
		
	}

}
