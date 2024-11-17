//FA2024_Parallelogram_Nguyen

public class FA2024_Parallelogram_Nguyen extends Shape {
    public FA2024_Parallelogram_Nguyen() {
        super();
    }

    public FA2024_Parallelogram_Nguyen(double b, double h) {
        super(0, 0, 0, h, b);
    }

    @Override
    public double area() {
        return getBase() * getHeight();
    }

    public String toString() {
        return "ROOM: Parallelogram - Base = " + getBase() + " Height = " + getHeight();
    }
}