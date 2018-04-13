package application;


public class Documents {
    private String idDocument;
    private String idSupport;
    private String idTypeDoc;
    private String libelDocument;
    private String versionDocument;
    private String mediaDocument;
    private String nbrPagNBDocument;
    private String nbrPagCoulDocument;
    private String reliureDocument;
    private String texteDocument;
    private String couvDocument;

    void setIdDocument(String value) {
        this.idDocument = value;
    }

    String getIdDocument() {
        return this.idDocument;
    }

    String getIdSupport() {
        return this.idSupport;
    }

    void setIdSupport(String value) {
        this.idSupport = value;
    }

    String getIdTypeDoc() {
        return this.idTypeDoc;
    }

    void setIdTypeDoc(String value) {
        this.idTypeDoc = value;
    }

    String getLibelDocument() {
        return this.libelDocument;
    }

    void setLibelDocument(String value) {
        this.libelDocument = value;
    }

    String getVersionDocument() {
        return this.versionDocument;
    }

    void setVersionDocument(String value) {
        this.versionDocument = value;
    }

    String getMediaDocument() {
        return this.mediaDocument;
    }

    void setMediaDocument(String value) {
        this.mediaDocument = value;
    }

    String getNbrPagCoulDocument() {
        return this.nbrPagCoulDocument;
    }

    void setNbrPagCoulDocument(String value) {
        this.nbrPagCoulDocument = value;
    }

    void setNbrPagNBDocument(String value) {
        this.nbrPagNBDocument = value;
    }

    String getNbrPagNBDocument() {
        return this.nbrPagNBDocument;
    }

    String getReliureDocument() {
        return this.reliureDocument;
    }

    void setReliureDocument(String value) {
        this.reliureDocument = value;
    }

    String getTexteDocument() {
        return this.texteDocument;
    }

    void setTexteDocument(String value) {
        this.texteDocument = value;
    }

    String getCouvDocument() {
        return this.couvDocument;
    }

    void setCouvDocument(String value) {
        this.couvDocument = value;
    }

}
