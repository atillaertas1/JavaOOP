package WEEK_6;

class Rectangle extends GeometricShape {
    int length;
    int width;

    public Rectangle(int length, int width){
        super(length * width);
        this.length = length;
        this.width = width;
    }
}