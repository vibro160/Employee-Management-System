package Employee.Management.System;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Arrays;

public class Login<conn> extends JFrame implements ActionListener {

     JTextField user_name;

     JPasswordField userpassword;
     JButton Login;
     JButton Back;



    Login() {
        JLabel username = new JLabel("username");
        username.setBounds(40, 20, 100, 30);
        add(username);

        user_name = new JTextField();
        user_name.setBounds(120, 25, 150, 20);
        add(user_name);

        JLabel password = new JLabel("password");
        password.setBounds(40, 60, 100, 20);
        add(password);

        userpassword = new JPasswordField();
        userpassword.setBounds(120, 65, 150, 20);
        add(userpassword);

        Login = new JButton("LOGIN");
        Login.setBounds(120, 140, 150, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.white);
        Login.addActionListener(this);
        add(Login);

        Back = new JButton("BACK");
        Back.setBounds(120, 200, 150, 30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);

        ImageIcon I11 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image I22 = I11.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon I33 = new ImageIcon(I22);
        JLabel imgg = new JLabel(I33);
        imgg.setBounds(400, 20, 800, 400);
        add(imgg);


        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/loginB.jpg"));
        Image I2 = I1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel img = new JLabel(I3);
        img.setBounds(0, 0, 800, 400);
        add(img);


        setSize(800, 400);
        setLocation(400, 200);
        setLayout(null);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == Login){
         try {
             String username = user_name.getText();
            String password = userpassword.getText();


             connection connection =new connection();

             String query= "SELECT * FROM login WHERE username='" + username + "' AND password='" + password + "'"; ;
             ResultSet resultSet= connection.statement.executeQuery(query);


          if(resultSet.next()){
              setVisible(false);
              new main();

          }
          else{
              JOptionPane.showMessageDialog(null,"Invalid username or password");
          }

         } catch (Exception E) {
            E.printStackTrace();
         }

     } else if (e.getSource()==Back) {
         System.exit(77);
     }
    }

    public static void main(String[] args) {
        new Login();

    }


}
