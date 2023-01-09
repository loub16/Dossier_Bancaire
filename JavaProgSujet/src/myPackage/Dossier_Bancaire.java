package myPackage;

public class Dossier_Bancaire {
	
	private Compte_Courant cc;
	private Compte_Epargne ce;
	
	//Constructeur
    public Dossier_Bancaire()
    {
    	cc = new Compte_Courant(0);
    	ce = new Compte_Epargne(0);	
    }
    
    public void deposer(double value) {
    	double quarante = value*0.4;
    	double soixante = value*0.6;
    	
    	cc.Crediter(quarante);
    	ce.Crediter(soixante);
    }
   
    public double get_solde() {
    	return cc.getSolde() + ce.getSolde();
    }
    
    public void remunerer() {
    	ce.Remunerer();
    }
	
    
    
    
}
