import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	//Create the frame.
	public registration() {
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 204));
		panel.setBounds(0, 0, 1575, 812);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personal Details");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setBounds(503, 110, 307, 48);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name: ");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1.setBounds(368, 191, 112, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name: ");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(368, 328, 112, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Middle Name: ");
		lblNewLabel_1_4.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(368, 261, 128, 32);
		panel.add(lblNewLabel_1_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(544, 262, 336, 32);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Class:");
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(368, 397, 71, 32);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender:");
		lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(368, 477, 88, 32);
		panel.add(lblNewLabel_1_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.BOLD, 18));
		rdbtnNewRadioButton.setBackground(new Color(102, 255, 204));
		rdbtnNewRadioButton.setBounds(559, 480, 79, 26);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Calibri", Font.BOLD, 18));
		rdbtnFemale.setBackground(new Color(102, 255, 204));
		rdbtnFemale.setBounds(676, 480, 104, 26);
		panel.add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Calibri", Font.BOLD, 18));
		rdbtnOther.setBackground(new Color(102, 255, 204));
		rdbtnOther.setBounds(801, 480, 79, 26);
		panel.add(rdbtnOther);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnFemale);
		bg.add(rdbtnOther);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 16));
		textField.setBounds(544, 190, 336, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Date of Birth:");
		lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(368, 550, 128, 32);
		panel.add(lblNewLabel_1_1_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		dateChooser.setBounds(530, 545, 350, 37);
		panel.add(dateChooser);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(544, 329, 336, 32);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(544, 395, 336, 32);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				contact Contact = new contact();
				Contact.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 102, 102));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(575, 637, 152, 32);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Student Registration Form");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Microsoft Himalaya", Font.BOLD, 60));
		lblNewLabel_2.setBounds(345, 48, 661, 65);
		panel.add(lblNewLabel_2);
		

	}
}
