
public class to_string{
    public static void main(String[] args){

        Car car = new Car();

        // explicitly
        // System.out.println(car.toString());
        
        // implicitly
        System.out.println(car); 
    }
}

class Car {
    String make = "BMW";
    String model = "gla";
    int year = 2022;
    String color = "Red";

    public String toString(){
        String myString = make + "\n" + model + "\n" + year + "\n" + color;
        return myString;
    }
}