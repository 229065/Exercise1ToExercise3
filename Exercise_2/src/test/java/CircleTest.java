import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle c;
    @org.junit.Test
    public void perimeter()
    {
        c=new Circle();
        //Format Double Value Up to 2 decimal

        String perimeterCircle=String.format("%.2f",c.perimeter(1.5));
        assertEquals("9.42",perimeterCircle);
    }

    @org.junit.Test
    public void area() {
        c=new Circle();
        //Format Double Value Up to 2 decimal
        String areaCircle=String.format("%.2f",c.area(1.5));
        assertEquals("7.07",areaCircle);
    }
}