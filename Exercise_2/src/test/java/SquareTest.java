import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private Square s;
    @org.junit.Test
    public void perimeter() {
        s=new Square();
        double perimeterSquare=s.perimeter(4);
        assertEquals(16.0,perimeterSquare,0);
    }

    @org.junit.Test
    public void area() {
        s=new Square();
        double areaSquare=s.area(4);
        assertEquals(16.0,areaSquare,0);
    }
}