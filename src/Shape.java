//Shape

public class Shape  {
// Possible inputs for all shapes
    protected double side;
    protected double length;
    protected double width;
    protected double height;
    protected double base;

    //Input constructor
    public Shape()
    {
        side = 0.0f;
        length = 0.0f;
        width = 0.0f;
        height = 0.0f;
        base = 0.0f;
    }

    public Shape (double s, double l, double w, double h, double b){
        side = s;
        length = l;
        width = w;
        height = h;
        base = b;

    }

    // Getters and setters for possible shape inputs
    public double getSide(){
        return side;
    }

    public void setSide(double s){
        side = s;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double l){
        length = l;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        width = w;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        height = h;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double b){
        base = b;
    }

    public double area()
    {
        return 0.0f;
    }

    public String toString() {
        return "ROOM: ";
    }

}

