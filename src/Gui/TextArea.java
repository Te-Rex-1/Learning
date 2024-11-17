package Gui;

import javax.swing.*;
import java.awt.*;

public class TextArea {
    JFrame frame;
    JTextArea textArea;
    TextArea(){
        frame=new JFrame("Text Area Demo");
        textArea =new JTextArea();
        textArea.setPreferredSize(new Dimension(100,100));
        textArea.setBackground(Color.black);
        frame.setLayout(new BorderLayout());
        frame.setSize(500,500);
        frame.add(textArea,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new TextArea();
    }
}
