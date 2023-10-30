package OOPs.Polymorphism;

public class main {
    public static void main(String[] args) {
        shapes Shape = new shapes();
        shapes Circle = new circle();
        square Square = new square();

        Shape.area();
        Circle.area();
        Square.area();
    }
}
