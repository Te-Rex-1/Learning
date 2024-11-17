package Project;
// not completed still  working
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator extends JFrame implements ActionListener  {
    // operation
    ArrayList store=new ArrayList<>();
    JButton plus,minus,multiply,divide,calculate;
    // Number;
    JButton one,two,three,four,five,six,seven,eight,nine,zero;
    // display area
    JTextField display;
    Calculator(){
        // set operation
        plus=new JButton("+");
        minus=new JButton("-");
        divide=new JButton("+");
        calculate=new JButton("=");
        multiply=new JButton("+");

        // set number
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        zero=new JButton("0");

        display=new JTextField();


        // set boundry
        plus.setBounds(400,400,50,40);
        // add button to frame
        add(plus);
        add(minus);
        add(multiply);
        add(divide);
        add(calculate);

        // add number to frame
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(zero);
        add(nine);

        // add text field
        add(display);
        setLayout(new GridBagLayout());
        setSize(500,500);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String input=display.getText();
    }



    public static void main(String[] args) {
    new Calculator();
    }
}
