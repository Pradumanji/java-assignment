/*4) Write a program in java for dress item purchasing and billing using checkbox in
swing. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public  class question4 extends JFrame implements ActionListener{
JCheckBox ch1,ch2,ch3,ch4,ch5;
JFrame jf;
JButton b1,b2;
JLabel l1,l2,l3,l4,l5;
question4()
{   jf=new JFrame("Men's suit collection");
    ch1=new JCheckBox("Suit 1 Price @1000");
    ch1.setBounds(150,50,200,100);
    ch2=new JCheckBox("Suit 2 Price @1500");
    ch2.setBounds(150,160,200,100);
    ch3=new JCheckBox("Suit 3 Price @1200");
    ch3.setBounds(150,270,200,100);
    ch4=new JCheckBox("Suit 4 Price @1300");
    ch4.setBounds(150,380,200,100);
    ch5=new JCheckBox("Suit 5 Price @1700");
    ch5.setBounds(150,490,200,100);

    l1=new JLabel();
    l1.setIcon(new ImageIcon("1.jpg"));
    l2=new JLabel();
    l2.setIcon(new ImageIcon("2.jpg"));
    l3=new JLabel();
    l3.setIcon(new ImageIcon("3.jpg"));
    l4=new JLabel();
    l4.setIcon(new ImageIcon("4.jpg"));
    l5=new JLabel();
    l5.setIcon(new ImageIcon("5.jpg"));
    l1.setBounds(50,50,100,100);
    l2.setBounds(50,160,100,100);
    l3.setBounds(50,270,100,100);
    l4.setBounds(50,380,100,100);
    l5.setBounds(50,490,100,100);


    b1=new JButton("Proceed to buy");
    b1.setBounds(400,200,150,50);
    b2=new JButton("clear");
    b2.setBounds(400,340,100,50);
    jf.add(ch1);
    jf.add(ch2);
    jf.add(ch3);
    jf.add(ch4);
    jf.add(ch5);
    jf.add(b1);
    jf.add(b2);
    jf.add(l1);
    jf.add(l2);
    jf.add(l3);
    jf.add(l4);
    jf.add(l5);
    jf.setSize(600,1000);

    b1.addActionListener(this);
    b2.addActionListener(this);
   jf.setLayout(null);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(EXIT_ON_CLOSE);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        if(str.equals("Proceed to buy"))
        {
           int amount=0;
           String s="";
           if(ch1.isSelected()){
               amount+=1000;
               s+="Suit 1=1000 rs\n";
           }
            if(ch2.isSelected()){
                amount+=1500;
                s+="Suit 2=1500 rs\n";
            }
            if(ch3.isSelected()){
                amount+=1200;
                s+="Suit 3=1200 rs\n";
            }
            if(ch4.isSelected()){
                amount+=1300;
                s+="Suit 4=1300 rs\n";
            }
            if(ch5.isSelected()){
                amount+=1700;
                s+="Suit 5=1700 rs\n";
            }

            s+="___________\n";
            JOptionPane.showMessageDialog(this,s+"Total: "+amount);

        }
        if(str.equals("clear"))
        {
            ch1.setSelected(false);
            ch2.setSelected(false);
            ch3.setSelected(false);
            ch4.setSelected(false);
            ch5.setSelected(false);

        }
    }
    public static void main(String[] args)
    {
        new question4();
    }
}
