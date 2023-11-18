import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class BienvenidaDialog extends JDialog {
    private JProgressBar progressBar;
    private Timer timer;
    private int progress = 0;

    public BienvenidaDialog(JFrame parent, String nombreUsuario) {
        super(parent, "Bienvenido " + nombreUsuario, true);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout());

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);

        add(progressBar, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(parent);

        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (progress >= 100) {
                    timer.stop();
                    dispose();
                } else {
                    progress += 10; // Simulación de progreso.
                    progressBar.setValue(progress);
                }
            }
        });

        timer.start();
    }
}

public class InicioDeSesion extends JFrame implements ActionListener, FocusListener {
    // ...

    @Override
    public void actionPerformed(ActionEvent ae) {
        // ...

        if (nombre.equals("andergilblaz") && password.equals("1234")) {
            BienvenidaDialog bienvenidaDialog = new BienvenidaDialog(this, nombre);
            bienvenidaDialog.setVisible(true);

            MenuFondoFooterPaginaPrincipal vh = new MenuFondoFooterPaginaPrincipal();
            vh.setTitle("Modo edición del usuario " + nombre);
            vh.setVisible(true);
            dispose(); // Cierra la ventana de inicio de sesión.
        } else {
            JOptionPane.showMessageDialog(this, "Login Incorrecto. Acceso denegado.");
        }
    }
}
