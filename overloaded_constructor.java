// OVERLOADED CONSTRUCTORS: multiple constructors within a class with the same name,
//     but name different parameters 
//  (name + parameter = signature)

public class overloaded_constructor{
    public static void main(String[] args){

        // if all ingridints is need
        // Pizza pizza = new Pizza("tomato","mozerilla","garlic","onion");


        // if only three need
        // Pizza pizza = new Pizza("tomato","mozerilla","garlic");

        // if only two need
        // Pizza pizza = new Pizza("tomato","mozerilla");

        // if only one need
        // Pizza pizza = new Pizza("tomato");

        //if plan pizz is need
        Pizza pizza = new Pizza();


        System.out.println("here your pizza type: ");
        System.out.println(pizza.souce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.bread);
        System.out.println(pizza.type);
    }
}

class Pizza{

    
    String souce;
    String cheese;
    String bread;
    String type;

    //if plan pizza is need
    Pizza(){
    }

    // if only one item is need
    Pizza(String souce ){
        this.souce = souce;
    }


    // if only two item needs
    Pizza(String souce, String cheese ){
        this.souce = souce;
        this.cheese = cheese;
    }

    // if only three item needs  
    Pizza(String souce, String cheese , String bread ){
        this.souce = souce;
        this.cheese = cheese;
        this.bread = bread;
    } 
    
    //  if all item needs
    Pizza(String souce, String cheese , String bread , String type){
        this.souce = souce;
        this.cheese = cheese;
        this.bread = bread;
        this.type = type;
    }

    

}