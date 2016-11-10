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
	public  AdminHome(String user) {
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
		clock.setBounds(1000,0,200,50);
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
			JButton b1 = new JButton("New York");
			add(b1);
			JButton b2 = new JButton("London");
			add(b2);
			JButton b3 = new JButton("Hong Kong");
			add(b3);
			JButton b4 = new JButton("Tokyo");
			add(b4);
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

			JComboBox jcb = new JComboBox();
			jcb.addItem("Vanilla");
			jcb.addItem("Chocolate");
			jcb.addItem("Strawberry");
			add(jcb);
		}
	}
}