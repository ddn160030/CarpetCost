//FA2024_Triangle_Nguyen

public class FA2024_Triangle_Nguyen extends Shape{ //Method for triangle inheriting Shape
    public FA2024_Triangle_Nguyen(){
        super();
    }
    public FA2024_Triangle_Nguyen(double h, double b){
        super(0,0,0,h,b);
    }
    @Override
    public double area(){
        return (getBase() * getHeight()) / 2;
    }
    @Override
    public String toString(){
        return "ROOM: TRIANGLE - Base = " + getBase() + " Height = " + getHeight() + "     ";
    }
}