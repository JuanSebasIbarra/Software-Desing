public class chasiss {

    private float type;
    private ChasissMaterial material;

// Constructor
    public chasiss(float type, ChasissMaterial material) {
        this.type = type;
        this.material = material;
    }


    // Getters and Setters


    public float getType() {
        return type;
    }

    public void setType(float type) {
        this.type = type;
    }

    public ChasissMaterial getMaterial() {
        return material;
    }

    public void setMaterial(ChasissMaterial material) {
        this.material = material;
    }
}
