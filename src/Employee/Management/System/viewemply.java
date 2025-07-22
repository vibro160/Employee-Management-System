package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


public class viewemply  extends JFrame implements ActionListener {
     Choice choiceemp;

     JTable table;
      JButton search,print,update,back;

    viewemply(){

        getContentPane().setBackground(new Color(255,130,122));
         JLabel searchbtn=new JLabel("Search By Employee ID");
         searchbtn.setBounds(20,20,150,20);
         add(searchbtn);

         choiceemp=new Choice();
         choiceemp.setBounds(180,20,150,20);
         add(choiceemp);

         try {
             connection c =new connection();
             ResultSet rs=c.statement.executeQuery("select * from employee");
             while (rs.next()) {
                 choiceemp.add(rs.getString("empid"));

             }


         } catch (Exception e) {
           e.printStackTrace();
         }


         table=new JTable();
         try {
              connection c= new connection();
              ResultSet rs=c.statement.executeQuery("select * from employee");
              table.setModel(DbUtils.resultSetToTableModel(rs));

         } catch (Exception e) {
             e.printStackTrace();
         }

         JScrollPane jp=new JScrollPane(table);
         jp.setBounds(0,100,900,600);
         add(jp);

       search =new JButton("Search");
       search.setBounds(20,70,80,20);
       search.addActionListener(this);
       add(search);

        print =new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);
       update =new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add( update);
        back =new JButton("Back");
       back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add( back);






        setSize(900,700);
        setLocation(300,100);
        setLayout(null);
        setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            String query="select * from employee where empid='" +choiceemp.getSelectedItem()+"'";
            try {
              connection c=new connection();
              ResultSet rs=c.statement.executeQuery(query);
              table.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource()==print) {
            try {
                table.print();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        } else if (e.getSource()==update) {
            setVisible(false);
             try {

             } catch (Exception ex) {
                 throw new RuntimeException(ex);
             }
        }
        else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
   new viewemply();
    }
}
