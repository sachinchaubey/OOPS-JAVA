
public class poly_mor{
    public static void main(String[] args){
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();
        Car car = new Car();

        vehicle[] racer = {boat,bicycle,car};

        for(vehicle x : racer){
            x.go();
        }
    }
}

class vehicle{
    public void go(){
        
    }
}

class Boat extends vehicle{
    public void go(){
        System.out.println("boat is moving ");
    }
}

class Bicycle extends vehicle{
    public void go(){
        System.out.println("bicycle is moving ");
    }
} 

class Car extends vehicle{
    public void go(){
        System.out.println("car is moving");
    }
}