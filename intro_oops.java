// OOPS IN JAVA: object: an instance of a class that may contain attributes and method //  example: (phone,car,desk,coffee cup)



// import OOPS_JAVA.car;

public class intro_oops extends car{ 
    public static void main(String[] args){
        car myCar = new car();
        System.out.println(myCar.make);
        System.out.println(myCar.model);

        myCar.brake();
    }
}

// public class Car {
//     String make = "BMW";
//     String model = "gl200";
//     int year = 2022;
//     Double price = 50000.00;
//     String color = "red";

//     void drive(){
//         System.out.println("your car is drive:");
//     }

//     void brake(){
//         System.out.println("Your car is in break mood:");
//     }
// }