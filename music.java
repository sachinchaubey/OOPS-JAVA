import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class music{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        try (Scanner scanner = new Scanner(System.in)) {
            File file = new File("C:\\Users\\sachi\\Downloads\\12.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            

            String responce = "" ;

            while(!responce.equals("Q")){
                System.out.println("P = play , S = stop , R = reset , Q = quit");
                System.out.print("Enter your choice: ");

                responce = scanner.next();
                responce = responce.toUpperCase();

                switch(responce){
                    case("P"): clip.start();
                    break;
                    
                    case("S"): clip.stop();
                    break;

                    case("R"): clip.setMicrosecondPosition(0);
                    break;

                    case("Q"): clip.close();
                    break;

                    default: System.out.println("Not a valid choice:");
                } 

            }
        }

        System.out.println("Byeeeeee");
    }
}