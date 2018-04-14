package application;


public class Entretien extends Individus{
    private String idEntretien;
    private String idAffectation;

    public Entretien(){
    	super();
    	idEntretien = null;
    	idAffectation = null;
    }
    
    public void setIdEntretien(String value) {
        this.idEntretien = value;
    }

    public String getIdEntretien() {
        return this.idEntretien;
    }

    public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

    public String getIdAffectation() {
        return this.idAffectation;
    }

}
