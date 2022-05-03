class UseComplex {
    public static void main(String args[]){
        double imaginary = 2.5;
        double real = 1.5;

        Complex one = new Complex(imaginary, real);
        Complex two = new Complex(3.5, 9.0);

        one.display();
        two.display();

        Complex three = one.addComplex(two);
        three.display();
    }
}