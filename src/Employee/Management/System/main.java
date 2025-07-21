package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {



    main(){
         ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
         Image I2=I1.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
         ImageIcon I3= new ImageIcon(I2);
         JLabel  img= new JLabel(I3);
         img.setBounds(0,0,1200,800);
         add(img);;

         JLabel heading= new JLabel("Employee Management System");
         heading.setBounds(370,160,500,50);
         heading.setFont(new Font("Raleway",Font.BOLD,25));
         img.add(heading);

         JButton add=new JButton("Add Employee");
          add.setBounds(335,300,150,40);
          add.setForeground(Color.white);
          add.setBackground(Color.black);
          img.add(add);
          add.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {

              }
          });

        JButton view=new JButton("VIew Employee");
        view.setBounds(630,300,150,40);
        view.setForeground(Color.white);
        view.setBackground(Color.black);
        img.add(view);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton remove=new JButton("Remove Employee");
        remove.setBounds(490,400,150,40);
        remove.setForeground(Color.white);
        remove.setBackground(Color.black);
        img.add(remove);
        remove .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




         setSize(1200,800);
         setVisible(true);
         setLayout(null);
         setLocation(180,0);

    }

    public static void main(String[] args) {
     new main();
    }
}
