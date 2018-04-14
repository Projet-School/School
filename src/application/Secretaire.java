package application;


public class Secretaire extends Individus{
	private String idSecretaire;
    private String idAffectation;
    
    public Secretaire() {
		super();
		idSecretaire = null;
		idAffectation = null;
	}
    
    public String getIdSecretaire() {
        return this.idSecretaire;
    }

    public void setIdSecretaire(String value) {
        this.idSecretaire = value;
    }

    public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

    public String getIdAffectation() {
        return this.idAffectation;
    }

}
