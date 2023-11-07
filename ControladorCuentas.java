package Reto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControladorCuentas {
    private Map<String, String> cuentas = new HashMap<>();

    public ControladorCuentas() {
        //Inicializacion de cuentas
    }

    public boolean validarCredenciales(String usuario, String contraseña) {
        // Realiza la validación de credenciales aquí.
        String contraseñaAlmacenada = cuentas.get(usuario);
        return contraseñaAlmacenada != null && contraseñaAlmacenada.equals(contraseña);
    }

    public List<Cuenta> getCuentasGuardadas() {
        // Cambia esta función para devolver una lista de cuentas guardadas.
        List<Cuenta> cuentasGuardadas = new ArrayList<>();
        // Aquí debes cargar las cuentas desde tus datos guardados.
        // Puedes recorrer el mapa 'cuentas' y agregar cada cuenta a la lista.
        for (Map.Entry<String, String> entry : cuentas.entrySet()) {
            cuentasGuardadas.add(new Cuenta(entry.getKey(), entry.getValue()));
        }
        return cuentasGuardadas;
    }
    
    public void agregarCuenta(String usuario, String contraseña) {
      cuentas.put(usuario, contraseña);
      // Aquí puedes agregar código para guardar la cuenta en tus datos guardados.
  }

  public void eliminarCuenta(String usuario) {
      cuentas.remove(usuario);
      // Aquí puedes agregar código para eliminar la cuenta de tus datos guardados.
  }

  public List<String> getUsuarios() {
      return new ArrayList<>(cuentas.keySet());
  }
}
