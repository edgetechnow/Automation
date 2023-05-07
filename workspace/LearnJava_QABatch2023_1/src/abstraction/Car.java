package abstraction;

public class Car extends Vehicle {
    public Car(String brand) {
    	 super(brand);
        
    }

    @Override
    public void move() {
        System.out.println(this.getBrand() + " is driving.");
    }
}

