import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contact extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contact frame = new contact();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Create the frame.
	public contact() {
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 204));
		panel.setBounds(0, 0, 1607, 931);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblContactDetails = new JLabel("Contact Details");
		lblContactDetails.setForeground(new Color(255, 69, 0));
		lblContactDetails.setFont(new Font("Algerian", Font.BOLD, 30));
		lblContactDetails.setBackground(Color.RED);
		lblContactDetails.setBounds(529, 58, 292, 48);
		panel.add(lblContactDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Contact Number (Personal): ");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1.setBounds(353, 153, 256, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact Number (Home): ");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(353, 224, 244, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("E-Mail Address:");
		lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(353, 294, 244, 32);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Room no:");
		lblNewLabel_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(197, 431, 101, 32);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Building Name:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(197, 487, 134, 32);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Street Name:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_2.setBounds(197, 542, 134, 32);
		panel.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("City:");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_3.setBounds(777, 431, 81, 32);
		panel.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_4 = new JLabel("State:");
		lblNewLabel_1_1_1_1_4.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_4.setBounds(777, 487, 81, 32);
		panel.add(lblNewLabel_1_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_1_5 = new JLabel("Pin Code:");
		lblNewLabel_1_1_1_1_5.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_5.setBounds(777, 542, 81, 32);
		panel.add(lblNewLabel_1_1_1_1_5);
		
		JLabel lblResidentialDetails = new JLabel("Residential Details");
		lblResidentialDetails.setForeground(new Color(255, 69, 0));
		lblResidentialDetails.setFont(new Font("Algerian", Font.BOLD, 30));
		lblResidentialDetails.setBackground(Color.RED);
		lblResidentialDetails.setBounds(499, 358, 347, 48);
		panel.add(lblResidentialDetails);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(603, 150, 336, 32);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(603, 221, 336, 32);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(603, 292, 336, 32);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(355, 428, 336, 32);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(353, 484, 336, 32);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(353, 539, 336, 32);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(881, 428, 336, 32);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(881, 484, 336, 32);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(881, 539, 336, 32);
		panel.add(textField_8);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				credentials Credentials = new credentials();
				Credentials.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(255, 102, 102));
		btnNewButton.setBounds(937, 635, 152, 32);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				registration Registration = new registration();
				Registration.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 102, 102));
		btnBack.setBounds(398, 635, 152, 32);
		panel.add(btnBack);
	}
}
