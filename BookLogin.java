package com.Project;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BookLogin {
	JFrame frame = new JFrame("KENARI �α���");
	JPanel jpanel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
	JButton button11 = new JButton("�α���");
	
	public void loginDisplay() {
		

        jpanel.setLayout(null);

        
        jpanel.setPreferredSize(new Dimension(600, 400));

//�α��� ��ư �κ�
        JButton button11 = new JButton("�α���");
///           JButton button12 = new JButton("�α���");
        
        button11.setBounds(200, 280, 200, 50);
///           button12.setLocation(600, 250);
///           button12.setSize(100, 30);
        
        jpanel.add(button11);
///           jpanel.add(button12);
        
        
        
        	//ID,PW�κ�

//        JLabel label0 = new JLabel();
        JLabel label1 = new JLabel("���� �Ǵ� ��ȭ��ȣ:");
        JLabel label2 = new JLabel("��й�ȣ:");
        JTextField jtf = new JTextField(10);
        JPasswordField jpf = new JPasswordField(10);
       
        
      //üũ�ڽ� �κ�           
        JCheckBox login1 = new JCheckBox("����� �α���");
        login1.setSelected(true);
        JCheckBox login2 = new JCheckBox("������ �α���");
        login2.setSelected(true);
        
        
        frame.setSize(500,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(jpanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        

        
        

        

	}
	public static void main(String[] args) {
		
		BookLogin blogin  = new BookLogin();
		blogin.loginDisplay();
		

		

//�α��� ��ư �κ�
		
///           JButton button12 = new JButton("�α���");

		
///           button12.setLocation(600, 250);
///           button12.setSize(100, 30);

		
///           jpanel.add(button12);

		






	}

}
