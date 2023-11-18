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

public class SobreNosotros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SobreNosotros frame = new SobreNosotros();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SobreNosotros() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
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

     // Escala la imagen original a las dimensiones objetivo
        
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
        
      	// Crea el primer panel ("¿Quiénes Somos?")
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        tabbedPane.addTab("¿Quiénes Somos?", null, panel, null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBounds(0, 0, 769, 451);
        panel.add(panel_1);
        
        // Crea un subpanel para el contenido en la primera pestaña
        
        JLabel lblNewLabel = new JLabel("Somos un grupo apasionado de estudiantes de Desarrollo de Aplicaciones Web");
        lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel.setBounds(106, 300, 556, 42);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("que comparten un interés común por la creación de experiencias digitales impactantes y funcionales.");
        lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(30, 352, 709, 42);
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Nuestros 3 principios:");
        lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(152, 413, 162, 25);
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Minimalismo, Accesibilidad, Funcionalidad ");
        lblNewLabel_3.setFont(new Font("Calibri", Font.ITALIC, 17));
        lblNewLabel_3.setBounds(312, 404, 320, 42);
        panel_1.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("¿Quiénes Somos?");
        lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 30));
        lblNewLabel_4.setBounds(270, 25, 229, 66);
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ik_1DW3A\\eclipse-workspace\\Java\\src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
        lblNewLabel_7.setBounds(305, 110, 159, 150);
        panel_1.add(lblNewLabel_7);
        
      	// Crea el segundo panel ("¿Cómo ha surgido esta web?")
        
        JPanel panel_5 = new JPanel();
        tabbedPane.addTab("¿Cómo ha surgido esta web?", null, panel_5, null);
        panel_5.setLayout(null);
        
      	// Crea un subpanel para el contenido en la segunda pestaña
        
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(0, 0, 769, 451);
        panel_5.add(panel_2);
        
        JLabel lblNewLabel_5 = new JLabel("Esta web ha surgido con el objetivo de que toda aquella persona que quiera informarse ");
        lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_5.setBounds(78, 289, 612, 42);
        panel_2.add(lblNewLabel_5);
        
        JLabel lblNewLabel_1_1 = new JLabel("sobre la División de Honor de Waterpolo pueda hacerlo,");
        lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_1_1.setBounds(182, 335, 404, 42);
        panel_2.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("por eso empezamos a desarrollar esta web en grupo, para facilitar el acceso a la información.");
        lblNewLabel_2_1.setFont(new Font("Calibri", Font.PLAIN, 17));
        lblNewLabel_2_1.setBounds(58, 393, 653, 25);
        panel_2.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_4_1 = new JLabel("¿Cómo ha surgido esta web?");
        lblNewLabel_4_1.setFont(new Font("Calibri", Font.BOLD, 30));
        lblNewLabel_4_1.setBounds(201, 25, 366, 66);
        panel_2.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ik_1DW3A\\eclipse-workspace\\Java\\src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
        lblNewLabel_6.setBounds(305, 110, 159, 150);
        panel_2.add(lblNewLabel_6);
        
       
        
       
    }
}