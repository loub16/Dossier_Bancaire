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
	
	public void Retirer(double m){ 
		if(m<=this.getSolde()) {
			montant -= m;
		}
		else {
			throw new IllegalArgumentException("Solde compte courant inferieur au montant du retrait");
		}

	}

	@Override
	public double getSolde() {
		return montant;
	}
	

}
