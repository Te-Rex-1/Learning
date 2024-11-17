package School;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends KeithNO implements ActionListener {
    JFrame frame=new JFrame();
    JTextField textField=new JTextField();
    JTextField textField2=new JTextField();
    JButton button=new JButton("Encrypt");
    Frame(){
        textField.setBounds(100,100,150,50);
        button.setText("Encrypt");
        textField2.setBounds(100,300,150,50);
        button.setBounds(100,400,40,40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(textField2);
        frame.add(button);
        frame.add(textField);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        int input=Integer.parseInt(textField.getText());


    }

    public static void main(String[] args) {
        KeithNO keithNO=new KeithNO();
        new Frame();
    }


}
