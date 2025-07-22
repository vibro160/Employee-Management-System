package Employee.Management.System;

import javax.swing.*;
import java.awt.*;

public class addemployee  extends JFrame {

    JTextField employeename,fathername,dob,address,phoneno,aadhar,email,salary,designation;



    addemployee() {

        getContentPane().setBackground(new Color(163,255,188));

        JLabel heading= new JLabel("Add Employee Details ");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,25));
        add(heading);

        JLabel name=new JLabel("  Name: ");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);
        employeename=new JTextField();
        employeename.setBounds(200,150,150,30);
        employeename.setBackground(new Color(177,252,197));
        add(employeename);

        JLabel fname=new JLabel("Father's Name:");
        fname.setBounds(400,200,150,30);
        fname.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(fname);
        fathername=new JTextField();
        fathername.setBounds(600,200,150,30);
        fathername.setBackground(new Color(177,252,197));
        add(fathername);



        JLabel phone=new JLabel("Phone No:");
        phone.setBounds(50,300,150,30);
        phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(phone);
        phoneno=new JTextField();
        phoneno.setBounds(200,300,150,30);
        phoneno.setBackground(new Color(177,252,197));
        add(phoneno);

        JLabel DOB=new JLabel(" DOB:");
        DOB.setBounds(50,350,150,30);
        DOB.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(DOB);
        dob=new JTextField();
        dob.setBounds(200,350,150,30);
       dob.setBackground(new Color(177,252,197));
        add(dob);

        JLabel addres=new JLabel(" Address ");
        addres.setBounds(50,250,150,30);
        addres.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(addres);
        address=new JTextField();
        address.setBounds(200,250,150,30);
        address.setBackground(new Color(177,252,197));
        add(address);

        JLabel adhar=new JLabel("Aadhar No:");
        adhar.setBounds(50,400,150,30);
        adhar.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(adhar);
        aadhar=new JTextField();
        aadhar.setBounds(200,400,150,30);
        aadhar.setBackground(new Color(177,252,197));
        add(aadhar);




        setSize(900, 700);
        setLocation(300, 50);
        setLayout(null);
        setVisible(true);


    }


    public static void main(String[] args) {


        new addemployee();
    }
}