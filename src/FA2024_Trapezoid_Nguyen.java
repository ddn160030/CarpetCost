//FA2024_Trapezoid_Nguyen

public class FA2024_Trapezoid_Nguyen extends Shape{
    public FA2024_Trapezoid_Nguyen(){
        super();
    }
    public FA2024_Trapezoid_Nguyen(double s, double b, double h){
        super(s,0,0,h,b);
    }
    @Override
    public double area(){
        return ( (getBase() * getSide()) / 2 ) * getHeight();
    }
    public String toString(){
        return "ROOM: Trapezoid - Base 1 = " + getBase() + "Base 2 = " + getSide() + " Height = " + getHeight();
    }
}