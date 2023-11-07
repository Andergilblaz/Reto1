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

import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


public class ClasificaciónIngles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClasificaciónIngles frame = new ClasificaciónIngles();
					frame.setVisible(true);
					frame.setResizable (false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ClasificaciónIngles() {
		
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
		setTitle("Spanish Waterpolo Classification");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 375);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo (null);
		
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
                        "Position", "Equipment", "Points", "MP", "MW", "ML", "MT", "GF", "GA", "GD"
                }
        );

        table = new JTable(tableModel);
        table.setFont(new Font("Calibri", Font.BOLD, 20));
        table.setGridColor(new Color(35, 33, 156));

        table.setRowHeight(40);

        table.setEnabled(false); //Si necesita hacer que la tabla sea editable, debe eliminarla.
        
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
        tableHeader.setForeground(new Color(35, 33, 156));
	tableHeader.setReorderingAllowed(false);
 
        contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Waterpolo Classification Season 2023/24");
	    lblNewLabel.setForeground(Color.BLACK);
	    lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    JPanel topPanel = new JPanel(new BorderLayout());
	    topPanel.add(lblNewLabel, BorderLayout.NORTH);
	    topPanel.add(new JScrollPane(table), BorderLayout.CENTER);
	    
	    JLabel lblAbbreviations = new JLabel("Abbreviations: MP - Matches Played   MW - Matches Won   ML - Matches Lost   MT - Matches Tied   GF - Goals in Favor   GA - Goals Against   GD - Goal Difference   ");
	    lblAbbreviations.setForeground(Color.BLACK);
	    lblAbbreviations.setFont(new Font("Calibri", Font.BOLD, 13));
	    lblAbbreviations.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(topPanel, BorderLayout.NORTH);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		contentPane.add(lblAbbreviations, BorderLayout.SOUTH);
	    setContentPane(contentPane);
    }
}
