/*
Gilbert Lopez
CSCE 111 501
08/28/2018
*/

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

class BackgroundImageJFrame extends JFrame {

    public BackgroundImageJFrame() {
        //
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\Gilbe\\Documents\\CSCE 111 501\\FinalProject\\space.png"));
        setSize(1280, 720);  // sets size for frame in pixels
        setLocationRelativeTo(null);  //centers pane
        getContentPane().add(background);  //adds background
        setVisible(true);  //makes pane visible ._.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // quits program in console upon exiting
        //keylistener looks for keypresses
        addKeyListener(new KeyAdapter() {  // create keylistener
            public void keyPressed(KeyEvent evt) {  //creates keypress even
                if(evt.getKeyCode() == KeyEvent.VK_ESCAPE)  // listen for esc keypress
                    setSize(1280, 720);  //set size of window upon esc keypress
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // quits program in console upon exiting
                    setLocationRelativeTo(null);  // centers window
            }
        });
    }
}



class SpaceExplorer {
    public static void main(String args[]) 
        {
            new BackgroundImageJFrame();
            
        }
    }