package ucc.edu.co;

class Factory {

    private String tire;
    private String chassis;
    private String color;
    public String typeTire;
    public String cassisMaterial;

    // Constructor


    public Factory(String tire, String chassis, String color, String typeTire, String cassisMaterial) {
        this.tire = tire;
        this.chassis = chassis;
        this.color = color;
        this.typeTire = typeTire;
        this.cassisMaterial = cassisMaterial;
    }

    //Getters and Setters

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeTire() {
        return typeTire;
    }

    public void setTypeTire(String typeTire) {
        this.typeTire = typeTire;
    }

    public String getCassisMaterial() {
        return cassisMaterial;
    }

    public void setCassisMaterial(String cassisMaterial) {
        this.cassisMaterial = cassisMaterial;
    }
}
