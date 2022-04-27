

//  SUPER: keyword refers to the super class(parent) of an object very
        // similar to the "this" keyword.

public class super_key{
    public static void main(String[] ars){

        Hero hero = new Hero("HanumanG",100,"everything");
        Hero hero2 = new Hero("bholenath",101,"universeboss");
        System.out.println(hero2.toString());
    }
}

class Person{
    String name;
    int age;
    Person(String name ,int age){
        this.name= name;
        this.age= age;
        
    }
    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
}

class Hero extends Person{
    String power;
    Hero(String name,int age, String power){
        super(name,age);
        this.power= power;
    }
    public String toString(){
        return super.toString() + this.power;
    }
}