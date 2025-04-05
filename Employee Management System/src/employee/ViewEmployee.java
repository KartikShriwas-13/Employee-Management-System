package employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewEmployee extends JFrame implements ActionListener{

    JTable table;
    Choice cempID;
    JButton back;

    ViewEmployee(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // JLabel searchlbl = new JLabel("Search by Employee ID ");
        // searchlbl.setBounds(30,20,220,25);
        // searchlbl.setFont(new Font("serif",Font.BOLD,20));
        // add(searchlbl);

        // cempID = new Choice();
        // cempID.setBounds(280,20,200,25);
        // add(cempID);

        // try{
        //     Conn c = new Conn();
        //     ResultSet rs = c.s.executeQuery("Select * from employee");

        //     while(rs.next()){
        //         cempID.add(rs.getString("employeeID"));
        //     }

        // }catch(Exception e){
        //     e.printStackTrace();
        // }

        back = new JButton("Back");
        back.setBounds(400, 550, 180, 40);
        back.setFont(new Font("serif",Font.PLAIN,20));
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);



        table = new JTable();

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));



        }catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,990,600);
        add(jsp);

        setSize(1000,650);
        setLocation(150,30);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Home();
        

    }
    public static void main(String[] args) {
        new ViewEmployee();
        
    }

}
