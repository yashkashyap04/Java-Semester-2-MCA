class Rectangle {

	private double[] bottomLeft;
	private double length;
	private double breadth;

	public Rectangle(){
		//Null rectangle concept
		length = 1.0;
		breadth = 0.0;
		bottomLeft = new double[2];
		bottomLeft[0] = 0.0;
		bottomLeft[1] = 0.0;
	}

	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
		bottomLeft = new double[2];
		bottomLeft[0] = 0.0;
		bottomLeft[1] = 0.0;
	}

	public Rectangle(double length, double breadth, double[] bottomLeft){
		this.length = length;
		this.breadth = breadth;
		this.bottomLeft = bottomLeft; 
	}

	public double getArea(){
		return length * breadth; 
	}

	public void setBreadth(double breadth){
		if (breadth >= 0.0){
			this.breadth = breadth;
		}
	}

	public double getBreadth(){
		return breadth;
	}

	public double getPerimeter(){
		return 2 * (length + breadth);
	}

	public Rectangle intersectWith(Rectangle rectangle){
		Rectangle intersectingRectangle = new Rectangle();

		if (this.bottomLeft[0] < rectangle.bottomLeft[0] + rectangle.length + rectangle.breadth  &&  this.bottomLeft[0] + this.length + this.breadth > rectangle.bottomLeft[0] && this.bottomLeft[1] < rectangle.bottomLeft[1] + rectangle.length + rectangle.breadth && this.bottomLeft[1] + this.length + this.breadth > rectangle.bottomLeft[1] + rectangle.breadth){
			return new Rectangle(rectangle.length, rectangle.breadth, rectangle.bottomLeft);
		}

		else {
			return new Rectangle(0.0, 0.0);
		}
	}
}