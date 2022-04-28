// Encapulation : attributes of a class will be hidden or private , can be accessed
//              only through method (getters & setters) you should make attribute private 
//              if you don't hava a reason to make them public / protected.


public class encap{
    public static void main(String[] args){
        Car car = new Car("Bmw","q2",2021);
        // Car car1 = new Car("merc" ,"tata",2022);
        Car car1 = new Car(car);

        // car1.copy(car);

        // car.setModel("glw 200");
        System.out.println(car);
        System.out.println(car1);
        System.out.println(""); 
        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(""); 
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear()); 
        
    }
}

class Car{
    private String name;
    private String model;
    private int year;

    Car(String name,String model,int year){
        this.setName(name);
        this.setModel(model);
        this.setYear(year);
    }
    Car (Car x){
        this.copy(x);
    } 

    public String getName(){
        return name;
    }
    
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year; 
    }

    public void setName(String name){
        this.name = name; 
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year=year; 
    }

    public void copy(Car x){
        this.setModel(x.getModel());
        this.setName(x.getName());
        this.setYear(x.getYear());
    }

}