import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(0, 0, 1, 1));
        rectangles.add(new Rectangle(0, 0, 2, 2));
        rectangles.add(new Rectangle(0, 0, 3, 3));
        rectangles.add(new Rectangle(0, 0, 4, 2));
        rectangles.add(new Rectangle(0, 0, 5, 3));
        rectangles.add(new Rectangle(0, 0, 6, 2));
        rectangles.add(new Rectangle(0, 0, 1, 6));
        rectangles.add(new Rectangle(0, 0, 7, 4));
        rectangles.add(new Rectangle(0, 0, 2, 5));
        rectangles.add(new Rectangle(0, 0, 8, 3));

        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter greater than 10:");

        for (Rectangle rect : rectangles) {

            if (filter.accept(rect)) {

                double perimeter = 2 * (rect.width + rect.height);

                System.out.println("Width: " + rect.width +
                        ", Height: " + rect.height +
                        ", Perimeter: " + perimeter);
            }
        }
    }
}