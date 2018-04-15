package application;


public class Individus {
    private String idIndividu;
    private String password;
    private String nomIndividu;
    private String prenomIndividu;
    private String matiere; // si c'est un prof
    private String statut;
    private String genreIndividu;
    private String datNaisIndividu;
    private Adresses lieuNaisIndividu;
    private String nivEtudIndividu;
    private Adresses domEtudIndividu;
    private Individus profIndividu;
    private String domCompetIndividu;
    private String langMatIndividu;
    private String langParlIndividu;
    private String photoIndividu; //bonus
    private String rectoPIDIndividu; //bonus
    private String versoPIDIndividu; //bonus
    
    public Individus(){
   	 idIndividu = null;
   	 nomIndividu = null;
   	 password = null;
   	 matiere = null;
   	 statut = null;
   	 prenomIndividu = null;
   	 genreIndividu = null;
   	 datNaisIndividu = null;
   	 lieuNaisIndividu = null;
   	 nivEtudIndividu = null;
   	 domEtudIndividu = null;
   	 profIndividu = null;
   	 domCompetIndividu = null;
   	 langMatIndividu = null;
   	 langParlIndividu = null;
   	 photoIndividu = null;
   	 rectoPIDIndividu = null;
   	 versoPIDIndividu = null;
   }
    
    public String getIdIndividu() {
        return this.idIndividu;
    }

    public void setIdIndividu(String value) {
        this.idIndividu = value;
    }

    public String getNomIndividu() {
        return this.nomIndividu;
    }

    public void setNomIndividu(String value) {
        this.nomIndividu = value;
    }

    public void setDatNaisIndividu(String value) {
        this.datNaisIndividu = value;
    }

    public String getDatNaisIndividu() {
        return this.datNaisIndividu;
    }

    public String getGenerIndividu() {
        return this.genreIndividu;
    }

    public void setGenerIndividu(String value) {
        this.genreIndividu = value;
    }

    public String getPrenomIndividu() {
        return this.prenomIndividu;
    }

    public void setPrenomIndividu(String value) {
        this.prenomIndividu = value;
    }

    public Adresses getDomEtudIndividu() {
        return this.domEtudIndividu;
    }

    public void setDomEtudIndividu(Adresses value) {
        this.domEtudIndividu = value;
    }

    public String getVersoPIDIndividu() {
        return this.versoPIDIndividu;
    }

    public void setVersoPIDIndividu(String value) {
        this.versoPIDIndividu = value;
    }

    public String getRectoPIDIndividu() {
        return this.rectoPIDIndividu;
    }

    public void setRectoPIDIndividu(String value) {
        this.rectoPIDIndividu = value;
    }

    public void setPhotoIndividu(String value) {
        this.photoIndividu = value;
    }

    public String getPhotoIndividu() {
        return this.photoIndividu;
    }

    public void setLangParlIndividu(String value) {
        this.langParlIndividu = value;
    }

    public String getLangParlIndividu() {
        return this.langParlIndividu;
    }

    public void setLangMatIndividu(String value) {
        this.langMatIndividu = value;
    }

    public String getLangMatIndividu() {
        return this.langMatIndividu;
    }

    public String getDomCompetIndividu() {
        return this.domCompetIndividu;
    }

    public void setDomCompetIndividu(String value) {
        this.domCompetIndividu = value;
    }

    public Individus getProfIndividu() {
        return this.profIndividu;
    }

    public void setProfIndividu(Individus value) {
        this.profIndividu = value;
    }

    public String getNivEtudIndividu() {
        return this.nivEtudIndividu;
    }

    public void setNivEtudIndividu(String value) {
        this.nivEtudIndividu = value;
    }

    public Adresses getLieuNaisIndividu() {
        return this.lieuNaisIndividu;
    }

    public void setLieuNaisIndividu(Adresses value) {
        this.lieuNaisIndividu = value;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		matiere = matiere;
	}

}
