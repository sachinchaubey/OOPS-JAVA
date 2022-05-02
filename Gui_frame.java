import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

//JFrame :> a GUI window to add components to 

public class Gui_frame{
    public static void main(String arg[]){

        JFrame jframe = new JFrame();

        jframe.setTitle("Making Gui for window"); //for changing title
        jframe.setSize(420, 420);  //for fix size
        jframe.setResizable(false);  // for risizablility stop
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // for close
        jframe.setVisible(true);  // for visiblility of gui
        jframe.getContentPane().setBackground(new Color(123,50,250));  // for changeing background color 
        // if we want to change the logo then use  ImageIcon image = new ImageIcon("image path");
        // jframe.setIconImage(Image.getImage());
    }
}


// you make this from another formate that is called parante child method and make another class myFrame and use this instend frame.