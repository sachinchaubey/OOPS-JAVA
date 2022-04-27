// Encapulation : attributes of a class will be hidden or private , can be accessed
//              only through method (getters & setters) you should make attribute private 
//              if you don't hava a reason to make them public / protected.


public class encap{
    public static void main(String[] args){
        Car car = new Car("Bmw","q2",2021);

        car.setModel("glw 200"); 

        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getYear()); 
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

}