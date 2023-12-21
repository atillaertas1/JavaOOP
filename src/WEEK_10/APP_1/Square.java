package WEEK_10.APP_1;

public class Square implements Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}