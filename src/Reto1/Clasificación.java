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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
                        {"1", "CN Atlétic Barceloneta", e1p, e1pj, e1pg, e1pp, e1pe, e1gf, e1gc, e1dg},
                        {"2", "Urbat IKE", e2p, e2pj, e2pg, e2pp, e2pe, e2gf, e2gc, e2dg},
                        {"3", "CN La Latina", e3p, e3pj, e3pg, e3pp, e3pe, e3gf, e3gc, e3dg},
                        {"4", "CN Terrasa", e4p, e4pj, e4pg, e4pp, e4pe, e4gf, e4gc, e4dg},
                        {"5", "Club Askartza", e5p, e5pj, e5pg, e5pp, e5pe, e5gf, e5gc, e5dg},
                        {"6", "Tenerife Echeyde", e6p, e6pj, e6pg, e6pp, e6pe, e6gf, e6gc, e6dg},
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
	int e1p;
	int e2p;
	int e3p;
	int e4p;
	int e5p;
	int e6p;
	
	//Partidos jugados	
	int e1pj; 
	int e2pj;
	int e3pj;
	int e4pj;
	int e5pj;
	int e6pj;

	//Partidos ganados
	int e1pg;
	int e2pg;
	int e3pg;
	int e4pg;
	int e5pg;
	int e6pg;
	
	//Partidos perdidos
	int e1pp;
	int e2pp;
	int e3pp;
	int e4pp;
	int e5pp;
	int e6pp;
	
	//Partidos empatados
	int e1pe; 
	int e2pe;
	int e3pe;
	int e4pe;
	int e5pe;
	int e6pe;
	
	//Goles a favor
	int e1gf;
	int e2gf;
	int e3gf;
	int e4gf;
	int e5gf;
	int e6gf;
	
	//Goles en contra
	int e1gc;
	int e2gc;
	int e3gc;
	int e4gc;
	int e5gc;
	int e6gc;
	
	// Diferencia de goles
	int e1dg;
	int e2dg;
	int e3dg;
	int e4dg;
	int e5dg;
	int e6dg;
	
	
	
	
	{	
	
		try (BufferedReader br = new BufferedReader(new FileReader("E1R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R1 = Integer.parseInt(ultimoNumero);
	            e1gf = numeroArchivoE1R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R2 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R3 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R4 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R5 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R6 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R7 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R8 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R9 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R10 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R1 = Integer.parseInt(ultimoNumero);
	            e2gf = numeroArchivoE2R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R2 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R3 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R4 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R5 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R6 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R7 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R8 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R9 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R10 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R1 = Integer.parseInt(ultimoNumero);
	            e3gf = numeroArchivoE3R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R2 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R3 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R4 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R5 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R6 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R7 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R8 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R9 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R10 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R1 = Integer.parseInt(ultimoNumero);
	            e4gf = numeroArchivoE4R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R2 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R3 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R4 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R5 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R6 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R7 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R8 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R9 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R10 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R1 = Integer.parseInt(ultimoNumero);
	            e5gf = numeroArchivoE5R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R2 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R3 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R4 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R5 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R6 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R7 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R8 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R9 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R10 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R1 = Integer.parseInt(ultimoNumero);
	            e6gf = numeroArchivoE6R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R2 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R3 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R4 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R5 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R6 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R7 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R8 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R9 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R10 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }


	
	//Codigo para la obtencion de goles en contra
	
	
	{	
	
		try (BufferedReader br = new BufferedReader(new FileReader("E1R1GC.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R1GC = Integer.parseInt(ultimoNumero);
	            e1gc = numeroArchivoE1R1GC;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R2GC.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R2GC = Integer.parseInt(ultimoNumero);
            e1gc=  e1gc += numeroArchivoE1R2GC;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R3 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R4 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R5 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R6 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R7 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R8 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E1R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE1R9 = Integer.parseInt(ultimoNumero);
	            e1gf=  e1gf += numeroArchivoE1R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE1R10 = Integer.parseInt(ultimoNumero);
            e1gf=  e1gf += numeroArchivoE1R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R1 = Integer.parseInt(ultimoNumero);
	            e2gf = numeroArchivoE2R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R2 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R3 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R4 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R5 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R6 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R7 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R8 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E2R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE2R9 = Integer.parseInt(ultimoNumero);
	            e2gf=  e2gf += numeroArchivoE2R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E2R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE2R10 = Integer.parseInt(ultimoNumero);
            e2gf=  e2gf += numeroArchivoE2R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R1 = Integer.parseInt(ultimoNumero);
	            e3gf = numeroArchivoE3R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R2 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R3 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R4 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R5 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R6 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R7 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R8 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E3R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE3R9 = Integer.parseInt(ultimoNumero);
	            e3gf=  e3gf += numeroArchivoE3R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E3R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE3R10 = Integer.parseInt(ultimoNumero);
            e3gf=  e3gf += numeroArchivoE3R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R1 = Integer.parseInt(ultimoNumero);
	            e4gf = numeroArchivoE4R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R2 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R3 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E1R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R4 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R5 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R6 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R7 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R8 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E4R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE4R9 = Integer.parseInt(ultimoNumero);
	            e4gf=  e4gf += numeroArchivoE4R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E4R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE4R10 = Integer.parseInt(ultimoNumero);
            e4gf=  e4gf += numeroArchivoE4R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R1 = Integer.parseInt(ultimoNumero);
	            e5gf = numeroArchivoE5R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R2 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R3 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R4 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R5 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R6 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R7 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R8 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E5R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE5R9 = Integer.parseInt(ultimoNumero);
	            e5gf=  e5gf += numeroArchivoE5R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E5R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE5R10 = Integer.parseInt(ultimoNumero);
            e5gf=  e5gf += numeroArchivoE5R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R1GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R1 = Integer.parseInt(ultimoNumero);
	            e6gf = numeroArchivoE6R1;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R2GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R2 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R2;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R3GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R3 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R3;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R4GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R4 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R4;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R5GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R5 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R5;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R6GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R6 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R6;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R7GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R7 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R7;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R8GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R8 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R8;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	{	
		
		try (BufferedReader br = new BufferedReader(new FileReader("E6R9GF.dat"))) {
	    String linea;
	    String ultimoNumero = "";
	    
	    // Lee cada línea del archivo
	    while ((linea = br.readLine()) != null) {
	        // Verifica si la línea tiene al menos un número
	        if (!linea.isEmpty()) {
	            // Toma el último número de la línea
	            if (linea.length() >= 2 || linea.length() == 1) {
	                ultimoNumero = linea.substring(Math.max(linea.length() - 2, 0)); // Captura los dos últimos caracteres o uno si solo hay uno
	            }
	        }
	    }
	    
	    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
	    if (!ultimoNumero.isEmpty()) {
	        try {
	            int numeroArchivoE6R9 = Integer.parseInt(ultimoNumero);
	            e6gf=  e6gf += numeroArchivoE6R9;
	        } catch (NumberFormatException e) {
	            System.out.println("El archivo no contiene un número válido.");
	        }
	    } else {
	        System.out.println("El archivo está vacío o no contiene números.");
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}

		
	{	
		
	try (BufferedReader br = new BufferedReader(new FileReader("E6R10GF.dat"))) {
    String linea;
    String ultimoNumero = "";
    
    // Lee cada línea del archivo
    while ((linea = br.readLine()) != null) {
        // Verifica si la línea tiene al menos dos caracteres y toma los últimos dos
        if (linea.length() >= 2) {
            ultimoNumero = linea.substring(linea.length() - 2);
        } else if (linea.length() == 1) {
            ultimoNumero = linea; // Si solo hay un número en la línea
        }
    }
    
    // Si se encontró un número válido, conviértelo a tipo numérico (por ejemplo, int)
    if (!ultimoNumero.isEmpty()) {
        try {
            int numeroArchivoE6R10 = Integer.parseInt(ultimoNumero);
            e6gf=  e6gf += numeroArchivoE6R10;
       
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene un número válido.");
        }
    } else {
        System.out.println("El archivo está vacío o no contiene números.");
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
	
	}	}	}	}	}	}	} } } }

	
	
}
	
	

	
