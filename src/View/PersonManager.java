package View;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PersonManager extends JPanel {

	/**
	 * Create the panel.
	 */
	public PersonManager() {
		setLayout(new CardLayout(0, 0));

		JLabel lblThisIsHome = new JLabel("This is people manager");
		lblThisIsHome.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblThisIsHome, "name_140143002992856");
	}

}
