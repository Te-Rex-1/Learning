package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textFeild extends JFrame implements ActionListener {
    JTextField textField=new JTextField();
    JButton jButton=new JButton("Submit");
    JButton stop=new JButton("Stop");

    textFeild(){
        textField.setPreferredSize(new Dimension(400,400));
        jButton.addActionListener(this);
        jButton.setFocusable(false);
        stop.setFocusable(false);
        stop.addActionListener(e -> System.exit(0));
        this.add(stop);
        this.add(textField);
        this.add(jButton);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource()==jButton){
            System.out.println(textField.getText());
        }

    }

    public static void main(String[] args) {
        new textFeild();
    }

}
