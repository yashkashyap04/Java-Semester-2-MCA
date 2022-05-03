class Complex {
    private double imaginary;
    private double real;

    public Complex() {
        this.imaginary = 0;
        this.real = 0;
    }

    public Complex(double imaginary, double real){
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getImaginary(){
        return this.imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public Complex addComplex(Complex complex){
        double imaginary = this.imaginary + complex.imaginary;
        double real = this.real + complex.real;

        return new Complex(imaginary, real);
    }

    public void display(){
        System.out.println(imaginary + "i + " + real);
    }
}