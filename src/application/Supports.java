package application;


public class Supports {
    private String idSupport;
    private String idMatiere;
    private String idTypeDocs;
    private String libelSupport;
    private String titreSupport;

    String getIdSupport() {
        return this.idSupport;
    }

    void setIdSupport(String value) {
        this.idSupport = value;
    }

    String getIdMatiere() {
        return this.idMatiere;
    }

    void setIdMatiere(String value) {
        this.idMatiere = value;
    }

    void setIdTypeDocs(String value) {
        this.idTypeDocs = value;
    }

    String getIdTypeDocs() {
        return this.idTypeDocs;
    }

    void setLibelSupport(String value) {
        this.libelSupport = value;
    }

    String getLibelSupport() {
        return this.libelSupport;
    }

    void setTitreSupport(String value) {
        this.titreSupport = value;
    }

    String getTitreSupport() {
        return this.titreSupport;
    }

}
