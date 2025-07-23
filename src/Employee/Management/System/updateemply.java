package Employee.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updateemply extends JFrame  implements ActionListener {
    JTextField teducation, tfname, taddress,tphone, taadhar, temail, tsalary,tdesignation;
    JLabel tempid;
    JButton update;
    JButton back;
    String number;
    updateemply(String number){
    this.number=number;
        getContentPane().setBackground(new Color(163,255,188));

        JLabel heading= new JLabel("Update Employee Details ");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,25));
        add(heading);

        JLabel name=new JLabel("  Name: ");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);
        JLabel temployeename=new JLabel();
        temployeename.setBounds(200,150,150,30);
        temployeename.setBackground(new Color(177,252,197));
        add(temployeename);

        JLabel fname=new JLabel("Father's Name:");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(fname);
        JLabel  tfname=new JLabel();
        tfname.setBounds(650,150,150,30);
        tfname.setBackground(new Color(177,252,197));
        add( tfname);



        JLabel phone=new JLabel("Phone No:");
        phone.setBounds(50,200,150,30);
        phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(phone);
        tphone=new JTextField();
        tphone.setBounds(200,200,150,30);
        tphone.setBackground(new Color(177,252,197));
        add(tphone);

        JLabel DOB=new JLabel(" DOB:");
        DOB.setBounds(50,250,150,30);
        DOB.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(DOB);
         JLabel tdob=new JLabel();
        tdob.setBounds(200,250,150,30);
        tdob.setBackground(new Color(177,252,197));
        add(tdob);



        JLabel adhar=new JLabel("Aadhar No:");
        adhar.setBounds(50,300,150,30);
        adhar.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(adhar);
         JLabel taadhar=new JLabel();
        taadhar.setBounds(200,300,150,30);
        taadhar.setBackground(new Color(177,252,197));
        add(taadhar);

        JLabel addres=new JLabel(" Address ");
        addres.setBounds(50,350,150,30);
        addres.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(addres);
        taddress=new JTextField();
        taddress.setBounds(200,350,150,30);
        taddress.setBackground(new Color(177,252,197));
        add(taddress);


        JLabel sal=new JLabel("Salary:");
        sal.setBounds(400,200,150,30);
        sal.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(sal);
        tsalary=new JTextField();
        tsalary.setBounds(650,200,150,30);
        tsalary.setBackground(new Color(177,252,197));
        add(tsalary);

        JLabel mail=new JLabel("Email ID:");
        mail.setBounds(400,250,150,30);
        mail.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(mail);
        temail=new JTextField();
        temail.setBounds(650,250,150,30);
        temail.setBackground(new Color(177,252,197));
        add(temail);

        JLabel desg=new JLabel("Designation:");
        desg.setBounds(400,300,150,30);
        desg.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(desg);
        tdesignation=new JTextField();
        tdesignation.setBounds(650,300,150,30);
        tdesignation.setBackground(new Color(177,252,197));
        add(tdesignation);
        try {
             connection c=new connection();
             String query="select * from employee  where empid= '"+number+"'";
            ResultSet rs=c.statement.executeQuery(query);
            while (rs.next()){
                name.setText(rs.getString("name"));
                tfname.setText(rs.getString("fname"));
                tdob.setText(rs.getString("dob"));
                taddress.setText(rs.getString("address"));
                tsalary.setText(rs.getString("salary"));
                tphone.setText(rs.getString("phone"));
                temail.setText(rs.getString("email"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel edu=new JLabel("Highest Education:");
        edu.setBounds(50,400,200,30);
        edu.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(edu);

         JLabel  teducation=new JLabel();
         teducation.setBackground(new Color(177,252,197));
        teducation.setBounds(250,400,100,30);
        add( teducation);

        JLabel eid=new JLabel("Employee ID:");
        eid.setBounds(50,450,150,30);
        eid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(eid);
        JLabel tempid=new JLabel("");
        tempid.setBounds(200,450,150,30);
        tempid.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        tempid.setForeground(Color.black); //text colour
        add(tempid);

        update= new JButton("Update");
        update.setBounds(350,550,150,40);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.white);
        update.addActionListener(this);
        add(update);

        back= new JButton("BACK");
        back.setBounds(350,600,150,40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        add(back);


        setSize(900, 700);
        setLocation(300, 50);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
         new updateemply("");
    }

}
