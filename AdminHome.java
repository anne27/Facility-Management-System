import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
public class AdminHome extends JFrame {
	public Admin boss;
	public  AdminHome(String user,String depa,Admin adm) {
		this.boss=adm;
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Home</td></tr></table></body></html>", new Home());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Staff</td></tr></table></body></html>", new Staff1());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Logistics</td></tr></table></body></html>", new Logistics1());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Reports</td></tr></table></body></html>", new Reports());
		jtp.addTab("<html><body><table width='160'><tr><td height='40'>Requests</td></tr></table></body></html>", new Requests());
		ClockLabel clock = new ClockLabel();
		clock.setBounds(1050,0,200,50);
		JButton Logout=new JButton("LOGOUT");
		Logout.setBounds(900,0,100,50);
		Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); WelcomeScreen2 frame = new WelcomeScreen2();
				frame.setVisible(true);
				frame.start();
			}
		});
		add(Logout);
		add(clock);
		add(jtp);
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
			JLabel l1=new JLabel("Details: ");
			JLabel l2=new JLabel("Name: "+boss.getName());
			JLabel l3=new JLabel("Username: "+boss.getUsername());
			JLabel l4=new JLabel("DOB: "+boss.getDOB());
			JLabel l5=new JLabel("Department: "+boss.getDepartment());
			JLabel l6=new JLabel("Department: "+boss.getID());
			add(l1);
			add(l2);
			add(l3);
			add(l4);
			add(l5);
			add(l6);
		}
	}

	class Staff1 extends JPanel {

		public Staff1() {
			
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
			
			JCheckBox cb1 = new JCheckBox("Red");
			add(cb1);
			JCheckBox cb2 = new JCheckBox("Green");
			add(cb2);
			JCheckBox cb3 = new JCheckBox("Blue");
			add(cb3);
		}
	}
	
	class Reports extends JPanel {
		public Reports() {
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
			//JFrame frame = new JFrame("TableRenderDemo");
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create and set up the content pane.
	        TableRenderDemo newContentPane = new TableRenderDemo();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        add(newContentPane);
	        //frame.setContentPane(newContentPane);

	        //Display the window.
	        //frame.pack();
	        //frame.setVisible(true);
		}
	}
}