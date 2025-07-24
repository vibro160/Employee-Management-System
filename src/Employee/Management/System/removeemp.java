package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class removeemp extends JFrame implements ActionListener {
    Choice choiceempid;





    removeemp(){
        JLabel lable= new JLabel("Employee ID");
        lable.setBounds(50,50,150,30);
        lable.setFont(new Font("Tahoma",Font.BOLD,20));
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



        setSize(1000,300);
        setLocation(300,150);
        setVisible(true);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
    new removeemp();
    }
}
