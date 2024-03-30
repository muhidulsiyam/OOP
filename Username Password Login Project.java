  import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {
    JFrame f = new JFrame();
    JLabel userName = new JLabel();
    JTextField userNameInput = new JTextField();
    JLabel password = new JLabel();
    JTextField passwordInput = new JTextField();
    JButton login = new JButton();
    public void actionPerformed(ActionEvent e) {
        if (userNameInput.getText().equals("abc") && passwordInput.getText().equals("123")) {
            System.out.println("successful");
        } else System.out.println("try again");
    }

    public GUI() {
        userName.setBounds(50, 50, 100, 50);
        userNameInput.setBounds(200, 50, 100, 50);
        password.setBounds(50, 150, 100, 50);
        passwordInput.setBounds(200, 150, 100, 50);
        login.setBounds(100, 250, 100, 50);
        f.add(userName);
        f.add(userNameInput);
        f.add(passwordInput);
        f.add(password);
        f.add(login);
        userName.setText("username");
        password.setText("password");
        login.setText("login");
        login.addActionListener(this);

       //f.setLocation(300, 50);
       //f.setSize(600, 600);
        f.setBounds(300,50,600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}
