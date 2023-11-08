package Reto1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JMenu;



public class CalendarioING extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarioING frame = new CalendarioING();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalendarioING() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\LMSG\\Fotos\\ideogram.jpeg"));
		setAlwaysOnTop(true);
		setTitle("Spanish Water Polo Results");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 978, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(139, 0, 0));
		menuBar.setFont(new Font("Calibri", Font.BOLD, 20));
		setJMenuBar(menuBar);
		
		JSeparator separator_1 = new JSeparator();
		menuBar.add(separator_1);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		showImage();
	}
	public void showImage() {
        JLabel imageLabel = new JLabel();
        
        ImageIcon originalImageIcon = new ImageIcon("src/Reto1/fotos/ImagenesJuntas.png");
        int originalWidth = originalImageIcon.getIconWidth();
        int originalHeight = originalImageIcon.getIconHeight();

        int targetWidth = 1200;			/**800/500*/
        int targetHeight = 2000;

        Image scaledImage = originalImageIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        JLabel imageLabel1 = new JLabel(new ImageIcon("src/Reto1/fotos/ImagenesJuntas.png"));

        JScrollPane scrollPane = new JScrollPane(imageLabel1);

        scrollPane.setPreferredSize(new Dimension(800, 500));

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        JLabel lblNewLabel = new JLabel("Schedule");
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scrollPane.setColumnHeaderView(lblNewLabel);
        
     
    }
	
	}
