package Employee.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class addemployee  extends JFrame implements ActionListener {
    Random ran =new Random();
    int number= ran.nextInt(999999);
    JTextField employeename,fathername,address,phoneno,aadhar,email,salary,designation;
    JLabel employeeid;

    JDateChooser tdob;
    JComboBox Boxeducation;

    JButton add;
    JButton back;


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
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(fname);
        fathername=new JTextField();
        fathername.setBounds(650,150,150,30);
        fathername.setBackground(new Color(177,252,197));
        add(fathername);



        JLabel phone=new JLabel("Phone No:");
        phone.setBounds(50,200,150,30);
        phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(phone);
        phoneno=new JTextField();
        phoneno.setBounds(200,200,150,30);
        phoneno.setBackground(new Color(177,252,197));
        add(phoneno);

        JLabel DOB=new JLabel(" DOB:");
        DOB.setBounds(50,250,150,30);
        DOB.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(DOB);
        tdob=new JDateChooser();
        tdob.setBounds(200,250,150,30);
        tdob.setBackground(new Color(177,252,197));
        add(tdob);



        JLabel adhar=new JLabel("Aadhar No:");
        adhar.setBounds(50,300,150,30);
        adhar.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(adhar);
        aadhar=new JTextField();
        aadhar.setBounds(200,300,150,30);
        aadhar.setBackground(new Color(177,252,197));
        add(aadhar);

        JLabel addres=new JLabel(" Address ");
        addres.setBounds(50,350,150,30);
        addres.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(addres);
        address=new JTextField();
        address.setBounds(200,350,150,30);
        address.setBackground(new Color(177,252,197));
        add(address);


        JLabel sal=new JLabel("Salary:");
        sal.setBounds(400,200,150,30);
        sal.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(sal);
        salary=new JTextField();
        salary.setBounds(650,200,150,30);
        salary.setBackground(new Color(177,252,197));
        add(salary);

        JLabel mail=new JLabel("Email ID:");
        mail.setBounds(400,250,150,30);
        mail.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(mail);
        email=new JTextField();
        email.setBounds(650,250,150,30);
        email.setBackground(new Color(177,252,197));
        add(email);

        JLabel desg=new JLabel("Designation:");
        desg.setBounds(400,300,150,30);
        desg.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(desg);
        designation=new JTextField();
        designation.setBounds(650,300,150,30);
        designation.setBackground(new Color(177,252,197));
        add(designation);

        JLabel edu=new JLabel("Highest Education:");
        edu.setBounds(50,400,200,30);
        edu.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(edu);
       String items[]={"BBA","BCA","B.Tech","BA","BSC","B.COM","MBA","MA","MTech","MSC","Phd"};
       Boxeducation=new JComboBox(items);
       Boxeducation.setBackground(new Color(177,252,197));
       Boxeducation.setBounds(250,400,100,30);
       add(Boxeducation);

        JLabel eid=new JLabel("Employee ID:");
        eid.setBounds(50,450,150,30);
        eid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(eid);
        employeeid=new JLabel(""+number);
        employeeid.setBounds(200,450,150,30);
        employeeid.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        employeeid.setForeground(Color.black); //text colour
        add(employeeid);

        add= new JButton("ADD");
        add.setBounds(350,550,150,40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);

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
        if(e.getSource()==add){
            String name=employeename.getText();
            String fname =fathername.getText();
            String DOB = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();

            String addres=address.getText();
            String phone=phoneno.getText();
            String education=(String)Boxeducation.getSelectedItem();
            String desg=designation.getText();
            String adhar=aadhar.getText();
            String  eid=employeeid.getText();
            String mail=email.getText();
            String sal=salary.getText();




             try{
               connection c=new connection();
               String query="insert into employee values('"+name+"','"+fname+"','"+DOB+"','"+addres+"','"+phone+"','"+education+"','"+desg+"','"+adhar+"','"+eid+"','"+mail+"','"+sal+"')";
               c.statement.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Details added");
               setVisible(false);
               new main();


             } catch (Exception E) {
                 E.printStackTrace();
             }

        }
    }

    public static void main(String[] args) {


        new addemployee();
    }
}