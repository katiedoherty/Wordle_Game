package wordlepackage.wordle.src;
//these are used for the graphics windows and events
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*;
import java.util.*;
import java.util.List;
//this is for the keeper's choice



public class wordle_game extends JPanel {


      public static String randomword()  throws FileNotFoundException{
            Dictionary input = new Dictionary();
            int size = input.getSize();
           String randomWord =  input.getWord(size);
           return randomWord;
      
      }


/////////main method, plays the game//////////////////////////
      public static void main(String[] args) {

            // creating a frame  
    Frame f = new Frame("TextField Example");    
  
    // creating objects of textfield  
    TextField t1, t2;    
    // instantiating the textfield objects  
    // setting the location of those objects in the frame  
    t1 = new TextField("Welcome to Javatpoint.");    
    t1.setBounds(50, 100, 200, 30);    
    t2 = new TextField("AWT Tutorial");    
    t2.setBounds(50, 150, 200, 30);    
    // adding the components to frame  
    f.add(t1);  
    f.add(t2);   
    // setting size, layout and visibility of frame   
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);    
       

      }
}

