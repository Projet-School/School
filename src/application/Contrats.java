package application;


public class Contrats {
    private String idContrat;
    //private String idStatut;//inutilisé
    private String idFonction;
    private String idIndividu;
    private String libelContrat;
    private String dateEntrContrat;//non implementé
    private String dateSortContrat;//non implementé
    private String salaireContrat;
    private String indemniteContrat;
    private String materielContrat;
    private String contratContrat;//non implementé

    public Contrats(String idContrat, String idFonction, String idIndividu, String libelContrat, String salaireContrat, String indemniteContrat, String materielContrat) {
		super();
		this.idContrat = idContrat;
		this.idFonction = idFonction;
		this.idIndividu = idIndividu;
		this.libelContrat = libelContrat;
		this.dateEntrContrat = "";
		this.dateSortContrat = "";
		this.salaireContrat = salaireContrat;
		this.indemniteContrat = indemniteContrat;
		this.materielContrat = materielContrat;
		this.contratContrat = "";
	}

    public String getIdContrat() {
        return this.idContrat;
    }

    public void setIdContrat(String value) {
        this.idContrat = value;
    }

    /*public String getIdStatut() {
        return this.idStatut;
    }

    public void setIdStatut(String value) {
        this.idStatut = value;
    }*/

    public String getIdFonction() {
        return this.idFonction;
    }

    public void setIdFonction(String value) {
        this.idFonction = value;
    }

    public String getIdIndividu() {
        return this.idIndividu;
    }

    public void setIdIndividu(String value) {
        this.idIndividu = value;
    }

    public String getLibelContrat() {
        return this.libelContrat;
    }

    public void setLibelContrat(String value) {
        this.libelContrat = value;
    }

    public String getDateEntrContrat() {
        return this.dateEntrContrat;
    }

    public void setDateEntrContrat(String value) {
        this.dateEntrContrat = value;
    }

    public String getDateSortContrat() {
        return this.dateSortContrat;
    }

    public void setDateSortContrat(String value) {
        this.dateSortContrat = value;
    }

    public String getSalaireContrat() {
        return this.salaireContrat;
    }

    public void setSalaireContrat(String value) {
        this.salaireContrat = value;
    }

    public String getIndemniteContrat() {
        return this.indemniteContrat;
    }

    public void setIndemniteContrat(String value) {
        this.indemniteContrat = value;
    }

    public String getMaterielContrat() {
        return this.materielContrat;
    }

    public void setMaterielContrat(String value) {
        this.materielContrat = value;
    }

    public String getContratContrat() {
        return this.contratContrat;
    }

    public void setContratContrat(String value) {
        this.contratContrat = value;
    }

}
