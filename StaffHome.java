import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import org.eclipse.wb.swing.FocusTraversalOnArray;
public class StaffHome extends JFrame {
	public Staff staff;
	public String username;
	public  StaffHome(String user) {
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Home</td></tr></table></body></html>", new Home());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Staff</td></tr></table></body></html>", new leave());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Logistics</td></tr></table></body></html>", new Logistics1());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Reports</td></tr></table></body></html>", new Reports());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Requests</td></tr></table></body></html>", new Requests());
		ClockLabel clock = new ClockLabel();
		clock.setBounds(1000,0,200,50);
		getContentPane().add(clock);
		getContentPane().add(jtp);
		/*JButton logout=new JButton("Logout");
		logout.setBounds(200,0,10,10);
		logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().add(logout);*/		//Button covering entire panel
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{jtp}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), jtp}));
	}
	class ClockLabel extends JLabel implements ActionListener {

		public ClockLabel() {
			super("" + new Date());
			Timer t = new Timer(1000, this);
			t.start();
		}

		public void actionPerformed(ActionEvent ae) {
			setText((new Date()).toString());
		}
	}

	class Home extends JPanel {
		public Home() {
			JLabel l1=new JLabel("Details:");
			add(l1);
			String username=Login.user;
			String filename=Login.depa+"Staff.csv";
			InputStream in;
			try {
				in = new FileInputStream(filename);
				Scanner sc=new Scanner(in);
					String x = sc.nextLine();
					while (sc.hasNextLine())
						{
						x=sc.nextLine();
						
					String split[] = x.split(",");
					if ((split[0]).equals(Login.user))
						staff=new Staff(split[0],split[2],Login.depa,split[3],split[4],split[5],split[12]);
			}
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			JLabel l_user=new JLabel("Username:\t"+staff.getUsername());
			add(l_user);
			JLabel l_userID=new JLabel("ID:\t"+staff.getID());
			add(l_userID);
			JLabel l_name=new JLabel("Name:\t"+staff.getName());
			add(l_name);
			JLabel l_DOB=new JLabel("DOB:\t"+staff.getDOB());
			add(l_DOB);
			JLabel l_address=new JLabel("Address:\t"+staff.getAddress());
			add(l_address);
			JLabel l_status=new JLabel("Status:\t"+staff.getStatus());
			add(l_status);
		}
	}

	class leave extends JPanel {

		public leave() {
			
			JCheckBox cb1 = new JCheckBox("Red");
			add(cb1);
			JCheckBox cb2 = new JCheckBox("Green");
			add(cb2);
			JCheckBox cb3 = new JCheckBox("Blue");
			add(cb3);
		}
	}
	class Logistics1 extends JPanel {

		public Logistics1() {
			JLabel label=new JLabel("Send Logistics Requests to Department Supervisor");
			add(label);
			JLabel l1=new JLabel("Requirement:");
			add(l1);
			JTextField t1=new JTextField("");
			add(t1);
			JLabel l2=new JLabel("Quantity:");
			add(l2);
			JComboBox<Integer> jcb = new JComboBox<Integer>();
			jcb.addItem(1);
			jcb.addItem(2);
			jcb.addItem(3);
			jcb.addItem(4);
			jcb.addItem(5);
			jcb.addItem(6);
			add(jcb);
			JLabel error=new JLabel("");
			
			JButton sendreq=new JButton("Send");
			sendreq.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent a)
				{
					if (t1.getText()=="")
						error.setText("Please enter the requirement");
					else
					{
						staff.sendLogisticReq(t1.getText(), jcb.getSelectedItem().toString(), staff);
						//Write to file inventoryreq.csv
					}
				}
			});
			add(sendreq);
		}
	}
	class Reports extends JPanel {
		public Reports() {
			JLabel l1=new JLabel("List of Tasks:");
			//tasks list
			
			JCheckBox cb1 = new JCheckBox("Red");
			add(cb1);
			JCheckBox cb2 = new JCheckBox("Green");
			add(cb2);
			JCheckBox cb3 = new JCheckBox("Blue");
			add(cb3);
		}
	}
	class Requests extends JPanel {
		public Requests() {

			JComboBox jcb = new JComboBox();
			jcb.addItem("Vanilla");
			jcb.addItem("Chocolate");
			jcb.addItem("Strawberry");
			add(jcb);
		}
	}
}