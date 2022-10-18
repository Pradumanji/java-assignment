/*3) Write a java program to create a button with the name of three countries and on
clicking a button it display the flag image of the respective country. */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment_10_question3 implements ActionListener {

    JLabel l4;
    JButton l1,l2,l3;

    JFrame jf;
    Assignment_10_question3() {
        jf = new JFrame("Flags");
        l1 = new JButton("INDIA");
        l1.setBounds(30,50,150,50);

        l2 = new JButton("CHINA");
        l2.setBounds(30,120,150,50);
        l4 = new JLabel();
        l4.setBounds(300,50,500,400);
        l3 = new JButton("RUSSIA");
        l3.setBounds(30,190,150,50);
        jf.add(l1);
        jf.add(l2);

        jf.add(l3);
        jf.add(l4);
        l1.addActionListener(this);
        l2.addActionListener(this);
        l3.addActionListener(this);
        jf.setSize(900, 900);
        jf.setLayout(null);
        jf.setVisible(true);
        //b1.addActionListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        String st=e.getActionCommand();
        if(st.equals("INDIA"))
        {
            ImageIcon img=new ImageIcon("india.jpg");
            l4.setIcon(img);
        }
        else  if(st.equals("CHINA"))
        {
            ImageIcon img=new ImageIcon("china.jpg");
            l4.setIcon(img);
        }

        else  if(st.equals("RUSSIA"))
        {
            ImageIcon img=new ImageIcon("russia.jpg");
            l4.setIcon(img);
        }
    }

    public static void main(String[] args)
    {
        new Assignment_10_question3();
    }
}



