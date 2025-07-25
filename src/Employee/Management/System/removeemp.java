package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class removeemp extends JFrame implements ActionListener {
    Choice choiceempid;





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


        setSize(1000,500);
        setLocation(300,150);

        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
    new removeemp();
    }
}
