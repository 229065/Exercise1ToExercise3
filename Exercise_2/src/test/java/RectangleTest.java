import org.junit.*;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle r;
    @org.junit.Test
    public void perimeter() {
        r=new Rectangle();
        double perimeterRectangle=r.perimeter(2,3);
        assertEquals(10.0,perimeterRectangle,0);
    }

    @org.junit.Test
    public void area() {
        r=new Rectangle();
        double areaRectangle=r.area(2,3);
        assertEquals(6.0,areaRectangle,0);
    }
}