package application;


public class Sessions {
    private String idSession;
    private String idAnnee;
    private String libelSession;
    private String dateDebutSession;
    private String dateFinSession;
    private String joursFerieSession;

    void setIdSession(String value) {
        this.idSession = value;
    }

    String getIdSession() {
        return this.idSession;
    }

    String getIdAnnee() {
        return this.idAnnee;
    }

    void setIdAnnee(String value) {
        this.idAnnee = value;
    }

    String getLibelSession() {
        return this.libelSession;
    }

    void setLibelSession(String value) {
        this.libelSession = value;
    }

    String getDateDebutSession() {
        return this.dateDebutSession;
    }

    void setDateDebutSession(String value) {
        this.dateDebutSession = value;
    }

    String getDateFinSession() {
        return this.dateFinSession;
    }

    void setDateFinSession(String value) {
        this.dateFinSession = value;
    }

    String getJoursFerieSession() {
        return this.joursFerieSession;
    }

    void setJoursFerieSession(String value) {
        this.joursFerieSession = value;
    }

}
