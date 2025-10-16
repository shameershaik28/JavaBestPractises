package OOPS;

public class Car {
    String brand;
    String color;


    Car (String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void displayCarInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
