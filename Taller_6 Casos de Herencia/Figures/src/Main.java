public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape("Azul", true);
        System.out.println(myShape);

        Shape myCircle = new Circle(3.15, "Lila", false);
        System.out.println(myCircle);

        Shape myRectangle = new Rectangle(3.2, 5.6, "Gris", true);
        System.out.println(myRectangle);

        Shape mySquare = new Square(1.2, "Verde", true);
        System.out.println(mySquare);
    }
}
