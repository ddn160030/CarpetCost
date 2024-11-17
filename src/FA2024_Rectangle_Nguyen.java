//FA2024_Rectangle_Nguyen

import java.awt.*;

public class FA2024_Rectangle_Nguyen extends Shape { //Method for rectangle inheriting Shape
    public FA2024_Rectangle_Nguyen() {
        super();
    }
    public FA2024_Rectangle_Nguyen(double l, double w) {
        super(0,l,w,0,0);
    }
    @Override
    public double area(){
        return getLength() * getWidth();
    }
    @Override
    public String toString() {
        return "ROOM: RECTANGLE - Length = " + getLength() + " Width = " + getWidth();
    }
}