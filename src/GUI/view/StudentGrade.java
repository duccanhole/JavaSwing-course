package GUI.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import GUI.ColorTheme;

public class StudentGrade extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public StudentGrade() {
		setLayout(new CardLayout(0, 0));
		
                
                JPanel StudentGradePanel = new StudentGradePanel();
                add(StudentGradePanel);
	}

}
