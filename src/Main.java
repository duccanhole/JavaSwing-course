import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.net.URL;

import View.CourseManager;
import View.HomeView;
import View.PersonManager;
import View.TeachingSchedule;

import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;

public class Main {

	private JFrame frame;
	private JPanel navigateView, mainView;
	private JLabel avatar;
	private JButton homeBtn, courseManageBtn, personManageBtn, teachingScheduleBtn, logOutBtn;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Course manager app");
		GridBagLayout gridBagLayout = new GridBagLayout();
		// set layout with 2 column, first has min 350, second has min 100
		gridBagLayout.columnWidths = new int[] { 350, 100 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		this.initNavigateView();
		this.initMainView();

		frame.setVisible(true);
	}

	private void initNavigateView() {
		// add JPanel to navigate
		this.navigateView = new JPanel();
		navigateView.setBackground(Color.decode("#a5b4fc"));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(this.navigateView, gbc_panel);
		// create Circle Image
		try {
			URL imageSource = new URL("https://i.pravatar.cc/100");
			BufferedImage image = ImageIO.read(imageSource);
			BufferedImage circularImage = new BufferedImage(image.getWidth(), image.getHeight(),
					BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2 = circularImage.createGraphics();
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2.setColor(Color.WHITE);
			g2.fillOval(0, 0, circularImage.getWidth(), circularImage.getHeight());
			g2.setClip(new java.awt.geom.Ellipse2D.Float(0, 0, circularImage.getWidth(), circularImage.getHeight()));
			g2.drawImage(image, 0, 0, null);
			g2.dispose();
			GridBagLayout gbl_navigateView = new GridBagLayout();
			gbl_navigateView.columnWidths = new int[] { 345, 0 };
			gbl_navigateView.rowHeights = new int[] { 300, 100, 0 };
			gbl_navigateView.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
			gbl_navigateView.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
			navigateView.setLayout(gbl_navigateView);
			this.avatar = new JLabel(new ImageIcon(circularImage));
			this.avatar.setText("Admin");
			avatar.setFont(new Font("Dialog", Font.BOLD, 30));
			GridBagConstraints gbc_avatar = new GridBagConstraints();
			gbc_avatar.fill = GridBagConstraints.BOTH;
			gbc_avatar.insets = new Insets(0, 0, 5, 0);
			gbc_avatar.gridx = 0;
			gbc_avatar.gridy = 0;
			this.navigateView.add(this.avatar, gbc_avatar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		panel = new JPanel();
		panel.setBackground(Color.decode("#a5b4fc"));
		GridBagConstraints gbc_panel1 = new GridBagConstraints();
		gbc_panel1.fill = GridBagConstraints.BOTH;
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 1;
		navigateView.add(panel, gbc_panel1);
		panel.setLayout(new GridLayout(5, 1, 0, 20));
		this.homeBtn = new JButton("Home");
		homeBtn.setFont(new Font("Dialog", Font.BOLD, 30));
//		homeBtn.setBounds(200, 200, 30, 25);
//		homeBtn.setBackground(Color.decode("#818cf8"));
		homeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchView("home-view");
			}
		});
		panel.add(homeBtn);
		this.courseManageBtn = new JButton("Course Manager");
		courseManageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchView("course-manager");
			}
		});
		panel.add(courseManageBtn);
		this.personManageBtn = new JButton("Person Manager");
		personManageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchView("person-manager");
			}
		});
		panel.add(personManageBtn);
		this.teachingScheduleBtn = new JButton("Teaching Schedule Manager");
		teachingScheduleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchView("teaching-schedule");
			}
		});
		panel.add(teachingScheduleBtn);
		this.logOutBtn = new JButton("Log out");
		panel.add(logOutBtn);
	}

	private void initMainView() {
		// add JPanel to switch between multiple JPanel
		this.mainView = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(this.mainView, gbc_panel_1);
		// add other panel from View package to main view
		this.mainView.setLayout(new CardLayout());
		this.mainView.add(new HomeView(), "home-view");
		this.mainView.add(new CourseManager(), "course-manager");
		this.mainView.add(new PersonManager(), "person-manager");
		this.mainView.add(new TeachingSchedule(), "teaching-schedule");
	}

	private void switchView(String view) {
		CardLayout layout = (CardLayout) mainView.getLayout();
		layout.show(mainView, view);
	}
}
