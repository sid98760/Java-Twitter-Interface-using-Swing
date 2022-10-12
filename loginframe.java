import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPassword;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;

	//Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginframe frame = new loginframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//Create the frame.
	
	public loginframe() {
		setTitle("Twitter Login ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 23));
		lblNewLabel.setBounds(574, 346, 119, 40);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setBounds(686, 348, 235, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 23));
		lblPassword.setBounds(574, 410, 119, 40);
		contentPane.add(lblPassword);
		
		JPasswordField textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(686, 409, 235, 29);
		contentPane.add(textField_1);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\login dp.png"));
		lblNewLabel_1.setBounds(58, 102, 445, 348);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textField.getText();
				String pass = String.valueOf(textField_1.getPassword());
				if(user.equals("narendramodi") && pass.equals("bjp"))
				{
					dispose();
					twitter Twitter = new twitter();
					Twitter.setVisible(true);
					
				}
				else
				{
					JOptionPane.showInternalMessageDialog(null, "Wrong Username OR Password. Please Try Again!!");
				}
				
				
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 21));
		btnNewButton.setBounds(644, 478, 107, 29);
		contentPane.add(btnNewButton);
		
	}
}
