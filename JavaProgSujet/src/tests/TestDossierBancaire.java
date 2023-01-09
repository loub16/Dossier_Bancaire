package tests;

import static org.junit.Assert.*;
import myPackage.Dossier_Bancaire;

import org.junit.Test;

//The Test annotation indicates that the public void method to which it is attached can be run as a test case.
public class TestDossierBancaire {

	@Test  
	public void test1_1() 
	{
		Dossier_Bancaire dossier=new Dossier_Bancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0); //voir documentation en ligne sur assertions Junit 
	}
	
	@Test
	public void test1_2() 
	{
		Dossier_Bancaire dossier=new Dossier_Bancaire();
		dossier.deposer(100);
		dossier.remunerer();
		
		assertEquals(102.04,dossier.get_solde(),0.01);
		
	}

}
