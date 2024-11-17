package Gui;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        JPanel rpanel=new JPanel();
        rpanel.setBackground(Color.red);
        rpanel.setBounds(0,0,250,250);
        JPanel bpanel=new JPanel();
        bpanel.setBackground(Color.blue);
        bpanel.setBounds(250,0,250,250);
        JLabel jLabel=new JLabel();
        jLabel.setText("I am in red");

        JFrame frame=new JFrame("Frame ");
        rpanel.add(jLabel);

        frame.add(rpanel,BorderLayout.SOUTH);
        frame.add(bpanel,BorderLayout.NORTH);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);


    }
    }