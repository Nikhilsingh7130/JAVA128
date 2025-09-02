package Unit1;

public class Calculator {
    double ar;
    public void area(double l, double b){
        ar=l*b;
        System.out.println("Area of rectangle : "+ ar);
    }
    public void area(double r){
        ar=Math.PI*r*r;
        System.out.println("Area of circle: "+ar);
    }
    public void area(double l, double b, double h){
        ar=2*(l*b+l*h+b*h);
        System.out.println("Area of cubiod: "+ar);
    }
}