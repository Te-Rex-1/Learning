package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage extends NewWindow implements ActionListener {
    JFrame jFrame;
    JButton jButton;
    LaunchPage (){
        jFrame=new JFrame();
       jButton=new JButton();
        jButton.setBounds(200,100,100,50);
        jButton.addActionListener(this);
       jFrame.add(jButton);
       jFrame.setDefaultCloseOperation(3);
       jFrame.setLayout(null);
       jFrame.setSize(500,500);
       jFrame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==jButton)
        {
            NewWindow newWindow=new NewWindow();
        }

    }

    public static void main(String[] args) {
        new LaunchPage();

    }
}
