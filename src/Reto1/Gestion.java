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
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel() {
          /**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
          public boolean isCellEditable(int row, int column) {
              // Hacer que todas las celdas no sean editables
              return false;
          }
      };

      tableModel.addColumn("Usuario");
      tableModel.addColumn("Contraseña");

      cuentasTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(cuentasTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        agregarCuentaButton = new JButton("Agregar Cuenta");
        agregarCuentaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
									agregarCuenta();
								} catch (FileNotFoundException e1) {
									// TODO Bloque catch generado automáticamente
									e1.printStackTrace();
								}
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

    public void agregarCuenta() throws FileNotFoundException {
    	String aviso = "⚠ Una vez introducida una nueva cuenta, no es editable, tendrías que eliminarla y volver a crearla. ⚠";
    	
    	JOptionPane.showMessageDialog(this, aviso, "Aviso", JOptionPane.INFORMATION_MESSAGE);
    	JDialog dialog = new JDialog();
    	dialog.setAlwaysOnTop(true);
    	String usuario = JOptionPane.showInputDialog("Nombre de usuario:");
    	JDialog dialog2 = new JDialog();
    	dialog2.setAlwaysOnTop(true);
      String contraseña = JOptionPane.showInputDialog("Contraseña:");

      if (usuario != null && !usuario.isEmpty() && contraseña != null && !contraseña.isEmpty()) {
          Cuenta nuevaCuenta = new Cuenta(usuario, contraseña);
          cuentasGuardadas.add(nuevaCuenta);
          tableModel.addRow(new Object[]{nuevaCuenta.getUsuario(), nuevaCuenta.getContraseña()});
          guardarCuentas();
          String nuevaRutaArchivo = "src/Reto1/cuentas.dat";
          @SuppressWarnings({ "unused", "resource" })
					FileOutputStream fileOutput = new FileOutputStream(nuevaRutaArchivo);
      } else {
          JOptionPane.showMessageDialog(this, "Usuario o contraseña vacíos, no se puede agregar la cuenta.", "Error", JOptionPane.WARNING_MESSAGE);
      }
  }

    public void eliminarCuenta() {
      int selectedRow = cuentasTable.getSelectedRow();

      if (selectedRow != -1) {
          Cuenta cuentaAEliminar = cuentasGuardadas.get(selectedRow);

          if (!cuentaAEliminar.getUsuario().equals("Supremo")) { // Evitar eliminar la cuenta "admin"
              cuentasGuardadas.remove(selectedRow);
              tableModel.removeRow(selectedRow);
              guardarCuentas();
          } else {
              JOptionPane.showMessageDialog(this, "No puedes eliminar la cuenta 'Supremo'", "Error", JOptionPane.WARNING_MESSAGE);
          }
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

    public boolean validarCredenciales(String usuario, String contraseña) {
      for (Cuenta cuenta : cuentasGuardadas) {
          if (cuenta.getUsuario().equals(usuario) && cuenta.getContraseña().equals(contraseña)) {
              return true;
          }
      }
      return false;
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

}