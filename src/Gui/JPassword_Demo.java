package Gui;

import javax.swing.*;
import java.awt.*;

public class JPassword_Demo {
    JFrame frame;
    JPasswordField passwordField;
       JPassword_Demo(){
           frame=new JFrame();
           passwordField=new JPasswordField();
           passwordField.setBounds(100,100,100,30);
           frame.add(passwordField);
           frame.setLayout(new BorderLayout());
           frame.setSize(500,500);
           frame.setDefaultCloseOperation(3);
           frame.setVisible(true);
       }

    public static void main(String[] args) {
        new JPassword_Demo();
    }

}
