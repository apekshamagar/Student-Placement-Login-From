//program fro const the login from using awt
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Student_Placement_Login_From extends Frame implements ActionListener
{
    Label lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
    TextField tfusername,tfpassword;
    Button butLogin,butCancel;

    Student_Placement_Login_From ()
    {
        setSize(1200,700);
        setLayout(null);
        setTitle("Simple Login Form");
        setBackground(Color.pink);

        Font f1=new Font("Arial Black",Font.BOLD,34);
        Font f2=new Font("Arial",Font.BOLD,26);
        Font f3=new Font("Arial",Font.BOLD,20);

        lb1 = new Label("A Mini Project",Label.CENTER);
        lb2 = new Label("Students Campus Placement Information System",Label.CENTER);
        lb3 = new Label("Developed For The College",Label.CENTER);
        lb4 = new Label("Pravara Rural Engg College Loni, Rahata, A.Nagar 413736",Label.CENTER);
        lb5 = new Label("Login Form",Label.CENTER);
        lb6 = new Label("Enter Your User ID/Name and Password",Label.CENTER);

        lb7 = new Label("UserName");
        lb8 = new Label("Password");

        tfusername = new TextField();
        tfpassword = new TextField();
        tfpassword.setEchoChar('*');

        butLogin = new Button("Login");
        butCancel = new Button("Cancel");

        lb1.setFont(f2);
        lb2.setFont(f2);
        lb3.setFont(f1);
        lb4.setFont(f3);
        lb5.setFont(f1);
        lb6.setFont(f2);
        lb7.setFont(f3);
        lb8.setFont(f3);

        tfusername.setFont(f3);
        tfpassword.setFont(f3);
        butLogin.setFont(f3);
        butCancel.setFont(f3);

        butLogin.addActionListener(this);
        butCancel.addActionListener(this);

        add(lb1); add(lb2); add(lb3); add(lb4);
        add(lb5); add(lb6); add(lb7); add(lb8);
        add(tfusername); add(tfpassword);
        add(butLogin); add(butCancel);

        // Title Section
        lb1.setBounds(450,50,300,30);
        lb2.setBounds(200,90,800,35);
        lb3.setBounds(350,140,500,35);
        lb4.setBounds(200,180,800,30);

        // Login Title
        lb5.setBounds(450,260,300,40);
        lb6.setBounds(300,330,600,30);

        // Form Fields
        lb7.setBounds(420,400,120,30);
        lb8.setBounds(420,450,120,30);

        tfusername.setBounds(550,400,220,30);
        tfpassword.setBounds(550,450,220,30);

        // Buttons
        butLogin.setBounds(450,520,130,35);
        butCancel.setBounds(620,520,130,35);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==butLogin)
    {
        if((tfusername.getText().equals("ram") && tfpassword.getText().equals("ram123")) 
        || 
        (tfusername.getText().equals("sham") && tfpassword.getText().equals("sham123")))
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Invalid Login");
        }
    }

    if(ae.getSource()==butCancel)
    {
        dispose();
    }
}

    public static void main(String[] args)
    {
        Student_Placement_Login_From  obj = new Student_Placement_Login_From ();

        obj.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}