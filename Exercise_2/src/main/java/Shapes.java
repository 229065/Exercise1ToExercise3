class Rectangle
{
	//Overloading
	public double perimeter(double breadth,double height)
	{
		if(breadth < 0 || height < 0)
		{
			return -1;
		}
		else
		{
			double perimeterRectangle=2*(breadth+height);//Perimeter of Rectangle : 2*(breadth+height)
			return perimeterRectangle;
		}
	}

	//Overloading
	public double area(double breadth,double height)
	{
		if(breadth < 0 || height < 0)
		{
			return -1;
		}
		else
		{
			double areaRectangle=breadth*height;//Area of Rectangle : length*width
			return areaRectangle;
		}
	}
}

class Square
{

	public double perimeter(double side)
	{
		if(side < 0)
		{
			return -1;
		}
		else
		{
			double perimeterSquare=4*side;//Perimeter of Square : 4*side
			return perimeterSquare;
		}
		
	}


	public double area(double side)
	{
		if(side < 0)
		{
			return -1;
		}
		else
		{
			double areaSquare=side*side;//Area of Square : side*side
			return areaSquare;
		}
	}	
}

class Circle extends Square
{
	//Overriding Function from Square
	public double perimeter(double radius)
	{
		if(radius < 0)
		{
			return -1;
		}
		else
		{
			double perimeterCircle=2*Math.PI*radius;//Perimeter of Circle : 2*3.14*r
			return perimeterCircle;
		}
	}

	//Overriding Function from Square
	public double area(double radius)
	{
		if(radius < 0)
		{
			return -1;
		}
		else
		{
			double areaCircle=Math.PI*radius*radius;//Area of Circle : 3.14*r*r
			return areaCircle;
		}
	}
}


public class Shapes
{
	public static void main(String[] args) {

		Rectangle rectangle =new Rectangle();
		System.out.println("Perimeter of Rectangle: "+rectangle.area(2, 3));
		System.out.println("Area of Rectangle: "+rectangle.perimeter(2, 3));
		
		Square square = new Square();
		System.out.println("Perimeter of Square: "+square.perimeter(4));
		System.out.println("Area of Square: "+square.area(4));

		Circle circle = new Circle();

		//Format Double Value Up to 2 decimal
		System.out.println("Perimeter of Circle: "+String.format("%.2f",circle.perimeter(1.5)));
		System.out.println("Area of Circle: "+String.format("%.2f",circle.area(1.5)));
	}

}



