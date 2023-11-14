package Reto1;
//Add imports for all component functionality
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
import Reto1.ListaEquipos; 
import Reto1.ListaEquiposIngles; 
import Reto1.MenuFondoFooterPaginaPrincipalING; 
import Reto1.MenuFondoFooterPaginaPrincipal; 


@SuppressWarnings("unused")
public class MenuFondoFooterPaginaPrincipalING extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final JMenu PaginaPrincipal = null;
	private JPanel contentPane;

	//launching the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFondoFooterPaginaPrincipalING frame = new MenuFondoFooterPaginaPrincipalING();
					frame.setVisible(true);
					//prohibit changing the size of the application
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//showing all application components
	public MenuFondoFooterPaginaPrincipalING() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Spanish Water Polo Results");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1178, 793);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setLocationRelativeTo(null);

		//creating a menu at the top of the screen with buttons such as: Results, Calendar, Team List, etc.
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(139, 0, 0));
		menuBar.setFont(new Font("Calibri", Font.BOLD, 20));
		setJMenuBar(menuBar);

		//Button Results
		
		JButton btnResultados = new JButton("Results");
		menuBar.add(btnResultados);
		btnResultados.setForeground(new Color(255, 255, 255));
		btnResultados.setBackground(new Color(139, 0, 0));
		btnResultados.setFont(new Font("Calibri", Font.BOLD, 20));
    btnResultados.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Open the ResultadosING Document
            ResultadosING ResultadosING = new ResultadosING();
            ResultadosING.setVisible(true);
            ResultadosING.setResizable(false);
        }
    });
		
		//Button Schedule
    
		JButton btnCalendario = new JButton("Schedule");
		btnCalendario.setFont(new Font("Calibri", Font.BOLD, 20));
		menuBar.add(btnCalendario);
		btnCalendario.setForeground(new Color(255, 255, 255));
		btnCalendario.setBackground(new Color(139, 0, 0));
    btnCalendario.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the CalendarioING Document
          CalendarioING CalendarioING = new CalendarioING();
          CalendarioING.setVisible(true);
          CalendarioING.setResizable(false);
      }
  });
		
		//Button Teams
    
		JButton btnListaEquipos = new JButton("Teams");
		menuBar.add(btnListaEquipos);
		btnListaEquipos.setBackground(new Color(139, 0, 0));
		btnListaEquipos.setForeground(new Color(255, 255, 255));
		btnListaEquipos.setFont(new Font("Calibri", Font.BOLD, 20));
	  btnListaEquipos.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the ListaEquiposIngles Document
          ListaEquiposIngles ListaEquiposIngles = new ListaEquiposIngles();
          ListaEquiposIngles.setVisible(true);
          ListaEquiposIngles.setResizable(false);
      }
  });	
	  
		//Button League Table
	  
		JButton btnClasificacion = new JButton("League Table");
		menuBar.add(btnClasificacion);
		btnClasificacion.setForeground(new Color(255, 255, 255));
		btnClasificacion.setBackground(new Color(139, 0, 0));
		btnClasificacion.setFont(new Font("Calibri", Font.BOLD, 20));
	  btnClasificacion.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the ClasificaciónIngles Document
          ClasificaciónIngles ClasificaciónIngles = new ClasificaciónIngles();
          ClasificaciónIngles.setVisible(true);
          ClasificaciónIngles.setResizable(false);
      }
  });
	  
		//Button About us
		
		JButton btnSobreNosotros = new JButton("About us");
		menuBar.add(btnSobreNosotros);
		btnSobreNosotros.setFont(new Font("Calibri", Font.BOLD, 20));
		btnSobreNosotros.setForeground(new Color(255, 255, 255));
		btnSobreNosotros.setBackground(new Color(139, 0, 0));
		menuBar.add(btnSobreNosotros);
		btnSobreNosotros.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	          // Open the SobreNosotrosIngles Document
	          SobreNosotrosING SobreNosotrosING = new SobreNosotrosING();
	          SobreNosotrosING.setVisible(true);
	          SobreNosotrosING.setResizable(false);
	      }
	  });
		
		//Button FAQ
		
		JButton btnFAQ = new JButton("FAQ");
		btnFAQ.setFont(new Font("Calibri", Font.BOLD, 20));
		btnFAQ.setBackground(new Color(139, 0, 0));
		btnFAQ.setForeground(new Color(255, 255, 255));
		menuBar.add(btnFAQ);
		btnFAQ.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the FAQIngles Document
         	FAQIngles FAQIngles = new FAQIngles();
         	FAQIngles.setVisible(true);
         	FAQIngles.setResizable(false);
      }
  });
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator);

		//menu with language selection Main Page
		
		JMenu mnIdioma = new JMenu("ES/EN");
		mnIdioma.setFont(new Font("Calibri", Font.BOLD, 20));
		mnIdioma.setForeground(new Color(255, 255, 255));
		mnIdioma.setBackground(new Color(139, 0, 0));
		menuBar.add(mnIdioma);
		
		//Button with Spanish language
		
		JMenuItem mntmEspañol = new JMenuItem("Español");
		mntmEspañol.setForeground(new Color(255, 255, 255));
		mntmEspañol.setBackground(new Color(139, 0, 0));
		mnIdioma.add(mntmEspañol);
		mntmEspañol.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the Document Main Page (Spanish)
      	MenuFondoFooterPaginaPrincipal MenuFondoFooterPaginaPrincipal = new MenuFondoFooterPaginaPrincipal();
      	MenuFondoFooterPaginaPrincipal.setVisible(true);
          dispose();
      }
  });
		
		//Button with English language
		
		JMenuItem mntmIngles = new JMenuItem("English");
		mntmIngles.setForeground(new Color(255, 255, 255));
		mntmIngles.setBackground(new Color(139, 0, 0));
		mnIdioma.add(mntmIngles);
		mntmIngles.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the Document Main Page (English)
      	MenuFondoFooterPaginaPrincipalING menuFondoFooterPaginaPrincipalING = new MenuFondoFooterPaginaPrincipalING();
				menuFondoFooterPaginaPrincipalING.setVisible(true);
          
      }
  });
		
		//Button Log in
		
		JButton btnInicioSesion = new JButton("Log in");
		menuBar.add(btnInicioSesion);
		btnInicioSesion.setFont(new Font("Calibri", Font.BOLD, 20));
		btnInicioSesion.setBackground(new Color(139, 0, 0));
		btnInicioSesion.setForeground(new Color(255, 255, 255));
		btnInicioSesion.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the InicioDeSesion Document
      	InicioDeSesion InicioDeSesion = new InicioDeSesion();
      	InicioDeSesion.setVisible(true);
        InicioDeSesion.setResizable(false);
      }
  });
		
		//Button Contact us
		
		JButton btnContacto = new JButton("Contact us");
		menuBar.add(btnContacto);
		btnContacto.setForeground(new Color(255, 255, 255));
		btnContacto.setBackground(new Color(139, 0, 0));
		btnContacto.setFont(new Font("Calibri", Font.BOLD, 20));
		btnContacto.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          // Open the WebContact Document
    	WebContact WebContact = new WebContact();
    	WebContact.setVisible(true);
    	WebContact.setResizable(false);
      }
  });
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		//panel on the left of the screen that shows 2 photos with news
		
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
	     JLabel lblNoticias = new JLabel("Breaking news");
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
	     lblNoticiaWP.setIcon(new ImageIcon("src/Reto1/fotos/Noticia ingles.png"));
	     noticiaPanel.add(lblNoticiaWP);
	     noticiaPanel.add(Box.createHorizontalGlue());
	     newsPanel.add(noticiaPanel);
	     
	     JPanel nuevaNoticiaPanel = new JPanel();
	     nuevaNoticiaPanel.setLayout(new BoxLayout(nuevaNoticiaPanel, BoxLayout.X_AXIS));
	     nuevaNoticiaPanel.add(Box.createHorizontalGlue());
	     JLabel lblNuevaNoticiaWP = new JLabel("");
	     lblNuevaNoticiaWP.setBackground(new Color(255, 255, 255));
	     lblNuevaNoticiaWP.setHorizontalAlignment(SwingConstants.CENTER);
	     lblNuevaNoticiaWP.setIcon(new ImageIcon("src/Reto1/fotos/Noticia ingles 2.png"));
	     nuevaNoticiaPanel.add(lblNuevaNoticiaWP);
	     nuevaNoticiaPanel.add(Box.createHorizontalGlue());
	     newsPanel.add(nuevaNoticiaPanel);

		//Panel on the right side of the screen showing subsequent games
		
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
	    	JLabel lblProximosPartidos = new JLabel("Next games");
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
		lblPartidos.setIcon(new ImageIcon("src/Reto1/fotos/Jornada ordenada ingles.png"));
		noticiaPanel.add(Box.createHorizontalGlue());
		partidosPanel.add(lblPartidos);
	     matchesPanel.add(partidosPanel);

		//panel below to show connections to us
		
		Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		Label lblFooter1 = new Label("Contact number: +34 566 34 21 78 ");
		lblFooter1.setForeground(new Color(255, 255, 255));
		lblFooter1.setFont(new Font("Calibri", Font.BOLD, 14));
		panel.add(lblFooter1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		panel.add(separator_1);
		
		Label lblFooter2 = new Label("Location: C. de Alcalá, 211, 28028 Madrid");
		lblFooter2.setForeground(new Color(255, 255, 255));
		lblFooter2.setFont(new Font("Calibri", Font.BOLD, 14));
		panel.add(lblFooter2);
	}
		
}
