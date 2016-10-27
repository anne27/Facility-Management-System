import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import java.awt.Component;

public class AdminHome extends JFrame {
	public  AdminHome(String user) {
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Home", new CitiesPanel());
		jtp.addTab("Staff", new ColorsPanel());
		jtp.addTab("Logistics", new CitiesPanel());
		jtp.addTab("Reports", new CitiesPanel());
		jtp.addTab("Requests", new FlavorsPanel());
		add(jtp);
	}
	class CitiesPanel extends JPanel {

		public CitiesPanel() {

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

	class ColorsPanel extends JPanel {

		public ColorsPanel() {

			JCheckBox cb1 = new JCheckBox("Red");
			add(cb1);
			JCheckBox cb2 = new JCheckBox("Green");
			add(cb2);
			JCheckBox cb3 = new JCheckBox("Blue");
			add(cb3);
		}
	}

	class FlavorsPanel extends JPanel {

		public FlavorsPanel() {

			JComboBox jcb = new JComboBox();
			jcb.addItem("Vanilla");
			jcb.addItem("Chocolate");
			jcb.addItem("Strawberry");
			add(jcb);
		}
	}
}