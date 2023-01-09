package myPackage;

public class Compte_Epargne implements Compte {
	private double montant;
	private double taux=3.4;

	public Compte_Epargne(double m) {
		montant=m;
	}
	@Override
	public void Crediter(double m) {
		// TODO Auto-generated method stub
		montant+=m;

	}

	@Override
	public double getSolde() {
		// TODO Auto-generated method stub
		return montant;
	}
	
	public void Remunerer() {
		montant+=montant*(taux/100);
		
	}

}
