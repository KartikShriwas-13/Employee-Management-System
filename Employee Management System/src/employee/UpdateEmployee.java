package employee;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class UpdateEmployee extends JFrame implements ActionListener{


    JButton add,back;
    JTextField tfeducation,tname,tlname,tlsal,tcity,tlphone,temail,tlaadhar,tdes;
    JLabel lablelID;

    UpdateEmployee(){

         getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        JLabel heading = new JLabel("Update  Employee Details");
        heading.setBounds(320,20,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,26));
        add(heading);

        JLabel lablename = new JLabel("Name");
        lablename.setBounds(50,120,150,30);
        lablename.setFont(new Font("serif",Font.BOLD,20));
        add(lablename);

        JLabel lbtname = new JLabel();
        lbtname.setBounds(200,120,220,30);
        lbtname.setFont(new Font("Arial",Font.PLAIN,18));
        add(lbtname);

        JLabel lablelname = new JLabel("Last Name");
        lablelname.setBounds(550,120,150,30);
        lablelname.setFont(new Font("serif",Font.BOLD,20));
        add(lablelname);

        JLabel lblname = new JLabel();
        lblname.setBounds(700,120,220,30);
        lblname.setFont(new Font("Arial",Font.PLAIN,18));
        add(lblname);

        JLabel labledob = new JLabel("Date of Birth");
        labledob.setBounds(50,180,150,30);
        labledob.setFont(new Font("serif",Font.BOLD,20));
        add(labledob);

        JLabel lbldcdob = new JLabel();
        lbldcdob.setBounds(200,180,220,30);
        add(lbldcdob);

        JLabel lablelsal = new JLabel("Salary");
        lablelsal.setBounds(550,180,150,30);
        lablelsal.setFont(new Font("serif",Font.BOLD,20));
        add(lablelsal);

        tlsal = new JTextField();
        tlsal.setBounds(700,180,220,30);
        tlsal.setFont(new Font("Arial",Font.PLAIN,18));
        add(tlsal);

        JLabel lablecity = new JLabel("City");
        lablecity.setBounds(50,240,150,30);
        lablecity.setFont(new Font("serif",Font.BOLD,20));
        add(lablecity);

        tcity = new JTextField();
        tcity.setBounds(200,240,220,30);
        tcity.setFont(new Font("Arial",Font.PLAIN,18));
        add(tcity);

        JLabel lablelphone = new JLabel("Phone No.");
        lablelphone.setBounds(550,240,150,30);
        lablelphone.setFont(new Font("serif",Font.BOLD,20));
        add(lablelphone);

        tlphone = new JTextField();
        tlphone.setBounds(700,240,220,30);
        tlphone.setFont(new Font("Arial",Font.PLAIN,18));
        add(tlphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50,300,150,30);
        labelemail.setFont(new Font("serif",Font.BOLD,20));
        add(labelemail);

        temail = new JTextField();
        temail.setBounds(200,300,220,30);
        temail.setFont(new Font("Arial",Font.PLAIN,18));
        add(temail);

        JLabel labeledu = new JLabel("Highest Education");
        labeledu.setBounds(510,300,180,30);
        labeledu.setFont(new Font("serif",Font.BOLD,19));
        add(labeledu);

        
        tfeducation = new JTextField();
        tfeducation.setBounds(700,300,220,30);
        tfeducation.setBackground(Color.white);
        tfeducation.setFont(new Font("Arial",Font.PLAIN,18));
        add(tfeducation);
        
        JLabel labeldes = new JLabel("Designation");
        labeldes.setBounds(50,360,150,30);
        labeldes.setFont(new Font("serif",Font.BOLD,20));
        add(labeldes);

        tdes = new JTextField();
        tdes.setBounds(200,360,220,30);
        tdes.setFont(new Font("Arial",Font.PLAIN,18));
        add(tdes);

        JLabel lablelaadhar = new JLabel("Aadhar No.");
        lablelaadhar.setBounds(550,360,150,30);
        lablelaadhar.setFont(new Font("serif",Font.BOLD,20));
        add(lablelaadhar);

        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(700,360,220,30);
        lblaadhar.setFont(new Font("Arial",Font.PLAIN,18));
        add(lblaadhar);

        JLabel lablelempID = new JLabel("Employee ID");
        lablelempID.setBounds(50,420,150,30);
        lablelempID.setFont(new Font("serif",Font.BOLD,20));
        add(lablelempID);

        lablelID = new JLabel(); 
        lablelID.setBounds(200,420,150,30);
        lablelID.setFont(new Font("serif",Font.BOLD,20));
        add(lablelID);

        add = new JButton("Add Details");
        add.setBounds(270, 520, 180, 40);
        add.setFont(new Font("serif",Font.PLAIN,20));
        add.setBackground(Color.darkGray);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(520, 520, 180, 40);
        back.setFont(new Font("serif",Font.PLAIN,20));
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        setSize(1000,650);
        setLocation(150,30);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args) {
        new UpdateEmployee();
    }

}
