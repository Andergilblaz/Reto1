package Reto1;

import java.io.*;

public class DatosPartido implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String resultado;

    public DatosPartido(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    // Método para guardar los datos de un partido en un archivo
    public static void guardarDatos(DatosPartido partido, String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(partido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar los datos de un partido desde un archivo
    public static DatosPartido cargarDatos(String filePath) {
        DatosPartido partido = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            partido = (DatosPartido) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return partido;
    }
    
}
