// OVERRIDING : declaring a method in subclass. which already present in parent class.
            // done so that a child class can give its own implemention.


public class over_riding{
    public static void main(String[] args){
        Dog dog = new Dog();
        Animal animal = new Animal();
        dog.loud(); 
        animal.speak();
    }
}

class Animal{
    void speak(){
        System.out.println("the animal speak");
    }
}

class Dog{

    void loud(){
        System.out.println("dog is bark");
    }
}