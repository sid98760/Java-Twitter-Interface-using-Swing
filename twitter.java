import java.awt.EventQueue;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class twitter extends JFrame {

	JPanel contentPane;
	private JTextField txtSearch;
	

	
	//Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					twitter frame = new twitter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 
	//Create the frame.
	
	public twitter() {
		setFont(new Font("Calibri", Font.BOLD, 18));
		setTitle("Twitter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1345, 829);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 296, 941);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Main Four columns
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(296, -27, 1285, 941);
		contentPane.add(tabbedPane);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		//Home Tab
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		panel_11.setBounds(24, 24, 915, 182);
		panel_1.add(panel_11);
		panel_11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_11.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(23, 49, 858, 75);
		scrollPane_1.getViewport().setBackground(Color.RED);
		scrollPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.add(scrollPane_1);
		
		
		JLabel lblNewLabel_14 = new JLabel();
		lblNewLabel_14.setText("0");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_14.setBounds(96, 138, 37, 34);
		panel_11.add(lblNewLabel_14);
		panel_11.setVisible(false);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked1.png"));
				lblNewLabel_14.setText("1");
			}
		});
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked2.png"));
		lblNewLabel_13.setBounds(47, 138, 50, 34);
		panel_11.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\comment.png"));
		lblNewLabel_15.setBounds(307, 138, 60, 34);
		panel_11.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\Retweet.png"));
		lblNewLabel_16.setBounds(559, 138, 65, 34);
		panel_11.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Likes");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_17.setFont(new Font("Calibri", Font.BOLD, 29));
		lblNewLabel_17.setBounds(127, 142, 65, 26);
		panel_11.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Comments");
		lblNewLabel_18.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_18.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_18.setBounds(377, 141, 138, 30);
		panel_11.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Retweet");
		lblNewLabel_19.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_19.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_19.setBounds(634, 140, 104, 26);
		panel_11.add(lblNewLabel_19);
		
		JLabel lblNewLabel_25 = new JLabel("Narendra Modi");
		lblNewLabel_25.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_25.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel_25.setBounds(49, 13, 182, 26);
		panel_11.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_26.setBounds(209, 5, 37, 39);
		panel_11.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\dp2.png"));
		lblNewLabel_27.setBounds(10, 5, 42, 37);
		panel_11.add(lblNewLabel_27);
		
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setBackground(new Color(255, 255, 255));
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(24, 216, 915, 184);
		panel_11_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel_11_1);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(23, 51, 858, 75);
		panel_11_1.add(scrollPane_1_1);
		

		
		JLabel lblNewLabel_14_1 = new JLabel();
		lblNewLabel_14_1.setText("0");
		lblNewLabel_14_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_14_1.setBounds(93, 134, 37, 34);
		panel_11_1.add(lblNewLabel_14_1);
		panel_11_1.setVisible(false);
		
		JLabel lblNewLabel_13_1 = new JLabel("");
		lblNewLabel_13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_13_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked1.png"));
				lblNewLabel_14_1.setText("1");
			}
		});
		lblNewLabel_13_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked2.png"));
		lblNewLabel_13_1.setBounds(44, 134, 50, 34);
		panel_11_1.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("");
		lblNewLabel_15_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\comment.png"));
		lblNewLabel_15_1.setBounds(309, 134, 60, 34);
		panel_11_1.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("");
		lblNewLabel_16_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\Retweet.png"));
		lblNewLabel_16_1.setBounds(558, 134, 65, 34);
		panel_11_1.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("Likes");
		lblNewLabel_17_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_17_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17_1.setFont(new Font("Calibri", Font.BOLD, 29));
		lblNewLabel_17_1.setBounds(128, 138, 65, 26);
		panel_11_1.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_18_1 = new JLabel("Comments");
		lblNewLabel_18_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_18_1.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_18_1.setBounds(373, 138, 138, 30);
		panel_11_1.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_19_1 = new JLabel("Retweet");
		lblNewLabel_19_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_19_1.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_19_1.setBounds(633, 138, 104, 26);
		panel_11_1.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_27_1 = new JLabel("");
		lblNewLabel_27_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\dp2.png"));
		lblNewLabel_27_1.setBounds(10, 10, 42, 37);
		panel_11_1.add(lblNewLabel_27_1);
		
		JLabel lblNewLabel_25_1 = new JLabel("Narendra Modi");
		lblNewLabel_25_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_25_1.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel_25_1.setBounds(47, 15, 182, 26);
		panel_11_1.add(lblNewLabel_25_1);
		
		JLabel lblNewLabel_26_1 = new JLabel("");
		lblNewLabel_26_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_26_1.setBounds(209, 6, 37, 39);
		panel_11_1.add(lblNewLabel_26_1);
		
		
		JPanel panel_11_2 = new JPanel();
		panel_11_2.setBackground(new Color(255, 255, 255));
		panel_11_2.setLayout(null);
		panel_11_2.setBounds(24, 410, 915, 184);
		panel_11_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel_11_2);
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		scrollPane_1_2.setBounds(25, 50, 858, 75);
		panel_11_2.add(scrollPane_1_2);
		

		
		JLabel lblNewLabel_14_1_1 = new JLabel();
		lblNewLabel_14_1_1.setText("0");
		lblNewLabel_14_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_14_1_1.setBounds(93, 135, 37, 34);
		panel_11_2.add(lblNewLabel_14_1_1);
		panel_11_2.setVisible(false);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("");
		lblNewLabel_13_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_13_1_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked1.png"));
				lblNewLabel_14_1_1.setText("1");
			}
		});
		lblNewLabel_13_1_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked2.png"));
		lblNewLabel_13_1_1.setBounds(46, 135, 50, 34);
		panel_11_2.add(lblNewLabel_13_1_1);
		
		JLabel lblNewLabel_15_2 = new JLabel("");
		lblNewLabel_15_2.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\comment.png"));
		lblNewLabel_15_2.setBounds(314, 135, 60, 34);
		panel_11_2.add(lblNewLabel_15_2);
		
		JLabel lblNewLabel_16_2 = new JLabel("");
		lblNewLabel_16_2.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\Retweet.png"));
		lblNewLabel_16_2.setBounds(562, 135, 65, 34);
		panel_11_2.add(lblNewLabel_16_2);
		
		JLabel lblNewLabel_17_2 = new JLabel("Likes");
		lblNewLabel_17_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_17_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17_2.setFont(new Font("Calibri", Font.BOLD, 29));
		lblNewLabel_17_2.setBounds(127, 139, 65, 26);
		panel_11_2.add(lblNewLabel_17_2);
		
		JLabel lblNewLabel_18_2 = new JLabel("Comments");
		lblNewLabel_18_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_18_2.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_18_2.setBounds(378, 139, 138, 30);
		panel_11_2.add(lblNewLabel_18_2);
		
		JLabel lblNewLabel_19_2 = new JLabel("Retweet");
		lblNewLabel_19_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_19_2.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_19_2.setBounds(637, 138, 104, 26);
		panel_11_2.add(lblNewLabel_19_2);
		
		JLabel lblNewLabel_27_1_1 = new JLabel("");
		lblNewLabel_27_1_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\dp2.png"));
		lblNewLabel_27_1_1.setBounds(10, 10, 42, 37);
		panel_11_2.add(lblNewLabel_27_1_1);
		
		JLabel lblNewLabel_25_1_1 = new JLabel("Narendra Modi");
		lblNewLabel_25_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_25_1_1.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel_25_1_1.setBounds(46, 14, 163, 26);
		panel_11_2.add(lblNewLabel_25_1_1);
		
		JLabel lblNewLabel_26_1_1 = new JLabel("");
		lblNewLabel_26_1_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_26_1_1.setBounds(208, 5, 37, 39);
		panel_11_2.add(lblNewLabel_26_1_1);
		

		
		JPanel panel_11_3 = new JPanel();
		panel_11_3.setBackground(new Color(255, 255, 255));
		panel_11_3.setLayout(null);
		panel_11_3.setBounds(24, 604, 915, 184);
		panel_11_3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.add(panel_11_3);
		
		JScrollPane scrollPane_1_3 = new JScrollPane();
		scrollPane_1_3.setBounds(21, 47, 858, 75);
		panel_11_3.add(scrollPane_1_3);
	
		
		JLabel lblNewLabel_14_1_2 = new JLabel();
		lblNewLabel_14_1_2.setText("0");
		lblNewLabel_14_1_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_14_1_2.setBounds(90, 136, 37, 34);
		panel_11_3.add(lblNewLabel_14_1_2);
		
		JLabel lblNewLabel_13_1_1_1 = new JLabel("");
		lblNewLabel_13_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_13_1_1_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked1.png"));
				lblNewLabel_14_1_2.setText("1");
			}
		});
		lblNewLabel_13_1_1_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\liked2.png"));
		lblNewLabel_13_1_1_1.setBounds(41, 136, 50, 34);
		panel_11_3.add(lblNewLabel_13_1_1_1);
		
		JLabel lblNewLabel_15_3 = new JLabel("");
		lblNewLabel_15_3.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\comment.png"));
		lblNewLabel_15_3.setBounds(319, 136, 60, 34);
		panel_11_3.add(lblNewLabel_15_3);
		
		JLabel lblNewLabel_16_3 = new JLabel("");
		lblNewLabel_16_3.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\Retweet.png"));
		lblNewLabel_16_3.setBounds(566, 136, 65, 34);
		panel_11_3.add(lblNewLabel_16_3);
		
		JLabel lblNewLabel_17_3 = new JLabel("Likes");
		lblNewLabel_17_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_17_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17_3.setFont(new Font("Calibri", Font.BOLD, 29));
		lblNewLabel_17_3.setBounds(129, 140, 65, 26);
		panel_11_3.add(lblNewLabel_17_3);
		
		JLabel lblNewLabel_18_3 = new JLabel("Comments");
		lblNewLabel_18_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_18_3.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_18_3.setBounds(383, 140, 138, 30);
		panel_11_3.add(lblNewLabel_18_3);
		
		JLabel lblNewLabel_19_3 = new JLabel("Retweet");
		lblNewLabel_19_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_19_3.setFont(new Font("Calibri", Font.BOLD, 28));
		lblNewLabel_19_3.setBounds(641, 138, 104, 26);
		panel_11_3.add(lblNewLabel_19_3);
		
		JLabel lblNewLabel_27_1_2 = new JLabel("");
		lblNewLabel_27_1_2.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\dp2.png"));
		lblNewLabel_27_1_2.setBounds(10, 8, 42, 37);
		panel_11_3.add(lblNewLabel_27_1_2);
		
		JLabel lblNewLabel_25_1_2 = new JLabel("Narendra Modi");
		lblNewLabel_25_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_25_1_2.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel_25_1_2.setBounds(52, 13, 182, 26);
		panel_11_3.add(lblNewLabel_25_1_2);
		
		JLabel lblNewLabel_26_1_2 = new JLabel("");
		lblNewLabel_26_1_2.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_26_1_2.setBounds(213, 3, 37, 39);
		panel_11_3.add(lblNewLabel_26_1_2);
		panel_11_3.setVisible(false);
		

		//DashBoard Buttons

		JButton btnNewButton = new JButton("Home");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(new Color(255, 255, 255));
				btnNewButton.setBackground(new Color(0, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setForeground(new Color(0, 0, 0));
			}
		});
		
		btnNewButton.setToolTipText("Home");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 26));
		btnNewButton.setBounds(117, 152, 99, 42);
		btnNewButton.setBorder(null);
		panel.add(btnNewButton);
		
		JButton btnExplore = new JButton("Explore");
		btnExplore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExplore.setForeground(new Color(255, 255, 255));
				btnExplore.setBackground(new Color(0, 0,0));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnExplore.setBackground(new Color(255, 255, 255));
				btnExplore.setForeground(new Color(0, 0, 0));
				
			}
		});
		btnExplore.setToolTipText("Explore the World");
		btnExplore.setHorizontalAlignment(SwingConstants.LEFT);
		btnExplore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnExplore.setBackground(new Color(255, 255, 255));
		btnExplore.setFont(new Font("Calibri", Font.BOLD, 26));
		btnExplore.setBounds(105, 231, 121, 42);
		btnExplore.setBorder(null);
		panel.add(btnExplore);
		
		JButton btnNewButton_1 = new JButton("Messages");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setForeground(new Color(255, 255, 255));
				btnNewButton_1.setBackground(new Color(0, 0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(255, 255, 255));
				btnNewButton_1.setForeground(new Color(0, 0, 0));
			}
		});
		btnNewButton_1.setToolTipText("See the Messages");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 26));
		btnNewButton_1.setBounds(103, 308, 113, 42);
		btnNewButton_1.setBorder(null);
		panel.add(btnNewButton_1);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnProfile.setForeground(new Color(255, 255, 255));
				btnProfile.setBackground(new Color(0, 0,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnProfile.setBackground(new Color(255, 255, 255));
				btnProfile.setForeground(new Color(0, 0, 0));
			}
		});
		btnProfile.setToolTipText("View your Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnProfile.setBackground(new Color(255, 255, 255));
		btnProfile.setFont(new Font("Calibri", Font.BOLD, 26));
		btnProfile.setBounds(94, 390, 99, 42);
		btnProfile.setBorder(null);
		panel.add(btnProfile);
		
		JLabel lblNewLabel = new JLabel("TWITTER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 26));
		lblNewLabel.setBounds(83, 41, 143, 56);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\icon3.png"));
		lblNewLabel_1.setBounds(35, 41, 60, 60);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setToolTipText("Home\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\home.png"));
		lblNewLabel_2.setBounds(62, 155, 45, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setToolTipText("Explore the World");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\explore.png"));
		lblNewLabel_3.setBounds(62, 231, 33, 34);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setToolTipText("See the Messages");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\messages.png"));
		lblNewLabel_3_1.setBounds(62, 314, 33, 26);
		panel.add(lblNewLabel_3_1);
		
		
		
		JLabel lblNewLabel_3_2 = new JLabel();
		lblNewLabel_3_2.setToolTipText("View your Profile");
		lblNewLabel_3_2.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\profile.png"));
		lblNewLabel_3_2.setBounds(62, 391, 33, 28);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\real AS.png"));
		lblNewLabel_20.setBounds(29, 91, 134, 120);
		panel_3.add(lblNewLabel_20);
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_28.setBounds(301, 127, 35, 32);
		panel_3.add(lblNewLabel_28);
			
		
		//Messages Tab
		
		
		JLabel lblNewLabel_8 = new JLabel("Messages");
		lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel_8.setBounds(31, 38, 167, 43);
		panel_3.add(lblNewLabel_8);
		
		
		JButton btnNewButton_2 = new JButton("Amit Shah");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton_2.setBounds(195, 81, 111, 130);
		btnNewButton_2.setBorder(null);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Eknath Shinde");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setToolTipText("");
		btnNewButton_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2_1.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(193, 253, 143, 81);
		panel_3.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Joe Biden");
		btnNewButton_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2_2.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton_2_2.setBorder(null);
		btnNewButton_2_2.setBackground(Color.WHITE);
		btnNewButton_2_2.setBounds(193, 406, 95, 81);
		panel_3.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Vladimir Putin");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2_3.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton_2_3.setBorder(null);
		btnNewButton_2_3.setBackground(Color.WHITE);
		btnNewButton_2_3.setBounds(193, 550, 143, 81);
		panel_3.add(btnNewButton_2_3);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\ES2.png"));
		lblNewLabel_21.setBounds(31, 236, 127, 120);
		panel_3.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\JB2.png"));
		lblNewLabel_22.setBounds(31, 388, 132, 113);
		panel_3.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\VP2.png"));
		lblNewLabel_23.setBounds(31, 536, 127, 113);
		panel_3.add(lblNewLabel_23);
		
		JLabel lblNewLabel_28_1 = new JLabel("");
		lblNewLabel_28_1.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_28_1.setBounds(338, 272, 35, 32);
		panel_3.add(lblNewLabel_28_1);
		
		JLabel lblNewLabel_28_2 = new JLabel("");
		lblNewLabel_28_2.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_28_2.setBounds(292, 425, 35, 32);
		panel_3.add(lblNewLabel_28_2);
		
		JLabel lblNewLabel_28_3 = new JLabel("");
		lblNewLabel_28_3.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_28_3.setBounds(341, 570, 35, 32);
		panel_3.add(lblNewLabel_28_3);
		
		
		JLabel lblNewLabel_10 = new JLabel("Explore");
		lblNewLabel_10.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_10.setFont(new Font("Calibri", Font.BOLD, 32));
		lblNewLabel_10.setBounds(41, 110, 167, 39);
		panel_2.add(lblNewLabel_10);
		
		//Explore Tab
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 35, 1126, 52);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		
		//Search Field
		txtSearch = new JTextField();
		txtSearch.setBounds(84, 10, 799, 32);
		panel_6.add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\Search_Icon4.png"));
		lblNewLabel_11.setBounds(24, 10, 35, 32);
		panel_6.add(lblNewLabel_11);
		
		JButton btnNewButton_6 = new JButton("Search");
		btnNewButton_6.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_6.setFont(new Font("Calibri", Font.BOLD, 18));
		btnNewButton_6.setBounds(909, 12, 85, 27);
		panel_6.add(btnNewButton_6);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(-11, -35, 1034, 697);
		panel_6.add(scrollPane);
		
		
		//Hastag Sections
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 146, 1126, 820);
		panel_2.add(tabbedPane_1);
		
		//Trending
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(null);
		tabbedPane_1.addTab("Trending", null, panel_7, "Trending Today");
		tabbedPane_1.setEnabledAt(0, true);
		tabbedPane_1.setBackgroundAt(0, new Color(255, 255, 255));
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("#1 PM_Modi");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12.setBounds(24, 30, 1087, 64);
		panel_7.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("#2 SSRJustice");
		lblNewLabel_12_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_1.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_1.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_1.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_1.setBounds(24, 104, 1087, 64);
		panel_7.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("#3 HumanityisourReligion");
		lblNewLabel_12_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_2.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_2.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_2.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_2.setBounds(24, 178, 1087, 64);
		panel_7.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_12_3 = new JLabel("#4 Modi_worldwide_no1");
		lblNewLabel_12_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_3.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_3.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_3.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_3.setBounds(24, 252, 1087, 64);
		panel_7.add(lblNewLabel_12_3);
		
		JLabel lblNewLabel_12_4 = new JLabel("#5 BanGandhi");
		lblNewLabel_12_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_4.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_4.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_4.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_4.setBounds(24, 326, 1087, 64);
		panel_7.add(lblNewLabel_12_4);
		
		JLabel lblNewLabel_12_5 = new JLabel("#6 Chowkidaar_Chor_hai");
		lblNewLabel_12_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_5.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_5.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_5.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_5.setBounds(24, 400, 1087, 64);
		panel_7.add(lblNewLabel_12_5);
		
		JLabel lblNewLabel_12_6 = new JLabel("#7 We_Support_Nupur_Sharma");
		lblNewLabel_12_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_6.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_6.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_6.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_6.setBounds(24, 474, 1087, 64);
		panel_7.add(lblNewLabel_12_6);
		
		JLabel lblNewLabel_12_7 = new JLabel("#8 RSS");
		lblNewLabel_12_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_7.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_7.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_7.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_7.setBounds(24, 548, 1087, 64);
		panel_7.add(lblNewLabel_12_7);
		
		//Politics
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(null);
		panel_8.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Politics", null, panel_8, null);
		tabbedPane_1.setBackgroundAt(1, new Color(255, 255, 255));
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_12_8 = new JLabel("#1 PM_Modi_no1");
		lblNewLabel_12_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_8.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_8.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_8.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_8.setBounds(24, 35, 1087, 64);
		panel_8.add(lblNewLabel_12_8);
		
		JLabel lblNewLabel_12_9 = new JLabel(" #2 Gulam_Nabi_Azad");
		lblNewLabel_12_9.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_9.setBounds(24, 109, 1087, 64);
		panel_8.add(lblNewLabel_12_9);
		
		JLabel lblNewLabel_12_10 = new JLabel("#3 Imran_Khan_ki _Sarkar_gir_Gayi");
		lblNewLabel_12_10.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_10.setBounds(24, 183, 1087, 64);
		panel_8.add(lblNewLabel_12_10);
		
		JLabel lblNewLabel_12_11 = new JLabel("#4 Yogi_Against_Mafias");
		lblNewLabel_12_11.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_11.setBounds(24, 257, 1087, 64);
		panel_8.add(lblNewLabel_12_11);
		
		JLabel lblNewLabel_12_12 = new JLabel("#5 Congress");
		lblNewLabel_12_12.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_12.setBounds(24, 331, 1087, 64);
		panel_8.add(lblNewLabel_12_12);
		
		JLabel lblNewLabel_12_13 = new JLabel("#6 Kejrival");
		lblNewLabel_12_13.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_13.setBounds(24, 405, 1087, 64);
		panel_8.add(lblNewLabel_12_13);
		
		JLabel lblNewLabel_12_14 = new JLabel("#7 Eknath_Shinde_CM");
		lblNewLabel_12_14.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_14.setBounds(24, 479, 1087, 64);
		panel_8.add(lblNewLabel_12_14);
		
		JLabel lblNewLabel_12_15 = new JLabel("#8 Papu");
		lblNewLabel_12_15.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_15.setBounds(24, 553, 1087, 64);
		panel_8.add(lblNewLabel_12_15);
		
		//Sports
		Panel panel_9 = new Panel();
		panel_9.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Sports", null, panel_9, null);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_12_16 = new JLabel("#1 Modi_Wants_World_Cup");
		lblNewLabel_12_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_16.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_16.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_16.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_16.setBounds(24, 24, 1087, 64);
		panel_9.add(lblNewLabel_12_16);
		
		JLabel lblNewLabel_12_17 = new JLabel("#2 AsiaCup");
		lblNewLabel_12_17.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_17.setBounds(24, 98, 1087, 64);
		panel_9.add(lblNewLabel_12_17);
		
		JLabel lblNewLabel_12_18 = new JLabel("#3 Virat_ki_Form_Ko_Dhundho");
		lblNewLabel_12_18.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_18.setBounds(24, 172, 1087, 64);
		panel_9.add(lblNewLabel_12_18);
		
		JLabel lblNewLabel_12_19 = new JLabel("#4 CommonWealthGames");
		lblNewLabel_12_19.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_19.setBounds(24, 246, 1087, 64);
		panel_9.add(lblNewLabel_12_19);
		
		JLabel lblNewLabel_12_20 = new JLabel("#5 GoldinCommonWealth");
		lblNewLabel_12_20.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_20.setBounds(24, 320, 1087, 64);
		panel_9.add(lblNewLabel_12_20);
		
		JLabel lblNewLabel_12_21 = new JLabel("#6 IndVSPak");
		lblNewLabel_12_21.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_21.setBounds(24, 394, 1087, 64);
		panel_9.add(lblNewLabel_12_21);
		
		JLabel lblNewLabel_12_22 = new JLabel("#7 T20Worldcup");
		lblNewLabel_12_22.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_22.setBounds(24, 468, 1087, 64);
		panel_9.add(lblNewLabel_12_22);
		
		JLabel lblNewLabel_12_23 = new JLabel("#8 ModijisecricketKhelvao");
		lblNewLabel_12_23.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_23.setBounds(24, 539, 1087, 64);
		panel_9.add(lblNewLabel_12_23);
		
		//Music
		Panel panel_10 = new Panel();
		panel_10.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Music", null, panel_10, null);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_12_24 = new JLabel("#1 MusicisTherapy");
		lblNewLabel_12_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_12_24.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_12_24.setForeground(Color.BLACK);
			}
		});
		lblNewLabel_12_24.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_24.setBounds(24, 20, 1087, 64);
		panel_10.add(lblNewLabel_12_24);
		
		JLabel lblNewLabel_12_25 = new JLabel("#2 BanKakkars");
		lblNewLabel_12_25.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_25.setBounds(24, 94, 1087, 64);
		panel_10.add(lblNewLabel_12_25);
		
		JLabel lblNewLabel_12_26 = new JLabel("#3 HollywoodMusic");
		lblNewLabel_12_26.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_26.setBounds(24, 168, 1087, 64);
		panel_10.add(lblNewLabel_12_26);
		
		JLabel lblNewLabel_12_27 = new JLabel("#4 Spotifykeadsbandkaro");
		lblNewLabel_12_27.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_27.setBounds(24, 242, 1087, 64);
		panel_10.add(lblNewLabel_12_27);
		
		JLabel lblNewLabel_12_28 = new JLabel("#5 OldIsGold");
		lblNewLabel_12_28.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_28.setBounds(24, 316, 1087, 64);
		panel_10.add(lblNewLabel_12_28);
		
		JLabel lblNewLabel_12_29 = new JLabel("#6 BollywoodMusic");
		lblNewLabel_12_29.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_29.setBounds(24, 390, 1087, 64);
		panel_10.add(lblNewLabel_12_29);
		
		JLabel lblNewLabel_12_30 = new JLabel("#7 BanBTS");
		lblNewLabel_12_30.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_30.setBounds(24, 464, 1087, 64);
		panel_10.add(lblNewLabel_12_30);
		
		JLabel lblNewLabel_12_31 = new JLabel("#8 WeloveSelenaGomez\r\n");
		lblNewLabel_12_31.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_12_31.setBounds(24, 538, 1087, 64);
		panel_10.add(lblNewLabel_12_31);
		
		
		// Profile Tab Elements
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\finaldp.png"));
		lblNewLabel_5.setBounds(48, 207, 243, 177);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\backdp4.png"));
		lblNewLabel_4.setBounds(10, 10, 1158, 271);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Narendra Modi");
		lblNewLabel_6.setFont(new Font("Candara", Font.BOLD, 22));
		lblNewLabel_6.setBounds(89, 394, 147, 32);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("@narendramodi");
		lblNewLabel_7.setFont(new Font("Gadugi", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(89, 416, 646, 27);
		panel_4.add(lblNewLabel_7);

		Object border = BorderFactory.createLineBorder(Color.BLACK,2);
		
		JTextArea txtrNarendraDamodardasModi = new JTextArea();
		txtrNarendraDamodardasModi.setFont(new Font("Leelawadee UI", Font.PLAIN, 16));
		txtrNarendraDamodardasModi.setText("Narendra Damodardas Modi\r\nPrime Minister of India\r\nBorn September 17\r\nJoined January 2009");
		txtrNarendraDamodardasModi.setBounds(89, 460, 646, 126);
		panel_4.add(txtrNarendraDamodardasModi);
		
		JButton btnNewButton_3 = new JButton("81.9M  Followers");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 16));
			}
		});
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3.setBounds(99, 596, 169, 40);
		btnNewButton_3.setBorder(null);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("2,446 Following");
		btnNewButton_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3_1.setFont(new Font("Arial", Font.PLAIN, 16));
			}
		});
		btnNewButton_3_1.setBackground(new Color(255, 255, 255));
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_1.setBounds(293, 596, 169, 40);
		btnNewButton_3_1.setBorder(null);
		panel_4.add(btnNewButton_3_1);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(220, 220, 220));
		panel_5.setBounds(10, 671, 1158, 107);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(121, 10, 778, 72);
		panel_5.add(scrollPane_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		scrollPane_2.setViewportView(textArea_1);
		textArea_1.setBorder((Border) border);
		
		JLabel lblNewLabel_9 = new JLabel("Tweet Here");
		lblNewLabel_9.setBackground(new Color(211, 211, 211));
		lblNewLabel_9.setBounds(10, 10, 113, 40);
		panel_5.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JButton btnNewButton_5 = new JButton("TWEET");
		btnNewButton_5.addActionListener(new ActionListener() {
			static int i=0;
			public void actionPerformed(ActionEvent e) {
				
				if (i ==0) {
					panel_11.setVisible(true);
					//Setting the text of tweet
					JTextArea textArea_2 = new JTextArea();
					textArea_2.setBorder(new LineBorder(new Color(0, 0, 0)));
					String tweet = textArea_1.getText();
					scrollPane_1.setViewportView(textArea_2);
					textArea_2.setText(tweet);
					i++;
				}
				else if (i==1) {
					panel_11_1.setVisible(true);
					JTextArea textArea_2_1 = new JTextArea();
					textArea_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
					String tweet2 = textArea_1.getText();
					scrollPane_1_1.setViewportView(textArea_2_1);
					textArea_2_1.setText(tweet2);
					i++;
				}
				else if(i==2) {
					panel_11_2.setVisible(true);
					JTextArea textArea_2_2 = new JTextArea();
					textArea_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
					String tweet3 = textArea_1.getText();
					scrollPane_1_2.setViewportView(textArea_2_2);
					textArea_2_2.setText(tweet3);
					i++;
				}
				else if(i==3) {
					panel_11_3.setVisible(true);
					JTextArea textArea_2_3 = new JTextArea();
					textArea_2_3.setBorder(new LineBorder(new Color(0, 0, 0)));
					String tweet4 = textArea_1.getText();
					scrollPane_1_3.setViewportView(textArea_2_3);
					textArea_2_3.setText(tweet4);
					i++;
				}
				else if (i>3) {
					i=0;
					panel_11.setVisible(false);
					panel_11_1.setVisible(false);
					panel_11_2.setVisible(false);
					panel_11_3.setVisible(false);
				}
				else {
					i=0;
				}
			}
		});
		btnNewButton_5.setBackground(new Color(0, 191, 255));
		btnNewButton_5.setFont(new Font("Calibri", Font.BOLD, 14));
		btnNewButton_5.setBounds(921, 22, 85, 46);
		panel_5.add(btnNewButton_5);
			
		
		JButton btnNewButton_4 = new JButton("Messages");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_4.setBounds(889, 309, 112, 42);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_4.setBounds(889, 309, 102, 32);
			}
		});
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_4.setBackground(new Color(0, 191, 255));
		btnNewButton_4.setBounds(889, 309, 102, 32);
		btnNewButton_4.setBorder(null);
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Edit Profile");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_4_1.setBounds(711, 309, 132, 42);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_4_1.setBounds(711, 309, 122, 32);
			}
		});
		btnNewButton_4_1.setForeground(new Color(255, 255, 255));
		btnNewButton_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_4_1.setBackground(new Color(0, 191, 255));
		btnNewButton_4_1.setBounds(711, 309, 122, 32);
		btnNewButton_4_1.setBorder(null);
		panel_4.add(btnNewButton_4_1);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon("C:\\Users\\Siddhesh Chinchole\\eclipse-workspace\\internal project\\images\\bluetick.png"));
		lblNewLabel_24.setBounds(250, 388, 35, 32);
		panel_4.add(lblNewLabel_24);
		
		//Edit Profile Tab
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel_12, null);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_29 = new JLabel("Edit Profile");
		lblNewLabel_29.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_29.setBounds(10, 10, 186, 74);
		panel_12.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Edit Bio:");
		lblNewLabel_30.setFont(new Font("Clarendon BT", Font.BOLD, 24));
		lblNewLabel_30.setBounds(25, 446, 155, 36);
		panel_12.add(lblNewLabel_30);
		
		JLabel lblNewLabel_30_1 = new JLabel("Edit Username:");
		lblNewLabel_30_1.setFont(new Font("Clarendon BT", Font.BOLD, 24));
		lblNewLabel_30_1.setBounds(25, 307, 209, 36);
		panel_12.add(lblNewLabel_30_1);
		
		JLabel lblNewLabel_30_1_1 = new JLabel("Edit Name:");
		lblNewLabel_30_1_1.setFont(new Font("Clarendon BT", Font.BOLD, 24));
		lblNewLabel_30_1_1.setBounds(27, 154, 209, 36);
		panel_12.add(lblNewLabel_30_1_1);
		
		String act_name = lblNewLabel_6.getText();
		String act_username = lblNewLabel_7.getText();
		String act_bio = txtrNarendraDamodardasModi.getText();
		
		Panel panel_13 = new Panel();
		panel_13.setBackground(new Color(51, 51, 51));
		panel_13.setBounds(37, 196, 455, 56);
		panel_12.add(panel_13);
		panel_13.setLayout(null);
		
		TextField textField_1 = new TextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		textField_1.setText(act_name);
		textField_1.setBounds(10, 10, 432, 36);
		panel_13.add(textField_1);
		
		Panel panel_13_2 = new Panel();
		panel_13_2.setLayout(null);
		panel_13_2.setBackground(new Color(51, 51, 51));
		panel_13_2.setBounds(37, 494, 473, 212);
		panel_12.add(panel_13_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(20, 22, 432, 167);
		panel_13_2.add(scrollPane_3);
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		TextArea textArea = new TextArea();
		textArea.setText(act_bio);
		scrollPane_3.setViewportView(textArea);
		
		Panel panel_13_3 = new Panel();
		panel_13_3.setLayout(null);
		panel_13_3.setBackground(new Color(0, 0, 0));
		panel_13_3.setBounds(35, 349, 455, 56);
		panel_12.add(panel_13_3);
		
		TextField textField_1_2 = new TextField();
		textField_1_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		textField_1_2.setText(act_username);
		textField_1_2.setBounds(10, 10, 432, 36);
		panel_13_3.add(textField_1_2);
		
		JButton btnNewButton_7 = new JButton("Save and exit");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_1.getText();
				String username = textField_1_2.getText();
				String bio1 = textArea.getText();
				
				txtrNarendraDamodardasModi.setText(bio1);
				lblNewLabel_6.setText(name);
				lblNewLabel_7.setText(username);
					
				tabbedPane.setSelectedIndex(3);
				
	
			}
		});
		btnNewButton_7.setBackground(new Color(153, 255, 255));
		btnNewButton_7.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_7.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton_7.setBounds(212, 728, 180, 36);
		panel_12.add(btnNewButton_7);
		

		
	}
}
