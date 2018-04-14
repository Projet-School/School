package application;

//Classe non-utilisée.
public class Agents extends Individus{
	private String idAgent;
    private String idAffectation;
    
    public Agents() {
		super();
		idAgent = null;
		idAffectation = null;
	}
    
    public String getIdAgent() {
        return this.idAgent;
    }

    public void setIdAgent(String value) {
        this.idAgent = value;
    }

    public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

    public String getIdAffectation() {
        return this.idAffectation;
    }

}
