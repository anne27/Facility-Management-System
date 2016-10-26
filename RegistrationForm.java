import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import java.util.*;

public class RegistrationForm extends JFrame {	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String department,type;
	private JLabel l2, l3, l4, l5, l6, l7, l8;
	private JTextField Name, Username, Address, DOB;
	private JButton Submit, Clear;
	private JPasswordField Password;
	private JLabel lblRegistration,lblNewLabel;

	public RegistrationForm() {
	this.setVisible(true);
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 l2 = new JLabel("Name:");
	        l3 = new JLabel("Username:");
	        l4 = new JLabel("Password:");
	        l5 = new JLabel("DOB:");
	        l6 = new JLabel("Address:");
	        l7 = new JLabel("Department:");
	        l8 = new JLabel("Type:"); 
	        Name = new JTextField();
	        Username = new JTextField();
	        Password = new JPasswordField();
	        DOB = new JTextField();
	        Address = new JTextField();	 
	        Submit = new JButton("Submit");
	        Submit.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					if (Name.getText().isEmpty()||Username.getText().isEmpty()||Address.getText().isEmpty())
						lblNewLabel.setText("All fields are required");
					else
						{
				        File myFile = new File("Registrations.csv");
				        try
				        {
				            FileWriter fileWriter = new FileWriter(myFile,true);
				            StringBuilder string1=new StringBuilder();
			                string1.append("\r\n"+Username.getText()+","+String.valueOf(Password.getPassword())+","+Name.getText()+","+DOB.getText()+","+Address.getText()+","+"department"+","+type);				            fileWriter.write(string1.toString());
				            System.out.println(string1);
				            fileWriter.close();
				            dispose();
				        }
				        catch(IOException ex){}
				    }
					
				}
				});
		   
	        Clear = new JButton("Clear");
	        Clear.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					RegistrationForm r=new RegistrationForm();
					dispose();
				}
				});
	        l2.setBounds(386, 70, 200, 30);
	        l3.setBounds(386, 111, 200, 30);
	        l4.setBounds(386, 152, 200, 30);
	        l5.setBounds(386, 193, 200, 30);
	        l6.setBounds(386, 234, 200, 30);
	        l7.setBounds(386, 272, 200, 30);
	        l8.setBounds(386, 313, 200, 30);
	        Name.setBounds(618, 70, 200, 30);
	        Username.setBounds(618, 111, 200, 30);
	        Password.setBounds(618, 152, 200, 30);
	        DOB.setBounds(618, 193, 200, 30);
	        Address.setBounds(618, 234, 200, 30);
	        Submit.setBounds(568, 417, 100, 30);
	        Clear.setBounds(678, 417, 100, 30);
	        getContentPane().add(l2);
	        getContentPane().add(Name);
	        getContentPane().add(l3);
	        getContentPane().add(Username);
	        getContentPane().add(l4);
	        getContentPane().add(Password);
	        getContentPane().add(l5);
	        getContentPane().add(DOB);
	        getContentPane().add(l6);
	        getContentPane().add(Address);
	        getContentPane().add(l7);
	        getContentPane().add(l8);
	        getContentPane().add(Submit);
	        getContentPane().add(Clear);
	        
	        /*DefaultListModel listModel = new DefaultListModel<String>();
	        listModel.addElement("Electricity");
	        listModel.addElement("HVAC");
	        listModel.addElement("Audio/Video");
	        listModel.addElement("Security");
	        listModel.addElement("Housekeeping");

	        list = new JList(listModel);
	        list.setBounds(363, 295, 77, -17);
	        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
	        list.setVisibleRowCount(6);
	        list.setFixedCellHeight(15);
	        list.setFixedCellWidth(100);
	        list.setVisible(true);
	        getContentPane().add(list);*/
	        
	       /* DefaultListModel<String> listModel = new DefaultListModel<>();
	        listModel.addElement("USA");
	        listModel.addElement("India");
	        listModel.addElement("Vietnam");
	        listModel.addElement("Canada");
	        listModel.addElement("Denmark");
	        listModel.addElement("France");
	        listModel.addElement("Great Britain");
	        listModel.addElement("Japan");
	 
	        JList<String> countryList = new JList<String>(listModel);
	        countryList.setBounds(363, 295, 77, -17);
	        getContentPane().add(countryList);*/
	       
	        JButton btnStaff = new JButton("Staff");
	        JButton btnSupervisor = new JButton("Supervisor");
	        btnStaff.setBounds(618, 314, 89, 23);
	        btnStaff.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					type="Staff";
					btnStaff.setBackground(Color.CYAN);
					btnSupervisor.setEnabled(false);
				}
				});
	        contentPane.add(btnStaff);
	        
	        btnSupervisor.setBounds(729, 314, 89, 23);
	        btnSupervisor.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					type="Supervisor";
					btnSupervisor.setBackground(Color.CYAN);
					btnStaff.setEnabled(false);
				}
				});
	        contentPane.add(btnSupervisor);
	        
	        lblRegistration = new JLabel("Registration");
	        lblRegistration.setFont(new Font("Serif", Font.PLAIN, 38));
	        lblRegistration.setBounds(575, 11, 212, 48);
	        contentPane.add(lblRegistration);
	        
	        lblNewLabel = new JLabel("");
	        lblNewLabel.setBounds(661, 496, 46, 14);
	        contentPane.add(lblNewLabel);
	        //list.addListSelectionListener(...);
	}
}