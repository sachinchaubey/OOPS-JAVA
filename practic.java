
public class practic{
    public static void main(String[] args){
        Garage garage = new Garage();

        Car car1 = new Car("Bmw");
        Car car2 = new Car("mercdies");
        Train train = new Train("Satabdi Express");

        garage.park(car1);
        garage.park(car2);
        garage.park(train);
    }
}

class Garage{
    void park(Car car){
        System.out.println(car.name + " park in your garage:");
    }

    void park(Train train){
        System.out.println(train.name + " arrive on station");
    }
}

class Car{
    String name;
    Car(String name){
        this.name= name;
    }
}

class Train{
    String name;
    Train(String name){
        this.name = name;
    }
}