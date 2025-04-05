package employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener{

    JButton add,view,update,remove;

    Home(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/Home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);

        JLabel heading = new JLabel("EMPLOYEE  MANAGEMENT  SYSTEM");
        heading.setBounds(560, 20, 500, 40);
        heading.setFont(new Font("serif",Font.BOLD,26));
        image.add(heading);

        add = new JButton("Add Employee");
        add.setBounds(600, 80, 180, 40);
        add.setFont(new Font("serif",Font.PLAIN,20));
        add.setBackground(Color.darkGray);
        add.setForeground(Color.white);
        add.addActionListener(this);
        image.add(add);

        view = new JButton("View Employee");
        view.setBounds(830, 80, 180, 40);
        view.setFont(new Font("serif",Font.PLAIN,20));
        view.setBackground(Color.darkGray);
        view.setForeground(Color.white);
        view.addActionListener(this);
        image.add(view);

        update = new JButton("Update Date");
        update.setBounds(600, 150, 180, 40);
        update.setFont(new Font("serif",Font.PLAIN,20));
        update.setBackground(Color.darkGray);
        update.setForeground(Color.white);
        update.addActionListener(this);
        // image.add(update); //hide button

        remove = new JButton("Remove Data");
        remove.setBounds(830, 150, 180, 40);
        remove.setFont(new Font("serif",Font.PLAIN,20));
        remove.setBackground(Color.darkGray);
        remove.setForeground(Color.white);
        remove.addActionListener(this);
        image.add(remove);

        setSize(1120,630);
        setLocation(90,40);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add ){
            setVisible(false);
            new AddEmployee();
        }else if(ae.getSource() == view){
            setVisible(false);
            new ViewEmployee();
        }else if(ae.getSource() == remove){
            setVisible(false);
            new Delete();
        }else{
            
        }
    }
    public static void main(String[] args) {
        new Home();
    }


}
