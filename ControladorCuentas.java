package Reto1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorCuentas {
    private List<Cuenta> cuentas;

    public ControladorCuentas() {
        cargarCuentas();
    }

    public boolean validarCredenciales(String usuario, String contraseña) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getUsuario().equals(usuario) && cuenta.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public List<Cuenta> getCuentasGuardadas() {
        return cuentas;
    }

    public void agregarCuenta(String usuario, String contraseña) {
        cuentas.add(new Cuenta(usuario, contraseña));
        guardarCuentas();
    }

    public void eliminarCuenta(String usuario) {
        cuentas.removeIf(cuenta -> cuenta.getUsuario().equals(usuario));
        guardarCuentas();
    }

    @SuppressWarnings("unchecked")
		private void cargarCuentas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cuentas.dat"))) {
            cuentas = (ArrayList<Cuenta>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            cuentas = new ArrayList<>();
        }
    }

    private void guardarCuentas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cuentas.dat"))) {
            oos.writeObject(cuentas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
