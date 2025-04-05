package employee;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

    JTextField tfusername,tfpass;

    Login(){
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        JLabel username = new JLabel("Username :");
        username.setFont(new Font("Arial",Font.PLAIN,18));
        username.setBounds(60,40,100,30);
        username.setForeground(Color.WHITE);
        add(username);

        tfusername = new JTextField();
        tfusername.setBounds(200,40,300,30);
        tfusername.setFont(new Font("Arial",Font.PLAIN,16));
        add(tfusername);

        JLabel pass = new JLabel("Password :");
        pass.setFont(new Font("Arial",Font.PLAIN,18));
        pass.setBounds(60,100,100,30);
        pass.setForeground(Color.WHITE);
        add(pass);

        tfpass = new JTextField();
        tfpass.setBounds(200,100,300,30);
        tfpass.setFont(new Font("Arial",Font.PLAIN,16));
        add(tfpass);

        JButton login = new JButton("LOGIN");
        login.setBounds(250,180,100,40);
        login.setFont(new Font("serif",Font.PLAIN,20));
        login.setBackground(Color.lightGray);
        login.addActionListener(this);
        add(login);

        
        setSize(600,300);
        setLocation(360,170);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        try{
            String username = tfusername.getText();
            String password = tfpass.getText();
            Conn c = new Conn();

            String query = "select * from login where username = '"+username+"' and password ='"+password+"'";

            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                setVisible(false);
                setVisible(true);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    } 
    
    public static void main(String[] args) {
        new Login();
        
        
    }
}