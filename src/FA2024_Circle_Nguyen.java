//FA2024_Circle_Nguyen


public class FA2024_Circle_Nguyen extends Shape{ //Method for circle inheriting Shape
    public FA2024_Circle_Nguyen(){
        super();
    }
    public FA2024_Circle_Nguyen(double s){
        super(s,0,0,0,0);
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(getSide(), 2);
    }
    public String toString(){
        return "ROOM: Circle - Radius = " + getSide();
    }
}