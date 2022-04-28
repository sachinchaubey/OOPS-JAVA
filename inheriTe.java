// INHERITANCE : the proces where one class acquires ,
        //  the attributs and method of another class


public class inheriTe{
    public static void main(String[] args){
        Car car = new Car();

        Bicycle bicycle = new Bicycle();

        car.go();
        // bicycle.speed();
        System.out.println(car.tyre);
        System.out.println(car.speed);
        System.out.println(bicycle.paddle);
    } 
}

class vehicle{
    double speed;

    void go(){
        System.out.println("your vehicle is in speed");
    }

    void stop(){
        System.out.println("your vehicle is stopped");
    }
}

class Car extends vehicle{
    int tyre = 4;
    int door = 4;
}

class Bicycle extends vehicle{
    int type = 3;
    int paddle = 2;
}
