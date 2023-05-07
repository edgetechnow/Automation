package abstraction;

public abstract class Vehicle {
    private String brand;
    
    

    public Vehicle(String brand) {
        this.brand = brand;
        
    }

    public abstract void move();
    

    public void honk() {
        System.out.println("Honk honk!");
    }

    public String getBrand() {
        return this.brand;
    }
}

