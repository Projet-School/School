package application;


public class Evaluations {
    public String idEvaluation;
    public String idAssiduite;
    public String idExamen;
    public String auteurEvaluation;
    public String noteEvaluation;
    public String apprecEvaluation;

    void setIdEvaluation(String value) {
        this.idEvaluation = value;
    }

    String getIdEvaluation() {
        return this.idEvaluation;
    }

    String getIdAssiduite() {
        return this.idAssiduite;
    }

    void setIdAssiduite(String value) {
        this.idAssiduite = value;
    }

    String getIdExamen() {
        return this.idExamen;
    }

    void setIdExamen(String value) {
        this.idExamen = value;
    }

    String getAuteurEvaluation() {
        return this.auteurEvaluation;
    }

    void setAuteurEvaluation(String value) {
        this.auteurEvaluation = value;
    }

    String getNoteEvaluation() {
        return this.noteEvaluation;
    }

    void setNoteEvaluation(String value) {
        this.noteEvaluation = value;
    }

    void setApprecEvaluation(String value) {
        this.apprecEvaluation = value;
    }

    String getApprecEvaluation() {
        return this.apprecEvaluation;
    }

}
