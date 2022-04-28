public class inter_face{
    public static void main(String[] args){
    //     Rabbit rabbit = new Rabbit();
    //     rabbit.seek();
    // Hawk hawk = new Hawk();
    // hawk.feek();

    Fish fish = new Fish();
    fish.feek();
    fish.seek();

    }
}

class Fish implements prey,predictor{
    @Override
    public void seek(){
        System.out.println("fish hunting big fish");
    } 

    @Override
    public void feek(){
        System.out.println("fish hunting small fish");
    }
}

interface prey{
    void seek();
}

interface predictor{
    void feek();
}