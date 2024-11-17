package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button  {
    static JButton jButton;
    static JLabel jLabel;
    public static void main(String[] args) {

        jLabel =new JLabel();

        jButton=new JButton("I am button");
        jButton.setBounds(200,100,100,50);
        jButton.setFocusable(false);

        ImageIcon imageIcon=new ImageIcon("C:\\Users\\Abhinav Rathore\\Pictures\\Saved Pictures\\org.png");
        jLabel.setIcon(imageIcon);
        jLabel.setBounds(200,350,200,200);
        jLabel.setVisible(false);
        JFrame frame=new JFrame("Frame ");


        JButton closeButton=new JButton("Stop Program");
        closeButton.setBounds(500,200,100,100);
        closeButton.addActionListener(e -> System.exit(0));


        jButton.addActionListener(e -> jLabel.setVisible(true));// using lambda expression
        frame.setLayout(null);
        frame.add(jLabel);
        frame.add(jButton);
        frame.add(closeButton);
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
//    public void actionPerformed(ActionEvent e){
//        if(e.getSource()==jButton){
//            System.out.println("I am button ");
//
//        }

    }



