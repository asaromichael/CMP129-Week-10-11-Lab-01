public class Laptop implements Device {
    
    private String brand;
    private String model;
    private String processorType;

    public Laptop(String brand, String model, String processorType) {

        this.brand = brand;
        this.model = model;
        this.processorType = processorType;


    }

    @Override
    public void turnOn() {

        System.out.println("The " + brand + " " + model + " laptop is turning on.");
        System.out.println("Processor: " + processorType);

    }

}
