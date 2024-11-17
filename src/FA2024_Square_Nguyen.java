//FA2024_Square_Nguyen

public class FA2024_Square_Nguyen extends Shape{ //Method for square inheriting Shape

    public FA2024_Square_Nguyen(){
        super();
    }

    public FA2024_Square_Nguyen(double s){
        super(s,0,0,0,0);
    }
// Area method calculation
    @Override
    public double area(){
        return getSide() * getSide();
    }

    @Override
    public String toString(){
        return "ROOM: Square - Side = " + getSide() + "                   ";
    }
}
