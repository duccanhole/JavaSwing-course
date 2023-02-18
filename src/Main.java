import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.net.URL;

import View.HomeView;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Main {

	private JFrame frame;
	private JPanel navigateView, mainView;
	private JLabel avatar;
	private JButton homeBtn, courseManageBtn, personManageBtn, teachingScheduleBtn, logOutBtn;
	private JButton btnNewButton;
	private JButton btnNewButton_2;

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
		// add JPanel to switch between multiple JPanel

		JButton btnNewButton_1 = new JButton("New button");
		this.mainView.add(btnNewButton_1);

//		JPanel panel = new JPanel(new CardLayout());
//		
//		JPanel SecondView = new JPanel();
//		SecondView.add(new JLabel("this is second view"));
//		frame.getContentPane().add(panel);
//		
//		JButton btnNewButton = new JButton("New button");
//		btnNewButton.addActionListener(new ActionListener() {
//
////			@SuppressWarnings("deprecation")
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				CardLayout layout = (CardLayout) panel.getLayout();
//				layout.show(panel, "second-view");
//			}
//			
//		});
//		panel.add(new HomeView(), "home-view");
//		panel.add(SecondView, "second-view");
//		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}

	private void initNavigateView() {
		// add JPanel to navigate
		this.navigateView = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(this.navigateView, gbc_panel);
		this.navigateView.setLayout(new GridLayout(7, 1, 0, 0));
		// create Circle Image
		try {
			URL imageSource = new URL("https://i.pravatar.cc/175");
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

			this.avatar = new JLabel(new ImageIcon(circularImage));
			this.navigateView.add(this.avatar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.homeBtn = new JButton("Home");
		this.courseManageBtn = new JButton("Course Manager");
		this.personManageBtn = new JButton("Person Manager");
		this.teachingScheduleBtn = new JButton("Teaching Schedule Manager");
		this.logOutBtn = new JButton("Log out");
		this.navigateView.add(homeBtn);
		this.navigateView.add(courseManageBtn);
		this.navigateView.add(personManageBtn);
		this.navigateView.add(teachingScheduleBtn);
		this.navigateView.add(logOutBtn);
	}

	private void initMainView() {
		this.mainView = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(this.mainView, gbc_panel_1);
		this.navigateView.setLayout(new GridLayout(0, 1, 0, 0));

	}
}
