import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
public class WelcomeScreen2 extends JFrame {
	WelcomeScreen2 frame;
	private JPanel contentPane;
	
	public static void main(String[] args) {
                	WelcomeScreen2 frame = new WelcomeScreen2();
            		frame.setVisible(true);
            		frame.start();
    }
	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login n=new Login();
				dispose();
			}
		});
		
		Login.setBounds(636, 102, 89, 23);
		contentPane.add(Login);
		
		JButton OAuth = new JButton("Login via Google");
		
		OAuth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		OAuth.setBounds(608, 137, 145, 23);
		contentPane.add(OAuth);
	
		JButton Register = new JButton("Register");
		Register.setBounds(636, 171, 89, 23);
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm nF = new RegistrationForm();
				nF.setVisible(true);
		         setVisible(false);
		         dispose();
			}
		});
		contentPane.add(Register);		
		JLabel mainLabel = new JLabel("Facility Management Services\n System");
		mainLabel.setFont(new Font("Sitka Display", Font.BOLD, 24));
		mainLabel.setBounds(479, 11, 403, 86);
		contentPane.add(mainLabel);
	}
}