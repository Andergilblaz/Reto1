package Reto1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InicioDeSesion extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JTextField usuarioTextField;
    private JPasswordField contraseñaField;
    private JButton iniciarSesionButton;

    
    public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
          try {
          	InicioDeSesion ventanaInicioSesion = new InicioDeSesion();
              ventanaInicioSesion.setVisible(true);
              ventanaInicioSesion.setResizable(false);
          } catch (Exception e) {
              e.printStackTrace();
          }
      });
  }



    public InicioDeSesion() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(("src/Reto1/fotos/LogoWaterpolo.png")));
        setTitle("LogIn Personal Autorizado");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(497, 235);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        usuarioLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        usuarioLabel.setBounds(63, 83, 81, 25);
        panel.add(usuarioLabel);

        usuarioTextField = new JTextField();
        usuarioTextField.setBounds(170, 82, 141, 25);
        panel.add(usuarioTextField);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        contraseñaLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        contraseñaLabel.setBounds(43, 115, 101, 25);
        panel.add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(170, 114, 141, 25);
        panel.add(contraseñaField);

        iniciarSesionButton = new JButton("Entrar");
        iniciarSesionButton.setBounds(180, 150, 120, 25);
        iniciarSesionButton.setFont(new Font("Calibri", Font.PLAIN, 20));
        iniciarSesionButton.addActionListener(this);
        panel.add(iniciarSesionButton);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Introduzca usuario y contraseña");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel.setBounds(88, 11, 305, 31);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("(Personal Autorizado)");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(167, 44, 147, 14);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(InicioDeSesion.class.getResource("/Reto1/fotos/LogoWaterpoloPequeña.png")));
        lblNewLabel_2.setBounds(324, 44, 147, 144);
        panel.add(lblNewLabel_2);
    }

    public void actionPerformed(ActionEvent e) {
        String usuario = usuarioTextField.getText();
        char[] contraseñaChars = contraseñaField.getPassword();
        String contraseña = new String(contraseñaChars);

        // Aquí validar las credenciales con la lógica que tienes en Gestion
        boolean accesoConcedido = validarCredenciales(usuario, contraseña);

        if (accesoConcedido) {
            JOptionPane.showMessageDialog(this, "Entrando al modo edicion del usuario "+ "[" + usuario + "]");
            // Abre la siguiente ventana o realiza alguna acción después del inicio de sesión exitoso
            PaginaPrincipalEditor PaginaPrincipalEditor = new PaginaPrincipalEditor();
            PaginaPrincipalEditor.setVisible(true);
            PaginaPrincipalEditor.setResizable(false);
            
            
         
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Acceso denegado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para validar las credenciales (utilizando la lógica de Gestion)
    private boolean validarCredenciales(String usuario, String contraseña) {
        Gestion gestion = new Gestion(); // Crear una instancia de Gestion
        return gestion.validarCredenciales(usuario, contraseña); // Utilizar el método de validación de Gestion
    }

}
