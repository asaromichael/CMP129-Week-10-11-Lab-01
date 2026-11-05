public class Smartphone implements Device {
    
    private String brand;
    private String model;
    private double screenSize;

    public Smartphone(String brand, String model, double screenSize) {

        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;

    }

    @Override
    public void turnOn() {

        System.out.println("The " + brand + " " + model + " smartphone is turning on.");
        System.out.println("Screen size: " + screenSize + " inches");

    }

}
