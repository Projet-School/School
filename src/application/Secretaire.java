package application;


public class Secretaire {
    private String idSecretaire;
    private String idAffectation;

    String getIdSecretaire() {
        return this.idSecretaire;
    }

    void setIdSecretaire(String value) {
        this.idSecretaire = value;
    }

    void setIdAffectation(String value) {
        this.idAffectation = value;
    }

    String getIdAffectation() {
        return this.idAffectation;
    }

}
