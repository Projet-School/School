package application;


public class Charges {
    private String idCharge;
    private String nomCharge;
    private String typeCharge;
    private String montCharge;
    
    String getIdCharge() {
        return this.idCharge;
    }

    void setIdCharge(String value) {
        this.idCharge = value;
    }

    void setNomCharge(String value) {
        this.nomCharge = value;
    }

    String getNomCharge() {
        return this.nomCharge;
    }

    void setTypeCharge(String value) {
        this.typeCharge = value;
    }

    String getTypeCharge() {
        return this.typeCharge;
    }

    String getMontCharge() {
        return this.montCharge;
    }

    void setMontCharge(String value) {
        this.montCharge = value;
    }

}
