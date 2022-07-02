class abst{
    public static void main(String[] args){
        Player play = new Player();
        play.playing();
    }
}
abstract class Cricket{
    abstract void playing();
}

class Player extends Cricket{
    @Override 
    void playing(){
        System.out.println("players play cricket");
    }
}
