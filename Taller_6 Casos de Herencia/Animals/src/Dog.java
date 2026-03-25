public class Dog extends Mammal {

    private String race;
    private String color; // 👈 agregar private

    public Dog(String name, String race, String color) {
        super(name);
        this.race = race;
        this.color = color;
    }

    public String getRace() { return race; }
    public String getColor() { return color; }

    public void setRace(String race) { this.race = race; }
    public void setColor(String color) { this.color = color; }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        Race razaEnum = Race.fromDisplayName(race);
        String razaImpresa = razaEnum != null
                ? razaEnum.getNumero() + " (" + razaEnum.getNombreMostrar() + ")"
                : "sin número (" + race + ")";

        return "Dog [" + super.toString() + ", Raza: " + razaImpresa + ", Color: " + color + "]";
    }
}
