package myPackage;

public class Dossier_Bancaire {
	
	//qst3 exo4
    //qst1 exo4
	
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
    
    public void retirer(double value){
    	cc.Retirer(value);
    }
   
    public double get_solde() {
    	return cc.getSolde() + ce.getSolde();
    }
    
    public void remunerer() {
    	ce.Remunerer();
    }


    //ce commentaire est vraiment sur new_dev -> commit exo4 qst2.3
    //ce com est aussi sur new_dev -> commit exo4 qst2.4

}
