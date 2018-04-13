package application;


public class Seances {
    private String idSeance;
    private String idGroupe;
    private String idHoraire;
    private String remplacantSeance;
    private String rattrapageSeance;
    private String annulationSeance;
    private String reportSeance;

    String getIdSeance() {
        return this.idSeance;
    }

    void setIdSeance(String value) {
        this.idSeance = value;
    }

    String getIdGroupe() {
        return this.idGroupe;
    }

    void setIdGroupe(String value) {
        this.idGroupe = value;
    }

    String getIdHoraire() {
        return this.idHoraire;
    }

    void setIdHoraire(String value) {
        this.idHoraire = value;
    }

    String getRemplacantSeance() {
        return this.remplacantSeance;
    }

    void setRemplacantSeance(String value) {
        this.remplacantSeance = value;
    }

    String getRattrapageSeance() {
        return this.rattrapageSeance;
    }

    void setRattrapageSeance(String value) {
        this.rattrapageSeance = value;
    }

    String getAnnulationSeance() {
        return this.annulationSeance;
    }

    void setAnnulationSeance(String value) {
        this.annulationSeance = value;
    }

    String getReportSeance() {
        return this.reportSeance;
    }

    void setReportSeance(String value) {
        this.reportSeance = value;
    }

}
