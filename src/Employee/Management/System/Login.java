package Employee.Management.System;

import javax.swing.*;

public class Login extends JFrame {

     JTextField user_name;

     JPasswordField userpassword;



    Login(){
        JLabel  username=new JLabel("username");
        username.setBounds(40,20,100,30);
        add(username);

        user_name=new JTextField();
        user_name.setBounds(120,25,150,20);
         add(user_name);

        JLabel password =new JLabel("password");
        password.setBounds(40,60,100,20);
        add(password);

        userpassword=new JPasswordField();
        userpassword.setBounds(120,65,150,20);
        add(userpassword);





   setSize(800,400);
   setLocation(400,200);
   setLayout(null);
   setVisible(true);






    }
    public static void main(String[] args) {
        new Login();

    }


}
