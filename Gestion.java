package Reto1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;

public class Gestion extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private DefaultTableModel tableModel;
    private JTable cuentasTable;
    private JButton agregarCuentaButton;
    private JButton eliminarCuentaButton;
    private ArrayList<Cuenta> cuentasGuardadas;
    private String archivoCuentas = "cuentas.dat";

    public Gestion() {
        setTitle("Registro de Cuentas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

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

        eliminarCuentaButton = new JButton("Eliminar Cuenta");
        eliminarCuentaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarCuenta();
            }
        });

        cargarCuentasGuardadas(); // Cargar cuentas almacenadas al iniciar la ventana.

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(agregarCuentaButton);
        buttonPanel.add(eliminarCuentaButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public void agregarCuenta() {
        String usuario = JOptionPane.showInputDialog("Nombre de usuario:");
        String contraseña = JOptionPane.showInputDialog("Contraseña:");

        if (usuario != null && contraseña != null) {
            Cuenta nuevaCuenta = new Cuenta(usuario, contraseña);
            cuentasGuardadas.add(nuevaCuenta); // Agregar cuenta a la lista de cuentas.
            tableModel.addRow(new Object[]{nuevaCuenta.getUsuario(), nuevaCuenta.getContraseña()});
            guardarCuentas();
        }
    }

    public void eliminarCuenta() {
        int selectedRow = cuentasTable.getSelectedRow();

        if (selectedRow != -1) {
            cuentasGuardadas.remove(selectedRow);
            tableModel.removeRow(selectedRow);
            guardarCuentas();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cuenta para eliminar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
		public void cargarCuentasGuardadas() {
        try {
            FileInputStream fileInput = new FileInputStream(archivoCuentas);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            cuentasGuardadas = (ArrayList<Cuenta>) objectInput.readObject();
            objectInput.close();
            fileInput.close();

            for (Cuenta cuenta : cuentasGuardadas) {
                tableModel.addRow(new Object[]{cuenta.getUsuario(), cuenta.getContraseña()});
            }
        } catch (IOException | ClassNotFoundException e) {
            cuentasGuardadas = new ArrayList<>();
        }
    }

    public void guardarCuentas() {
        try {
            FileOutputStream fileOutput = new FileOutputStream(archivoCuentas);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(cuentasGuardadas);
            objectOutput.close();
            fileOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gestion frame = new Gestion();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

class Cuenta implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
}
