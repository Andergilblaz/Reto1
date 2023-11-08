		package Reto1;
		
		import java.awt.EventQueue;
		
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JPanel;
		import javax.swing.border.EmptyBorder;
		
		import javax.swing.JLabel;
		import javax.swing.JOptionPane;
		
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.FocusEvent;
		import java.awt.event.FocusListener;
	
		import java.awt.Font;
		import java.awt.Toolkit;
		
		import javax.swing.SwingConstants;
		import javax.swing.JTextField;
		import javax.swing.JPasswordField;
		import javax.swing.ImageIcon;
		
		public class InicioDeSesion extends JFrame implements ActionListener, FocusListener{
		
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;
			private JButton btnEntrar;
			private JLabel lblTexto;	
			private JLabel lblUsuario;
			private JTextField txtNombre;
			private JLabel lblContraseña;
			private JPasswordField Contraseña;
			private JLabel lblLogo;
			private ControladorCuentas controladorCuentas; // Agrega una referencia al ControladorCuentas
	
			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				ControladorCuentas controladorCuentas = new ControladorCuentas();
	      Gestion ventanaGestion = new Gestion();
	      InicioDeSesion ventanaInicioSesion = new InicioDeSesion(controladorCuentas, ventanaGestion);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							InicioDeSesion frame = new InicioDeSesion();
							frame.setVisible(true);
							frame.setResizable(false);
							ventanaInicioSesion.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		
			/**
			 * Create the frame.
			 */
			public InicioDeSesion(ControladorCuentas controladorCuentas, Gestion ventanaGestion) {
				setTitle("Login Personal Autorizado");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 498, 242);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setLocationRelativeTo(null);
				setIconImage(Toolkit.getDefaultToolkit().getImage("src/Reto1/fotos/LogoWaterpolo.png"));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				this.controladorCuentas = controladorCuentas;
			  lblTexto = new JLabel("Introduzca usuario y contraseña");
				lblTexto.setBounds(29, 10, 426, 29);
				lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
				lblTexto.setFont(new Font("Calibri", Font.BOLD, 19));
				contentPane.add(lblTexto);
				
				lblUsuario = new JLabel("Usuario:");
				lblUsuario.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblUsuario.setBounds(78, 69, 77, 29);
				contentPane.add(lblUsuario);
				
				txtNombre = new JTextField();
				txtNombre.setBounds(165, 68, 141, 29);
				contentPane.add(txtNombre);
				txtNombre.addActionListener(this);
				txtNombre.addFocusListener(this);
				txtNombre.setColumns(10);
				
				lblContraseña = new JLabel("Contraseña:");
				lblContraseña.setFont(new Font("Calibri", Font.PLAIN, 20));
				lblContraseña.setBounds(51, 108, 118, 29);
				contentPane.add(lblContraseña);
				
				btnEntrar = new JButton("Entrar");
				btnEntrar.setFont(new Font("Calibri", Font.BOLD, 20));
				btnEntrar.setBounds(175, 146, 118, 29);
				contentPane.add(btnEntrar);
				
				Contraseña = new JPasswordField();
				Contraseña.setBounds(165, 107, 141, 29);
				contentPane.add(Contraseña);
				
				lblLogo = new JLabel("");
				lblLogo.setLabelFor(lblLogo);
				lblLogo.setIcon(new ImageIcon(InicioDeSesion.class.getResource("/Reto1/fotos/LogoWaterpoloPequeña.png")));
				lblLogo.setBounds(326, 29, 158, 146);
				contentPane.add(lblLogo);
				
				JLabel lblTexto2 = new JLabel("(Personal Autorizado)");
				lblTexto2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblTexto2.setBounds(168, 29, 147, 29);
				contentPane.add(lblTexto2);
				btnEntrar.addActionListener(this);
			}
			
			 
	  
			 public InicioDeSesion() {
				// TODO Apéndice de constructor generado automáticamente
			}
	
			@Override
		    public void actionPerformed(ActionEvent ae) {
		        Object o = ae.getSource();
	
		        if (o == btnEntrar) {
		            String usuario = txtNombre.getText();
		            char[] contraseñaIngresada = Contraseña.getPassword();
		            String contraseña = new String(contraseñaIngresada);
	
		            if (controladorCuentas.validarCredenciales(usuario, contraseña)) {
		                // Las credenciales son válidas, puedes proceder con la autenticación.
		                JOptionPane.showMessageDialog(this, "Accediendo al modo edición del usuario " + usuario);
		                // Abre la ventana de gestión y cierra la ventana de inicio de sesión
		                MenuFondoFooterPaginaPrincipal vh = new MenuFondoFooterPaginaPrincipal();
		        				vh.setTitle("Modo edición del usuario " + usuario);
		        				vh.setVisible(true);
		        				dispose();
		            } else {
		                // Las credenciales no son válidas.
		                JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Acceso denegado.");
		            }
		        }
		    }
	
	
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Apéndice de método generado automáticamente
				
			}
	
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Apéndice de método generado automáticamente
				
			}
			
				
			}
		
		
			
				
			
		
		
