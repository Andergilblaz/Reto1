	package Reto1;
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.border.EmptyBorder;
	import java.awt.BorderLayout;
	
	import javax.swing.ImageIcon;
	import java.awt.Font;
	import java.awt.Image;
	import java.awt.Toolkit;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.Color;
	import java.awt.Dimension;
	import javax.swing.SwingConstants;
	import javax.swing.JTabbedPane;
	import javax.swing.JButton;
	
	public class ResultadosEditable extends JFrame {
	
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JButton btnEditarE1R2;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ResultadosEditable frame = new ResultadosEditable();
						frame.setVisible(true);
						frame.setResizable(false);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		public ResultadosEditable() {
			setBackground(new Color(255, 255, 255));
			setForeground(new Color(139, 0, 0));
			setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
			setAlwaysOnTop(true);
			setTitle("Resultados Waterpolo Español");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 780, 498);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setPreferredSize(new Dimension(200,100));
			setLocationRelativeTo(null);
	
			
			
			setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			
			showImage();
		}
		public void showImage() {
	        new JLabel();
	        
	        ImageIcon originalImageIcon = new ImageIcon("/Reto1/fotos/LogoWaterpolo.png");
	        originalImageIcon.getIconWidth();
	        originalImageIcon.getIconHeight();
	
	        int targetWidth = 1200;
	        int targetHeight = 2000;
	
	        Image scaledImage = originalImageIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
	
	        new ImageIcon(scaledImage);
	
	        JScrollPane scrollPane = new JScrollPane();
	
	        scrollPane.setPreferredSize(new Dimension(800, 500));
	
	        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	
	        getContentPane().add(scrollPane, BorderLayout.CENTER);
	        
	        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	        scrollPane.setViewportView(tabbedPane);
	        
	        JPanel panel = new JPanel();
	        panel.setLayout(null);
	        tabbedPane.addTab("Jornada1", null, panel, null);
	        
	        JPanel panel_5 = new JPanel();
	        tabbedPane.addTab("Jornada2", null, panel_5, null);
	        panel_5.setLayout(null);
	        
	        JPanel panel_1_3_2 = new JPanel();
	        panel_1_3_2.setLayout(null);
	        panel_1_3_2.setBounds(10, 125, 729, 172);
	        panel_5.add(panel_1_3_2);
	        
	        JLabel lblE42 = new JLabel("CN Terrassa");
	        lblE42.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE42.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE42.setBounds(106, 45, 192, 25);
	        panel_1_3_2.add(lblE42);
	        
	        JLabel lblJornada_2_3 = new JLabel("Jornada 2");
	        lblJornada_2_3.setFont(new Font("Calibri", Font.BOLD, 25));
	        lblJornada_2_3.setBounds(310, 10, 109, 25);
	        panel_1_3_2.add(lblJornada_2_3);
	        
	        JLabel lblE4R2 = new JLabel("-");
	        lblE4R2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE4R2.setBounds(308, 46, 29, 22);
	        panel_1_3_2.add(lblE4R2);
	        
	        JLabel lblNewLabel_5_3_2 = new JLabel("VS");
	        lblNewLabel_5_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_5_3_2.setBounds(347, 47, 31, 20);
	        panel_1_3_2.add(lblNewLabel_5_3_2);
	        
	        JLabel lblE6R2 = new JLabel("-");
	        lblE6R2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE6R2.setBounds(403, 45, 29, 22);
	        panel_1_3_2.add(lblE6R2);
	        
	        JLabel lblE62 = new JLabel("Tenerife Echeyde");
	        lblE62.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE62.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE62.setBounds(442, 47, 193, 20);
	        panel_1_3_2.add(lblE62);
	        
	        JLabel lblE12 = new JLabel("CN Atlétic Barceloneta");
	        lblE12.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE12.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE12.setBounds(106, 80, 192, 20);
	        panel_1_3_2.add(lblE12);
	        
	        JLabel lblE1R2 = new JLabel("-");
	        lblE1R2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE1R2.setBounds(308, 74, 29, 32);
	        panel_1_3_2.add(lblE1R2);
	        
	        JLabel lblNewLabel_8_3_2 = new JLabel("VS");
	        lblNewLabel_8_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_8_3_2.setBounds(347, 75, 48, 30);
	        panel_1_3_2.add(lblNewLabel_8_3_2);
	        
	        JLabel lblE3R2 = new JLabel("-");
	        lblE3R2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE3R2.setBounds(403, 69, 29, 47);
	        panel_1_3_2.add(lblE3R2);
	        
	        JLabel lblE32 = new JLabel("CN La Latina");
	        lblE32.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE32.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE32.setBounds(442, 78, 193, 25);
	        panel_1_3_2.add(lblE32);
	        
	        JLabel lblE22 = new JLabel("Urbat IKE");
	        lblE22.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE22.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE22.setBounds(106, 109, 192, 20);
	        panel_1_3_2.add(lblE22);
	        
	        JLabel lblE2R2 = new JLabel("-");
	        lblE2R2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE2R2.setBounds(308, 101, 45, 36);
	        panel_1_3_2.add(lblE2R2);
	        
	        JLabel lblNewLabel_13_3_2 = new JLabel("VS");
	        lblNewLabel_13_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_13_3_2.setBounds(347, 109, 45, 20);
	        panel_1_3_2.add(lblNewLabel_13_3_2);
	        
	        JLabel lblE5R2 = new JLabel("-");
	        lblE5R2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE5R2.setBounds(403, 105, 45, 30);
	        panel_1_3_2.add(lblE5R2);
	        
	        JLabel lblE52 = new JLabel("Club Askartza");
	        lblE52.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE52.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE52.setBounds(442, 107, 193, 24);
	        panel_1_3_2.add(lblE52);
	        
	        JButton btnEditable1_1 = new JButton("Editar");
	        btnEditable1_1.setFont(new Font("Calibri", Font.PLAIN, 25));
	        btnEditable1_1.setBounds(219, -111, 106, 31);
	        panel_1_3_2.add(btnEditable1_1);
	        
	        JButton btnNewButton_1 = new JButton("Aceptar");
	        btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 25));
	        btnNewButton_1.setBounds(208, 258, 129, 31);
	        panel_1_3_2.add(btnNewButton_1);
	        
	        JButton btnEditarE4R2 = new JButton("Editar");
	        btnEditarE4R2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE4R2, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE4R2.setText(nuevoTexto);
	                          DatosPartido datos19 = new DatosPartido(nuevoTexto);
	                          datos19.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos19, "datos_partido_19.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE4R2, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE4R2, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados19 = DatosPartido.cargarDatos("datos_partido_19.dat");
	      if (datosGuardados19!= null) {
	          lblE4R2.setText(datosGuardados19.getResultado());
	      }
	        btnEditarE4R2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        btnEditarE4R2.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE4R2.setBounds(10, 45, 85, 25);
	        panel_1_3_2.add(btnEditarE4R2);
	        
	        btnEditarE1R2 = new JButton("Editar");
	        btnEditarE1R2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE1R2, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE1R2.setText(nuevoTexto);
	                          DatosPartido datos20 = new DatosPartido(nuevoTexto);
	                          datos20.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos20, "datos_partido_20.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE1R2, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE1R2, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados20 = DatosPartido.cargarDatos("datos_partido_20.dat");
	      if (datosGuardados20!= null) {
	          lblE1R2.setText(datosGuardados20.getResultado());
	      }
	        btnEditarE1R2.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE1R2.setBounds(10, 79, 85, 25);
	        panel_1_3_2.add(btnEditarE1R2);
	        
	        JButton btnEditarE2R2 = new JButton("Editar");
	        btnEditarE2R2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE2R2, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE2R2.setText(nuevoTexto);
	                          DatosPartido datos21 = new DatosPartido(nuevoTexto);
	                          datos21.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos21, "datos_partido_21.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE2R2, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE2R2, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados21 = DatosPartido.cargarDatos("datos_partido_21.dat");
	      if (datosGuardados21!= null) {
	          lblE2R2.setText(datosGuardados21.getResultado());
	      }
	        btnEditarE2R2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        btnEditarE2R2.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE2R2.setBounds(10, 112, 85, 25);
	        panel_1_3_2.add(btnEditarE2R2);
	        
	        JButton btnEditarE6R2 = new JButton("Editar");
	        btnEditarE6R2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE6R2, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE6R2.setText(nuevoTexto);
	                          DatosPartido datos22 = new DatosPartido(nuevoTexto);
	                          datos22.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos22, "datos_partido_22.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE6R2, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE6R2, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados22 = DatosPartido.cargarDatos("datos_partido_22.dat");
	      if (datosGuardados22!= null) {
	          lblE6R2.setText(datosGuardados22.getResultado());
	      }
	      
	        btnEditarE6R2.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE6R2.setBounds(644, 45, 85, 25);
	        panel_1_3_2.add(btnEditarE6R2);
	        
	        JButton btnEditarE3R2 = new JButton("Editar");
	        btnEditarE3R2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE3R2, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE3R2.setText(nuevoTexto);
	                          DatosPartido datos23 = new DatosPartido(nuevoTexto);
	                          datos23.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos23, "datos_partido_23.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE3R2, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE3R2, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados23 = DatosPartido.cargarDatos("datos_partido_23.dat");
	      if (datosGuardados23!= null) {
	          lblE3R2.setText(datosGuardados23.getResultado());
	      }
	        btnEditarE3R2.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE3R2.setBounds(644, 75, 85, 25);
	        panel_1_3_2.add(btnEditarE3R2);
	        
	        JButton btnEditarE5R2 = new JButton("Editar");
	        btnEditarE5R2.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE5R2, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE5R2.setText(nuevoTexto);
	                          DatosPartido datos24 = new DatosPartido(nuevoTexto);
	                          datos24.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos24, "datos_partido_24.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE5R2, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE5R2, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados24 = DatosPartido.cargarDatos("datos_partido_24.dat");
	      if (datosGuardados24!= null) {
	          lblE5R2.setText(datosGuardados24.getResultado());
	      }
	        btnEditarE5R2.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE5R2.setBounds(644, 109, 85, 25);
	        panel_1_3_2.add(btnEditarE5R2);
	        
	        JPanel panel_4 = new JPanel();
	        tabbedPane.addTab("Jornada3", null, panel_4, null);
	        panel_4.setLayout(null);
	        
	        JPanel panel_1_3_1_1 = new JPanel();
	        panel_1_3_1_1.setLayout(null);
	        panel_1_3_1_1.setBounds(10, 125, 729, 172);
	        panel_4.add(panel_1_3_1_1);
	        
	        JLabel lblE33 = new JLabel("CN La Latina");
	        lblE33.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE33.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE33.setBounds(90, 50, 197, 25);
	        panel_1_3_1_1.add(lblE33);
	        
	        JLabel lblJornada_2_2_1 = new JLabel("Jornada 3");
	        lblJornada_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblJornada_2_2_1.setFont(new Font("Calibri", Font.BOLD, 25));
	        lblJornada_2_2_1.setBounds(304, 10, 121, 31);
	        panel_1_3_1_1.add(lblJornada_2_2_1);
	        
	        JLabel lblE3R3 = new JLabel("-");
	        lblE3R3.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE3R3.setBounds(297, 52, 37, 20);
	        panel_1_3_1_1.add(lblE3R3);
	        
	        JLabel lblNewLabel_5_3_1_1 = new JLabel("VS");
	        lblNewLabel_5_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_5_3_1_1.setBounds(347, 52, 31, 20);
	        panel_1_3_1_1.add(lblNewLabel_5_3_1_1);
	        
	        JLabel lblE6R3 = new JLabel("-");
	        lblE6R3.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE6R3.setBounds(396, 53, 29, 22);
	        panel_1_3_1_1.add(lblE6R3);
	        
	        JLabel lblE63 = new JLabel("Tenerife Echeyde");
	        lblE63.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE63.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE63.setBounds(442, 52, 193, 20);
	        panel_1_3_1_1.add(lblE63);
	        
	        JLabel lblE43 = new JLabel("CN Terrassa");
	        lblE43.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE43.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE43.setBounds(90, 84, 197, 20);
	        panel_1_3_1_1.add(lblE43);
	        
	        JLabel lblE4R3 = new JLabel("-");
	        lblE4R3.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE4R3.setBounds(297, 78, 29, 32);
	        panel_1_3_1_1.add(lblE4R3);
	        
	        JLabel lblNewLabel_8_3_1_1 = new JLabel("VS");
	        lblNewLabel_8_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_8_3_1_1.setBounds(347, 79, 48, 30);
	        panel_1_3_1_1.add(lblNewLabel_8_3_1_1);
	        
	        JLabel lblE2R3 = new JLabel("-");
	        lblE2R3.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE2R3.setBounds(403, 73, 29, 47);
	        panel_1_3_1_1.add(lblE2R3);
	        
	        JLabel lblE23 = new JLabel("Urbat IKE");
	        lblE23.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE23.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE23.setBounds(442, 82, 193, 25);
	        panel_1_3_1_1.add(lblE23);
	        
	        JLabel lbl53 = new JLabel("Club Askartza");
	        lbl53.setHorizontalAlignment(SwingConstants.CENTER);
	        lbl53.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lbl53.setBounds(90, 114, 197, 20);
	        panel_1_3_1_1.add(lbl53);
	        
	        JLabel lblE5R3 = new JLabel("-");
	        lblE5R3.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE5R3.setBounds(297, 106, 45, 36);
	        panel_1_3_1_1.add(lblE5R3);
	        
	        JLabel lblNewLabel_13_3_1_1 = new JLabel("VS");
	        lblNewLabel_13_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_13_3_1_1.setBounds(347, 114, 45, 20);
	        panel_1_3_1_1.add(lblNewLabel_13_3_1_1);
	        
	        JLabel lblE1R3 = new JLabel("-");
	        lblE1R3.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE1R3.setBounds(403, 110, 45, 30);
	        panel_1_3_1_1.add(lblE1R3);
	        
	        JLabel lblE13 = new JLabel("CN Atlétic Barceloneta");
	        lblE13.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE13.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE13.setBounds(442, 112, 193, 24);
	        panel_1_3_1_1.add(lblE13);
	        
	        JButton btnEditarE3R3 = new JButton("Editar");
	        btnEditarE3R3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE3R3, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE3R3.setText(nuevoTexto);
	                          DatosPartido datos25 = new DatosPartido(nuevoTexto);
	                          datos25.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos25, "datos_partido_25.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE3R3, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE3R3, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados25 = DatosPartido.cargarDatos("datos_partido_25.dat");
	      if (datosGuardados25!= null) {
	          lblE3R3.setText(datosGuardados25.getResultado());
	      }
	        btnEditarE3R3.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE3R3.setBounds(10, 50, 85, 25);
	        panel_1_3_1_1.add(btnEditarE3R3);
	        
	        JButton btnEditarE4R3 = new JButton("Editar");
	        btnEditarE4R3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE4R3, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE4R3.setText(nuevoTexto);
	                          DatosPartido datos25 = new DatosPartido(nuevoTexto);
	                          datos25.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos25, "datos_partido_26.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE4R3, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE4R3, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados26 = DatosPartido.cargarDatos("datos_partido_26.dat");
	      if (datosGuardados25!= null) {
	          lblE4R3.setText(datosGuardados26.getResultado());
	      }
	        btnEditarE4R3.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE4R3.setBounds(10, 84, 85, 25);
	        panel_1_3_1_1.add(btnEditarE4R3);
	        
	        JButton btnEditarE5R3 = new JButton("Editar");
	        btnEditarE5R3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE5R3, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE5R3.setText(nuevoTexto);
	                          DatosPartido datos27 = new DatosPartido(nuevoTexto);
	                          datos27.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos27, "datos_partido_27.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE5R3, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE5R3, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados27 = DatosPartido.cargarDatos("datos_partido_27.dat");
	      if (datosGuardados25!= null) {
	          lblE5R3.setText(datosGuardados27.getResultado());
	      }
	        btnEditarE5R3.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE5R3.setBounds(10, 117, 85, 25);
	        panel_1_3_1_1.add(btnEditarE5R3);
	        
	        JButton btnEditarE6R3 = new JButton("Editar");
	        btnEditarE6R3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE6R3, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE6R3.setText(nuevoTexto);
	                          DatosPartido datos28= new DatosPartido(nuevoTexto);
	                          datos28.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos28, "datos_partido_28.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE6R3, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE6R3, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados28 = DatosPartido.cargarDatos("datos_partido_28.dat");
	      if (datosGuardados28!= null) {
	          lblE6R3.setText(datosGuardados28.getResultado());
	      }
	        btnEditarE6R3.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE6R3.setBounds(644, 50, 85, 25);
	        panel_1_3_1_1.add(btnEditarE6R3);
	        
	        JButton btnEditarE2R3 = new JButton("Editar");
	        btnEditarE2R3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE2R3, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE2R3.setText(nuevoTexto);
	                          DatosPartido datos29 = new DatosPartido(nuevoTexto);
	                          datos29.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos29, "datos_partido_29.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE2R3, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE2R3, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados29 = DatosPartido.cargarDatos("datos_partido_29.dat");
	      if (datosGuardados29!= null) {
	          lblE2R3.setText(datosGuardados29.getResultado());
	      }
	        btnEditarE2R3.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE2R3.setBounds(644, 80, 85, 25);
	        panel_1_3_1_1.add(btnEditarE2R3);
	        
	        JButton btnEditarE1R3 = new JButton("Editar");
	        btnEditarE1R3.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE1R3, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE1R3.setText(nuevoTexto);
	                          DatosPartido datos30 = new DatosPartido(nuevoTexto);
	                          datos30.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos30, "datos_partido_30.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE1R3, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE1R3, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados30 = DatosPartido.cargarDatos("datos_partido_30.dat");
	      if (datosGuardados30!= null) {
	          lblE1R3.setText(datosGuardados30.getResultado());
	      }
	        btnEditarE1R3.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE1R3.setBounds(644, 114, 85, 25);
	        panel_1_3_1_1.add(btnEditarE1R3);
	        panel.setSize(400,250);
	        
	        JPanel panel_2 = new JPanel();
	        tabbedPane.addTab("Jornada4", null, panel_2, null);
	        panel.setSize(400,250);
	        
	        JPanel panel_1_3_1 = new JPanel();
	        panel_1_3_1.setLayout(null);
	        panel_1_3_1.setBounds(10, 125, 729, 172);
	        panel.add(panel_1_3_1);
	        
	        JLabel lblE1 = new JLabel("CN Atlétic Barceloneta");
	        lblE1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE1.setBounds(100, 54, 197, 25);
	        panel_1_3_1.add(lblE1);
	        
	        JLabel lblJornada1 = new JLabel("Jornada 1");
	        lblJornada1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblJornada1.setFont(new Font("Calibri", Font.BOLD, 25));
	        lblJornada1.setBounds(304, 10, 121, 31);
	        panel_1_3_1.add(lblJornada1);
	        
	        JLabel lblE1R1 = new JLabel("-");
	        lblE1R1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE1R1.setBounds(307, 51, 29, 30);
	        panel_1_3_1.add(lblE1R1);
	        
	        
	        JLabel lblJ1VS = new JLabel("VS");
	        lblJ1VS.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblJ1VS.setBounds(346, 56, 31, 20);
	        panel_1_3_1.add(lblJ1VS);
	        
	        JLabel lblE2R1 = new JLabel("-");
	        lblE2R1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE2R1.setBounds(402, 54, 29, 22);
	        panel_1_3_1.add(lblE2R1);
	        
	        JLabel lblE2 = new JLabel("Urbat IKE");
	        lblE2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE2.setBounds(441, 56, 193, 20);
	        panel_1_3_1.add(lblE2);
	        
	        JLabel lblE3 = new JLabel("CN La Latina");
	        lblE3.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE3.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE3.setBounds(105, 89, 174, 20);
	        panel_1_3_1.add(lblE3);
	        
	        JLabel lblE3R1 = new JLabel("-");
	        lblE3R1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE3R1.setBounds(307, 83, 29, 32);
	        panel_1_3_1.add(lblE3R1);
	        
	        JLabel lblNewLabel_8_3_1 = new JLabel("VS");
	        lblNewLabel_8_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_8_3_1.setBounds(346, 84, 48, 30);
	        panel_1_3_1.add(lblNewLabel_8_3_1);
	        
	        JLabel lblE4R1 = new JLabel("-");
	        lblE4R1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE4R1.setBounds(402, 78, 29, 47);
	        panel_1_3_1.add(lblE4R1);
	        
	        JLabel lblE4 = new JLabel("CN Terrassa");
	        lblE4.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE4.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE4.setBounds(441, 87, 193, 25);
	        panel_1_3_1.add(lblE4);
	        
	        JLabel lblE5 = new JLabel("Club Askartza");
	        lblE5.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE5.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE5.setBounds(105, 126, 187, 20);
	        panel_1_3_1.add(lblE5);
	        
	        JLabel lblE5R1 = new JLabel("-");
	        lblE5R1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE5R1.setBounds(307, 118, 45, 36);
	        panel_1_3_1.add(lblE5R1);
	        
	        JLabel lblNewLabel_13_3_1 = new JLabel("VS");
	        lblNewLabel_13_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_13_3_1.setBounds(346, 126, 45, 20);
	        panel_1_3_1.add(lblNewLabel_13_3_1);
	        
	        JLabel lblE6R1 = new JLabel("-");
	        lblE6R1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE6R1.setBounds(402, 122, 45, 30);
	        panel_1_3_1.add(lblE6R1);
	        
	        JLabel lblE6 = new JLabel("Tenerife Echeyde");
	        lblE6.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE6.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE6.setBounds(441, 124, 193, 24);
	        panel_1_3_1.add(lblE6);
	        
	        JButton btnEditarE1R1 = new JButton("Editar");
	        btnEditarE1R1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE1R1, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE1R1.setText(nuevoTexto);
	                          DatosPartido datos = new DatosPartido(nuevoTexto);
	                          datos.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos, "datos_partido_1.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE1R1, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE1R1, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados = DatosPartido.cargarDatos("datos_partido_1.dat");
	      if (datosGuardados != null) {
	          lblE1R1.setText(datosGuardados.getResultado());
	      }
	
	        btnEditarE1R1.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE1R1.setBounds(10, 54, 85, 25);
	        panel_1_3_1.add(btnEditarE1R1);
	        
	        JButton btnEditarE3R1 = new JButton("Editar");
	        btnEditarE3R1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE3R1, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE3R1.setText(nuevoTexto);
	                          DatosPartido datos2 = new DatosPartido(nuevoTexto);
	                          datos2.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos2, "datos_partido_2.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE3R1, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE3R1, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados2 = DatosPartido.cargarDatos("datos_partido_2.dat");
	      if (datosGuardados2 != null) {
	          lblE3R1.setText(datosGuardados2.getResultado());
	      }
	        btnEditarE3R1.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE3R1.setBounds(10, 88, 85, 25);
	        panel_1_3_1.add(btnEditarE3R1);
	        
	        JButton btnEditarE5R1 = new JButton("Editar");       
	        btnEditarE5R1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE5R1, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE5R1.setText(nuevoTexto);
	                          DatosPartido datos3 = new DatosPartido(nuevoTexto);
	                          datos3.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos3, "datos_partido_3.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE5R1, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE5R1, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados3 = DatosPartido.cargarDatos("datos_partido_3.dat");
	      if (datosGuardados3!= null) {
	          lblE5R1.setText(datosGuardados3.getResultado());
	      }
	        btnEditarE5R1.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE5R1.setBounds(10, 121, 85, 25);
	        panel_1_3_1.add(btnEditarE5R1);
	        
	        JButton btnEditarE2R1 = new JButton("Editar");
	        btnEditarE2R1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE2R1, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE2R1.setText(nuevoTexto);
	                          DatosPartido datos4 = new DatosPartido(nuevoTexto);
	                          datos4.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos4, "datos_partido_4.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE2R1, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE2R1, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados4 = DatosPartido.cargarDatos("datos_partido_4.dat");
	      if (datosGuardados4!= null) {
	          lblE2R1.setText(datosGuardados4.getResultado());
	      }
	        btnEditarE2R1.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE2R1.setBounds(644, 54, 85, 25);
	        panel_1_3_1.add(btnEditarE2R1);
	        
	        
	        JButton btnEditarE6R1 = new JButton("Editar");
	        btnEditarE6R1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE6R1, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE6R1.setText(nuevoTexto);
	                          DatosPartido datos6 = new DatosPartido(nuevoTexto);
	                          datos6.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos6, "datos_partido_6.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE6R1, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE6R1, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados6 = DatosPartido.cargarDatos("datos_partido_6.dat");
	      if (datosGuardados6!= null) {
	          lblE6R1.setText(datosGuardados6.getResultado());
	      }
	        btnEditarE6R1.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE6R1.setBounds(644, 118, 85, 25);
	        panel_1_3_1.add(btnEditarE6R1);
	        
	        JButton btnEditarE4R1 = new JButton("Editar");
	        btnEditarE4R1.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE4R1, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE4R1.setText(nuevoTexto);
	                          DatosPartido datos5 = new DatosPartido(nuevoTexto);
	                          datos5.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos5, "datos_partido_5.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE4R1, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE4R1, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados5 = DatosPartido.cargarDatos("datos_partido_5.dat");
	      if (datosGuardados5!= null) {
	          lblE4R1.setText(datosGuardados5.getResultado());
	      }
	      btnEditarE4R1.setFont(new Font("Calibri", Font.PLAIN, 20));
	      btnEditarE4R1.setBounds(644, 88, 85, 25);
	        panel_1_3_1.add(btnEditarE4R1);
	        panel_2.setLayout(null);
	        
	        JPanel panel_1_3_1_2 = new JPanel();
	        panel_1_3_1_2.setLayout(null);
	        panel_1_3_1_2.setBounds(13, 125, 727, 172);
	        panel_2.add(panel_1_3_1_2);
	        
	        JLabel lblE54 = new JLabel("Club Askartza");
	        lblE54.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE54.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE54.setBounds(92, 51, 197, 25);
	        panel_1_3_1_2.add(lblE54);
	        
	        JLabel lblJornada_2_2_2 = new JLabel("Jornada 4");
	        lblJornada_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblJornada_2_2_2.setFont(new Font("Calibri", Font.BOLD, 25));
	        lblJornada_2_2_2.setBounds(303, 10, 121, 31);
	        panel_1_3_1_2.add(lblJornada_2_2_2);
	        
	        JLabel lblE5R4 = new JLabel("-");
	        lblE5R4.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE5R4.setBounds(299, 51, 29, 25);
	        panel_1_3_1_2.add(lblE5R4);
	        
	        JLabel lblNewLabel_5_3_1_2 = new JLabel("VS");
	        lblNewLabel_5_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_5_3_1_2.setBounds(349, 53, 31, 20);
	        panel_1_3_1_2.add(lblNewLabel_5_3_1_2);
	        
	        JLabel lblE3R4 = new JLabel("-");
	        lblE3R4.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE3R4.setBounds(405, 51, 29, 25);
	        panel_1_3_1_2.add(lblE3R4);
	        
	        JLabel lbl34 = new JLabel("CN La Latina");
	        lbl34.setHorizontalAlignment(SwingConstants.CENTER);
	        lbl34.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lbl34.setBounds(444, 53, 193, 20);
	        panel_1_3_1_2.add(lbl34);
	        
	        JLabel lblE24 = new JLabel("Urbat IKE");
	        lblE24.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE24.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE24.setBounds(92, 87, 197, 20);
	        panel_1_3_1_2.add(lblE24);
	        
	        JLabel lblE2R4 = new JLabel("-");
	        lblE2R4.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE2R4.setBounds(303, 86, 29, 32);
	        panel_1_3_1_2.add(lblE2R4);
	        
	        JLabel lblNewLabel_8_3_1_2 = new JLabel("VS");
	        lblNewLabel_8_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_8_3_1_2.setBounds(349, 82, 48, 30);
	        panel_1_3_1_2.add(lblNewLabel_8_3_1_2);
	        
	        JLabel lblE6R4 = new JLabel("-");
	        lblE6R4.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE6R4.setBounds(405, 76, 29, 47);
	        panel_1_3_1_2.add(lblE6R4);
	        
	        JLabel lblE64 = new JLabel("Tenerife Echeyde");
	        lblE64.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE64.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE64.setBounds(444, 85, 193, 25);
	        panel_1_3_1_2.add(lblE64);
	        
	        JLabel lblE14 = new JLabel("CN Atlétic Barceloneta");
	        lblE14.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE14.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE14.setBounds(89, 123, 203, 20);
	        panel_1_3_1_2.add(lblE14);
	        
	        JLabel lblE1R4 = new JLabel("-");
	        lblE1R4.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE1R4.setBounds(303, 115, 45, 36);
	        panel_1_3_1_2.add(lblE1R4);
	        
	        JLabel lblNewLabel_13_3_1_2 = new JLabel("VS");
	        lblNewLabel_13_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_13_3_1_2.setBounds(346, 123, 45, 20);
	        panel_1_3_1_2.add(lblNewLabel_13_3_1_2);
	        
	        JLabel lblE4R4 = new JLabel("-");
	        lblE4R4.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE4R4.setBounds(402, 119, 45, 30);
	        panel_1_3_1_2.add(lblE4R4);
	        
	        JLabel lblE44 = new JLabel("CN Terrassa");
	        lblE44.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE44.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE44.setBounds(441, 121, 193, 24);
	        panel_1_3_1_2.add(lblE44);
	        
	        JButton btnEditarE5R4 = new JButton("Editar");
	        btnEditarE5R4.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE5R4, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE5R4.setText(nuevoTexto);
	                          DatosPartido datos7 = new DatosPartido(nuevoTexto);
	                          datos7.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos7, "datos_partido_7.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE5R4, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE5R4, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados7 = DatosPartido.cargarDatos("datos_partido_7.dat");
	      if (datosGuardados7!= null) {
	          lblE5R4.setText(datosGuardados7.getResultado());
	      }
	        btnEditarE5R4.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE5R4.setBounds(4, 51, 85, 25);
	        panel_1_3_1_2.add(btnEditarE5R4);
	        
	        JButton btnEditarE2R4 = new JButton("Editar");
	        btnEditarE2R4.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE2R4, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE2R4.setText(nuevoTexto);
	                          DatosPartido datos8 = new DatosPartido(nuevoTexto);
	                          datos8.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos8, "datos_partido_8.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE2R4, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE2R4, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados8 = DatosPartido.cargarDatos("datos_partido_8.dat");
	      if (datosGuardados8!= null) {
	          lblE2R4.setText(datosGuardados8.getResultado());
	      }
	        btnEditarE2R4.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE2R4.setBounds(4, 85, 85, 25);
	        panel_1_3_1_2.add(btnEditarE2R4);
	        
	        JButton btnEditarE1R4 = new JButton("Editar");
	        btnEditarE1R4.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE1R4, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE1R4.setText(nuevoTexto);
	                          DatosPartido datos9 = new DatosPartido(nuevoTexto);
	                          datos9.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos9, "datos_partido_9.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE1R4, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE1R4, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados9 = DatosPartido.cargarDatos("datos_partido_9.dat");
	      if (datosGuardados9!= null) {
	          lblE1R4.setText(datosGuardados9.getResultado());
	      }
	        btnEditarE1R4.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE1R4.setBounds(4, 118, 85, 25);
	        panel_1_3_1_2.add(btnEditarE1R4);
	        
	        JButton btnEditarE4R4 = new JButton("Editar");
	        btnEditarE4R4.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE4R4, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE4R4.setText(nuevoTexto);
	                          DatosPartido datos10 = new DatosPartido(nuevoTexto);
	                          datos10.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos10, "datos_partido_10.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE4R4, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE4R4, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados10 = DatosPartido.cargarDatos("datos_partido_10.dat");
	      if (datosGuardados10!= null) {
	          lblE4R4.setText(datosGuardados10.getResultado());
	      }
	        btnEditarE4R4.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE4R4.setBounds(638, 115, 85, 25);
	        panel_1_3_1_2.add(btnEditarE4R4);
	        
	        JButton btnEditarE6R4 = new JButton("Editar");
	        btnEditarE6R4.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE6R4, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE6R4.setText(nuevoTexto);
	                          DatosPartido datos11 = new DatosPartido(nuevoTexto);
	                          datos11.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos11, "datos_partido_11.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE6R4, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE6R4, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados11 = DatosPartido.cargarDatos("datos_partido_11.dat");
	      if (datosGuardados11!= null) {
	          lblE6R4.setText(datosGuardados11.getResultado());
	      }
	        btnEditarE6R4.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE6R4.setBounds(638, 81, 85, 25);
	        panel_1_3_1_2.add(btnEditarE6R4);
	        
	        JButton btnEditarE3R4 = new JButton("Editar");
	        btnEditarE3R4.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE3R4, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE3R4.setText(nuevoTexto);
	                          DatosPartido datos12 = new DatosPartido(nuevoTexto);
	                          datos12.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos12, "datos_partido_12.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE3R4, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE3R4, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados12 = DatosPartido.cargarDatos("datos_partido_12.dat");
	      if (datosGuardados12!= null) {
	          lblE3R4.setText(datosGuardados12.getResultado());
	      }
	        btnEditarE3R4.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE3R4.setBounds(638, 51, 85, 25);
	        panel_1_3_1_2.add(btnEditarE3R4);
	        
	        JPanel panel_3 = new JPanel();
	        tabbedPane.addTab("Jornada5", null, panel_3, null);
	        panel_3.setLayout(null);
	        
	        JPanel panel_1_1_2_1 = new JPanel();
	        panel_1_1_2_1.setBounds(1129, 25, 1, 1);
	        panel_3.add(panel_1_1_2_1);
	        panel_1_1_2_1.setLayout(null);
	        
	        JLabel lblUrbatIke_1_1 = new JLabel("Urbat IKE");
	        lblUrbatIke_1_1.setBounds(5, 8, 77, 25);
	        lblUrbatIke_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblUrbatIke_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblUrbatIke_1_1);
	        
	        JLabel lblJornada_1_1 = new JLabel("Jornada 5");
	        lblJornada_1_1.setBounds(87, 5, 100, 31);
	        lblJornada_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
	        panel_1_1_2_1.add(lblJornada_1_1);
	        
	        JLabel lblNewLabel_1_2_2_1 = new JLabel("-");
	        lblNewLabel_1_2_2_1.setBounds(192, 8, 6, 25);
	        lblNewLabel_1_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_1_2_2_1);
	        
	        JLabel lblNewLabel_5_2_2_1 = new JLabel("VS");
	        lblNewLabel_5_2_2_1.setBounds(203, 8, 20, 25);
	        lblNewLabel_5_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_5_2_2_1);
	        
	        JLabel lblNewLabel_2_2_2_1 = new JLabel("-");
	        lblNewLabel_2_2_2_1.setBounds(228, 8, 6, 25);
	        lblNewLabel_2_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_2_2_2_1);
	        
	        JLabel lblNewLabel_3_2_2_1 = new JLabel("CN La Latina");
	        lblNewLabel_3_2_2_1.setBounds(239, 8, 103, 25);
	        lblNewLabel_3_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_3_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_3_2_2_1);
	        
	        JLabel lblNewLabel_6_2_2_1 = new JLabel("Club Askartza");
	        lblNewLabel_6_2_2_1.setBounds(347, 8, 111, 25);
	        lblNewLabel_6_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_6_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_6_2_2_1);
	        
	        JLabel lblNewLabel_7_2_2_1 = new JLabel("-");
	        lblNewLabel_7_2_2_1.setBounds(463, 8, 6, 25);
	        lblNewLabel_7_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_7_2_2_1);
	        
	        JLabel lblNewLabel_8_1_2_1 = new JLabel("VS");
	        lblNewLabel_8_1_2_1.setBounds(474, 8, 20, 25);
	        lblNewLabel_8_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_8_1_2_1);
	        
	        JLabel lblNewLabel_9_1_2_1 = new JLabel("-");
	        lblNewLabel_9_1_2_1.setBounds(499, 8, 6, 25);
	        lblNewLabel_9_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_9_1_2_1);
	        
	        JLabel lblNewLabel_10_2_2_1 = new JLabel("CN Terrassa");
	        lblNewLabel_10_2_2_1.setBounds(510, 8, 98, 25);
	        lblNewLabel_10_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_10_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_10_2_2_1);
	        
	        JLabel lblNewLabel_11_2_2_1 = new JLabel("Tenerife Echeyde");
	        lblNewLabel_11_2_2_1.setBounds(613, 8, 138, 25);
	        lblNewLabel_11_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_11_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_11_2_2_1);
	        
	        JLabel lblNewLabel_12_1_2_1 = new JLabel("-");
	        lblNewLabel_12_1_2_1.setBounds(756, 8, 6, 25);
	        lblNewLabel_12_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_12_1_2_1);
	        
	        JLabel lblNewLabel_13_1_2_1 = new JLabel("VS");
	        lblNewLabel_13_1_2_1.setBounds(767, 8, 20, 25);
	        lblNewLabel_13_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_13_1_2_1);
	        
	        JLabel lblNewLabel_14_2_2_1 = new JLabel("-");
	        lblNewLabel_14_2_2_1.setBounds(792, 8, 6, 25);
	        lblNewLabel_14_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_14_2_2_1);
	        
	        JLabel lblNewLabel_15_2_2_1 = new JLabel("CN Atlétic Barceloneta");
	        lblNewLabel_15_2_2_1.setBounds(803, 8, 182, 25);
	        lblNewLabel_15_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_15_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
	        panel_1_1_2_1.add(lblNewLabel_15_2_2_1);
	        
	        JPanel panel_1_1_2_3 = new JPanel();
	        panel_1_1_2_3.setLayout(null);
	        panel_1_1_2_3.setBounds(10, 125, 727, 172);
	        panel_3.add(panel_1_1_2_3);
	        
	        JLabel lblE25 = new JLabel("Urbat IKE");
	        lblE25.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE25.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE25.setBounds(101, 52, 188, 25);
	        panel_1_1_2_3.add(lblE25);
	        
	        JLabel lblJornada_1_2 = new JLabel("Jornada 5");
	        lblJornada_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblJornada_1_2.setFont(new Font("Calibri", Font.BOLD, 25));
	        lblJornada_1_2.setBounds(313, 10, 100, 31);
	        panel_1_1_2_3.add(lblJornada_1_2);
	        
	        JLabel lblE2R5 = new JLabel("-");
	        lblE2R5.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE2R5.setBounds(304, 52, 29, 19);
	        panel_1_1_2_3.add(lblE2R5);
	        
	        JLabel lblNewLabel_5_2_2_2 = new JLabel("VS");
	        lblNewLabel_5_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_5_2_2_2.setBounds(343, 54, 31, 20);
	        panel_1_1_2_3.add(lblNewLabel_5_2_2_2);
	        
	        JLabel lblE3R5 = new JLabel("-");
	        lblE3R5.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE3R5.setBounds(399, 52, 29, 22);
	        panel_1_1_2_3.add(lblE3R5);
	        
	        JLabel lblE35 = new JLabel("CN La Latina");
	        lblE35.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE35.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE35.setBounds(438, 54, 193, 20);
	        panel_1_1_2_3.add(lblE35);
	        
	        JLabel lblE55 = new JLabel("Club Askartza");
	        lblE55.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE55.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE55.setBounds(101, 93, 193, 20);
	        panel_1_1_2_3.add(lblE55);
	        
	        JLabel lblE5R5 = new JLabel("-");
	        lblE5R5.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE5R5.setBounds(304, 87, 29, 32);
	        panel_1_1_2_3.add(lblE5R5);
	        
	        JLabel lblNewLabel_8_1_2_2 = new JLabel("VS");
	        lblNewLabel_8_1_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_8_1_2_2.setBounds(343, 88, 48, 30);
	        panel_1_1_2_3.add(lblNewLabel_8_1_2_2);
	        
	        JLabel lblE4R5 = new JLabel("-");
	        lblE4R5.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE4R5.setBounds(399, 82, 29, 47);
	        panel_1_1_2_3.add(lblE4R5);
	        
	        JLabel lblE45 = new JLabel("CN Terrassa");
	        lblE45.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE45.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE45.setBounds(438, 91, 193, 25);
	        panel_1_1_2_3.add(lblE45);
	        
	        JLabel lblE65 = new JLabel("Tenerife Echeyde");
	        lblE65.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE65.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE65.setBounds(101, 132, 188, 20);
	        panel_1_1_2_3.add(lblE65);
	        
	        JLabel lblE6R5 = new JLabel("-");
	        lblE6R5.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE6R5.setBounds(304, 124, 45, 36);
	        panel_1_1_2_3.add(lblE6R5);
	        
	        JLabel lblNewLabel_13_1_2_2 = new JLabel("VS");
	        lblNewLabel_13_1_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblNewLabel_13_1_2_2.setBounds(343, 132, 45, 20);
	        panel_1_1_2_3.add(lblNewLabel_13_1_2_2);
	        
	        JLabel lblE1R5 = new JLabel("-");
	        lblE1R5.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE1R5.setBounds(399, 128, 45, 30);
	        panel_1_1_2_3.add(lblE1R5);
	        
	        JLabel lblE15 = new JLabel("CN Atlétic Barceloneta");
	        lblE15.setHorizontalAlignment(SwingConstants.CENTER);
	        lblE15.setFont(new Font("Calibri", Font.ITALIC, 20));
	        lblE15.setBounds(438, 130, 193, 24);
	        panel_1_1_2_3.add(lblE15);
	        
	        JButton btnEditarE2R5 = new JButton("Editar");
	        btnEditarE2R5.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE2R5, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE2R5.setText(nuevoTexto);
	                          DatosPartido datos13 = new DatosPartido(nuevoTexto);
	                          datos13.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos13, "datos_partido_13.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE2R5, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE2R5, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados13 = DatosPartido.cargarDatos("datos_partido_13.dat");
	      if (datosGuardados13!= null) {
	          lblE2R5.setText(datosGuardados13.getResultado());
	      }
	       
	        btnEditarE2R5.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE2R5.setBounds(10, 52, 85, 25);
	        panel_1_1_2_3.add(btnEditarE2R5);
	        
	        JButton btnEditarE5R5 = new JButton("Editar");
	        btnEditarE5R5.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE5R5, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE5R5.setText(nuevoTexto);
	                          DatosPartido datos14 = new DatosPartido(nuevoTexto);
	                          datos14.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos14, "datos_partido_14.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE5R5, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE5R5, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados14 = DatosPartido.cargarDatos("datos_partido_14.dat");
	      if (datosGuardados14!= null) {
	          lblE5R5.setText(datosGuardados14.getResultado());
	      }
	        btnEditarE5R5.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE5R5.setBounds(10, 91, 85, 25);
	        panel_1_1_2_3.add(btnEditarE5R5);
	        
	        JButton btnEditarE6R5 = new JButton("Editar");
	        btnEditarE6R5.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE6R5, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE6R5.setText(nuevoTexto);
	                          DatosPartido datos15 = new DatosPartido(nuevoTexto);
	                          datos15.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos15, "datos_partido_15.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE6R5, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE6R5, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados15 = DatosPartido.cargarDatos("datos_partido_15.dat");
	      if (datosGuardados15!= null) {
	          lblE6R5.setText(datosGuardados15.getResultado());
	      }
	        btnEditarE6R5.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE6R5.setBounds(10, 127, 85, 25);
	        panel_1_1_2_3.add(btnEditarE6R5);
	        
	        JButton btnEditarE1R5 = new JButton("Editar");
	        btnEditarE1R5.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE1R5, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE1R5.setText(nuevoTexto);
	                          DatosPartido datos16 = new DatosPartido(nuevoTexto);
	                          datos16.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos16, "datos_partido_16.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE1R5, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE1R5, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados16 = DatosPartido.cargarDatos("datos_partido_16.dat");
	      if (datosGuardados16!= null) {
	          lblE1R5.setText(datosGuardados16.getResultado());
	      }
	        btnEditarE1R5.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE1R5.setBounds(644, 124, 85, 25);
	        panel_1_1_2_3.add(btnEditarE1R5);
	        
	        JButton btnEditarE4R5 = new JButton("Editar");
	        btnEditarE4R5.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE4R5, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE4R5.setText(nuevoTexto);
	                          DatosPartido datos17 = new DatosPartido(nuevoTexto);
	                          datos17.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos17, "datos_partido_17.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE4R5, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE4R5, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados17 = DatosPartido.cargarDatos("datos_partido_17.dat");
	      if (datosGuardados17!= null) {
	          lblE4R5.setText(datosGuardados17.getResultado());
	      }
	        btnEditarE4R5.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE4R5.setBounds(644, 91, 85, 25);
	        panel_1_1_2_3.add(btnEditarE4R5);
	        
	        JButton btnEditarE3R5 = new JButton("Editar");
	        btnEditarE3R5.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              String nuevoTexto = JOptionPane.showInputDialog(lblE3R5, "Introduce el nuevo resultado:");

	              if (nuevoTexto != null) {
	                  if (nuevoTexto.matches("[0-9]+")) {
	                      int nuevoResultado = Integer.parseInt(nuevoTexto);
	                      if (nuevoResultado <= 100) {
	                          lblE3R5.setText(nuevoTexto);
	                          DatosPartido datos18 = new DatosPartido(nuevoTexto);
	                          datos18.setResultado(nuevoTexto);
	                          DatosPartido.guardarDatos(datos18, "datos_partido_18.dat");
	                      } else {
	                          JOptionPane.showMessageDialog(lblE3R5, "El resultado no puede superar 100.", "Error", JOptionPane.ERROR_MESSAGE);
	                      }
	                  } else {
	                      JOptionPane.showMessageDialog(lblE3R5, "Por favor, introduce solo números.", "Error", JOptionPane.ERROR_MESSAGE);
	                  }
	              }
	          }
	      });

	      DatosPartido datosGuardados18 = DatosPartido.cargarDatos("datos_partido_18.dat");
	      if (datosGuardados18!= null) {
	          lblE3R5.setText(datosGuardados18.getResultado());
	      }
	        btnEditarE3R5.setFont(new Font("Calibri", Font.PLAIN, 20));
	        btnEditarE3R5.setBounds(644, 52, 85, 25);
	        panel_1_1_2_3.add(btnEditarE3R5);
	        
		}
	    }
