
class Practical4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(23, 43);
        Complex c2 = new Complex(332, 412);
        
        System.out.println("First Complex number: "+c1.display());
        System.out.println("Second Complex number: "+c2.display());
        c1.add(c2);
        System.out.println("Addition of Complex number:"+c1.display());
        c1.sub(c2);
        System.out.println("Substraction of Complex number:"+c1.display());
    }
}

class Complex{
    private int real;
    private int imaginary;

    public Complex (int r, int i){
        real = r;
        imaginary = i;
    }

    public int getReal(){
        return real;
    }

    public int getImaginary(){
        return imaginary;
    }
    public String display(){
        return real + "+i" + imaginary;
    }
    public void add (Complex c){
        this.real=this.real+c.getReal();
        this.imaginary=this.imaginary+c.getImaginary();
    }
    public void sub(Complex c) {
        this.real=this.real-c.getReal();
        this.imaginary=this.imaginary-c.getImaginary();
    }
}