import java.util.*;

class Shape {

	
	public double calcArea(double a)
	{
		double squareA = a * a;
		return squareA;
	}

	
	public double calcArea(int a, int b)
	{
		int rectangleA = a * b;
		return rectangleA;
	}
	
	
	public double calcArea(float a, float b, float c)
	{
		float S = (a+b+c)/2;
		double triangleA = Math.sqrt(S * (S - a) * (S - b) * (S - c));
		return triangleA;
	}
}

class Driver {

	// Driver code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Shape s=new Shape();
		
		
		System.out.println("Enter the width of the Square : ");
		double a = sc.nextDouble();
		System.out.println("Area of the Square: " + s.calcArea(a));
			
		System.out.println("Enter the length of the Rectangle: ");
		int b = sc.nextInt(); 
		System.out.println("Enter the width of the Rectangle: ");
		int c = sc.nextInt(); 
		System.out.println("Area of the Rectangle: " + s.calcArea(b,c));
			
		System.out.println("Enter the 1st side length: ");
		float d = sc.nextFloat(); 
		System.out.println("Enter the 2nd side length: ");
		float e = sc.nextFloat();
		System.out.println("Enter the 3rd side length: ");
	    float f = sc.nextFloat();
	    


        
		

		// Calling function
		
		if ((d + e > f) && (e + f > d) && (f + d > e)) {
            System.out.println("Area of the triangle:"+s.calcArea(d,e,f));
            
            
        } else {
            System.out.println("This three sides can not make a Triangle");
        }
	}
}
