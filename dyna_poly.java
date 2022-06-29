import java.util.Scanner;


//Daynamic = after compleition or on run time
//polymorphism = poly + mor

public class dyna_poly{
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            Animal animal;

            System.out.println("What animal wants to do: ");
            System.out.print("(1-Dog) or (2-Cat): ");

            int choice = sc.nextInt();

            if(choice == 1){
                animal = new Dog();
                animal.speak();
            }

            else if(choice == 2){
                animal = new Cat();
                animal.speak();
            }

            else{
                animal = new Animal();
                System.out.println("the Choice is invalid");
                animal.speak(); 
            }
        }

        
    }
}

class Animal{
    public void speak(){
        System.out.println("the animal is *brrr*");
    }
}

class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("the Dog is *bark*");
    }
}

class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("the Cat is *meaw*");
    } 
}