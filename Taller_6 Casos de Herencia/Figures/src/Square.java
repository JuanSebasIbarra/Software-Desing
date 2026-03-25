public class Square extends Rectangle {


    //public Square() {}

    //public Square(double side) {
        //super(side, side);
    //}

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public double getSide() {
        return getWidth(); // o getLength()
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }


    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // toString
    @Override
    public String toString() {
        return "Cuadrado: " + " Lado: " +getSide() + ", color: "+ getColor() + ", relleno: " + isFilled() +".";
    }
}