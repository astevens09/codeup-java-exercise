package shapes;
import shapes.Rectangle;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.printf("Box1 area: %d\n", box1.getArea());
        System.out.printf("Box1 perimeter: %d", box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("\nBox2 area: %d\n", box2.getArea());
        System.out.printf("Box2 perimeter: %d", box2.getPerimeter());


    }
}