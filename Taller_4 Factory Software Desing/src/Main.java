class car {
    String name;
    int year;
    String color;

    car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}