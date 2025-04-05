package employee;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Intro extends JFrame implements ActionListener{

    Intro(){
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE  MANAGEMENT  SYSTEM");
        heading.setBounds(70,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,53));
        heading.setForeground(Color.white);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/Front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(910,497,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(55,100,950,420);
        add(image);
        
        JButton nextB = new JButton("Clik here to Continue");
        nextB.setBounds(410,550,230,50);
        nextB.setFont(new Font("serif",Font.PLAIN,20));
        nextB.setBackground(Color.lightGray);
        nextB.addActionListener(this);
        add(nextB);

        setSize(1100,650);
        setLocation(100,30);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Intro();
    }
}
