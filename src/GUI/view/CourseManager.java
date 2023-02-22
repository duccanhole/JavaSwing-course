package GUI.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import GUI.ColorTheme;

public class CourseManager extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CourseManager() {
		setLayout(new CardLayout(0, 0));
		JLabel lblThisIsHome = new JLabel("This is course manager");
		lblThisIsHome.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblThisIsHome, "name_140143002992856");
		setBackground(Color.decode(ColorTheme.neutral));
	}

}
