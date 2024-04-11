import java.util.Scanner;

public class Car {
    
    public String make;
    public String model;
    public int year;

    Scanner input = new Scanner(System.in);

    // constructor
    public Car(String model, String make){
        this.model = model;
        this.make = make;
    }

    public Car(int year){
        this.year = year;
    
    }

    public String carStart(String model, String make){

        System.out.println("The car is about to start...");

        System.out.print("Enter the car model: ");
        model = input.nextLine();

        System.out.print("Enter the car make: ");
        make = input.nextLine();

        return "The car model is: " + model + "\nThe car make is: " + make;
    }

    public String carMake(int year){

        System.out.println("The car has started...");

        System.out.print("Enter the car year: ");
        year = input.nextInt();

        return "The car was made in the year: " + year;
    }

    public static void main(String[] args) {
        
        Car car1 = new Car("", "");
        Car car2 = new Car(0);

        String model1 = car1.carStart("", "");
        String model2 = car2.carMake(0);

        System.out.println(model1);
        System.out.println(model2);
    }
}
