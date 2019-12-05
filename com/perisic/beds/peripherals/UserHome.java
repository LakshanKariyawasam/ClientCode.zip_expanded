package com.perisic.beds.peripherals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.perisic.beds.questionnaire.QuestionSet;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UserHome extends JFrame {

	private QuestionSet questionnaire = new QuestionSet();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private int val = 0;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionSet questionnaire = new QuestionSet();
					String val = questionnaire.reportAnswers();
					
					
					System.out.println("quection set 001::::: " + val );
					
					
					
					
					
					UserHome frame = new UserHome();
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
	public UserHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserHome.class.getResource("/Images/PQ.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(232, 241, 248));

//		JPanel panel = new JPanel();
//		panel.setBackground(new Color(51, 59, 78));
//		panel.setBounds(0, 57, 216, 621);
//		contentPane.add(panel);

//		JMenuItem mntmNewMenuItem = new JMenuItem("Dashboard");
//		mntmNewMenuItem.setBounds(0, 0, 216, 59);
//		mntmNewMenuItem.setBackground(new Color(91, 98, 113));
//		mntmNewMenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
//		mntmNewMenuItem.setIconTextGap(10);
//		mntmNewMenuItem.setBorder(null);
//		mntmNewMenuItem.setIcon(new ImageIcon(UserHome.class.getResource("/Images/home.png")));
//		panel.setLayout(null);
//		mntmNewMenuItem.setForeground(Color.WHITE);
//		panel.add(mntmNewMenuItem);

//		JMenuItem mntmStudentQuiz = new JMenuItem("Quiz Portal");
//		mntmStudentQuiz.setBounds(0, 60, 216, 59);
//		mntmStudentQuiz.setBackground(new Color(51, 59, 78));
//		mntmStudentQuiz.setIcon(new ImageIcon(UserHome.class.getResource("/Images/quiz.png")));
//		mntmStudentQuiz.setIconTextGap(10);
//		mntmStudentQuiz.setForeground(Color.WHITE);
//		mntmStudentQuiz.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
//		mntmStudentQuiz.setBorder(null);
//		panel.add(mntmStudentQuiz);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 169));
		panel_1.setBounds(0, 0, 216, 57);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblPathQuiz = new JLabel("PATH QUIZ");
		lblPathQuiz.setBounds(27, 16, 148, 30);
		lblPathQuiz.setForeground(Color.WHITE);
		lblPathQuiz.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		panel_1.add(lblPathQuiz);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(215, 0, 852, 57);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblRasikaLaksan = new JLabel("");
		lblRasikaLaksan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login frame = new Login();
				frame.setUndecorated(true);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				UserHome.this.dispose();
			}
		});

		lblRasikaLaksan.setBounds(635, 1, 179, 59);
		lblRasikaLaksan.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRasikaLaksan.setIcon(new ImageIcon(UserHome.class.getResource("/Images/userImg.png")));
		panel_2.add(lblRasikaLaksan);

		JPanel panel_Quiz = new JPanel();
		panel_Quiz.setBackground(Color.WHITE);
		panel_Quiz.setBounds(12, 81, 1008, 570);
		contentPane.add(panel_Quiz);
		
		Panel panel_Quiz2 = new Panel();
		panel_Quiz2.setBackground(Color.WHITE);
		panel_Quiz2.setBounds(12, 81, 1008, 570);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(UserHome.class.getResource("/Images/top_bar_01.png")));
		label_1.setForeground(new Color(0, 191, 169));
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		panel_Quiz2.add(label_1);
		
		JLabel lblNewLabel_3 = new JLabel("This is your first form. Please fill it out with somthing awesome!");
		lblNewLabel_3.setForeground(new Color(51, 51, 51));
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(UserHome.class.getResource("/Images/six.png")));
		
		JLabel lblNewLabel_4 = new JLabel("When you have problems what you do ?");
		lblNewLabel_4.setForeground(new Color(51, 51, 51));
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		JRadioButton rdbtnAsk = new JRadioButton("Ask People");
		buttonGroup.add(rdbtnAsk);
		rdbtnAsk.setForeground(new Color(153, 153, 153));
		rdbtnAsk.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnAsk.setBackground(Color.WHITE);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Search for It");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setForeground(new Color(153, 153, 153));
		rdbtnNewRadioButton_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Reaserch");
		buttonGroup.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setForeground(new Color(153, 153, 153));
		rdbtnNewRadioButton_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		
		JLabel label_5 = new JLabel("");
		
		JButton btnPrv = new JButton("Prvious");

		
		GroupLayout gl_panel_Quiz2 = new GroupLayout(panel_Quiz2);
		gl_panel_Quiz2.setHorizontalGroup(
			gl_panel_Quiz2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Quiz2.createSequentialGroup()
					.addGroup(gl_panel_Quiz2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Quiz2.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_1))
						.addGroup(gl_panel_Quiz2.createSequentialGroup()
							.addGap(40)
							.addComponent(lblNewLabel_3))
						.addGroup(gl_panel_Quiz2.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_Quiz2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_Quiz2.createSequentialGroup()
									.addComponent(rdbtnAsk)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnNewRadioButton_3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnNewRadioButton_4))
								.addComponent(lblNewLabel_4)))
						.addGroup(gl_panel_Quiz2.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_5)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_Quiz2.createSequentialGroup()
					.addContainerGap(893, Short.MAX_VALUE)
					.addComponent(btnPrv)
					.addGap(21))
		);
		gl_panel_Quiz2.setVerticalGroup(
			gl_panel_Quiz2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Quiz2.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addGroup(gl_panel_Quiz2.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_3)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_Quiz2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnAsk)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_4))
					.addGap(18)
					.addComponent(label_5)
					.addPreferredGap(ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
					.addComponent(btnPrv)
					.addGap(28))
		);
		panel_Quiz2.setLayout(gl_panel_Quiz2);

		Canvas canvas = new Canvas();
		canvas.setForeground(Color.BLACK);
		canvas.setBackground(new Color(0, 191, 169));

		JLabel lblNewLabel = new JLabel("What is your age ?");
		lblNewLabel.setForeground(new Color(51, 51, 51));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(UserHome.class.getResource("/Images/one.png")));

		textField = new JTextField();
		textField.setBackground(new Color(222, 255, 249));
		textField.setBorder(new EmptyBorder(5, 5, 5, 5));
		textField.setColumns(10);

		JLabel lblAreYouWorking_1 = new JLabel("Are you working currently ?");
		lblAreYouWorking_1.setForeground(new Color(51, 51, 51));
		lblAreYouWorking_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(UserHome.class.getResource("/Images/two.png")));

		JLabel lblWhatIsYour = new JLabel("What is your Educational level ?");
		lblWhatIsYour.setForeground(new Color(51, 51, 51));
		lblWhatIsYour.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(UserHome.class.getResource("/Images/three.png")));

		JLabel lblAreYouWorking = new JLabel("How is your technology background ?");
		lblAreYouWorking.setForeground(new Color(51, 51, 51));
		lblAreYouWorking.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(UserHome.class.getResource("/Images/four.png")));

		JRadioButton rdbtnYes = new JRadioButton("Yes");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setForeground(new Color(153, 153, 153));
		rdbtnYes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnYes.setBackground(Color.WHITE);

		JRadioButton rdbtnNo = new JRadioButton("No");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setForeground(new Color(153, 153, 153));
		rdbtnNo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnNo.setBackground(Color.WHITE);

		JLabel Bar_01 = new JLabel("");
		Bar_01.setIcon(new ImageIcon(UserHome.class.getResource("/Images/top_bar_01.png")));
		Bar_01.setForeground(new Color(0, 191, 169));
		Bar_01.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));

		JLabel lblNewLabel_2 = new JLabel("This is your first form. Please fill it out with somthing awesome!");
		lblNewLabel_2.setForeground(new Color(51, 51, 51));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));

		JRadioButton rdbtnAl = new JRadioButton("A/L");
		buttonGroup.add(rdbtnAl);
		rdbtnAl.setForeground(new Color(153, 153, 153));
		rdbtnAl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnAl.setBackground(Color.WHITE);

		JRadioButton rdbtnOl = new JRadioButton("O/L");
		buttonGroup.add(rdbtnOl);
		rdbtnOl.setForeground(new Color(153, 153, 153));
		rdbtnOl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnOl.setBackground(Color.WHITE);

		JRadioButton rdbtnHnd = new JRadioButton("HND");
		buttonGroup.add(rdbtnHnd);
		rdbtnHnd.setForeground(new Color(153, 153, 153));
		rdbtnHnd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnHnd.setBackground(Color.WHITE);

		JRadioButton rdbtnDiploma = new JRadioButton("Diploma");
		buttonGroup.add(rdbtnDiploma);
		rdbtnDiploma.setForeground(new Color(153, 153, 153));
		rdbtnDiploma.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnDiploma.setBackground(Color.WHITE);

		JRadioButton rdbtnDegree = new JRadioButton("Digree");
		buttonGroup.add(rdbtnDegree);
		rdbtnDegree.setForeground(new Color(153, 153, 153));
		rdbtnDegree.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnDegree.setBackground(Color.WHITE);

		JLabel lblWhatKindOf = new JLabel("What kind of work you are involve in ?");
		lblWhatKindOf.setForeground(new Color(51, 51, 51));
		lblWhatKindOf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblWhatKindOf.setVisible(false);

		JRadioButton rdbtnSocial = new JRadioButton("Social");
		buttonGroup.add(rdbtnSocial);
		rdbtnSocial.setForeground(new Color(153, 153, 153));
		rdbtnSocial.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnSocial.setBackground(Color.WHITE);
		rdbtnSocial.setVisible(false);

		JRadioButton rdbtnFreelance = new JRadioButton("Freelance");
		buttonGroup.add(rdbtnFreelance);
		rdbtnFreelance.setForeground(new Color(153, 153, 153));
		rdbtnFreelance.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnFreelance.setBackground(Color.WHITE);
		rdbtnFreelance.setVisible(false);

		JRadioButton rdbtnSkip = new JRadioButton("Skip");
		buttonGroup.add(rdbtnSkip);
		rdbtnSkip.setForeground(new Color(153, 153, 153));
		rdbtnSkip.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnSkip.setBackground(Color.WHITE);
		rdbtnSkip.setVisible(false);

		JLabel lblWhatIsYour_1 = new JLabel("What is your current occupation?");
		lblWhatIsYour_1.setForeground(new Color(51, 51, 51));
		lblWhatIsYour_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblWhatIsYour_1.setVisible(false);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		textField_1.setBackground(new Color(222, 255, 249));
		textField_1.setVisible(false);

