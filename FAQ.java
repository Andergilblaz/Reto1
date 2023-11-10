package Reto1;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

public class FAQ extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAQ frame = new FAQ();
					frame.setVisible(true);
					frame.setResizable (false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FAQ() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
		setAlwaysOnTop(true);
		setTitle("FAQ Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("FAQ");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
        panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
        contentPane.add(panel_1, BorderLayout.CENTER);
        
        JScrollPane scrollPane = new JScrollPane(panel_1);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JLabel lblNewLabel_1 = new JLabel("<html>1: ¿Cómo empezar a utilizar la aplicación?<br>- Después de instalar la aplicación, podrá utilizarla inmediatamente sin registrarse.</html>");
        lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("<html>2: Cómo encontrar la sección con fechas y resultados de la competencia?<br>- Para acceder al calendario de partidos, resultados, etc., puedes utilizar el menú de la aplicación.</html>");
        lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("<html>3: ¿Cómo cambiar el idioma de la aplicación?<br>- Actualmente hay 2 idiomas disponibles para utilizar la aplicación: español, inglés. Para cambiar <br> el idioma, utilice el menú \"Es/En\".</html>");
        lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("<html>4: ¿Qué debo hacer si la aplicación no funciona correctamente?<br>- En este caso, te recomendamos reiniciar la aplicación, y también enviarnos un mensaje a través <br>del menú \"Contacto\", describiendo el problema.</html>");
        lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("<html>5: ¿Cómo contactarnos?<br>- Si no ha encontrado la respuesta a su pregunta, siempre puede enviarnos un mensaje utilizando <br>el formulario del menú \"Contacto\".</html>");
        lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("<html>6: ¿Cómo inicio sesión en la cuenta de editor?<br>- Si eres editor, desarrollador y/o administrador de este proyecto, debes tener tu propio nombre de <br>usuario y contraseña personal.\r\n<br>Para iniciar sesión en su cuenta, utilice el menú \"Inicio de Sesión\", luego ingrese su nombre <br>personal y contraseña.</html>");
        lblNewLabel_6.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("<html>7: ¿Qué debo hacer si no tengo información de inicio de sesión personal?<br>- Si no hay datos de su cuenta, contáctenos usando el menú \"Contacto\".</html>");
        lblNewLabel_7.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        panel_1.add(lblNewLabel_7);
        JLabel lblNewLabel_8 = new JLabel("<html>8: Olvidé mi contraseña, ¿qué debo hacer?<br>- Si pierdes tu contraseña, debes contactar con el menú \"Contacto\".</html>");
        lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP); 
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT); 
        lblNewLabel_8.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        panel_1.add(lblNewLabel_8);
        
	}

}
