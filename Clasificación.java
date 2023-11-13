package Reto1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


public class Clasificación extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private Point initialClick;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clasificación frame = new Clasificación();
					frame.setVisible(true);
					frame.setResizable (false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Clasificación() {
		addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                int xMoved = thisX + (e.getX() - initialClick.x);
                int yMoved = thisY + (e.getY() - initialClick.y);

                setLocation(xMoved, yMoved);
            }
        });
		contentPane = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image background = new ImageIcon(" ").getImage();
                g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            }
        };
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 985, 372);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo (null);
		
		DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][] {
                        {"1", e1, e1p, e1pj, e1pg, e1pp, e1pe, e1gf, e1gc, e1dg},
                        {"2", e2, e2p, e2pj, e2pg, e2pp, e2pe, e2gf, e2gc, e2dg},
                        {"3", e3, e3p, e3pj, e3pg, e3pp, e3pe, e3gf, e3gc, e3dg},
                        {"4", e4, e4p, e4pj, e4pg, e4pp, e4pe, e4gf, e4gc, e4dg},
                        {"5", e5, e5p, e5pj, e5pg, e5pp, e5pe, e5gf, e5gc, e5dg},
                        {"6", e6, e6p, e6pj, e6pg, e6pp, e6pe, e6gf, e6gc, e6dg},
                },
                new String[] {
                        "Posicion", "Equipos", "Puntos", "PJ", "PG", "PP", "PE", "GF", "GC", "DG"
                }
        );

        table = new JTable(tableModel);
        table.setFont(new Font("Calibri", Font.BOLD, 20));
        table.setGridColor(new Color(139, 0, 0));

        table.setRowHeight(40);
	
	table.setEnabled(false); 

	table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
        table.getTableHeader().setResizingAllowed(false);
        
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
        tableHeader.setReorderingAllowed(false); 
 
        contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Clasificacion Waterpolo Temporada 2023/24");
	    lblNewLabel.setForeground(Color.BLACK);
	    lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    JPanel topPanel = new JPanel(new BorderLayout());
	    topPanel.add(lblNewLabel, BorderLayout.NORTH);
	    topPanel.add(new JScrollPane(table), BorderLayout.CENTER);
	    
	    JLabel lblAbbreviations = new JLabel("Abreviaturas: PG - Partidos Ganados   PP - Partidos Perdidos   PE - Partidos Empatados   GF - Goles a Favor   GC - Goles en Contra   DG - Diferencia de Goles   PJ - Partidos Jugados   ");
	    lblAbbreviations.setForeground(Color.BLACK);
	    lblAbbreviations.setFont(new Font("Calibri", Font.BOLD, 13));
	    lblAbbreviations.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(topPanel, BorderLayout.NORTH);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		contentPane.add(lblAbbreviations, BorderLayout.SOUTH);
	    setContentPane(contentPane);
    }
	
	//Equipos	
	Object e1; //Barceloneta
	Object e2; //Urbat
	Object e3; //Latina
	Object e4; //Terrasa
	Object e5; //Askartza
	Object e6; //Tenerife
	
	//Puntos
	Object e1p;
	Object e2p;
	Object e3p;
	Object e4p;
	Object e5p;
	Object e6p;
	
	//Partidos jugados	
	Object e1pj; 
	Object e2pj;
	Object e3pj;
	Object e4pj;
	Object e5pj;
	Object e6pj;

	//Partidos ganados
	Object e1pg;
	Object e2pg;
	Object e3pg;
	Object e4pg;
	Object e5pg;
	Object e6pg;
	
	//Partidos perdidos
	Object e1pp;
	Object e2pp;
	Object e3pp;
	Object e4pp;
	Object e5pp;
	Object e6pp;
	
	//Partidos empatados
	Object e1pe; 
	Object e2pe;
	Object e3pe;
	Object e4pe;
	Object e5pe;
	Object e6pe;
	
	//Goles a favor
	Object e1gf;
	Object e2gf;
	Object e3gf;
	Object e4gf;
	Object e5gf;
	Object e6gf;
	
	//Goles en contra
	Object e1gc;
	Object e2gc;
	Object e3gc;
	Object e4gc;
	Object e5gc;
	Object e6gc;
	
	// Diferencia de goles
	Object e1dg;
	Object e2dg;
	Object e3dg;
	Object e4dg;
	Object e5dg;
	Object e6dg;

	
}
