package application;


public class Inscriptions {
    private String idInscription;
    private String idEtudiant;
    private String idPaiement;
    private String idPrEnCharg;
    private String dateInscription;
    private String dateAbandInscription;
    private String dateAnnulInscription;
    private String creditInscritpion;

    void setIdInscription(String value) {
        this.idInscription = value;
    }

    String getIdInscription() {
        return this.idInscription;
    }

    String getIdEtudiant() {
        return this.idEtudiant;
    }

    void setIdEtudiant(String value) {
        this.idEtudiant = value;
    }

    void setIdPaiement(String value) {
        this.idPaiement = value;
    }

    String getIdPaiement() {
        return this.idPaiement;
    }

    String getIdPrEnCharg() {
        return this.idPrEnCharg;
    }

    void setIdPrEnCharg(String value) {
        this.idPrEnCharg = value;
    }

    String getDateInscription() {
        return this.dateInscription;
    }

    void setDateInscription(String value) {
        this.dateInscription = value;
    }

    void setDateAbandInscription(String value) {
        this.dateAbandInscription = value;
    }

    String getDateAbandInscription() {
        return this.dateAbandInscription;
    }

    void setDateAnnulInscription(String value) {
        this.dateAnnulInscription = value;
    }

    String getDateAnnulInscription() {
        return this.dateAnnulInscription;
    }

    void setCreditInscritpion(String value) {
        this.creditInscritpion = value;
    }

    String getCreditInscritpion() {
        return this.creditInscritpion;
    }

}
