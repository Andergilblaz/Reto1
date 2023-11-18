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
import javax.swing.JTabbedPane;

public class SobreNosotrosING extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SobreNosotrosING frame = new SobreNosotrosING();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SobreNosotrosING() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Spanish Water Polo Results");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setPreferredSize(new Dimension(200,100));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		showImage();
	}
	public void showImage() {
        new JLabel();
        
     // Carga el ícono de imagen original desde la ruta del archivo
        
        ImageIcon originalImageIcon = new ImageIcon("C:\\Users\\ik_1DW3A\\Pictures\\Saved Pictures\\calendario.png");
        originalImageIcon.getIconWidth();
        originalImageIcon.getIconHeight();
        
     // Establece las dimensiones objetivo para la imagen escalada
        
        int targetWidth = 1200;
        int targetHeight = 2000;

        Image scaledImage = originalImageIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        new ImageIcon(scaledImage);

     // Crea un JScrollPane para la imagen con dimensiones especificadas
        
        JScrollPane scrollPane = new JScrollPane();

        scrollPane.setPreferredSize(new Dimension(800, 500));

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
     // Crea un JTabbedPane para contener diferentes paneles
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        scrollPane.setViewportView(tabbedPane);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        tabbedPane.addTab("Who we are?", null, panel, null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBounds(0, 0, 769, 451);
        panel.add(panel_1);
        
     // Agrega etiquetas y contenido
        
        JLabel lblNewLabel = new JLabel("We are a passionate group of Web Application Development students");
        lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel.setBounds(138, 302, 493, 42);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("who share a common interest in creating digital experiences");
        lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(174, 350, 421, 42);
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_4 = new JLabel("Who we are?");
        lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 30));
        lblNewLabel_4.setBounds(288, 25, 193, 66);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ik_1DW3A\\eclipse-workspace\\Java\\src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
        lblNewLabel_2.setBounds(302, 113, 167, 162);
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Our 3 principles: Minimalism, Accessibility, Functionality");
        lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_3.setBounds(182, 406, 405, 22);
        panel_1.add(lblNewLabel_3);
        
        JPanel panel_5 = new JPanel();
        tabbedPane.addTab("How does this website come about?", null, panel_5, null);
        panel_5.setLayout(null);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBounds(0, 0, 771, 465);
        panel_5.add(panel_1_1);
        
        JLabel lblNewLabel_5 = new JLabel("This website has emerged with the aim that anyone who wants to find out about ");
        lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_5.setBounds(95, 296, 580, 42);
        panel_1_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_1_1 = new JLabel(" the Water Polo Honor Division can do so,");
        lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_1_1.setBounds(235, 348, 300, 42);
        panel_1_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("that is why we started to develop this website as a group, to facilitate access to information.");
        lblNewLabel_2_1.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_2_1.setBounds(59, 400, 653, 25);
        panel_1_1.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_4_1 = new JLabel("How does this website come about?");
        lblNewLabel_4_1.setFont(new Font("Calibri", Font.BOLD, 30));
        lblNewLabel_4_1.setBounds(158, 25, 454, 66);
        panel_1_1.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ik_1DW3A\\eclipse-workspace\\Java\\src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
        lblNewLabel_6.setBounds(302, 113, 167, 162);
        panel_1_1.add(lblNewLabel_6);
        
       
        
       
    }
}