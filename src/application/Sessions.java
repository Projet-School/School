package application;


public class Sessions {
    public String idSession;
    public String idAnnee;
    public String libelSession;
    public String dateDebutSession;
    public String dateFinSession;
    public String joursFerieSession;

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
