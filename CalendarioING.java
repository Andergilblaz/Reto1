package Reto1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class CalendarioING extends JFrame {

   
    private static final long serialVersionUID = 1L;

    
    private JPanel contentPane;
    private JLabel lblNewLabel;

    // Método principal para lanzar la aplicación
    public static void main(String[] args) {
        // Se utiliza EventQueue.invokeLater para ejecutar la creación de la interfaz 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalendarioING frame = new CalendarioING();
                    frame.setVisible(true);
                    // Se prohíbe cambiar el tamaño de la aplicación
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
    public CalendarioING() {
        // Configuración de la apariencia de la ventana
        setBackground(new Color(255, 255, 255));
        setForeground(new Color(139, 0, 0));
        setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
        setAlwaysOnTop(true);
        setTitle("Spanish Water Polo Results");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 978, 585);
        // Creación del panel principal y configuración del diseño
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        //Para mostrar los componentes en la interfaz
        showImage();
    }

    
    public void showImage() {
        // Carga de la imagen original desde el archivo
        ImageIcon originalImageIcon = new ImageIcon("src/Reto1/fotos/ImagenesJuntas.png");
        int targetWidth = 900;
        int targetHeight = 1800;

        // Escalado de la imagen al tamaño deseado
        Image scaledImage = originalImageIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        // Creación de un nuevo ImageIcon con la imagen escalada
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        
        JLabel imageLabel1 = new JLabel(scaledImageIcon);

        // Creación de un JScrollPane para permitir desplazamiento si la imagen es grande
        JScrollPane scrollPane = new JScrollPane(imageLabel1);

        // Configuración del tamaño preferido del JScrollPane
        scrollPane.setPreferredSize(new Dimension(800, 500));

        // Configuración de las políticas de barras de desplazamiento
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        
        lblNewLabel = new JLabel("Schedule:");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

       
        scrollPane.setColumnHeaderView(lblNewLabel);
    }
}
