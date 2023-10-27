package Reto1;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class InicioDeSesion extends JFrame implements ActionListener, FocusListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEntrar;
	private JLabel lblTexto;	
	private JLabel lblUsuario;
	private JTextField txtNombre;
	private JLabel lblContraseña;
	private JPasswordField Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioDeSesion frame = new InicioDeSesion();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioDeSesion() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Reto1/fotos/ideogram.jpeg"));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTexto = new JLabel("Introduzca usuario y contraseña");
		lblTexto.setBounds(-23, 10, 426, 29);
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Calibri", Font.BOLD, 19));
		contentPane.add(lblTexto);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUsuario.setBounds(78, 69, 77, 29);
		contentPane.add(lblUsuario);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(165, 68, 146, 29);
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
		btnEntrar.setBounds(131, 147, 118, 31);
		contentPane.add(btnEntrar);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(165, 107, 141, 29);
		contentPane.add(Contraseña);
		btnEntrar.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent ae) {
	// obtengo sobre que componente se ha realizado la accion
	Object o = ae.getSource();
	
	if (o == btnEntrar || o == this.txtNombre || o == this.Contraseña){
		// si se ha pulsado btnAceptar
		// si se ha pulsado txtNombre
		// si se ha pulsado txtPassword
		//Compruebo si son correctos
		//Los datos de referencia son nombre "andergilblaz" password "1234"
		String nombre = this.txtNombre.getText();
		@SuppressWarnings("deprecation")
		String password = this.Contraseña.getText();
		if (nombre.equals("andergilblaz")&& password.equals("1234")) {
			MenuFondoFooterPaginaPrincipal vh = new MenuFondoFooterPaginaPrincipal();
			vh.setTitle("Modo edición del usuario " + nombre);
			vh.setVisible(true);
			dispose();
		}
		else if (nombre.equals("alainluque")&& password.equals("1234")) {
			MenuFondoFooterPaginaPrincipal vh = new MenuFondoFooterPaginaPrincipal();
			vh.setTitle("Modo edición del usuario " + nombre);
			vh.setVisible(true);
			dispose();
		}
		else if (nombre.equals("xinyu")&& password.equals("1234")) {
			MenuFondoFooterPaginaPrincipal vh = new MenuFondoFooterPaginaPrincipal();
			vh.setTitle("Modo edición del usuario " + nombre);
			vh.setVisible(true);
			dispose();
		}
		else if (nombre.equals("artem")&& password.equals("1234")) {
			MenuFondoFooterPaginaPrincipal vh = new MenuFondoFooterPaginaPrincipal();
			vh.setTitle("Modo edición del usuario " + nombre);
			vh.setVisible(true);
			dispose();
			
		}
	else {
		//Si el login no es correcrto
		this.lblTexto.setText("Login Incorrecto ");
	}
	}
			}

	@Override
	public void focusGained(FocusEvent fe) {
		// Obtengo sobre que componente de texto ose ha realizado la accion
		Object o = fe.getSource();
		((JTextField) o).select(0, txtNombre.getText().length());
	}

	@Override
	public void focusLost(FocusEvent fe) {
	// Obtengo sobre que componente de texto ose ha realizado la accion
		txtNombre.select(0, 0);
		
	}
		}



	
		
	


