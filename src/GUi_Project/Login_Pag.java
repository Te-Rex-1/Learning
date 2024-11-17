package GUi_Project;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Pag implements ActionListener {
    JFrame frame;
    JPasswordField passwordField;
    JLabel userName;
    JLabel Password,output=new JLabel();
    JTextField userName_Input;
    JButton login;
    JPanel panel;
    Login_Pag(){
        frame=new JFrame();
        panel=new JPanel();
        passwordField=new JPasswordField();
        login=new JButton("Login");
        userName=new JLabel("User Name");
        Password=new JLabel("Password");
        userName_Input=new JTextField();

        output.setBounds(100,100,100,100);

        // Setting button

        login.setBounds(100,100,90,30);
        login.setFocusable(false);
        // setting textField and  password field
        userName_Input.setBounds(100,20,100,20);
        passwordField.setBounds(100,60,100,20);
        // setting label
        userName.setBounds(10,20,100,20);
        Password.setBounds(10,60,100,20);
        panel.setLayout(null);

        // adding component to panel
        panel.add(output);
        panel.add(userName_Input);
        panel.add(passwordField);
        panel.add(userName);
        panel.add(Password);
        panel.add(login);
        // adding component to frame
        login.addActionListener(this);
        frame.add(panel);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource()==login){

        if((userName_Input.getText()).equals("Abhinav")&&(passwordField.getPassword()).equals("12345")){

            output.setText("Login Successful");
            System.out.println("1");
        }
        else {
            output.setText("Login Failed");
            System.out.println("0");
        }}

    }


    public static void main(String[] args) {
        new Login_Pag();
    }
}
