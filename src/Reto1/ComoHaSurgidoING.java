package Reto1;

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

public class ComoHaSurgidoING extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComoHaSurgidoING frame = new ComoHaSurgidoING();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ComoHaSurgidoING() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\LMSG\\Fotos\\ideogram.jpeg"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		showImage();
	}
	public void showImage() {
        new JLabel();
        
        ImageIcon originalImageIcon = new ImageIcon("src/Reto1/fotos/calendario.png");
        originalImageIcon.getIconWidth();
        originalImageIcon.getIconHeight();

        int targetWidth = 1200;
        int targetHeight = 2000;

        Image scaledImage = originalImageIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        new ImageIcon(scaledImage);

        JScrollPane scrollPane = new JScrollPane();

        scrollPane.setPreferredSize(new Dimension(800, 500));

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        scrollPane.setViewportView(panel);
        
        JLabel lblNewLabel = new JLabel("This website has emerged with the aim that anyone who wants to find out about ");
        lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel.setBounds(109, 315, 580, 42);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel(" the Water Polo Honor Division can do so,");
        lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(249, 367, 300, 42);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("that is why we started to develop this website as a group, to facilitate access to information.");
        lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(72, 429, 653, 25);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_4 = new JLabel("How does this website come about?");
        lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 30));
        lblNewLabel_4.setBounds(172, 25, 454, 66);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ik_1DW3A\\eclipse-workspace\\Java\\src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
        lblNewLabel_5.setBounds(323, 101, 152, 195);
        panel.add(lblNewLabel_5);
        
    }
}
