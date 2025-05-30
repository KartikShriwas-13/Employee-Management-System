package employee;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Delete extends JFrame implements ActionListener {
    
    Choice cEmpId;
    JButton delete, back;
    
    Delete() {
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        JLabel heading = new JLabel("Remove Employee");
        heading.setBounds(350,2,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,22));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel labelempId = new JLabel("Employee Id");
        labelempId.setBounds(50, 50, 100, 30);
        labelempId.setFont(new Font("Arial",Font.PLAIN,17));
        labelempId.setForeground(Color.WHITE);
        add(labelempId);
        
        cEmpId = new Choice();
        cEmpId.setBounds(220, 50, 160, 35);
        cEmpId.setFont(new Font("Arial",Font.PLAIN,14));
        add(cEmpId);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                cEmpId.add(rs.getString("employeeId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 100, 100, 30);
        labelname.setFont(new Font("Arial",Font.PLAIN,17));
        labelname.setForeground(Color.WHITE);
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(220, 100, 100, 30);
        lblname.setFont(new Font("Arial",Font.PLAIN,17));
        lblname.setForeground(Color.WHITE);
        add(lblname);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 150, 100, 30);
        labelphone.setFont(new Font("Arial",Font.PLAIN,17));
        labelphone.setForeground(Color.WHITE);
        add(labelphone);
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(220, 150, 100, 30);
        lblphone.setFont(new Font("Arial",Font.PLAIN,17));
        lblphone.setForeground(Color.WHITE);
        add(lblphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 200, 100, 30);
        labelemail.setFont(new Font("Arial",Font.PLAIN,17));
        labelemail.setForeground(Color.WHITE);
        add(labelemail);
        
        JLabel lblemail = new JLabel();
        lblemail.setBounds(220, 200, 100, 30);
        lblemail.setFont(new Font("Arial",Font.PLAIN,17));
        lblemail.setForeground(Color.WHITE);
        add(lblemail);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where employeeId = '"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String query = "select * from employee where employeeId = '"+cEmpId.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()) {
                        lblname.setText(rs.getString("name"));
                        lblphone.setText(rs.getString("phone"));
                        lblemail.setText(rs.getString("email"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        delete = new JButton("Delete");
        delete.setBounds(80, 300, 100,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);
        
        back = new JButton("Back");
        back.setBounds(220, 300, 100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        // Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel image = new JLabel(i3);
        // image.setBounds(350, 0, 600, 400);
        // add(image);
        
        setSize(1000,650);
        setLocation(150,30);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == delete) {
            try {
                Conn c = new Conn();
                String query = "delete from employee where employeeId = '"+cEmpId.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Sucessfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new Delete();
    }
}
