class Square extends Rectangle{
	private int  length, width;
	public Square(int length){
		this.length = length;
		this.width = length;
	}
	public double getPerimeter(){
		return 2 * (length + width); 
	}

	public double getArea(){
		return length * width; 
	}
	
}