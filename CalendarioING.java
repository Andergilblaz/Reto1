package Reto1;
//Add imports for all component functionality
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class CalendarioING extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	//launching the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarioING frame = new CalendarioING();
					frame.setVisible(true);
					//prohibit changing the size of the application
					frame.setResizable (false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//showing all application components
	public CalendarioING() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
		setAlwaysOnTop(true);
		setTitle("Spanish Water Polo Results");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 978, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		showImage();
	}
	//opening a new method to display the following components
	public void showImage() {
		ImageIcon originalImageIcon = new ImageIcon("src/Reto1/fotos/ImagenesJuntas.png");
        int targetWidth = 900;
        int targetHeight = 1800;

        Image scaledImage = originalImageIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        JLabel imageLabel1 = new JLabel(scaledImageIcon);

        JScrollPane scrollPane = new JScrollPane(imageLabel1);

        scrollPane.setPreferredSize(new Dimension(800, 500));

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        	//adding a new Label
        lblNewLabel = new JLabel("Schedule:");
        lblNewLabel.setForeground(Color.BLACK);
	    lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scrollPane.setColumnHeaderView(lblNewLabel);
    }
}
