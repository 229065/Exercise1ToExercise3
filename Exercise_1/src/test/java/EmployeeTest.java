import org.junit.*;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee e; // Create instance of Employee Class
    private static int count=1; //To count test cases

    //Run before Test
    @org.junit.Before
    public void setUp() throws Exception
    {
        System.out.println("TestCase "+count+" Started.");
    }

    //Run after Test
    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("TestCase "+(count-1)+" Completed.");

    }

    @org.junit.Test
    public void getInfo() {
        e=new Employee();
        e.getInfo("John Smith",5,10);
        assertEquals(10,e.getHourly_salary(),0);
        count++;
    }

    @org.junit.Test
    public void computeBaseSalary()
    {
        e=new Employee();
        e.getInfo("John Smith",5,10);
        e.computeBaseSalary();
        assertEquals(1000,e.getSalary(),0);
        count++;
    }

    @org.junit.Test
    public void addSal()
    {
        e=new Employee();
        e.getInfo("Sandra Wang ",4,5);
        e.computeBaseSalary();
        e.addSal();
        assertEquals(410,e.getSalary(),0);
        count++;
    }

    @org.junit.Test
    public void addWork()
    {
        e=new Employee();
        e.getInfo("Gio Rossi",7,12);
        e.computeBaseSalary();
        e.addSal();
        e.addWork();
        assertEquals(1685,e.getSalary(),0);
        count++;
    }
}