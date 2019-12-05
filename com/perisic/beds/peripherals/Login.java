package com.perisic.beds.peripherals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.perisic.beds.questionnaire.QuestionSet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.beans.PropertyChangeEvent;

public class Login extends JFrame {

	private QuestionSet questionnaire = new QuestionSet();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String userName;
	private String password;
	private int val = 0;
	private String errorMsg = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setUndecorated(true);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Images/PQ.png")));
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setFocusable(true);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 345, 469);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setBackground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setBackground(Color.RED);
			}
		});
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login.this.dispose();
			}
		});
		label_1.setIcon(new ImageIcon(Login.class.getResource("/Images/close.png")));
		label_1.setBounds(315, 2, 46, 25);
		panel.add(label_1);

		JLabel lblSignIn = new JLabel("Sign In");
		lblSignIn.setForeground(Color.WHITE);
		lblSignIn.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		lblSignIn.setBounds(130, 82, 91, 25);
		panel.add(lblSignIn);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/Images/user.png")));
		label.setBounds(133, 11, 64, 71);
		panel.add(label);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Images/topBar.png")));
		lblNewLabel.setBounds(0, -197, 438, 424);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(19, 239, 72, 25);
		panel.add(lblNewLabel_1);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(19, 301, 72, 25);
		panel.add(lblPassword);

		textField = new JTextField();
		textField.setBackground(SystemColor.menu);
		textField.setBounds(105, 228, 210, 34);
		textField.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JPasswordField();
		textField_1.setBackground(SystemColor.menu);
		textField_1.setColumns(10);
		textField_1.setBounds(105, 292, 210, 34);
		textField_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.add(textField_1);

		JLabel lblSignIn_2 = new JLabel("Sign In");
		lblSignIn_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblSignIn_2.setForeground(Color.WHITE);
		lblSignIn_2.setBounds(185, 384, 57, 25);
		panel.add(lblSignIn_2);

		JLabel label_2 = new JLabel("");
		label_2.setForeground(Color.RED);
		label_2.setBackground(Color.RED);
		label_2.setBounds(105, 273, 159, 14);
		panel.add(label_2);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(105, 337, 156, 14);
		panel.add(lblNewLabel_2);

		JLabel lblSignIn_1 = new JLabel("");
		lblSignIn_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

				userName = textField.getText();
				password = textField_1.getText();

				if (userName == null || userName.equals("") || password == null || password.equals("")) {
					if (userName == null || userName.isEmpty()) {
						errorMsg = "Please enter username";
						label_2.setText(errorMsg);
						label_2.setVisible(true);
					}
					if (password == null || password.isEmpty()) {
						errorMsg = "Please enter password";
						lblNewLabel_2.setText(errorMsg);
						lblNewLabel_2.setVisible(true);
					}
				} else
					try {

						boolean flag = questionnaire.getSurveyAccess(userName, password);
						System.out.println("LOGIN : " + flag);

						if (flag == true) {
							UserHome userHome = new UserHome();
							userHome.setUndecorated(true);
							userHome.setVisible(true);
							userHome.setLocationRelativeTo(null);
							Login.this.dispose();
						} else {
							System.out.println("\n\nrasika lakshan 123");
						}
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
//						e.printStackTrace();
						System.out.println("rasika lakshan");
						errorMsg = "The password or username that you've entered is incorrect.";
						lblNewLabel_2.setText(errorMsg);
						lblNewLabel_2.setVisible(true);
					}
			}
		});

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				label_2.setVisible(false);
			}
		});

		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				lblNewLabel_2.setVisible(false);
			}
		});

		lblSignIn_1.setForeground(Color.BLACK);
		lblSignIn_1.setIcon(new ImageIcon(Login.class.getResource("/Images/signinBtn.png")));
		lblSignIn_1.setBounds(130, 373, 166, 50);
		panel.add(lblSignIn_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(105, 263, 210, 2);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(105, 326, 210, 2);
		panel.add(separator_1);

	}
}
