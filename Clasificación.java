package Java;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import java.awt.BorderLayout;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


public class Clasificacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clasificacion frame = new Clasificacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Clasificacion() {
		
		contentPane = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image background = new ImageIcon("C:\\Users\\ik_1DW3A\\Pictures\\Camera Roll\\Fondo.png").getImage();
                g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            }
        };
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
		
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("I:\\.shortcut-targets-by-id\\15dkCqPjbMIsgGF0lsmzUfUoErx1EL_qN\\G3-Reto1\\LMSG\\Fotos\\ideogram.jpeg"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1287, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
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

		contentPane.setLayout(new BorderLayout(0, 0));
		
		DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][] {
                        {"1", "CN Atlétic Barceloneta (Catalán)", "25", "10", "8", "1", "1", "68", "45", "+23"},
                        {"2", "CN La Latina (Madrid)", "20", "10", "6", "2", "2", "60", "43", "+17"},
                        {"3", "Urbat IKE (Eibar)", "19", "10", "6", "3", "1", "60", "50", "+10"},
                        {"4", "Club Askartza (Leioa)", "17", "10", "5", "3", "2", "52", "60", "-8"},
                        {"5", "CN Terrassa (Catalán)", "17", "10", "5", "3", "2", "55", "57", "-2"},
                        {"6", "Tenerife Echeyde (Tenerife)", "12", "10", "3", "4","3", "45", "70", "-25"},
                },
                new String[] {
                        "Posicion", "Equipos", "Puntos", "PJ", "PG", "PP", "PE", "GF", "GC", "DG"
                }
        );

        table = new JTable(tableModel);
        table.setFont(new Font("Calibri", Font.BOLD, 20));
        table.setGridColor(new Color(139, 0, 0));

        table.setRowHeight(40);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
        
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setMinWidth(80);
        column.setMaxWidth(80);
        column.setPreferredWidth(80);
        
        TableColumn column2 = table.getColumnModel().getColumn(1);
        column2.setMinWidth(275);
        column2.setMaxWidth(275);
        column2.setPreferredWidth(275);

        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 20));
        tableHeader.setBackground(Color.WHITE);
        tableHeader.setForeground(new Color(139, 0, 0));
 
        contentPane.setLayout(new BorderLayout(0, 0));
        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
        
        JLabel lblNewLabel = new JLabel("Clasificacion Waterpolo Temporada 2023/24");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setContentPane(contentPane);
        
        Panel panel = new Panel();
		panel.setBackground(new Color(139, 0, 0));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JPanel tableAndAbbreviationPanel = new JPanel();
		tableAndAbbreviationPanel.setLayout(new BoxLayout(tableAndAbbreviationPanel, BoxLayout.Y_AXIS));

		tableAndAbbreviationPanel.add(new JScrollPane(table));
		
		tableAndAbbreviationPanel.add(Box.createVerticalStrut(10));

		JPanel abbreviationPanel = new JPanel();
		abbreviationPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel abbreviationLabel1 = new JLabel("PG - Partidos Ganados   ");
		JLabel abbreviationLabel2 = new JLabel("PP - Partidos Perdidos   ");
		JLabel abbreviationLabel3 = new JLabel("PE - Partidos Empatados   ");
		JLabel abbreviationLabel4 = new JLabel("GF - Goles a Favor   ");
		JLabel abbreviationLabel5 = new JLabel("GC - Goles en Contra   ");
		JLabel abbreviationLabel6 = new JLabel("DG - Diferencia de Goles   ");
		JLabel abbreviationLabel7 = new JLabel("PJ - Partidos Jugados   ");

		abbreviationPanel.add(abbreviationLabel7);
		abbreviationPanel.add(abbreviationLabel1);
		abbreviationPanel.add(abbreviationLabel2);
		abbreviationPanel.add(abbreviationLabel3);
		abbreviationPanel.add(abbreviationLabel4);
		abbreviationPanel.add(abbreviationLabel5);
		abbreviationPanel.add(abbreviationLabel6);

		tableAndAbbreviationPanel.add(abbreviationPanel);

		contentPane.add(tableAndAbbreviationPanel, BorderLayout.CENTER);
		
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
		setContentPane(contentPane);
    }
}
