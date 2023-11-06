package WEEK_7;

public class Car {
    String brand;
    String model;
    int productionYear;

    static int counter = 0;

    public Car(String brand,String model,int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        counter++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Renault","Clio",2023);
        Car car2 = new Car("BMW","M5",2023);
        Car car3 = new Car("Mercedes","S500",2023);

        System.out.println(counter);
    }
}