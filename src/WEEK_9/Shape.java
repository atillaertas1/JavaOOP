package WEEK_9;

public class Shape {
    public String name;
    public void draw(){};
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3,5),
                new Square(4),
                new Triangle(5)
        };

        Drawing drawing = new Drawing(shapes);
        drawing.drawShapes();
    }
}

class Circle extends Shape{
    double distance;
    int rad;

    public Circle(double distance, int rad){
        this.name = "Circle";
        this.distance = distance;
        this.rad = rad;
    }

    public void draw(){
        for (int row = 0; row <= 2 * rad; row++) {
            for (int col = 0; col <= 2 * rad; col++) {
                distance = Math.sqrt((row - rad) * (row - rad) + (col - rad) * (col - rad));
                if (distance > rad - 0.5 && distance < rad + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Square extends Shape{
    private final int side;

    public Square(int side){
        this.name = "Square";
        this.side = side;
    }

    public void draw(){
        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class Triangle extends Shape{
    private final int row;

    public Triangle(int row){
        this.name = "Triangle";
        this.row = row;
    }
    public void draw(){

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Drawing {
    private final Shape[] shapes;

    public Drawing(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void drawShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}