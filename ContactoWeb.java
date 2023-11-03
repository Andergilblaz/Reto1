package Reto1;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Label;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class ContactoWeb extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAsunto;
	private JTextField txtNumero;
	private JTextField txtEmail;
	private JTextField txtNombreYApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactoWeb frame = new ContactoWeb();
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
	public ContactoWeb() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1190, 733);
		contentPane = new JPanel();
		contentPane.setBorder(null);
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

		JPanel contentPane = new JPanel(new BorderLayout());
	        setContentPane(contentPane);
		
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		Panel panel = new Panel();
		panel.setBounds(0, 422, screenWidth, 36);
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
		
		JPanel panelForm = new JPanel();
		contentPane.add(panelForm, BorderLayout.CENTER);
		panelForm.setLayout(null);
		 
		JLabel lblForm = new JLabel("Formulario de contacto");
		lblForm.setFont(new Font("Calibri", Font.BOLD, 26));
		lblForm.setBounds(646, 48, 272, 36);
		panelForm.add(lblForm, BorderLayout.CENTER);
		
		JLabel txtInstruccion = new JLabel("Rellena este formulario y un representante se pondrá en contacto contigo antes de 24 horas laborales.");
		txtInstruccion.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtInstruccion.setBounds(342, 94, 887, 48);
		panelForm.add(txtInstruccion,BorderLayout.CENTER);
			      
		JLabel txtNombre = new JLabel("Nombre completo:");
		txtNombre.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNombre.setBounds(388, 197, 163, 36);
		panelForm.add(txtNombre,BorderLayout.CENTER);
		
		txtNombreYApellido = new JTextField();
		txtNombreYApellido.setText("Nombre y Apellido");
		txtNombreYApellido.setForeground(Color.GRAY);
		txtNombreYApellido.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNombreYApellido.setColumns(10);
		txtNombreYApellido.setBounds(549, 201, 187, 28);
		panelForm.add(txtNombreYApellido,BorderLayout.CENTER);
		
	
		txtNombreYApellido.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (txtNombreYApellido.getText().equals("Nombre y Apellido")) {
		            txtNombreYApellido.setText("");
		            txtNombreYApellido.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        if (txtNombreYApellido.getText().isEmpty()) {
		            txtNombreYApellido.setText("Nombre y Apellido");
		            txtNombreYApellido.setForeground(Color.GRAY);
		        }
		    }
		});
		
		JLabel lblNumeroDeTelfono = new JLabel("Numero de teléfono:");
		lblNumeroDeTelfono.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNumeroDeTelfono.setBounds(571, 243, 225, 36);
		panelForm.add(lblNumeroDeTelfono,BorderLayout.CENTER);
		
		txtNumero = new JTextField();
		txtNumero.setText("Tu número de contacto");
		txtNumero.setForeground(Color.GRAY);
		txtNumero.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNumero.setColumns(10);
		txtNumero.setBounds(750, 243, 259, 28);
		panelForm.add(txtNumero,BorderLayout.CENTER);
		
		txtNumero.addFocusListener(new FocusListener() {
			    @Override
			    public void focusGained(FocusEvent e) {
			        if (txtNumero.getText().equals("Tu número de contacto")) {
			            txtNumero.setText("");
			            txtNumero.setForeground(Color.BLACK); 
			        }
			    }

			    @Override
			    public void focusLost(FocusEvent e) {
			        if (txtNumero.getText().isEmpty()) {
			            txtNumero.setText("Tu número de contacto");
			            txtNumero.setForeground(Color.GRAY);  
			        }
			    }
			});
		
		JLabel lblAsunto = new JLabel("Asunto:");
		lblAsunto.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblAsunto.setBounds(670, 281, 120, 36);
		panelForm.add(lblAsunto,BorderLayout.CENTER);
		
		txtAsunto = new JTextField("Asunto");
		txtAsunto.setForeground(Color.GRAY);
		txtAsunto.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtAsunto.setColumns(10);
		txtAsunto.setBounds(741, 285, 177, 28);
		panelForm.add(txtAsunto,BorderLayout.CENTER);
		

	        txtAsunto.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if (txtAsunto.getText().equals("Asunto")) {
	                    txtAsunto.setText("");
	                    txtAsunto.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtAsunto.getText().isEmpty()) {
	                    txtAsunto.setText("Asunto");
	                    txtAsunto.setForeground(Color.GRAY);
	                }
	            }
	        });
		

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblEmail.setBounds(752, 197, 58, 36);
		panelForm.add(lblEmail,BorderLayout.CENTER);

	        txtEmail = new JTextField("Email");
	        txtEmail.setForeground(Color.GRAY);
	        txtEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
	        txtEmail.setColumns(10);
	        txtEmail.setBounds(807, 201, 343, 28);
	        panelForm.add(txtEmail);

	        
	        txtEmail.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if (txtEmail.getText().equals("Email")) {
	                    txtEmail.setText("");
	                    txtEmail.setForeground(Color.BLACK); 
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtEmail.getText().isEmpty()) {
	                    txtEmail.setText("Email");
	                    txtEmail.setForeground(Color.GRAY);  
	                }
	            }
	        });

		
		JLabel lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMensaje.setBounds(740, 323, 82, 36);
		panelForm.add(lblMensaje);
	      
		
		 JTextArea txtMensaje = new JTextArea("Mensaje");
		 txtMensaje.setForeground(Color.GRAY);
	        txtMensaje.setFont(new Font("Calibri", Font.PLAIN, 20));
	        txtMensaje.setToolTipText("");
	        txtMensaje.setLineWrap(true);
	        txtMensaje.setWrapStyleWord(true);
	        JScrollPane scrollPane = new JScrollPane(txtMensaje);
	        scrollPane.setToolTipText("10");
	        scrollPane.setBounds(599, 369, 377, 209);
	        panelForm.add(scrollPane, BorderLayout.CENTER);
	   
	        txtMensaje.addFocusListener(new FocusListener() {
	     	    @Override
	     	    public void focusGained(FocusEvent e) {
	     	        if (txtMensaje.getText().equals("Mensaje")) {
	     	            txtMensaje.setText("");
	     	            txtMensaje.setForeground(Color.BLACK); 
	     	        }
	     	    }

	     	    @Override
	     	    public void focusLost(FocusEvent e) {
	     	        if (txtMensaje.getText().isEmpty()) {
	     	            txtMensaje.setText("Mensaje");
	     	            txtMensaje.setForeground(Color.GRAY);  
	     	        }
	     	    }
	     	});
	}
}
