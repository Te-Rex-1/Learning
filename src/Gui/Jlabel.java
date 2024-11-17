package Gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Jlabel  {
    public static void main(String[] args) {

        ImageIcon imageIcon=new ImageIcon("C:\\Users\\Abhinav Rathore\\Pictures\\Saved Pictures\\org.png");
        JLabel jLabel=new JLabel();// create label
        JFrame frame=new JFrame("Frame ");

        // all setting
        jLabel.setIcon(imageIcon);
        jLabel.setText("I am Label");
        jLabel.setHorizontalTextPosition(jLabel.CENTER);
        jLabel.setBounds(0,0,250,250);
//        jLabel.setVerticalAlignment(jLabel.TOP);
        jLabel.setIconTextGap(50);

        // color
        jLabel.setForeground(Color.white);// set color of text
        jLabel.setFont(new Font("MV Boli",Font.BOLD,30));// this will font for text
        jLabel.setBackground(Color.BLACK);// for setting background color
        jLabel.setOpaque(true);
        // add
        frame.add(jLabel);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }
}
