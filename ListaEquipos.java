package Reto1;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


public class ListaEquipos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					equipo frame = new equipo();
					frame.setVisible(true);
					frame.setResizable (false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ListaEquipos() {
		
		contentPane = new JPanel() {
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 356);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo (null);
		
		DefaultTableModel tableModel = new DefaultTableModel(
				new Object[][] {
                    {"CN Atlétic Barceloneta", "Cataluña", "Barcelona", "Club Natació Atlétic-Barcelona", "Placa del Mar, s/n"},
                    {"CN La Latina", "Madrid", "Madrid", "Deportiva Municipal de La Latina", "PLAZA CEBADA, 15"},
                    {"Urbat IKE", "Gipuzkoa", "Eibar", "Paco Yoldi de Anoeta", "P.º de Anoeta, 18(Donostia)"},
                    {"Club Askartza", "Bizkaia", "Leioa", "Piscina de colegio Askartza Claret", "Sarriena Auzoa, 173"},
                    {"CN Terrassa", "Cataluña", "Terrassa", "Instalaciones Área Olímpica", "Av. de l'Abat Marcet, 200"},
                    {"Tenerife Echeyde", "Tenerife", "Santa Cruz de Tenerife", "Piscina Municipal Acidalio Lorenzo", "Av. de Benito Pérez Armas, 1"},
            },
            new String[] {
                    "Nombre Equipo", "Provincia", "Ciudad", "Piscina", "Direccion"
            }
    );

        table = new JTable(tableModel);
        table.setFont(new Font("Calibri", Font.BOLD, 16));
        table.setGridColor(new Color(35, 33, 156));

        table.setRowHeight(40);

	table.setEnabled(false); //Si necesita hacer que la tabla sea editable, debe eliminarla.

        TableColumn column = table.getColumnModel().getColumn(0);
        column.setMinWidth(170);
        column.setMaxWidth(170);
        column.setPreferredWidth(170);
        
        TableColumn column2 = table.getColumnModel().getColumn(1);
        column2.setMinWidth(120);
        column2.setMaxWidth(120);
        column2.setPreferredWidth(120);
        
        TableColumn column3 = table.getColumnModel().getColumn(2);
        column3.setMinWidth(160);
        column3.setMaxWidth(160);
        column3.setPreferredWidth(160);

        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 20));
        tableHeader.setBackground(Color.WHITE);
        tableHeader.setForeground(new Color(35, 33, 156));
 
        contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Lista de Equipos:");
	    lblNewLabel.setForeground(Color.BLACK);
	    lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    JPanel topPanel = new JPanel(new BorderLayout());
	    topPanel.add(lblNewLabel, BorderLayout.NORTH);
	    topPanel.add(new JScrollPane(table), BorderLayout.CENTER);
		
		contentPane.add(topPanel, BorderLayout.NORTH);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
	    setContentPane(contentPane);
    }
}
