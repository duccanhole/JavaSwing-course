package View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;

public class HomeView extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomeView() {
		setLayout(new CardLayout(0, 0));
		
		JLabel lblThisIsHome = new JLabel("This is home view");
		lblThisIsHome.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblThisIsHome, "name_140143002992856");
	}
}
