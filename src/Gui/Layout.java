package Gui;

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    Layout(){
        JPanel redPanel=new JPanel();
        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
      //  bluePanel.setVisible(true);
        bluePanel.setPreferredSize(new Dimension(50,50));
        redPanel.setBackground(Color.red);
        redPanel.setPreferredSize(new Dimension(50,50));
      //  redPanel.setVisible(true);
        this.setLayout(new BorderLayout());
        this.add(bluePanel,BorderLayout.SOUTH);
        this.add(redPanel,BorderLayout.NORTH);
        this.setDefaultCloseOperation(3);
        this.setSize(500,500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Layout();
    }
}
