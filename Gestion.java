package Reto1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gestion extends JFrame {

    private DefaultTableModel tableModel;
    private JTable cuentasTable;
    private JButton agregarCuentaButton;
    private List cuentaListeners
    private ArrayList<Cuenta> cuentasGuardadas;

    public Gestion() {
        setTitle("Registro de Cuentas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Usuario");
        tableModel.addColumn("Contraseña");
        

        cuentasTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(cuentasTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        agregarCuentaButton = new JButton("Agregar Cuenta");
        agregarCuentaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarCuenta();
            }
        });

        cargarCuentasGuardadas(); // Cargar cuentas almacenadas al iniciar la ventana.

        getContentPane().add(agregarCuentaButton, BorderLayout.SOUTH);
    }

    public void agregarCuenta() {
        String usuario = JOptionPane.showInputDialog("Nombre de usuario:");
        String contraseña = JOptionPane.showInputDialog("Contraseña:");

        if (usuario != null && contraseña != null) {
            Cuenta nuevaCuenta = new Cuenta(usuario, contraseña);
            cuentasGuardadas.add(nuevaCuenta); // Agregar cuenta a la lista de cuentas.
            tableModel.addRow(new Object[]{nuevaCuenta.getUsuario(), nuevaCuenta.getContraseña()});
        }
    }

    public void cargarCuentasGuardadas() {
        // Simula la carga de cuentas almacenadas en tu sistema.
        cuentasGuardadas = new ArrayList<>();
        cuentasGuardadas.add(new Cuenta("andergilblaz", "1234"));
        cuentasGuardadas.add(new Cuenta("alainluque", "1234"));
        cuentasGuardadas.add(new Cuenta("xinyu", "1234"));
        cuentasGuardadas.add(new Cuenta("artem", "1234"));

        for (Cuenta cuenta : cuentasGuardadas) {
            tableModel.addRow(new Object[]{cuenta.getUsuario(), cuenta.getContraseña()});
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gestion frame = new Gestion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

class Cuenta {
    private String usuario;
    private String contraseña;

    public Cuenta(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public void agregarCuentaListener(CuentaListener listener) {
      cuentaListeners.add(listener);
  }
}
