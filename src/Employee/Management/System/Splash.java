package Employee.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

     Splash(){
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
         Image i2=i1.getImage().getScaledInstance(1200,820,Image.SCALE_DEFAULT );
          ImageIcon i3=new ImageIcon(i2);
          JLabel image =new JLabel(i3);
          image.setBounds(0,0,1200,820);
          add(image);



        setSize(1200,820);
        setLayout(null);
         setLocation(180,0);
        setVisible(true);
        try {
             Thread.sleep(5000);
            setVisible(false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    public static void main(String[] args) {

        new Splash();

    }
}
