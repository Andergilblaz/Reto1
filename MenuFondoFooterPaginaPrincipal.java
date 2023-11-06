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

import Reto1.Calendario; 
import Reto1.CalendarioING; 
import Reto1.Clasificación; 
import Reto1.ContactoWeb; 
import Reto1.InicioDeSesion; 
import Reto1.ListaDeEquipos; 
import Reto1.ListaEquiposIngles; 
import Reto1.MenuFondoFooterPaginaPrincipal; 



@SuppressWarnings("unused")
public class MenuFondoFooterPaginaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final JMenu PaginaPrincipal = null;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
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
		btnPaginaPrincipal.setBackground(new Color(139, 0, 0));
		btnPaginaPrincipal.setForeground(new Color(255, 255, 255));
		btnPaginaPrincipal.setFont(new Font("Calibri", Font.BOLD, 20));
		btnPaginaPrincipal.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
          MenuFondoFooterPaginaPrincipal menuFondoFooterPaginaPrincipal = new MenuFondoFooterPaginaPrincipal();
					menuFondoFooterPaginaPrincipal.setVisible(true);
          dispose();
      }
  });
		
		JButton btnResultados = new JButton("Resultados");
		menuBar.add(btnResultados);
		btnResultados.setForeground(new Color(255, 255, 255));
		btnResultados.setBackground(new Color(139, 0, 0));
		btnResultados.setFont(new Font("Calibri", Font.BOLD, 20));
    btnResultados.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Abre el DocumentoNuevo
            Resultados Resultados = new Resultados();
            Resultados.setVisible(true);
            dispose();
        }
    });
		
		JButton btnCalendario = new JButton("Calendario");
		btnCalendario.setFont(new Font("Calibri", Font.BOLD, 20));
		menuBar.add(btnCalendario);
		btnCalendario.setForeground(new Color(255, 255, 255));
		btnCalendario.setBackground(new Color(139, 0, 0));
    btnCalendario.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
          Calendario Calendario = new Calendario();
          Calendario.setVisible(true);
          dispose();
      }
  });
		
		JButton btnListaEquipos = new JButton("Lista Equipos");
		menuBar.add(btnListaEquipos);
		btnListaEquipos.setBackground(new Color(139, 0, 0));
		btnListaEquipos.setForeground(new Color(255, 255, 255));
		btnListaEquipos.setFont(new Font("Calibri", Font.BOLD, 20));
	  btnListaEquipos.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
          ListaEquipos ListaEquipos = new ListaEquipos();
          ListaEquipos.setVisible(true);
          dispose();
      }
  });
	
		
		JButton btnClasificacion = new JButton("Clasificación");
		menuBar.add(btnClasificacion);
		btnClasificacion.setForeground(new Color(255, 255, 255));
		btnClasificacion.setBackground(new Color(139, 0, 0));
		btnClasificacion.setFont(new Font("Calibri", Font.BOLD, 20));
	  btnClasificacion.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
          Clasificación Clasificación = new Clasificación();
          Clasificación.setVisible(true);
          dispose();
      }
  });
		JButton btnSobreNosotros = new JButton("Sobre Nosotros");
		menuBar.add(btnSobreNosotros);
		btnSobreNosotros.setFont(new Font("Calibri", Font.BOLD, 20));
		btnSobreNosotros.setForeground(new Color(255, 255, 255));
		btnSobreNosotros.setBackground(new Color(139, 0, 0));
		menuBar.add(btnSobreNosotros);
		btnSobreNosotros.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	          // Abre el DocumentoNuevo
	          SobreNosotros SobreNosotros = new SobreNosotros();
	          SobreNosotros.setVisible(true);
	          dispose();
	      }
	  });
		
		JButton btnFAQ = new JButton("FAQ");
		btnFAQ.setFont(new Font("Calibri", Font.BOLD, 20));
		btnFAQ.setBackground(new Color(139, 0, 0));
		btnFAQ.setForeground(new Color(255, 255, 255));
		menuBar.add(btnFAQ);
		btnFAQ.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
         	FAQ FAQ = new FAQ();
         	FAQ.setVisible(true);
          dispose();
      }
  });
		
		JButton btnInicioSesion = new JButton("Inicio de sesión");
		menuBar.add(btnInicioSesion);
		btnInicioSesion.setFont(new Font("Calibri", Font.BOLD, 20));
		btnInicioSesion.setBackground(new Color(139, 0, 0));
		btnInicioSesion.setForeground(new Color(255, 255, 255));
		btnInicioSesion.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
      	InicioDeSesion InicioDeSesion = new InicioDeSesion();
      	InicioDeSesion.setVisible(true);
          dispose();
      }
  });
		
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
		mntmEspañol.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
      	MenuFondoFooterPaginaPrincipal MenuFondoFooterPaginaPrincipal = new MenuFondoFooterPaginaPrincipal();
      	MenuFondoFooterPaginaPrincipal.setVisible(true);
          dispose();
      }
  });
		
		JMenuItem mntmIngles = new JMenuItem("English");
		mntmIngles.setForeground(new Color(255, 255, 255));
		mntmIngles.setBackground(new Color(139, 0, 0));
		mnIdioma.add(mntmIngles);
		
		
		JButton btnContacto = new JButton("Contacto");
		menuBar.add(btnContacto);
		btnContacto.setForeground(new Color(255, 255, 255));
		btnContacto.setBackground(new Color(139, 0, 0));
		btnContacto.setFont(new Font("Calibri", Font.BOLD, 20));
		btnContacto.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Abre el DocumentoNuevo
      	ContactoWeb ContactoWeb = new ContactoWeb();
      	ContactoWeb.setVisible(true);
          dispose();
      }
  });
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
	}
		
}
