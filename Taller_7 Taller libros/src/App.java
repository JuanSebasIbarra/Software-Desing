import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Publish: (1. Book, 2. Disc, 3. Video)");
            int option = readInt(sc, "Choose a valid option (1, 2 or 3):");
            while (option < 1 || option > 3) {
                option = readInt(sc, "Choose a valid option (1, 2 or 3):");
            }

            sc.nextLine();
            System.out.println("Set Title: (Lord of the Rings)");
            String titulo = sc.nextLine();
            double precio = readDouble(sc, "Set Price:");

            if (option == 1) {
                int numeroPaginas = readInt(sc, "Set Number of Pages:");
                int aniPublicacion = readInt(sc, "Set Year of Publication:");
                Libro libro = new Libro(titulo, precio, numeroPaginas, aniPublicacion);
                System.out.println(libro);
            } else if (option == 2) {
                int duracionMinutos = readInt(sc, "Set Duration in Minutes:");
                Disco disco = new Disco(titulo, precio, duracionMinutos);
                System.out.println(disco);
            } else {
                float duracionHoras = (float) readDouble(sc, "Set Duration in Hours:");
                LENGUAJES idioma = readIdiomaVideo(sc);
                Video video = new Video(titulo, precio, idioma, duracionHoras);
                System.out.println(video);
            }
        }
    }

    private static LENGUAJES readIdiomaVideo(Scanner sc) {
        while (true) {
            int optionIdioma = readInt(sc, "Set Language (1. ESPANOL, 2. INGLES, 3. PORTUGUES):");
            switch (optionIdioma) {
                case 1:
                    return LENGUAJES.ESPANOL;
                case 2:
                    return LENGUAJES.INGLES;
                case 3:
                    return LENGUAJES.PORTUGUES;
                default:
                    System.out.println("Invalid language option, try again.");
            }
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        System.out.println(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid number, try again:");
            sc.next();
        }
        int value = sc.nextInt();
        while (value < 0) {
            System.out.println("Value cannot be negative, try again:");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid number, try again:");
                sc.next();
            }
            value = sc.nextInt();
        }
        return value;
    }

    private static double readDouble(Scanner sc, String prompt) {
        System.out.println(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid number, try again:");
            sc.next();
        }
        double value = sc.nextDouble();
        while (value < 0) {
            System.out.println("Value cannot be negative, try again:");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid number, try again:");
                sc.next();
            }
            value = sc.nextDouble();
        }
        return value;
    }
}