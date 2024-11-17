package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Demo  implements ActionListener {
    public static void main(String[] args) {
        Menu_Demo ob=new Menu_Demo();
        JFrame frame=new JFrame();
        JMenuBar menuBar=new JMenuBar();
        JMenu edit=new JMenu("Edit");
        JMenu file=new JMenu("File");
        JMenu help=new JMenu("Help");

        JMenuItem save=new JMenuItem("Save");
        JMenuItem saveas=new JMenuItem("SaveAs");
        JMenuItem exit=new JMenuItem("Exit");

        file.add(save);
        file.add(saveas);
        file.add(exit);

            //save.addActionListener(this);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        System.out.println(" you click on save button");
    }

}
