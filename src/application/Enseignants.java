package application;


public class Enseignants extends Individus{
    private String idEnseignant;
    private String idAffectation;

    public Enseignants(){
    	super();
    	idEnseignant = null;
    	idAffectation = null;
    }
    
    public String getIdEnseignant() {
        return this.idEnseignant;
    }

    public void setIdEnseignant(String value) {
        this.idEnseignant = value;
    }

    public String getIdAffectation() {
        return this.idAffectation;
    }

    public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

}
