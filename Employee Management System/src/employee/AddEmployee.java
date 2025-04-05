package employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class AddEmployee extends JFrame implements ActionListener{

    Random rad = new Random();
    int number = rad.nextInt(999999);
    JButton add,back;
    JTextField tname,tlname,tlsal,tcity,tlphone,temail,tlaadhar,tdes;
    JDateChooser dcdob;
    JComboBox tledu;
    JLabel lablelID;

    AddEmployee(){

        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        JLabel heading = new JLabel("Add  Employee Details");
        heading.setBounds(350,20,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,26));
        add(heading);

        JLabel lablename = new JLabel("Name");
        lablename.setBounds(50,120,150,30);
        lablename.setFont(new Font("serif",Font.BOLD,20));
        add(lablename);

        tname = new JTextField();
        tname.setBounds(200,120,220,30);
        tname.setFont(new Font("Arial",Font.PLAIN,18));
        add(tname);

        JLabel lablelname = new JLabel("Last Name");
        lablelname.setBounds(550,120,150,30);
        lablelname.setFont(new Font("serif",Font.BOLD,20));
        add(lablelname);

        tlname = new JTextField();
        tlname.setBounds(700,120,220,30);
        tlname.setFont(new Font("Arial",Font.PLAIN,18));
        add(tlname);

        JLabel labledob = new JLabel("Date of Birth");
        labledob.setBounds(50,180,150,30);
        labledob.setFont(new Font("serif",Font.BOLD,20));
        add(labledob);

        dcdob = new JDateChooser();
        dcdob.setBounds(200,180,220,30);
        add(dcdob);

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

        String courses[] = {"BCA","B.Com","B.Tech","B.E","BBA","MCA","M.Tech","M.E","MBA"};
        tledu = new JComboBox(courses);
        tledu.setBounds(700,300,220,30);
        tledu.setBackground(Color.white);
        tledu.setFont(new Font("Arial",Font.PLAIN,18));
        add(tledu);
        
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

        tlaadhar = new JTextField();
        tlaadhar.setBounds(700,360,220,30);
        tlaadhar.setFont(new Font("Arial",Font.PLAIN,18));
        add(tlaadhar);

        JLabel lablelempID = new JLabel("Employee ID");
        lablelempID.setBounds(50,420,150,30);
        lablelempID.setFont(new Font("serif",Font.BOLD,20));
        add(lablelempID);

        lablelID = new JLabel(""+number);  //JLabel not accept number argg
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
        if(ae.getSource()==add){
            String name = tname.getText();
            String sname = tlname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tlsal.getText();
            String city = tcity.getText();
            String phone = tlphone.getText();
            String email = temail.getText();
            String education = (String)tledu.getSelectedItem();
            String designation = tdes.getText();
            String aadhar = tlaadhar.getText();
            String employeeID = lablelID.getText();

            try{
                Conn conn = new Conn();
                String query = "insert into employee values ('"+name+"','"+sname+"','"+dob+"','"+salary+"','"+city+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+employeeID+"')";

                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Added Successfully");
                new Home();


            }catch(Exception e){
                e.printStackTrace();
            }


        }else{
            setVisible(false);
            new Home();
        }

    }
    public static void main(String[] args) {
        new AddEmployee();
        
    }

}
