package application;

public class Affectations {
    private String idAffectation;
    private String idContrat;
    //private String trigrAffectation;//je ne sais pas à quoi ça correspond, inutilisé
    private String loginAffectation;
    private String motPasseAffectation;
    private String dateEntrAffectation;//non implementé
    private String dateSortAffectation;//non implementé
    private String commAffectation;
    private String ficheAffectation;//non implementé
    private String referentAffectation;
    private String validAffectation;//non implementé
    
    public Affectations(String idAffectation, String idContrat, String loginAffectation,
			String motPasseAffectation, String commAffectation, String referentAffectation) {
		super();
		this.idAffectation = idAffectation;
		this.idContrat = idContrat;
		this.loginAffectation = loginAffectation;
		this.motPasseAffectation = motPasseAffectation;
		this.dateEntrAffectation = "";
		this.dateSortAffectation = "";
		this.commAffectation = commAffectation;
		this.ficheAffectation = "";
		this.referentAffectation = referentAffectation;
		this.validAffectation = "";
	}

	public String getIdAffectation() {
        return this.idAffectation;
    }

	public void setIdAffectation(String value) {
        this.idAffectation = value;
    }

	public String getIdContrat() {
        return this.idContrat;
    }

	public void setIdContrat(String value) {
        this.idContrat = value;
    }

    /*public String getTrigrAffectation() {
        return this.trigrAffectation;
    }

    public void setTrigrAffectation(String value) {
        this.trigrAffectation = value;
    }*/

	public String getLoginAffectation() {
        return this.loginAffectation;
    }

	public void setLoginAffectation(String value) {
        this.loginAffectation = value;
    }

    public String getMotPasseAffectation() {
        return this.motPasseAffectation;
    }

    public void setMotPasseAffectation(String value) {
        this.motPasseAffectation = value;
    }

    public String getDateEntrAffectation() {
        return this.dateEntrAffectation;
    }

    public void setDateEntrAffectation(String value) {
        this.dateEntrAffectation = value;
    }

    public String getDateSortAffectation() {
        return this.dateSortAffectation;
    }

    public void setDateSortAffectation(String value) {
        this.dateSortAffectation = value;
    }

    public String getCommAffectation() {
        return this.commAffectation;
    }

    public void setCommAffectation(String value) {
        this.commAffectation = value;
    }

    public String getFicheAffectation() {
        return this.ficheAffectation;
    }

    public void setFicheAffectation(String value) {
        this.ficheAffectation = value;
    }

    public String getReferentAffectation() {
        return this.referentAffectation;
    }

    public void setReferentAffectation(String value) {
        this.referentAffectation = value;
    }

    public String getValidAffectation() {
        return this.validAffectation;
    }

    public void setValidAffectation(String value) {
        this.validAffectation = value;
    }

}
