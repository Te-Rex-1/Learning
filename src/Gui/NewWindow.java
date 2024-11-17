package Gui;

import javax.swing.*;


public class NewWindow {
    JFrame jFrame=new JFrame();
    JTextField textField=new JTextField("Hallo");;
    NewWindow(){

        textField.setText("Hallo");
        jFrame.add(textField);

        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
    }

}
