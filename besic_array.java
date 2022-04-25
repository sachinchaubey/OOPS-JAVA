
public class besic_array{
    public static void main(String[] args){
        // Food[] refrigerater = new Food[3] ;

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Pasta");
        Food food3 = new Food("chicken");

        Food[] refrigerater = {food1,food2,food3};

        // refrigerater[0] = food1;
        // refrigerater[1] = food2;
        // refrigerater[2] = food3;
        
        System.out.println(refrigerater[0].name);
        System.out.println(refrigerater[1].name);
        System.out.println(refrigerater[2].name);
    }
}

class Food{
    String name;
    Food(String name){
        this.name = name;
    }
}