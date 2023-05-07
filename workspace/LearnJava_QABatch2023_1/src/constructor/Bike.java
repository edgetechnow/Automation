package constructor;

public class Bike {
    private String brand;
    private String model;
    private int year;
    private String color;
    
   

    public Bike(String brand) {
        this(brand, null);
    }
  

    public Bike(String brand, String model) {
        this(brand, model, 0);
    }

    public Bike(String brand, String model, int year) {
        this(brand, model, year, null);
    }

    public Bike(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
}

/*
In this example, we have four constructors for the Bike class. 
The first constructor takes only the brand parameter 
and calls the second constructor using this(). The second 
constructor takes both brand and model parameters and calls 
the third constructor using this(). The third constructor takes 
both brand, model, and year parameters and calls the fourth 
constructor using this(). The fourth constructor takes all four 
parameters and sets the corresponding instance variables.

By using this() to call another constructor of the same class, 
we can avoid duplicating code and ensure that all constructors of 
the class properly initialize the instance variables.*/