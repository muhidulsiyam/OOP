import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    class NAME implements ActionListener {
        JFrame jFrame = new JFrame();
        JTextField ip1 = new JTextField();
        JTextField ip2= new JTextField();
        JButton add = new JButton();
        JButton sub = new JButton();
        JTextField op = new JTextField();

        public void actionPerformed(ActionEvent e){

            int n1= Integer.parseInt(ip1.getText());
            int n2= Integer.parseInt(ip2.getText());

            if (e.getSource() == add) {
                op.setText(""+ (n1+n2)); //othoba use Integer.toString(number) for conv from int to string
            }
            else if (e.getSource() == sub) {
                op.setText(""+ (n1-n2));
            }
            else {
                System.out.println("try again");
            }

        }

        public NAME(){
            jFrame.setLocation(300, 100);
            jFrame.setSize(600, 600);
            jFrame.setLayout(null);
            jFrame.setVisible(true);

            jFrame.add(ip1);
            jFrame.add(ip2);
            jFrame.add(add);
            jFrame.add(sub);
            jFrame.add(op);

            ip1.setBounds(100,50,100,50);
            ip2.setBounds(300,50,100,50);
            add.setBounds(100,100,50,30);
            sub.setBounds(300,100,50,30);
            op.setBounds(220,150,50,30);

            add.setText("+");
            sub.setText("-");

            add.addActionListener(this);
            sub.addActionListener(this);
            op.addActionListener(this);
        }

        public static void main(String[] args) {
            new NAME();
        }
    }

