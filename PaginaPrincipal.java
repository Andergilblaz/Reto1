package Reto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\LMSG\\Fotos\\ideogram.jpeg"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1097, 707);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setExtendedState(this.MAXIMIZED_BOTH);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnPaginaPrincipal = new JButton("Página Principal");
		btnPaginaPrincipal.setBackground(new Color(139, 0, 0));
		btnPaginaPrincipal.setForeground(new Color(255, 255, 255));
		btnPaginaPrincipal.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnPaginaPrincipal);
		
		
		JButton btnResultados = new JButton("Resultados");
		btnResultados.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnResultados);
		
		JButton btnListaEquipos = new JButton("Lista Equipos");
		btnListaEquipos.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnListaEquipos);
		
		JButton btnCalendario = new JButton("Calendario");
		btnCalendario.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnCalendario);
		
		JButton btnClasificacion = new JButton("Clasificación");
		btnClasificacion.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnClasificacion);
		
		JButton btnSobreNosotros = new JButton("Sobre Nosotros");
		btnSobreNosotros.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnSobreNosotros);
		
		JButton btnFaq = new JButton("FAQ");
		btnFaq.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnFaq);
		
		JButton btnIdioma = new JButton("ES/EN");
		btnIdioma.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnIdioma);
		
		JButton btnContacto = new JButton("Contacto");
		btnContacto.setFont(new Font("Calibri", Font.BOLD, 20));
		panel.add(btnContacto);
	}

}
