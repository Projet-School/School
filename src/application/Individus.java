package application;


public abstract class Individus {
    private String idIndividu;
    private String nomIndividu;
    private String prenomIndividu;
    private String generIndividu;
    private String datNaisIndividu;
    private String lieuNaisIndividu;
    private String nivEtudIndividu;
    private String domEtudIndividu;
    private String profIndividu;
    private String domCompetIndividu;
    private String langMatIndividu;
    private String langParlIndividu;
    private String photoIndividu;
    private String rectoPIDIndividu;
    private String versoPIDIndividu;

    String getIdIndividu() {
        return this.idIndividu;
    }

    void setIdIndividu(String value) {
        this.idIndividu = value;
    }

    String getNomIndividu() {
        return this.nomIndividu;
    }

    void setNomIndividu(String value) {
        this.nomIndividu = value;
    }

    void setDatNaisIndividu(String value) {
        this.datNaisIndividu = value;
    }

    String getDatNaisIndividu() {
        return this.datNaisIndividu;
    }

    String getGenerIndividu() {
        return this.generIndividu;
    }

    void setGenerIndividu(String value) {
        this.generIndividu = value;
    }

    String getPrenomIndividu() {
        return this.prenomIndividu;
    }

    void setPrenomIndividu(String value) {
        this.prenomIndividu = value;
    }

    String getDomEtudIndividu() {
        return this.domEtudIndividu;
    }

    void setDomEtudIndividu(String value) {
        this.domEtudIndividu = value;
    }

    String getVersoPIDIndividu() {
        return this.versoPIDIndividu;
    }

    void setVersoPIDIndividu(String value) {
        this.versoPIDIndividu = value;
    }

    String getRectoPIDIndividu() {
        return this.rectoPIDIndividu;
    }

    void setRectoPIDIndividu(String value) {
        this.rectoPIDIndividu = value;
    }

    void setPhotoIndividu(String value) {
        this.photoIndividu = value;
    }

    String getPhotoIndividu() {
        return this.photoIndividu;
    }

    void setLangParlIndividu(String value) {
        this.langParlIndividu = value;
    }

    String getLangParlIndividu() {
        return this.langParlIndividu;
    }

    void setLangMatIndividu(String value) {
        this.langMatIndividu = value;
    }

    String getLangMatIndividu() {
        return this.langMatIndividu;
    }

    String getDomCompetIndividu() {
        return this.domCompetIndividu;
    }

    void setDomCompetIndividu(String value) {
        this.domCompetIndividu = value;
    }

    String getProfIndividu() {
        return this.profIndividu;
    }

    void setProfIndividu(String value) {
        this.profIndividu = value;
    }

    String getNivEtudIndividu() {
        return this.nivEtudIndividu;
    }

    void setNivEtudIndividu(String value) {
        this.nivEtudIndividu = value;
    }

    String getLieuNaisIndividu() {
        return this.lieuNaisIndividu;
    }

    void setLieuNaisIndividu(String value) {
        this.lieuNaisIndividu = value;
    }

}