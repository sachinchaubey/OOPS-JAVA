

// LOCAL : declared inside a method visible only to that method
// GLOBAL : declated outside a method but within a class visible to all part of a class

import java.util.Random;

public class besic_dice{
    public static void main(String[] args){

        dice DiceRoll = new dice();

    }
}

// class dice{

    // dice(){ 

    //     // this is local var example bcz random and number are visialbe only dice() ;
    //     Random random = new Random();
    //     int number = 0;

    //     Roll(random, number);
    // }

    // void Roll(Random random, int number){
    //     number = random.nextInt(6) + 1;
    //     System.out.println(number); 
    // }

// } 

class dice{

    // this is local var method
    Random random;
    int number;
    
    dice(){
        random = new Random();
        Roll();
    }

    void Roll(){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}