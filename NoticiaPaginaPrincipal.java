package Reto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;



public class NoticiaPaginaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoticiaPaginaPrincipal frame = new NoticiaPaginaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NoticiaPaginaPrincipal() {
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel containerPanelLeft = new JPanel(new BorderLayout());
		int margenT = 50;
		int margenL = 40;
		int margenB = 70;
		int margenR = 40;
		containerPanelLeft.setBorder(BorderFactory.createEmptyBorder(margenT, margenL, margenB, margenR));
		contentPane.add(containerPanelLeft, BorderLayout.WEST);
		
		JPanel newsPanel = new JPanel();
	     newsPanel.setBackground(new Color(139, 0, 0));
	     newsPanel.setLayout(new BoxLayout(newsPanel, BoxLayout.Y_AXIS));
	     int margen = 10;
	     newsPanel.setBorder(BorderFactory.createEmptyBorder(margen, margen, margen, margen));
	     containerPanelLeft.add(newsPanel);
	     
	     JPanel centerPanel = new JPanel();
	     centerPanel.setBackground(new Color(139, 0, 0));
	     centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.X_AXIS));
	     centerPanel.add(Box.createHorizontalGlue());
	     JLabel lblNoticias = new JLabel("Noticias destacadas");
	     lblNoticias.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNoticias.setForeground(new Color(255, 255, 255));
	     lblNoticias.setFont(new Font("Calibri", Font.BOLD, 20));
	     centerPanel.add(lblNoticias);
	     centerPanel.add(Box.createHorizontalGlue()); 
	     newsPanel.add(centerPanel);
	     
	     JPanel noticiaPanel = new JPanel();
	     noticiaPanel.setLayout(new BoxLayout(noticiaPanel, BoxLayout.X_AXIS));
	     noticiaPanel.add(Box.createHorizontalGlue());
	     JLabel lblNoticiaWP = new JLabel("");
	     lblNoticiaWP.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNoticiaWP.setIcon(new ImageIcon("G:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\Fotos\\Fotos Web Java\\noticia waterpolo.jpg"));
	     noticiaPanel.add(lblNoticiaWP);
	     noticiaPanel.add(Box.createHorizontalGlue());
	     newsPanel.add(noticiaPanel);
	     
	     JPanel nuevaNoticiaPanel = new JPanel();
	     nuevaNoticiaPanel.setLayout(new BoxLayout(nuevaNoticiaPanel, BoxLayout.X_AXIS));
	     nuevaNoticiaPanel.add(Box.createHorizontalGlue());
	     JLabel lblNuevaNoticiaWP = new JLabel("");
	     lblNuevaNoticiaWP.setBackground(new Color(255, 255, 255));
	     lblNuevaNoticiaWP.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNuevaNoticiaWP.setIcon(new ImageIcon("G:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\Fotos\\Fotos Web Java\\noticia nueva waterpolo.jpg"));
	     nuevaNoticiaPanel.add(lblNuevaNoticiaWP);
	     nuevaNoticiaPanel.add(Box.createHorizontalGlue());
	     newsPanel.add(nuevaNoticiaPanel);
		
	     JPanel containerPanelRight = new JPanel(new BorderLayout());
		containerPanelRight.setBorder(BorderFactory.createEmptyBorder(margenT, margenL, margenB, margenR));
		contentPane.add(containerPanelRight, BorderLayout.EAST);
		
		JPanel matchesPanel = new JPanel();
		matchesPanel.setBackground(new Color(139, 0, 0));
		matchesPanel.setLayout(new BoxLayout(matchesPanel, BoxLayout.Y_AXIS));
		matchesPanel.setBorder(BorderFactory.createEmptyBorder(margen, margen, margen, margen));
		containerPanelRight.add(matchesPanel);
	     
	     JPanel centerPanelPartidos = new JPanel();
	     centerPanelPartidos.setBackground(new Color(139, 0, 0));
	     centerPanelPartidos.setLayout(new BoxLayout(centerPanelPartidos, BoxLayout.X_AXIS));
	     centerPanelPartidos.add(Box.createHorizontalGlue());
	    	JLabel lblProximosPartidos = new JLabel("Próximos partidos");
	    	lblProximosPartidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProximosPartidos.setForeground(new Color(255, 255, 255));
		lblProximosPartidos.setFont(new Font("Calibri", Font.BOLD, 20));
		centerPanelPartidos.add(lblProximosPartidos);
		centerPanelPartidos.add(Box.createHorizontalGlue()); 
	     matchesPanel.add(centerPanelPartidos);
	    
		JPanel partidosPanel = new JPanel();
		partidosPanel.setLayout(new BoxLayout(partidosPanel, BoxLayout.X_AXIS));
		partidosPanel.add(Box.createHorizontalGlue());
		JLabel lblPartidos = new JLabel("");
		lblPartidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartidos.setIcon(new ImageIcon("G:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\Fotos\\JORNADA ORDENADA.png"));
		noticiaPanel.add(Box.createHorizontalGlue());
		partidosPanel.add(lblPartidos);
	     matchesPanel.add(partidosPanel);
	}

	}

