import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
class Project extends JFrame {
    JLabel l1 = new JLabel("type the amount ");
    JLabel l4 = new JLabel("From ");
    JLabel l3 = new JLabel("To ");
    JLabel l5 = new JLabel("result ");
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);
    String[] s1 = { "USD", "INR", "JPY", "EUR", "AUD" };
    JComboBox<String> c1 = new JComboBox<>(s1);
    JComboBox<String> c2 = new JComboBox<>(s1);
    JButton b = new JButton("convert ");
    public Project() {
        JFrame f = new JFrame("currency converter ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        l1.setBounds(40, 20, 150, 20);
        t1.setBounds(80, 20, 150, 20);
        l3.setBounds(120, 200, 40, 20);
        c1.setBounds(160, 50, 80, 20);
        l4.setBounds(200, 50, 40, 20);
        c2.setBounds(240, 50, 80, 20);
        l5.setBounds(280, 80, 50, 20);
        t2.setBounds(320, 80, 80, 20);
        b.setBounds(360, 80, 100, 20);
        f.add(l1);
        f.add(t1);
        f.add(l4);
        f.add(c1);
        f.add(l3);
        f.add(c2);
        f.add(l5);
        f.add(t2);
        b.setBounds(200, 200, 300, 300);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertCurr();
            }
        });

    }
    public void convertCurr() {
        try{
            double amt, total;
            String toCurr, fromCurr;
            fromCurr = c1.getSelectedItem().toString();
            toCurr = c2.getSelectedItem().toString();
            amt = Double.parseDouble(t1.getText());
            fromCurr.toString();
                if(fromCurr.equals("USD"))
                {
                    if(toCurr.equals("INR")) {
                        total = amt * 83.48;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("EUR"))
                    {
                        total = amt * 0.92;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("JPY"))
                    {
                        total = amt * 157.83;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("AUD"))
                    {
                        total = amt *1.48 ;
                        t2.setText(String.valueOf(total));
                    }
                }
                else if(fromCurr.equals("INR"))
                {
                    if(toCurr.equals("USD"))
                    {
                        total = amt *0.012 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("EUR"))
                    {
                        total = amt *0.011 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("AUD"))
                    {
                        total = amt * 0.018 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("JPY"))
                    {
                        total = amt *1.9 ;
                        t2.setText(String.valueOf(total));
                    }
                } 
                else if(fromCurr.equals("JPY"))
                {
                    if(toCurr.equals("USD"))
                    {
                        total = amt *0.0063 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("INR"))
                    {
                        total = amt *0.53 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("EUR"))
                    {
                        total = amt *0.0058 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("AUD"))
                    {
                        total = amt *0.0094 ;
                        t2.setText(String.valueOf(total));
                    }
                }
                else if(fromCurr.equals("AUD"))
                {
                    if(toCurr.equals("INR"))
                    {
                        total = amt *56.52;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("USD"))
                    {
                        total = amt *0.68 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("EUR"))
                    {
                        total = amt *0.62;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("JPY"))
                    {
                        total = amt *107.21 ;
                        t2.setText(String.valueOf(total));
                    }
                }
                else if(fromCurr.equals("EUR"))
                {
                    if(toCurr.equals("JPY"))
                    {
                        total = amt *172.39 ;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("INR"))
                    {
                        total = amt * 91.21;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("AUD"))
                    {
                        total = amt * 1.61;
                        t2.setText(String.valueOf(total));
                    }
                    else if(toCurr.equals("USD"))
                    {
                        total = amt *1.09 ;
                        t2.setText(String.valueOf(total));
                    }
                }
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
       
    }
    public static void main(String args[])
    {
        new Project();
    }
}
