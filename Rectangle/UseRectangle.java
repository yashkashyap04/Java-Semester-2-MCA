class UseRectangle {
    public static void main(String args[]) {
        double coord[] = new double[2];
        coord[0] = 3.0;
        coord[1] = 5.0;
        Rectangle one = new Rectangle(3.0, 5.0);
        Rectangle two = new Rectangle(3.0, 5.0);

        one.setBreadth(4.0);

        System.out.println("Perimeter of Rectangle one: " + one.getPerimeter());
        System.out.println("Area of Rectangle two: " + one.getArea());

        Rectangle intersect = one.intersectWith(two);

        System.out.println("Intersection Rectangle: " + intersect.getPerimeter());
    }
}