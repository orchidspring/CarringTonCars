
public class Car {
    private String make;
    private String model;
    private String color;
    private String licensePlate;
    private int year;
    private double price;

    public Car(String make, String model, String color, String licensePlate, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
