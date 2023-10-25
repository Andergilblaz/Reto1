package Reto1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaCambioVentas extends JFrame {

    public PruebaCambioVentas() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/Reto1/fotos/ideogram.jpeg"));
        setTitle("Resultados Waterpolo Español");
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Aquí puedes agregar tu código de menú y otros componentes

        // Ejemplo:
        JMenuBar menuBar = new JMenuBar();
        contentPane.add(menuBar, BorderLayout.NORTH);

        JButton btnPaginaPrincipal = new JButton("Página Principal");
        menuBar.add(btnPaginaPrincipal);
        // Agregar ActionListener para el botón "Página Principal"
        btnPaginaPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Coloca aquí el código para manejar el evento del botón
            }
        });

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
    	// Agregar ActionListener para el botón "Calendario"
        mntmCalendario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Abre la ventana de CalendarioING
                CalendarioING calendario = new CalendarioING();
                calendario.setVisible(true);
               
            }
        });

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
        JPanel panelFondo = new JPanel();
        contentPane.add(panelFondo, BorderLayout.CENTER);

        JLabel labelFondo = new JLabel("");
        labelFondo.setHorizontalAlignment(SwingConstants.CENTER);
        labelFondo.setIcon(new ImageIcon("src/Reto1/fotos/Fondo.png"));
        panelFondo.add(labelFondo, BorderLayout.CENTER);

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

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PruebaCambioVentas frame = new PruebaCambioVentas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
