// CONSTRUCTOR: special method that is called when an object is instrantiated ( created )

public class  besic_constructor{
    public static void main(String[] args){
        Human human1 = new Human("Sachin",22,70);
        Human human2 = new Human("shivam",22,65);

        System.out.println("human1 name is : " + human1.name + " and age is " + human1.age );
        
        System.out.println("human2 name is: " + human2.name + " and age is " + human2.age );

        human1.eat();
        human2.drink();
    }
}

class Human{
    String name;
    int age;
    double weight;

    Human(String name, int age , double weight){
        this.name = name;
        this.age = age;
        this.weight = weight; 
    }

    void eat(){
        System.out.println( this.name + " is eating ");
    }

    void drink(){
        System.out.println( this.name + " is drinking bear ");
    }
}