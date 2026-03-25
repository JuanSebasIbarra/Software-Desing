public enum Race {
    BULL_TERRIER(1, "Bull Terrier"),
    PUG(2, "Pug"),
    BULLDOG(3, "Bulldog"),
    POODLE(4, "Poodle");

    private final int numero;
    private final String nombreMostrar;

    Race(int numero, String nombreMostrar) {
        this.numero = numero;
        this.nombreMostrar = nombreMostrar;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombreMostrar() {
        return nombreMostrar;
    }

    public static Race fromDisplayName(String nombre) {
        for (Race race : values()) {
            if (race.nombreMostrar.equalsIgnoreCase(nombre)) {
                return race;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return numero + " - " + nombreMostrar;
    }
}
