# Exercise 1 To Exercise 3

The project includes `3` Exercises in this project. which cover basic concepts of Java `Method Overloading`, `Method Overriding`,`Collections`, `File Handling`, `Comparator`. 

### Exercise 1  
   Employee class calculates the Salary of the employee using the following functions :  
   - `getInfo()` : 
                  Takes the hourly salary, number of hours of work per day of employee.
   - `computeBaseSalary()` :
                  Computes the base salary for 20 days of work.
   - `addSal()` :
                  Adds $10 to the base salary of the employee if it is less than $500.
   - `addWork()` :
                  Adds $5 daily to salary of employee if the number of hours of work per day is more than 6 hours. 
   - `printSalary()` :
                  Print Salary of Employee
### Exercise 2
   There are 3 classes in Shapes.java `Rectangle`, `Circle`, `Square` which includes the following functions :
   - `perimeter()` :
                  Calculate Perimeter of Circle, Rectangle and Square.
   - `area()` :
                  Calculate Area of Circle, Rectangle and Square.

### Exercise 3
There are 2 classes (FootballTeam,Basketball) Team  and 1 interface (team) in Sports.java which calculates Points  for FootballTeam and BasketballTeam 
accourding to following rules :

Football Team: Win: add 3 points; Drawn: add 1 point; Lose: do nothing. 

Basketball Team: Win: add 2 points; Lose: do nothing. 

-  `updatePoints(String status)` :
            This method takes input of string type and updates the points of team according to rules.
- `compare(Object a, Object b)` :
            This method is used to sort ArrayList<> of Objects  by comparing two objects of the same class.
- `printSortedList(ArrayList<FootballTeam> ft,ArrayList<BasketballTeam> bt)` :
            This method Print ArrayList of FootballTeam and BasketballTeam.
                 
## Instructions

### IntelliJ

1. Open IntelliJ IDEA and select File > Open....
2. Choose the Exercise1ToExercise3 directory and click OK.
3. Select Exercise from Project Menu
4. Select `File` > Settings... > `Build ,Execution, Deployment` > Build Tools
5. Inside `Build Tools` Select `Maven` > `Runner`
6. Check `Delegate IDE build/run actions to Maven checkbox`
7. Click on Apply and then Ok
8. Go to Main Project 
9. Select Build > `Build Project`
   

## Requirements
- [Java version: 14.0.1](https://www.javatpoint.com/javafx-how-to-install-java)
- [Junit 4.13.1](https://www.jetbrains.com/help/idea/junit.html)
- [Apache Maven 3.8.4](https://www.javatpoint.com/how-to-install-maven)

## Resources
- [Java Comparator Interface](https://www.javatpoint.com/Comparator-interface-in-collection-framework)
- [JUnit](https://www.javatpoint.com/junit-tutorial)

## Issues
     If you find a bug, Please let me know by submitting an issue.
