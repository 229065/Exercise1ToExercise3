public class Employee {
    private String name;
    private int number_of_hours;
    private int hourly_salary;

    public String getName() {
        return name;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }

    public int getHourly_salary() {
        return hourly_salary;
    }

    public int getSalary() {
        return salary;
    }

    private int salary;

    //Initializing Variables
    public Employee()
    {
        this.hourly_salary=0;
        this.number_of_hours=0;
        this.salary=0;
        this.name="";
    }

    public  void  getInfo(String name,int number_of_hours,int hourly_salary)
    {
        this.name=name;
        this.number_of_hours=number_of_hours;
        this.hourly_salary=hourly_salary;
        this.salary=this.hourly_salary*this.number_of_hours; //One Day Salary
    }

    //Compute Base Salary
    public  void computeBaseSalary()
    {
        this.salary=salary*20;
    }
    public void addSal()
    {
        if(this.salary<500)
        {
            this.salary  += 10;
        }
    }
    public void addWork()
    {
        if(this.number_of_hours>6)
        {
            this.salary += 5;
        }
    }

    //Printing Salary of Employee
    public void printSalary()
    {
        System.out.println("Salary of "+this.name+" : "+salary);
    }
    public static void main (String args[])
    {
        Employee e= new Employee();
        e.getInfo("John Smith",5, 10);
        e.computeBaseSalary();
        e.addSal();
        e.addWork();
        e.printSalary();
    }
}

