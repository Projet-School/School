package application;


public class Etudiants extends Individus{
    private String idEtudiant;
    private String idAffectation;

    public Etudiants(){
    	super();
    	idEtudiant = null;
    	idAffectation = null;
    }
    
    public String getIdEtudiant() {
        return this.idEtudiant;
    }

    public void setIdEtudiant(String value) {
        this.idEtudiant = value;
    }

    public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

    public String getIdAffectation() {
        return this.idAffectation;
    }

}
