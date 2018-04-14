package application;


public class Securite extends Individus{
    private String idSecurite;
    private String idAffectation;

    public Securite(){
    	super();
    	idSecurite = null;
    	idAffectation = null;
    }
    
    public String getIdSecurite() {
        return this.idSecurite;
    }

    public void setIdSecurite(String value) {
        this.idSecurite = value;
    }

    public String getIdAffectation() {
        return this.idAffectation;
    }

    public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

}
