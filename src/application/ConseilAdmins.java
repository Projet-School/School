package application;


public class ConseilAdmins {
    public String idConseilAdmin;
    public String idReunion;
    public String libelConseilAdmin;
    public String objetConseilAdmin;
    public String decisConseilAdmin;
    public String PVConseilAdmin;

    String getIdConseilAdmin() {
        return this.idConseilAdmin;
    }

    void setIdConseilAdmin(String value) {
        this.idConseilAdmin = value;
    }

    String getIdReunion() {
        return this.idReunion;
    }

    void setIdReunion(String value) {
        this.idReunion = value;
    }

    String getLibelConseilAdmin() {
        return this.libelConseilAdmin;
    }

    void setLibelConseilAdmin(String value) {
        this.libelConseilAdmin = value;
    }

    void setObjetConseilAdmin(String value) {
        this.objetConseilAdmin = value;
    }

    String getObjetConseilAdmin() {
        return this.objetConseilAdmin;
    }

    String getDecisConseilAdmin() {
        return this.decisConseilAdmin;
    }

    void setDecisConseilAdmin(String value) {
        this.decisConseilAdmin = value;
    }

    String getPVConseilAdmin() {
        return this.PVConseilAdmin;
    }

    void setPVConseilAdmin(String value) {
        this.PVConseilAdmin = value;
    }

}
