package Reto1;
import javax.swing.JFrame;

public class VentanaNoMaximizable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana No Maximizable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Establece el tamaño mínimo y máximo igual al tamaño actual
        frame.setMinimumSize(frame.getSize());
        frame.setMaximumSize(frame.getSize());

        frame.setVisible(true);
    }
}