//		JScrollPane scrollPane = new JScrollPane(panel_Quiz, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//		scrollPane.setEnabled(true);
//		scrollPane.setBounds(236, 81, 784, 570);
//		scrollPane.getViewport().setBackground(Color.WHITE);
//		panel_Quiz.setAutoscrolls(true);
		
		JRadioButton rdbtnPoor = new JRadioButton("Poor");
		buttonGroup.add(rdbtnPoor);
		rdbtnPoor.setForeground(new Color(153, 153, 153));
		rdbtnPoor.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnPoor.setBackground(Color.WHITE);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Good");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(153, 153, 153));
		rdbtnNewRadioButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Very Good");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setForeground(new Color(153, 153, 153));
		rdbtnNewRadioButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Excelent");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setForeground(new Color(153, 153, 153));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(UserHome.class.getResource("/Images/five.png")));
		
		JLabel lblHowYouIntracting = new JLabel("How you intracting with people ?");
		lblHowYouIntracting.setForeground(new Color(51, 51, 51));
		lblHowYouIntracting.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		JRadioButton rdbtnPoor_1 = new JRadioButton("Poor");
		buttonGroup.add(rdbtnPoor_1);
		rdbtnPoor_1.setForeground(new Color(153, 153, 153));
		rdbtnPoor_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnPoor_1.setBackground(Color.WHITE);
		
		JRadioButton rdbtnGood = new JRadioButton("Good");
		buttonGroup.add(rdbtnGood);
		rdbtnGood.setForeground(new Color(153, 153, 153));
		rdbtnGood.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnGood.setBackground(Color.WHITE);
		
		JRadioButton rdbtnVeryGood = new JRadioButton("Very Good");
		buttonGroup.add(rdbtnVeryGood);
		rdbtnVeryGood.setForeground(new Color(153, 153, 153));
		rdbtnVeryGood.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnVeryGood.setBackground(Color.WHITE);
		
		JRadioButton rdbtnExcelent = new JRadioButton("Excelent");
		buttonGroup.add(rdbtnExcelent);
		rdbtnExcelent.setForeground(new Color(153, 153, 153));
		rdbtnExcelent.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		rdbtnExcelent.setBackground(Color.WHITE);
		
		JButton btnNext = new JButton("Next");
		GroupLayout gl_panel_Quiz = new GroupLayout(panel_Quiz);
		gl_panel_Quiz.setHorizontalGroup(
			gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
				.addComponent(Bar_01, GroupLayout.PREFERRED_SIZE, 1012, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(65)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(26)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(26)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblAreYouWorking_1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(rdbtnYes, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(rdbtnSocial, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(rdbtnFreelance, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnSkip, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(26)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblWhatIsYour, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(rdbtnOl, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(rdbtnAl, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(rdbtnDiploma, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(rdbtnHnd, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(rdbtnDegree, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(26)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAreYouWorking, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(rdbtnPoor)
					.addGap(2)
					.addComponent(rdbtnNewRadioButton)
					.addComponent(rdbtnNewRadioButton_1)
					.addGap(2)
					.addComponent(rdbtnNewRadioButton_2))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel_1)
					.addGap(14)
					.addComponent(lblHowYouIntracting, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(64)
					.addComponent(rdbtnPoor_1)
					.addGap(4)
					.addComponent(rdbtnGood)
					.addGap(4)
					.addComponent(rdbtnVeryGood)
					.addComponent(rdbtnExcelent)
					.addGap(510)
					.addComponent(btnNext))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(lblWhatKindOf, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(59)
					.addComponent(lblWhatIsYour_1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_Quiz.setVerticalGroup(
			gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Quiz.createSequentialGroup()
					.addGap(11)
					.addComponent(Bar_01, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_Quiz.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_Quiz.createSequentialGroup()
							.addGap(1)
							.addComponent(lblAreYouWorking_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnYes, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWhatKindOf, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnSocial, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnFreelance, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnSkip, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWhatIsYour_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_Quiz.createSequentialGroup()
							.addGap(1)
							.addComponent(lblWhatIsYour, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnOl, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnAl, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnDiploma, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnHnd, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_Quiz.createSequentialGroup()
							.addGap(2)
							.addComponent(rdbtnDegree, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_Quiz.createSequentialGroup()
							.addGap(1)
							.addComponent(lblAreYouWorking, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnPoor)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_2))
					.addGap(4)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblHowYouIntracting, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panel_Quiz.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnPoor_1)
						.addComponent(rdbtnGood)
						.addComponent(rdbtnVeryGood)
						.addComponent(rdbtnExcelent)
						.addGroup(gl_panel_Quiz.createSequentialGroup()
							.addGap(9)
							.addComponent(btnNext))))
		);
		panel_Quiz.setLayout(gl_panel_Quiz);
		panel_Quiz.add(lblNewLabel_2);
		panel_Quiz.add(label);
		panel_Quiz.add(lblNewLabel);
		panel_Quiz.add(textField);
		panel_Quiz.add(label_2);
		panel_Quiz.add(lblAreYouWorking_1);
		panel_Quiz.add(rdbtnYes);
		panel_Quiz.add(rdbtnNo);
		panel_Quiz.add(lblWhatKindOf);
		panel_Quiz.add(rdbtnSocial);
		panel_Quiz.add(rdbtnFreelance);
		panel_Quiz.add(rdbtnSkip);
		panel_Quiz.add(lblWhatIsYour_1);
		panel_Quiz.add(textField_1);
		panel_Quiz.add(label_4);
		panel_Quiz.add(lblWhatIsYour);
		panel_Quiz.add(rdbtnOl);
		panel_Quiz.add(rdbtnAl);
		panel_Quiz.add(rdbtnDiploma);
		panel_Quiz.add(rdbtnHnd);
		panel_Quiz.add(rdbtnDegree);
		panel_Quiz.add(label_6);
		panel_Quiz.add(lblAreYouWorking);
		panel_Quiz.add(rdbtnPoor);
		panel_Quiz.add(rdbtnNewRadioButton);
		panel_Quiz.add(rdbtnNewRadioButton_1);
		panel_Quiz.add(rdbtnNewRadioButton_2);
		panel_Quiz.add(lblNewLabel_1);
		panel_Quiz.add(lblHowYouIntracting);
		panel_Quiz.add(rdbtnPoor_1);
		panel_Quiz.add(rdbtnGood);
		panel_Quiz.add(rdbtnVeryGood);
		panel_Quiz.add(rdbtnExcelent);
		panel_Quiz.add(btnNext);
		panel_Quiz.add(Bar_01);
		panel_1.setBackground(new Color(0, 191, 169));

		rdbtnYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblWhatKindOf.setVisible(true);
				rdbtnSocial.setVisible(true);
				rdbtnFreelance.setVisible(true);
				rdbtnSkip.setVisible(true);
			}
		});

		rdbtnSkip.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblWhatIsYour_1.setVisible(true);
				textField_1.setVisible(true);
			}
		});

		rdbtnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWhatIsYour_1.setVisible(false);
				textField_1.setVisible(false);
				lblWhatKindOf.setVisible(false);
				rdbtnSocial.setVisible(false);
				rdbtnFreelance.setVisible(false);
				rdbtnSkip.setVisible(false);
			}
		});

		rdbtnFreelance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWhatIsYour_1.setVisible(false);
				textField_1.setVisible(false);
			}
		});

		rdbtnSocial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWhatIsYour_1.setVisible(false);
				textField_1.setVisible(false);
			}
		});
		
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				val = 2;
				panel_Quiz.setVisible(false);
				contentPane.add(panel_Quiz2);
				panel_Quiz2.setVisible(true);
			}
		});
		
		btnPrv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_Quiz2.setVisible(false);
				panel_Quiz.setVisible(true);
			}
		});
	}
}
