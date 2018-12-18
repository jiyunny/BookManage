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
	JFrame frame = new JFrame("KENARI 로그인");
	JPanel jpanel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
	JButton button11 = new JButton("로그인");
	
	public void loginDisplay() {
		

        jpanel.setLayout(null);

        
        jpanel.setPreferredSize(new Dimension(600, 400));

//로그인 버튼 부분
        JButton button11 = new JButton("로그인");
///           JButton button12 = new JButton("로그인");
        
        button11.setBounds(200, 280, 200, 50);
///           button12.setLocation(600, 250);
///           button12.setSize(100, 30);
        
        jpanel.add(button11);
///           jpanel.add(button12);
        
        
        
        	//ID,PW부분

//        JLabel label0 = new JLabel();
        JLabel label1 = new JLabel("메일 또는 전화번호:");
        JLabel label2 = new JLabel("비밀번호:");
        JTextField jtf = new JTextField(10);
        JPasswordField jpf = new JPasswordField(10);
       
        
      //체크박스 부분           
        JCheckBox login1 = new JCheckBox("사용자 로그인");
        login1.setSelected(true);
        JCheckBox login2 = new JCheckBox("관리자 로그인");
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
		

		

//로그인 버튼 부분
		
///           JButton button12 = new JButton("로그인");

		
///           button12.setLocation(600, 250);
///           button12.setSize(100, 30);

		
///           jpanel.add(button12);

		






	}

}
