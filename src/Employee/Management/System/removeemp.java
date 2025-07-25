package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class removeemp extends JFrame implements ActionListener {
    Choice choiceempid;

    JButton delete;
    JButton back;



    removeemp(){
        JLabel lable= new JLabel("Employee ID");
        lable.setBounds(50,45,100,30);
        lable.setFont(new Font("Tahoma",Font.BOLD,15));
        add(lable);

        choiceempid=new Choice();
        choiceempid.setBounds(250,50,150,30);
        add(choiceempid);

        try {
            connection c= new connection();
            String query="select * from employee";
            ResultSet rs=c.statement.executeQuery(query);;
            while (rs.next()){
                choiceempid.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50,100,100,30);
        labelName.setFont(new Font("Tahoma", Font.BOLD,15));
        add(labelName);

        JLabel textName = new JLabel();
        textName.setBounds(200,100,100,30);
        add(textName);


        JLabel labelPhone = new JLabel("Phone");
        labelPhone.setBounds(50,150,100,30);
        labelPhone.setFont(new Font("Tahoma", Font.BOLD,15));
        add(labelPhone);

        JLabel textPhone = new JLabel();
        textPhone.setBounds(200,150,100,30);
        add(textPhone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50,200,100,30);
        labelemail.setFont(new Font("Tahoma", Font.BOLD,15));
        add(labelemail);

        JLabel textEmail = new JLabel();
        textEmail.setBounds(200,200,100,30);
        add(textEmail);

        try {
            connection c= new connection();
            ResultSet rs=c.statement.executeQuery("select * from employee  where empid='"+choiceempid.getSelectedItem()+"'");
            while (rs.next()){
                textName.setText(rs.getString("name"));
                textEmail.setText(rs.getString("email"));
                textPhone.setText(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        choiceempid.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    connection c= new connection();
                    ResultSet rs=c.statement.executeQuery("select * from employee  where empid='"+choiceempid.getSelectedItem()+"'");
                    while (rs.next()) {
                        textName.setText(rs.getString("name"));
                        textEmail.setText(rs.getString("email"));
                        textPhone.setText(rs.getString("phone"));
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

        delete= new JButton("Delete");
        delete.setBounds(80,300,100,30);
        delete.setBackground(Color.black);
        delete.setForeground(Color.white);
        delete.addActionListener(this);
        add(delete);


        back= new JButton("Back");
        back.setBounds(200,300,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        ImageIcon I1;
        I1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image I2=I1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel img=new JLabel(I3);
       img.setBounds(700,80,200,200);
       add(img);

        ImageIcon I11;
        I11 = new ImageIcon(ClassLoader.getSystemResource("icons/rback.png"));
        Image I22=I11.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon I33=new ImageIcon(I22);
        JLabel imgage=new JLabel(I33);
        imgage.setBounds(0,0,1120,630);
        add(imgage);



        setSize(1000,500);
        setLocation(300,150);

        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==delete){
            try{
                connection c=new connection();
                String query="delete from employee where empid='"+choiceempid.getSelectedItem()+"'";
                c.statement.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Data Deleted Sucessfully");
               setVisible(false);
               new main();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }else {
            setVisible(false);

        }

    }

    public static void main(String[] args) {
    new removeemp();
    }
}
