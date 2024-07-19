package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    JButton b1;
    About(){
        setBounds(400, 100, 600, 500);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70, 40, 400, 80);
        add(headerIcon);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(50, 180, 70, 70);
        add(icon);

        JLabel text = new JLabel("<html>Code for Interview<br>Youtube Channel Version 2021<br>2021 Code for Interview. All rights reserved<br><br>Notepad is a word processing program, <br>which allows changing of text in a computer file.<br>Notepad is a simple text editor for basic text-editing program<br> which enables computer users to create documents. </html>");
        text.setBounds(150, 100, 500, 200);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(text);

        b1 = new JButton("OK");
        b1.setBounds(150, 350, 120, 25);
        b1.addActionListener(this);
        add(b1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new About();
    }
}
