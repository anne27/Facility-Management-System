import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JToolBar;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JTabbedPane;

public class AdminHome extends JFrame {
	private JPanel panel1,panel2;
	private JButton Home,Staff,Logistics,Reports,Requests;
	private JTabbedPane tabbedPane;
	public AdminHome() {
		getContentPane().setLayout(null);
		panel1=new JPanel();
		panel1.setBounds(10, 11, 77, 250);
		getContentPane().add(panel1);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		Home=new JButton("Home");
		Staff=new JButton("Staff");
		Logistics=new JButton("Logistics");
		Reports=new JButton("Reports");
		Requests=new JButton("Requests");
		panel1.add(Home);
		panel1.add(Staff);
		panel1.add(Logistics);
		panel1.add(Reports);
		panel1.add(Requests);

		panel2 = new JPanel();
		panel2.setBounds(91, 11, 333, 250);
		getContentPane().add(panel2);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel2.add(tabbedPane);
		JLabel Time = new JLabel(dateFormat.format(cal.getTime()));
		panel2.add(Time);
	}
}