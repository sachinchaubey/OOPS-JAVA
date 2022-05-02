import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class J_label{
    public static void main(String args[]){
        ImageIcon image = new ImageIcon("C:\\Users\\sachi\\OneDrive\\Pictures\\sachin.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        //JLabel :> a GUI display area for a string Of text , an image, or both
        JLabel label = new JLabel();
        label.setText("Hay , you are a good programmer");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text positon
        label.setVerticalTextPosition(JLabel.TOP); //set text postion
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font sizing,decoration
        label.setForeground(Color.green); //set text color
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //set visulization of background color
        label.setBorder(border); //set border 
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within laber in center,top,left
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label in center,top,left
        // label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The profile");
        // frame.setLayout(null);
        // frame.setSize(500, 500); 
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // this is pack using for hole window size and that is always use after the frame.add(lable)
    }
}