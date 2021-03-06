import java.util.Scanner;

class UseRectangle{
	public static void main(String[] args){
		Rectangle first = new Rectangle();
		
		Rectangle second = new Rectangle(7.0, 3.0);
		second.setBreadth(-4.5);
		
		System.out.println("The second rectangle breadth is " + second.getBreadth());
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length and breadth of rectangle one: ");
		double len = sc.nextDouble();
		double wid = sc.nextDouble();
		
		System.out.println("Enter bottom left points: ");
		double bottomLeft[] = new double[2];
		
		for(int i = 0; i < 2; i++)
			bottomLeft[i] = sc.nextDouble();
		Rectangle rect1 = new Rectangle(len, wid, bottomLeft);
		
		System.out.println("Perimeter: " + rect1.getPerimeter());
		
		Rectangle s = new Square(5);
		s.setBreadth(5);
		s.setLength(4);
		
		System.out.println("It should display 20 if substitution hold but it display: " + s.getArea());
	}

}