package Reto1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import Reto1.Gestion;
import Reto1.InicioDeSesion;
import Reto1.ControladorCuentas;

public class BienvenidaDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	private JProgressBar progressBar;
    private Timer timer;
    private int progress = 0;
    
    // Constructor de la clase
    public BienvenidaDialog(BienvenidaDialog bienvenidaDialog, Object usuario) {
        super(bienvenidaDialog, "Bienvenido " + usuario, true);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Creación y configuración de la barra de progreso

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);

        add(progressBar, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(bienvenidaDialog);

     // Creación y inicio del temporizador para simular el progreso
        
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (progress >= 100) {
                    timer.stop();
                    dispose();
                } else {
                    progress += 10; // Simulación de progreso
                    progressBar.setValue(progress);
                }
            }
        });

        timer.start();
    }
    // Manejo de la acción
    public void actionPerformed(ActionEvent ae, Object usuario, Object contraseña) {

        if (usuario.equals("andergilblaz") && contraseña.equals("1234")) {
        	// Creación de una nueva ventana de diálogo de bienvenida
            BienvenidaDialog bienvenidaDialog = new BienvenidaDialog(this, usuario);
            bienvenidaDialog.setVisible(true);

            // Creación y visualización de la ventana principal
            MenuFondoFooterPaginaPrincipal vh = new MenuFondoFooterPaginaPrincipal();
            vh.setTitle("Modo edición del usuario " + usuario);
            vh.setVisible(true);
            dispose(); // Cierra la ventana de inicio de sesión
        } else {
            JOptionPane.showMessageDialog(this, "Login Incorrecto. Acceso denegado.");
        }
    }
}
