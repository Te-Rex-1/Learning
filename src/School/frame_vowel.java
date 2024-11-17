package School;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame_vowel extends JFrame implements ActionListener {
        JTextField textField;
        JPanel panel;
        JButton button;
        JPanel displayPanel;
   frame_vowel(){
       textField=new JTextField();
       panel=new JPanel();
       button=new JButton("Check");
       displayPanel=new JPanel();

       this.setLayout(new BorderLayout());

       button.setPreferredSize(new Dimension(100,50));
       button.setFocusable(false);
       panel.add(button);

       // adding action listner
       button.addActionListener(this);
       //panel.add(textField,BorderLayout.CENTER);
       textField.setPreferredSize(new Dimension(400,400));
        displayPanel.add(textField);
        this.add(displayPanel,BorderLayout.CENTER);
       this.add(panel,BorderLayout.SOUTH);
       this.setSize(500,500);
       this.setDefaultCloseOperation(3);
       this.setVisible(true);

   }

    public void actionPerformed(ActionEvent event){
        if (event.getSource()==button){
            Vowel vowel=new Vowel();
            String input=textField.getText();
            textField.setText(vowel.check(input)+"\n"+"no of vowel"+vowel.count);



        }
    }




}
