package Reto1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InicioDeSesionING extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JTextField usuarioTextField;
    private JPasswordField contraseñaField;
    private JButton iniciarSesionButton;

    public InicioDeSesionING() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(InicioDeSesionING.class.getResource("/Reto1/fotos/LogoWaterpolo.png")));
        setTitle("Autorized Personal LogIn");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(497, 219);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel usuarioLabel = new JLabel("User:");
        usuarioLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        usuarioLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        usuarioLabel.setBounds(63, 83, 81, 25);
        panel.add(usuarioLabel);

        usuarioTextField = new JTextField();
        usuarioTextField.setBounds(170, 82, 141, 25);
        panel.add(usuarioTextField);

        JLabel contraseñaLabel = new JLabel("Password:");
        contraseñaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contraseñaLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        contraseñaLabel.setBounds(43, 115, 101, 25);
        panel.add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(170, 114, 141, 25);
        panel.add(contraseñaField);

        iniciarSesionButton = new JButton("Enter");
        iniciarSesionButton.setBounds(180, 150, 120, 25);
        iniciarSesionButton.setFont(new Font("Calibri", Font.PLAIN, 20));
        iniciarSesionButton.addActionListener(this);
        panel.add(iniciarSesionButton);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Introduce user and password");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel.setBounds(88, 11, 305, 31);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("(Autorized Personal)");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(167, 44, 147, 14);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(InicioDeSesionING.class.getResource("/Reto1/fotos/LogoWaterpoloPequeña.png")));
        lblNewLabel_2.setBounds(323, 11, 148, 185);
        panel.add(lblNewLabel_2);
    }
    {
    	InicioDeSesionING InicioDeSesionING = new InicioDeSesionING();
    	InicioDeSesionING.addWindowListener(new WindowAdapter() {
    	    @Override
    	    public void windowClosing(WindowEvent e) {
    	        PaginaPrincipalING PaginaPrincipalING = new PaginaPrincipalING(); 
    	        PaginaPrincipalING.setVisible(true);
    	        PaginaPrincipalING.setResizable(false);
    	    }
    	});
    	InicioDeSesionING.setVisible(true);
    	InicioDeSesionING.setResizable(false);
    }
    public void actionPerformed(ActionEvent e) {
        String usuario = usuarioTextField.getText();
        char[] contraseñaChars = contraseñaField.getPassword();
        String contraseña = new String(contraseñaChars);

        // Aquí validar las credenciales con la lógica que tienes en Gestion
        boolean accesoConcedido = validarCredenciales(usuario, contraseña);

        if (accesoConcedido) {
            JOptionPane.showMessageDialog(this, "Entering user editing mode "+ "[" + usuario + "]");
            // Abre la siguiente ventana o realiza alguna acción después del inicio de sesión exitoso
            PaginaPrincipal PaginaPrincipal = new PaginaPrincipal();
            PaginaPrincipal.setVisible(true);
            PaginaPrincipal.setResizable(false);
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect credentials. Access denied.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para validar las credenciales (utilizando la lógica de Gestion)
    private boolean validarCredenciales(String usuario, String contraseña) {
        Gestion gestion = new Gestion(); // Crear una instancia de Gestion
        return gestion.validarCredenciales(usuario, contraseña); // Utilizar el método de validación de Gestion
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	InicioDeSesionING ventanaInicioSesion = new InicioDeSesionING();
                ventanaInicioSesion.setVisible(true);
                ventanaInicioSesion.setResizable(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
}
