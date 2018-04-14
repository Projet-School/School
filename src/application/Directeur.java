package application;


public class Directeur extends Individus{
    private String idDirecteur;
    private String idAffectation;

    public Directeur(){
    	super();
    	idDirecteur = null;
    	idAffectation = null;
    }
    
    public String getIdDirecteur() {
        return this.idDirecteur;
    }

    public void setIdDirecteur(String value) {
        this.idDirecteur = value;
    }

    public String getIdAffectation() {
        return this.idAffectation;
    }

    public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

}
