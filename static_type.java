import javax.sound.midi.Soundbank;

// STATIC: modifer. A single copy of a variable/method is create
    //  and shared. the class "owns" the static member.

public class static_type{
    public static void main(String[] args){
        Friend friend1 = new Friend("sachin");
        Friend friend2 = new Friend("shivam");
        Friend friend3 = new Friend("rishav");

        // System.out.println(Friend.noOfFriends);
        Friend.displayNoOfFriend();
    }
}

class Friend{
    String name;
    static int noOfFriends;
    Friend(String name){
        this.name = name;
        noOfFriends++;
    }

    static void displayNoOfFriend(){
        System.out.println("you have " + noOfFriends + " friends");
    }
}