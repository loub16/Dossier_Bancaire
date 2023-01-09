package myPackage;

public class Compte_Courant implements Compte{

	private double montant;
	
	public Compte_Courant(double m) {
		montant = m;
	}
	
	@Override
	public void Crediter(double m) {
		montant += m;
		
	}

	@Override
	public double getSolde() {
		return montant;
	}
	

}
