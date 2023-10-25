package Reto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

import java.awt.Panel;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class MenuFondoFooterPaginaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFondoFooterPaginaPrincipal frame = new MenuFondoFooterPaginaPrincipal();
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
	public MenuFondoFooterPaginaPrincipal() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Reto1/fotos/ideogram.jpeg"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 530);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(139, 0, 0));
		menuBar.setFont(new Font("Calibri", Font.BOLD, 20));
		setJMenuBar(menuBar);
		
		
		JButton btnPaginaPrincipal = new JButton("Página Principal");
		menuBar.add(btnPaginaPrincipal);
		btnPaginaPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPaginaPrincipal.setBackground(new Color(139, 0, 0));
		btnPaginaPrincipal.setForeground(new Color(255, 255, 255));
		btnPaginaPrincipal.setFont(new Font("Calibri", Font.BOLD, 20));
		
		
		JButton btnResultados = new JButton("Resultados");
		menuBar.add(btnResultados);
		btnResultados.setForeground(new Color(255, 255, 255));
		btnResultados.setBackground(new Color(139, 0, 0));
		btnResultados.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JMenu mnCalendario = new JMenu("Calendario");
		mnCalendario.setFont(new Font("Calibri", Font.BOLD, 20));
		mnCalendario.setForeground(new Color(255, 255, 255));
		mnCalendario.setBackground(new Color(139, 0, 0));
		menuBar.add(mnCalendario);
		
		JMenuItem mntmCalendario = new JMenuItem("Calendario");
		mntmCalendario.setBackground(new Color(139, 0, 0));
		mntmCalendario.setForeground(new Color(255, 255, 255));
		mnCalendario.add(mntmCalendario);
		
		JMenuItem mntmJornada1 = new JMenuItem("Jornada 1");
		mntmJornada1.setForeground(new Color(255, 255, 255));
		mntmJornada1.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada1);
		
		JMenuItem mntmJornada2 = new JMenuItem("Jornada 2");
		mntmJornada2.setForeground(new Color(255, 255, 255));
		mntmJornada2.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada2);
		
		JMenuItem mntmJornada3 = new JMenuItem("Jornada 3");
		mntmJornada3.setForeground(new Color(255, 255, 255));
		mntmJornada3.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada3);
		
		JMenuItem mntmJornada4 = new JMenuItem("Jornada 4");
		mntmJornada4.setBackground(new Color(139, 0, 0));
		mntmJornada4.setForeground(new Color(255, 255, 255));
		mnCalendario.add(mntmJornada4);
		
		JMenuItem mntmJornada5 = new JMenuItem("Jornada5");
		mntmJornada5.setBackground(new Color(139, 0, 0));
		mntmJornada5.setForeground(new Color(255, 255, 255));
		mnCalendario.add(mntmJornada5);
		
		JMenuItem mntmJornada6 = new JMenuItem("Jornada 6");
		mntmJornada6.setForeground(new Color(255, 255, 255));
		mntmJornada6.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada6);
		
		JMenuItem mntmJornada7 = new JMenuItem("Jornada 7");
		mntmJornada7.setForeground(new Color(255, 255, 255));
		mntmJornada7.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada7);
		
		JMenuItem mntmJornada8 = new JMenuItem("Jornada 8");
		mntmJornada8.setForeground(new Color(255, 255, 255));
		mntmJornada8.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada8);
		
		JMenuItem mntmJornada9 = new JMenuItem("Jornada 9");
		mntmJornada9.setForeground(new Color(255, 255, 255));
		mntmJornada9.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada9);
		
		JMenuItem mntmJornada10 = new JMenuItem("Jornada 10");
		mntmJornada10.setForeground(new Color(255, 255, 255));
		mntmJornada10.setBackground(new Color(139, 0, 0));
		mnCalendario.add(mntmJornada10);
		
		JButton btnListaEquipos = new JButton("Lista Equipos");
		menuBar.add(btnListaEquipos);
		btnListaEquipos.setBackground(new Color(139, 0, 0));
		btnListaEquipos.setForeground(new Color(255, 255, 255));
		btnListaEquipos.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JButton btnClasificacion = new JButton("Clasificación");
		menuBar.add(btnClasificacion);
		btnClasificacion.setForeground(new Color(255, 255, 255));
		btnClasificacion.setBackground(new Color(139, 0, 0));
		btnClasificacion.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JMenu mnSobreNosotros = new JMenu("Sobre Nosotros");
		mnSobreNosotros.setFont(new Font("Calibri", Font.BOLD, 20));
		mnSobreNosotros.setForeground(new Color(255, 255, 255));
		mnSobreNosotros.setBackground(new Color(139, 0, 0));
		menuBar.add(mnSobreNosotros);
		
		JMenuItem mntmQuienesSomos = new JMenuItem("¿Quienes Somos?");
		mntmQuienesSomos.setForeground(new Color(255, 255, 255));
		mntmQuienesSomos.setBackground(new Color(139, 0, 0));
		mnSobreNosotros.add(mntmQuienesSomos);
		
		JMenuItem mntmComoHaSurgido = new JMenuItem("¿Cómo ha surgido esta web?");
		mntmComoHaSurgido.setForeground(new Color(255, 255, 255));
		mntmComoHaSurgido.setBackground(new Color(139, 0, 0));
		mnSobreNosotros.add(mntmComoHaSurgido);
		
		JMenu mnFAQ = new JMenu("FAQ");
		mnFAQ.setFont(new Font("Calibri", Font.BOLD, 20));
		mnFAQ.setBackground(new Color(139, 0, 0));
		mnFAQ.setForeground(new Color(255, 255, 255));
		menuBar.add(mnFAQ);
		
		JMenuItem mntmComoFunciona = new JMenuItem("¿Cómo funciona esta web?");
		mntmComoFunciona.setForeground(new Color(255, 255, 255));
		mntmComoFunciona.setBackground(new Color(139, 0, 0));
		mnFAQ.add(mntmComoFunciona);
		
		JMenuItem mntmQueHago = new JMenuItem("¿Que hago si hay un error?");
		mntmQueHago.setBackground(new Color(139, 0, 0));
		mntmQueHago.setForeground(new Color(255, 255, 255));
		mnFAQ.add(mntmQueHago);
		
		JButton btnInicioSesion = new JButton("Inicio de sesión");
		menuBar.add(btnInicioSesion);
		btnInicioSesion.setFont(new Font("Calibri", Font.BOLD, 20));
		btnInicioSesion.setBackground(new Color(139, 0, 0));
		btnInicioSesion.setForeground(new Color(255, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator);
		
		JMenu mnIdioma = new JMenu("ES/EN");
		mnIdioma.setFont(new Font("Calibri", Font.BOLD, 20));
		mnIdioma.setForeground(new Color(255, 255, 255));
		mnIdioma.setBackground(new Color(139, 0, 0));
		menuBar.add(mnIdioma);
		
		JMenuItem mntmEspañol = new JMenuItem("Español");
		mntmEspañol.setForeground(new Color(255, 255, 255));
		mntmEspañol.setBackground(new Color(139, 0, 0));
		mnIdioma.add(mntmEspañol);
		
		JMenuItem mntmIngles = new JMenuItem("English");
		mntmIngles.setForeground(new Color(255, 255, 255));
		mntmIngles.setBackground(new Color(139, 0, 0));
		mnIdioma.add(mntmIngles);
		
		JButton btnContacto = new JButton("Contacto");
		menuBar.add(btnContacto);
		btnContacto.setForeground(new Color(255, 255, 255));
		btnContacto.setBackground(new Color(139, 0, 0));
		btnContacto.setFont(new Font("Calibri", Font.BOLD, 20));

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
	     lblNoticiaWP.setIcon(new ImageIcon("src\\Reto1\\fotos\\noticia waterpolo.png"));
	     noticiaPanel.add(lblNoticiaWP);
	     noticiaPanel.add(Box.createHorizontalGlue());
	     newsPanel.add(noticiaPanel);
	     
	     JPanel nuevaNoticiaPanel = new JPanel();
	     nuevaNoticiaPanel.setLayout(new BoxLayout(nuevaNoticiaPanel, BoxLayout.X_AXIS));
	     nuevaNoticiaPanel.add(Box.createHorizontalGlue());
	     JLabel lblNuevaNoticiaWP = new JLabel("");
	     lblNuevaNoticiaWP.setBackground(new Color(255, 255, 255));
	     lblNuevaNoticiaWP.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNuevaNoticiaWP.setIcon(new ImageIcon("src\\Reto1\\fotos\\noticia nueva waterpolo.png"));
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
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBackground(UIManager.getColor("ColorChooser.background"));
		partidosPanel.add(horizontalGlue);
		JLabel lblPartidos = new JLabel("");
		lblPartidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartidos.setIcon(new ImageIcon("src\\Reto1\\fotos\\JORNADA ORDENADA.png"));
		noticiaPanel.add(Box.createHorizontalGlue());
		partidosPanel.add(lblPartidos);
	     matchesPanel.add(partidosPanel);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		Label lblFooter1 = new Label("Teléfono contacto: +34 566 34 21 78 ");
		lblFooter1.setForeground(new Color(255, 255, 255));
		lblFooter1.setFont(new Font("Calibri", Font.BOLD, 14));
		panel.add(lblFooter1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		panel.add(separator_1);
		
		Label lblFooter2 = new Label("Ubicación: C. de Alcalá, 211, 28028 Madrid");
		lblFooter2.setForeground(new Color(255, 255, 255));
		lblFooter2.setFont(new Font("Calibri", Font.BOLD, 14));
		panel.add(lblFooter2);
		
		JPanel panelFondo = new JPanel ();
		contentPane.add(panelFondo);
		JLabel labelFondo = new JLabel("");
		labelFondo.setHorizontalAlignment(SwingConstants.CENTER);
		labelFondo.setIcon(new ImageIcon("src\\Reto1\\fotos\\Fondo.png"));
		Dimension panelFondoSize = panelFondo.getSize();
		labelFondo.setSize(panelFondoSize);
		panelFondo.add(labelFondo, BorderLayout.CENTER);
	}

}
