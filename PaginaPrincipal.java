package Reto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.List;
import javax.swing.JMenu;

public class PaginaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaPrincipal frame = new PaginaPrincipal();
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
	public PaginaPrincipal() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\LMSG\\Fotos\\ideogram.jpeg"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		
		JButton btnIdioma = new JButton("ES/EN");
		menuBar.add(btnIdioma);
		btnIdioma.setBackground(new Color(139, 0, 0));
		btnIdioma.setForeground(new Color(255, 255, 255));
		btnIdioma.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JButton btnContacto = new JButton("Contacto");
		menuBar.add(btnContacto);
		btnContacto.setForeground(new Color(255, 255, 255));
		btnContacto.setBackground(new Color(139, 0, 0));
		btnContacto.setFont(new Font("Calibri", Font.BOLD, 20));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

}
