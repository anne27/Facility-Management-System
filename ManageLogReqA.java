import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ManageLogReqA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ManageLogReqA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManageLogisticsRequests = new JLabel("Manage Logistics Requests");
		lblManageLogisticsRequests.setBounds(143, 27, 168, 32);
		contentPane.add(lblManageLogisticsRequests);
		
		JLabel lblNewLabel = new JLabel("Enter logistics ID:");
		lblNewLabel.setBounds(81, 87, 84, 14);
		contentPane.add(lblNewLabel);
		
		JLabel labelErr = new JLabel("");
		labelErr.setBounds(140, 128, 192, 14);
		contentPane.add(labelErr);
		
		textField = new JTextField();
		textField.setBounds(243, 84, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setBounds(121, 166, 89, 23);
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals(""))
					labelErr.setText("Please enter a logistics ID.");
				else
				{
					InputStream in;
					try {
						in = new FileInputStream("leavefile.csv");
						StringBuilder sb=new StringBuilder();
						Scanner sc=new Scanner(in);
						while (sc.hasNextLine())
						{
							String x=sc.nextLine();
							String split1[] = x.split(",");
							if (split1[0].equals(textField.getText()))
								{
								continue;
								}
							else
								sb.append("\n"+x);
						}
						in.close();
						FileWriter fileWriter1 = new FileWriter("inventoryreq.csv",false);
			            fileWriter1.write(sb.toString());
			            fileWriter1.close();
					} catch (IOException ert) {
						// TODO Auto-generated catch block
						ert.printStackTrace();
					}
					dispose();
				}
				
			}
		});

		contentPane.add(btnAccept);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setBounds(220, 166, 89, 23);
		contentPane.add(btnReject);
		
	
	}

}
