public class Square extends Rectangle{
    public  Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side, color, filled);
    }
    public double getSide(){
        return getWidth();

    }
    public double setSide(){
        return getWidth();
    }
    public void setSide(double side ){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }
    public String toString(){
       return " A Square with side= "
       +getSide()
       + " , Whisch is a subclass of "
       + super.toString();

    }
}
