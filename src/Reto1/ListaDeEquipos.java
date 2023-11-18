package Reto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;

public class ListaDeEquipos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDeEquipos frame = new ListaDeEquipos();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ListaDeEquipos() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Lista de equipos Waterpolo Español");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1500, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
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

		table = new JTable(tableModel) {
      private static final long serialVersionUID = 1L;

			@Override
      public boolean isCellEditable(int row, int column) {
          return false; // Establece todas las celdas como no editables
      }
  };

  table.setFont(new Font("Calibri", Font.BOLD, 20));
  table.setGridColor(new Color(139, 0, 0));
      
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(300);
        TableColumn firstColumn = table.getColumnModel().getColumn(0);
        TableColumn secondColumn = table.getColumnModel().getColumn(1); // Obtener la segunda columna

        int preferredWidth = secondColumn.getPreferredWidth();
        firstColumn.setPreferredWidth(preferredWidth);
        table.setRowHeight(40);

        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Calibri", Font.BOLD, 20));
        tableHeader.setBackground(Color.WHITE);
        tableHeader.setForeground(new Color(139, 0, 0));
 
        contentPane.setLayout(new BorderLayout(0, 0));
        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("Listado de los equipos:");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        contentPane.add(lblNewLabel, BorderLayout.NORTH);

        setContentPane(contentPane);
        
	}
}
