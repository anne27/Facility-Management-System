import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class WelcomeScreen extends JFrame {

	JFrame mainFrame=new JFrame();
	private JPanel contentPane;
	
	public static void main(String[] args) {
		WelcomeScreen frame = new WelcomeScreen();
		frame.setVisible(true);
	}
	public WelcomeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Login.setBounds(176, 102, 89, 23);
		contentPane.add(Login);
		JButton OAuth = new JButton("Login via Google");
		OAuth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		OAuth.setBounds(149, 137, 145, 23);
		contentPane.add(OAuth);
	
		JButton Register = new JButton("Register");
		Register.setBounds(176, 171, 89, 23);
		contentPane.add(Register);
		
		JLabel mainLabel = new JLabel("Facility Management Services\n System");
		mainLabel.setFont(new Font("Serif", Font.BOLD, 30));
		mainLabel.setBounds(21, 11, 403, 86);
		contentPane.add(mainLabel);
	}
}
