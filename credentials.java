import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class credentials extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	
	//Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					credentials frame = new credentials();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Create the frame.
	
	public credentials() {
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 204));
		panel.setBounds(0, 0, 1608, 868);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCredentialsDetails = new JLabel("Credential Details");
		lblCredentialsDetails.setForeground(new Color(255, 69, 0));
		lblCredentialsDetails.setFont(new Font("Algerian", Font.BOLD, 30));
		lblCredentialsDetails.setBackground(Color.RED);
		lblCredentialsDetails.setBounds(362, 70, 342, 48);
		panel.add(lblCredentialsDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Department Name:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1.setBounds(283, 172, 183, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Course Name:");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(283, 238, 183, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Student ID:");
		lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(283, 313, 183, 32);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Username:");
		lblNewLabel_1_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(283, 383, 183, 32);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Password:");
		lblNewLabel_1_1_2_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBounds(283, 456, 183, 32);
		panel.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Confirm Password:");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_2_1_1.setBounds(283, 521, 183, 32);
		panel.add(lblNewLabel_1_1_2_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(476, 168, 336, 32);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(476, 234, 336, 32);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(476, 309, 336, 32);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(476, 379, 336, 32);
		panel.add(textField_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Calibri", Font.BOLD, 16));
		passwordField.setBounds(476, 450, 336, 32);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Calibri", Font.BOLD, 16));
		passwordField_1.setBounds(476, 517, 336, 32);
		panel.add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I Hereby Agree all the terms and conditions ");
		chckbxNewCheckBox.setBackground(new Color(102, 255, 204));
		chckbxNewCheckBox.setFont(new Font("Calibri", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(348, 574, 412, 36);
		panel.add(chckbxNewCheckBox);
	
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				contact Contact = new contact();
				Contact.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 102, 102));
		btnBack.setBounds(173, 622, 152, 32);
		panel.add(btnBack);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			String pass = String.valueOf(passwordField.getPassword());
			String pass1 = String.valueOf(passwordField_1.getPassword());
			
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					JOptionPane.showInternalMessageDialog(null,"    Your Information is submitted Sucessfully!!    ");
					dispose();
				}
				else {
					JOptionPane.showInternalMessageDialog(null,"     Please accept the Terms and Conditions!!   ");
				}
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSubmit.setBackground(new Color(255, 102, 102));
		btnSubmit.setBounds(833, 622, 152, 32);
		panel.add(btnSubmit);
	}	

}
