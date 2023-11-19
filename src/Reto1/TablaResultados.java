package Reto1;

import javax.swing.*;
import java.awt.*;

public class TablaResultados {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TablaResultados::crearVentana);
    }

    private static void crearVentana() {
        JFrame ventana = new JFrame("Tabla de Resultados");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 400);

        JPanel panelTabla = new JPanel(new GridLayout(0, 8));

        // Simulación de datos para la tabla (reemplaza con tu lógica de lectura de archivos .dat)
        int[][] resultados = obtenerResultadosSimulados();

        // Llenar la tabla con los datos
        for (int equipo = 0; equipo < resultados.length; equipo++) {
            for (int dato = 0; dato < 7; dato++) {
                JLabel label = new JLabel(String.valueOf(resultados[equipo][dato]));
                panelTabla.add(label);
            }
        }

        ventana.add(new JScrollPane(panelTabla));
        ventana.setVisible(true);
    }

    // Simulación de obtención de resultados (reemplaza con tu lógica de lectura de archivos .dat)
    private static int[][] obtenerResultadosSimulados() {
        int[][] resultadosSimulados = {
                {10, 3, 1, 0, 8, 4, 4},
                {9, 2, 3, 0, 7, 5, 2},
                {7, 2, 1, 2, 6, 6, 0},
                {5, 1, 2, 2, 4, 5, -1},
                {4, 1, 1, 3, 4, 7, -3},
                {2, 0, 2, 3, 3, 7, -4}
                // Aquí simularías la lectura de datos desde tus archivos .dat y llenarías la matriz resultadosSimulados
        };
        return resultadosSimulados;
    }

    // Método para actualizar los resultados según los goles de cada enfrentamiento
    private static void actualizarResultados(int[][] resultados, String equipo1Archivo, String equipo2Archivo) {
        // Lógica para leer los archivos, obtener los goles y actualizar los resultados
        // ...

        // Ejemplo de actualización de resultados (simulación)
        int golesEquipo1 = 1; // Obtener de archivo
        int golesEquipo2 = 2; // Obtener de archivo

        resultados[0][4] += golesEquipo1; // Sumar goles a favor equipo 1
        resultados[0][5] += golesEquipo2; // Sumar goles en contra equipo 1
        resultados[1][4] += golesEquipo2; // Sumar goles a favor equipo 2
        resultados[1][5] += golesEquipo1; // Sumar goles en contra equipo 2

        // Actualizar demás datos como puntos, ganados, perdidos, empatados, etc.
        // ...

        // Esta es una simulación, debes completar la lógica real para calcular los resultados basados en los archivos .dat
    }

    // Método para mostrar la tabla de resultados
    private static void mostrarTablaResultados(int[][] resultados) {
      System.out.println("Nombre Equipo | Puntos | Partidos Ganados | Partidos Perdidos | Partidos Empatados | Goles a Favor | Goles en Contra | Diferencia de Goles");

      for (int equipo = 0; equipo < resultados.length; equipo++) {
          System.out.printf("E%d | %d | %d | %d | %d | %d | %d | %d\n",
                  equipo + 1,
                  resultados[equipo][0], // Puntos
                  resultados[equipo][1], // Partidos Ganados
                  resultados[equipo][2], // Partidos Perdidos
                  resultados[equipo][3], // Partidos Empatados
                  resultados[equipo][4], // Goles a Favor
                  resultados[equipo][5], // Goles en Contra
                  resultados[equipo][6]  // Diferencia de Goles
          );
      }
  }
}
