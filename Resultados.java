package Reto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;

public class Resultados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados frame = new Resultados();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Resultados() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1162, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setPreferredSize(new Dimension(200,100));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		showImage();
	}
	public void showImage() {
        new JLabel();
        
        ImageIcon originalImageIcon = new ImageIcon("C:\\Users\\ik_1DW3A\\Pictures\\Saved Pictures\\calendario.png");
        originalImageIcon.getIconWidth();
        originalImageIcon.getIconHeight();

        int targetWidth = 1200;
        int targetHeight = 2000;

        Image scaledImage = originalImageIcon.getImage().getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

        new ImageIcon(scaledImage);

        JScrollPane scrollPane = new JScrollPane();

        scrollPane.setPreferredSize(new Dimension(800, 500));

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        scrollPane.setViewportView(tabbedPane);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        tabbedPane.addTab("Jornada 1", null, panel, null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBounds(84, 124, 565, 172);
        panel.add(panel_1);
        
        JLabel lblEquipo1 = new JLabel("CN Atlétic \r\nBarceloneta");
        lblEquipo1.setHorizontalAlignment(SwingConstants.CENTER);
        lblEquipo1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblEquipo1.setBounds(10, 51, 187, 25);
        panel_1.add(lblEquipo1);
        
        JLabel lblNewLabel = new JLabel("Jornada 1");
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel.setBounds(232, 10, 100, 31);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("-");
        lblNewLabel_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1.setBounds(228, 57, 29, 13);
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_5 = new JLabel("VS");
        lblNewLabel_5.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5.setBounds(267, 53, 31, 20);
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_2 = new JLabel("-");
        lblNewLabel_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2.setBounds(323, 57, 29, 13);
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Urbat IKE");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3.setBounds(362, 53, 95, 20);
        panel_1.add(lblNewLabel_3);
        
        JLabel lblNewLabel_6 = new JLabel("CN La Latina");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6.setBounds(90, 91, 110, 20);
        panel_1.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("-");
        lblNewLabel_7.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7.setBounds(228, 85, 29, 32);
        panel_1.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("VS");
        lblNewLabel_8.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8.setBounds(267, 86, 48, 30);
        panel_1.add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("-");
        lblNewLabel_9.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9.setBounds(323, 80, 29, 47);
        panel_1.add(lblNewLabel_9);
        
        JLabel lblNewLabel_10 = new JLabel("CN Terrassa");
        lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10.setBounds(362, 89, 110, 25);
        panel_1.add(lblNewLabel_10);
        
        JLabel lblNewLabel_11 = new JLabel("Club Askartza");
        lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11.setBounds(80, 128, 133, 20);
        panel_1.add(lblNewLabel_11);
        
        JLabel lblNewLabel_12 = new JLabel("-");
        lblNewLabel_12.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12.setBounds(228, 120, 45, 36);
        panel_1.add(lblNewLabel_12);
        
        JLabel lblNewLabel_13 = new JLabel("VS");
        lblNewLabel_13.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13.setBounds(267, 128, 45, 20);
        panel_1.add(lblNewLabel_13);
        
        JLabel lblNewLabel_14 = new JLabel("-");
        lblNewLabel_14.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14.setBounds(323, 124, 45, 30);
        panel_1.add(lblNewLabel_14);
        
        JLabel lblNewLabel_15 = new JLabel("Tenerife Echeyde");
        lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15.setBounds(362, 126, 152, 24);
        panel_1.add(lblNewLabel_15);
        
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(391, 331, 565, 172);
        panel.add(panel_2);
        
        JLabel lblNewLabel_16 = new JLabel("Jornada 2");
        lblNewLabel_16.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel_16.setBounds(221, 10, 123, 24);
        panel_2.add(lblNewLabel_16);
        
        JLabel lblNewLabel_17 = new JLabel("CN Terrassa");
        lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_17.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_17.setBounds(87, 57, 110, 20);
        panel_2.add(lblNewLabel_17);
        
        JLabel lblNewLabel_18 = new JLabel("-");
        lblNewLabel_18.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_18.setBounds(214, 49, 45, 36);
        panel_2.add(lblNewLabel_18);
        
        JLabel lblNewLabel_19 = new JLabel("VS");
        lblNewLabel_19.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_19.setBounds(251, 57, 38, 20);
        panel_2.add(lblNewLabel_19);
        
        JLabel lblNewLabel_21 = new JLabel("-");
        lblNewLabel_21.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_21.setBounds(299, 49, 45, 36);
        panel_2.add(lblNewLabel_21);
        
        JLabel lblNewLabel_20 = new JLabel("Tenerife Echeyde");
        lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_20.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_20.setBounds(328, 52, 152, 30);
        panel_2.add(lblNewLabel_20);
        
        JLabel lblNewLabel_22 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_22.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_22.setBounds(10, 87, 199, 30);
        panel_2.add(lblNewLabel_22);
        
        JLabel lblNewLabel_23 = new JLabel("-");
        lblNewLabel_23.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_23.setBounds(214, 84, 45, 36);
        panel_2.add(lblNewLabel_23);
        
        JLabel lblNewLabel_24 = new JLabel("VS");
        lblNewLabel_24.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_24.setBounds(251, 92, 29, 20);
        panel_2.add(lblNewLabel_24);
        
        JLabel lblNewLabel_25 = new JLabel("-");
        lblNewLabel_25.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_25.setBounds(299, 84, 45, 36);
        panel_2.add(lblNewLabel_25);
        
        JLabel lblNewLabel_26 = new JLabel("CN La Latina");
        lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_26.setBounds(328, 92, 110, 20);
        panel_2.add(lblNewLabel_26);
        
        JLabel lblNewLabel_27 = new JLabel("Urbat IKE");
        lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_27.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_27.setBounds(87, 127, 110, 20);
        panel_2.add(lblNewLabel_27);
        
        JLabel lblNewLabel_28 = new JLabel("-");
        lblNewLabel_28.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_28.setBounds(214, 110, 45, 55);
        panel_2.add(lblNewLabel_28);
        
        JLabel lblNewLabel_29 = new JLabel("VS");
        lblNewLabel_29.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_29.setBounds(251, 117, 31, 41);
        panel_2.add(lblNewLabel_29);
        
        JLabel lblNewLabel_30 = new JLabel("-");
        lblNewLabel_30.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_30.setBounds(299, 110, 45, 55);
        panel_2.add(lblNewLabel_30);
        
        JLabel lblNewLabel_31 = new JLabel("Club Askartza");
        lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_31.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_31.setBounds(328, 127, 123, 20);
        panel_2.add(lblNewLabel_31);
        
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBounds(147, 464, 565, 172);
        panel.add(panel_3);
        
        JLabel lblNewLabel_32 = new JLabel("Jornada 3");
        lblNewLabel_32.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel_32.setBounds(231, 10, 103, 30);
        panel_3.add(lblNewLabel_32);
        
        JLabel lblNewLabel_6_1 = new JLabel("CN La Latina");
        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_1.setBounds(111, 48, 110, 20);
        panel_3.add(lblNewLabel_6_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("-");
        lblNewLabel_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_1.setBounds(231, 52, 29, 13);
        panel_3.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_5_1 = new JLabel("VS");
        lblNewLabel_5_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_1.setBounds(270, 50, 31, 20);
        panel_3.add(lblNewLabel_5_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("-");
        lblNewLabel_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_1.setBounds(323, 52, 29, 13);
        panel_3.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_15_1 = new JLabel("Tenerife Echeyde");
        lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_1.setBounds(351, 46, 152, 24);
        panel_3.add(lblNewLabel_15_1);
        
        JLabel lblNewLabel_10_1 = new JLabel("CN Terrassa");
        lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_1.setBounds(111, 83, 110, 25);
        panel_3.add(lblNewLabel_10_1);
        
        JLabel lblNewLabel_11_1 = new JLabel("Club Askartza");
        lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_1.setBounds(94, 118, 127, 20);
        panel_3.add(lblNewLabel_11_1);
        
        JLabel lblNewLabel_7_1 = new JLabel("-");
        lblNewLabel_7_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_1.setBounds(231, 74, 29, 32);
        panel_3.add(lblNewLabel_7_1);
        
        JLabel lblNewLabel_14_1 = new JLabel("-");
        lblNewLabel_14_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_1.setBounds(231, 108, 45, 30);
        panel_3.add(lblNewLabel_14_1);
        
        JLabel lblNewLabel_5_1_1 = new JLabel("VS");
        lblNewLabel_5_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_1_1.setBounds(270, 83, 31, 20);
        panel_3.add(lblNewLabel_5_1_1);
        
        JLabel lblNewLabel_5_1_1_1 = new JLabel("VS");
        lblNewLabel_5_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_1_1_1.setBounds(270, 113, 31, 20);
        panel_3.add(lblNewLabel_5_1_1_1);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("-");
        lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_1_1.setBounds(323, 84, 29, 13);
        panel_3.add(lblNewLabel_2_1_1);
        
        JLabel lblNewLabel_2_1_1_1 = new JLabel("-");
        lblNewLabel_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_1_1_1.setBounds(323, 117, 29, 13);
        panel_3.add(lblNewLabel_2_1_1_1);
        
        JLabel lblNewLabel_3_1 = new JLabel("Urbat IKE");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_1.setBounds(351, 80, 95, 20);
        panel_3.add(lblNewLabel_3_1);
        
        JLabel lblEquipo1_1 = new JLabel("CN Atlétic Barceloneta");
        lblEquipo1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblEquipo1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblEquipo1_1.setBounds(351, 108, 189, 30);
        panel_3.add(lblEquipo1_1);
        
        JPanel panel_5 = new JPanel();
        tabbedPane.addTab("Jornada 2", null, panel_5, null);
        panel_5.setLayout(null);
        
        JPanel panel_4_1 = new JPanel();
        panel_4_1.setLayout(null);
        panel_4_1.setBounds(594, 493, 565, 172);
        panel_5.add(panel_4_1);
        
        JLabel lblNewLabel_16_1_1 = new JLabel("Jornada 4");
        lblNewLabel_16_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel_16_1_1.setBounds(221, 10, 123, 24);
        panel_4_1.add(lblNewLabel_16_1_1);
        
        JLabel lblNewLabel_31_1_1 = new JLabel("Club Askartza");
        lblNewLabel_31_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_31_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_31_1_1.setBounds(85, 46, 123, 20);
        panel_4_1.add(lblNewLabel_31_1_1);
        
        JLabel lblNewLabel_18_1_1 = new JLabel("-");
        lblNewLabel_18_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_18_1_1.setBounds(221, 38, 45, 36);
        panel_4_1.add(lblNewLabel_18_1_1);
        
        JLabel lblNewLabel_19_1_1 = new JLabel("VS");
        lblNewLabel_19_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_19_1_1.setBounds(251, 46, 38, 20);
        panel_4_1.add(lblNewLabel_19_1_1);
        
        JLabel lblNewLabel_21_1_1 = new JLabel("-");
        lblNewLabel_21_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_21_1_1.setBounds(299, 38, 45, 36);
        panel_4_1.add(lblNewLabel_21_1_1);
        
        JLabel lblNewLabel_26_1_1 = new JLabel("CN La Latina");
        lblNewLabel_26_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_26_1_1.setBounds(326, 46, 110, 20);
        panel_4_1.add(lblNewLabel_26_1_1);
        
        JLabel lblNewLabel_27_1_1 = new JLabel("Urbat IKE");
        lblNewLabel_27_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_27_1_1.setBounds(120, 83, 110, 20);
        panel_4_1.add(lblNewLabel_27_1_1);
        
        JLabel lblNewLabel_23_1_1 = new JLabel("-");
        lblNewLabel_23_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_23_1_1.setBounds(221, 108, 45, 36);
        panel_4_1.add(lblNewLabel_23_1_1);
        
        JLabel lblNewLabel_29_1_1 = new JLabel("VS");
        lblNewLabel_29_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_29_1_1.setBounds(251, 76, 31, 41);
        panel_4_1.add(lblNewLabel_29_1_1);
        
        JLabel lblNewLabel_25_1_2 = new JLabel("-");
        lblNewLabel_25_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_25_1_2.setBounds(299, 76, 45, 36);
        panel_4_1.add(lblNewLabel_25_1_2);
        
        JLabel lblNewLabel_20_1_1 = new JLabel("Tenerife Echeyde");
        lblNewLabel_20_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_20_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_20_1_1.setBounds(326, 76, 152, 30);
        panel_4_1.add(lblNewLabel_20_1_1);
        
        JLabel lblNewLabel_22_1_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_22_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_22_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_22_1_1.setBounds(10, 111, 199, 30);
        panel_4_1.add(lblNewLabel_22_1_1);
        
        JLabel lblNewLabel_28_1_1 = new JLabel("-");
        lblNewLabel_28_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_28_1_1.setBounds(221, 76, 45, 36);
        panel_4_1.add(lblNewLabel_28_1_1);
        
        JLabel lblNewLabel_24_1_1 = new JLabel("VS");
        lblNewLabel_24_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_24_1_1.setBounds(251, 119, 29, 20);
        panel_4_1.add(lblNewLabel_24_1_1);
        
        JLabel lblNewLabel_25_1_1_1 = new JLabel("-");
        lblNewLabel_25_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_25_1_1_1.setBounds(299, 108, 45, 36);
        panel_4_1.add(lblNewLabel_25_1_1_1);
        
        JLabel lblNewLabel_17_1_1 = new JLabel("CN Terrassa");
        lblNewLabel_17_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_17_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_17_1_1.setBounds(326, 119, 110, 20);
        panel_4_1.add(lblNewLabel_17_1_1);
        
        JPanel panel_1_1_2 = new JPanel();
        panel_1_1_2.setLayout(null);
        panel_1_1_2.setBounds(878, 67, 565, 172);
        panel_5.add(panel_1_1_2);
        
        JLabel lblUrbatIke_1 = new JLabel("Urbat IKE");
        lblUrbatIke_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblUrbatIke_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblUrbatIke_1.setBounds(70, 51, 187, 25);
        panel_1_1_2.add(lblUrbatIke_1);
        
        JLabel lblJornada_1 = new JLabel("Jornada 5");
        lblJornada_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_1.setBounds(232, 10, 100, 31);
        panel_1_1_2.add(lblJornada_1);
        
        JLabel lblNewLabel_1_2_2 = new JLabel("-");
        lblNewLabel_1_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_2_2.setBounds(228, 57, 29, 13);
        panel_1_1_2.add(lblNewLabel_1_2_2);
        
        JLabel lblNewLabel_5_2_2 = new JLabel("VS");
        lblNewLabel_5_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_2_2.setBounds(267, 53, 31, 20);
        panel_1_1_2.add(lblNewLabel_5_2_2);
        
        JLabel lblNewLabel_2_2_2 = new JLabel("-");
        lblNewLabel_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_2_2.setBounds(323, 57, 29, 13);
        panel_1_1_2.add(lblNewLabel_2_2_2);
        
        JLabel lblNewLabel_3_2_2 = new JLabel("CN La Latina");
        lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_2_2.setBounds(362, 53, 110, 20);
        panel_1_1_2.add(lblNewLabel_3_2_2);
        
        JLabel lblNewLabel_6_2_2 = new JLabel("Club Askartza");
        lblNewLabel_6_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_2_2.setBounds(86, 91, 132, 20);
        panel_1_1_2.add(lblNewLabel_6_2_2);
        
        JLabel lblNewLabel_7_2_2 = new JLabel("-");
        lblNewLabel_7_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_2_2.setBounds(228, 85, 29, 32);
        panel_1_1_2.add(lblNewLabel_7_2_2);
        
        JLabel lblNewLabel_8_1_2 = new JLabel("VS");
        lblNewLabel_8_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_1_2.setBounds(267, 86, 48, 30);
        panel_1_1_2.add(lblNewLabel_8_1_2);
        
        JLabel lblNewLabel_9_1_2 = new JLabel("-");
        lblNewLabel_9_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_1_2.setBounds(323, 80, 29, 47);
        panel_1_1_2.add(lblNewLabel_9_1_2);
        
        JLabel lblNewLabel_10_2_2 = new JLabel("CN Terrassa");
        lblNewLabel_10_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_2_2.setBounds(362, 89, 110, 25);
        panel_1_1_2.add(lblNewLabel_10_2_2);
        
        JLabel lblNewLabel_11_2_2 = new JLabel("Tenerife Echeyde");
        lblNewLabel_11_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_2_2.setBounds(70, 128, 143, 20);
        panel_1_1_2.add(lblNewLabel_11_2_2);
        
        JLabel lblNewLabel_12_1_2 = new JLabel("-");
        lblNewLabel_12_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_1_2.setBounds(228, 120, 45, 36);
        panel_1_1_2.add(lblNewLabel_12_1_2);
        
        JLabel lblNewLabel_13_1_2 = new JLabel("VS");
        lblNewLabel_13_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_1_2.setBounds(267, 128, 45, 20);
        panel_1_1_2.add(lblNewLabel_13_1_2);
        
        JLabel lblNewLabel_14_2_2 = new JLabel("-");
        lblNewLabel_14_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_2_2.setBounds(323, 124, 45, 30);
        panel_1_1_2.add(lblNewLabel_14_2_2);
        
        JLabel lblNewLabel_15_2_2 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_15_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_2_2.setBounds(362, 126, 193, 24);
        panel_1_1_2.add(lblNewLabel_15_2_2);
        
        JPanel panel_1_1_1_1 = new JPanel();
        panel_1_1_1_1.setLayout(null);
        panel_1_1_1_1.setBounds(521, 301, 565, 172);
        panel_5.add(panel_1_1_1_1);
        
        JLabel lblTenerifeEcheyde_1 = new JLabel("Tenerife Echeyde");
        lblTenerifeEcheyde_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblTenerifeEcheyde_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblTenerifeEcheyde_1.setBounds(35, 51, 187, 25);
        panel_1_1_1_1.add(lblTenerifeEcheyde_1);
        
        JLabel lblJornada_2_1 = new JLabel("Jornada 6");
        lblJornada_2_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2_1.setBounds(232, 10, 100, 31);
        panel_1_1_1_1.add(lblJornada_2_1);
        
        JLabel lblNewLabel_1_2_1_1 = new JLabel("-");
        lblNewLabel_1_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_2_1_1.setBounds(228, 57, 29, 13);
        panel_1_1_1_1.add(lblNewLabel_1_2_1_1);
        
        JLabel lblNewLabel_5_2_1_1 = new JLabel("VS");
        lblNewLabel_5_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_2_1_1.setBounds(267, 53, 31, 20);
        panel_1_1_1_1.add(lblNewLabel_5_2_1_1);
        
        JLabel lblNewLabel_2_2_1_1 = new JLabel("-");
        lblNewLabel_2_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_2_1_1.setBounds(323, 57, 29, 13);
        panel_1_1_1_1.add(lblNewLabel_2_2_1_1);
        
        JLabel lblNewLabel_3_2_1_1 = new JLabel("Club Askartza");
        lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_2_1_1.setBounds(362, 53, 125, 20);
        panel_1_1_1_1.add(lblNewLabel_3_2_1_1);
        
        JLabel lblNewLabel_6_2_1_1 = new JLabel("CN Terrassa");
        lblNewLabel_6_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_2_1_1.setBounds(62, 91, 132, 20);
        panel_1_1_1_1.add(lblNewLabel_6_2_1_1);
        
        JLabel lblNewLabel_7_2_1_1 = new JLabel("-");
        lblNewLabel_7_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_2_1_1.setBounds(228, 85, 29, 32);
        panel_1_1_1_1.add(lblNewLabel_7_2_1_1);
        
        JLabel lblNewLabel_8_1_1_1 = new JLabel("VS");
        lblNewLabel_8_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_1_1_1.setBounds(267, 86, 48, 30);
        panel_1_1_1_1.add(lblNewLabel_8_1_1_1);
        
        JLabel lblNewLabel_9_1_1_1 = new JLabel("-");
        lblNewLabel_9_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_1_1_1.setBounds(323, 80, 29, 47);
        panel_1_1_1_1.add(lblNewLabel_9_1_1_1);
        
        JLabel lblNewLabel_10_2_1_1 = new JLabel("CN La Latina");
        lblNewLabel_10_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_2_1_1.setBounds(362, 89, 110, 25);
        panel_1_1_1_1.add(lblNewLabel_10_2_1_1);
        
        JLabel lblNewLabel_11_2_1_1 = new JLabel("Urbat IKE");
        lblNewLabel_11_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_2_1_1.setBounds(57, 128, 143, 20);
        panel_1_1_1_1.add(lblNewLabel_11_2_1_1);
        
        JLabel lblNewLabel_12_1_1_1 = new JLabel("-");
        lblNewLabel_12_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_1_1_1.setBounds(228, 120, 45, 36);
        panel_1_1_1_1.add(lblNewLabel_12_1_1_1);
        
        JLabel lblNewLabel_13_1_1_1 = new JLabel("VS");
        lblNewLabel_13_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_1_1_1.setBounds(267, 128, 45, 20);
        panel_1_1_1_1.add(lblNewLabel_13_1_1_1);
        
        JLabel lblNewLabel_14_2_1_1 = new JLabel("-");
        lblNewLabel_14_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_2_1_1.setBounds(323, 124, 45, 30);
        panel_1_1_1_1.add(lblNewLabel_14_2_1_1);
        
        JLabel lblNewLabel_15_2_1_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_15_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_2_1_1.setBounds(362, 126, 193, 24);
        panel_1_1_1_1.add(lblNewLabel_15_2_1_1);
        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setLayout(null);
        panel_2_1.setBounds(32, 119, 565, 172);
        panel_5.add(panel_2_1);
        
        JLabel lblNewLabel_16_1 = new JLabel("Jornada 2");
        lblNewLabel_16_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblNewLabel_16_1.setBounds(221, 10, 123, 24);
        panel_2_1.add(lblNewLabel_16_1);
        
        JLabel lblNewLabel_17_1 = new JLabel("CN Terrassa");
        lblNewLabel_17_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_17_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_17_1.setBounds(87, 57, 110, 20);
        panel_2_1.add(lblNewLabel_17_1);
        
        JLabel lblNewLabel_18_1 = new JLabel("-");
        lblNewLabel_18_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_18_1.setBounds(214, 49, 45, 36);
        panel_2_1.add(lblNewLabel_18_1);
        
        JLabel lblNewLabel_19_1 = new JLabel("VS");
        lblNewLabel_19_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_19_1.setBounds(251, 57, 38, 20);
        panel_2_1.add(lblNewLabel_19_1);
        
        JLabel lblNewLabel_21_1 = new JLabel("-");
        lblNewLabel_21_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_21_1.setBounds(299, 49, 45, 36);
        panel_2_1.add(lblNewLabel_21_1);
        
        JLabel lblNewLabel_20_1 = new JLabel("Tenerife Echeyde");
        lblNewLabel_20_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_20_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_20_1.setBounds(328, 52, 152, 30);
        panel_2_1.add(lblNewLabel_20_1);
        
        JLabel lblNewLabel_22_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_22_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_22_1.setBounds(10, 87, 199, 30);
        panel_2_1.add(lblNewLabel_22_1);
        
        JLabel lblNewLabel_23_1 = new JLabel("-");
        lblNewLabel_23_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_23_1.setBounds(214, 84, 45, 36);
        panel_2_1.add(lblNewLabel_23_1);
        
        JLabel lblNewLabel_24_1 = new JLabel("VS");
        lblNewLabel_24_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_24_1.setBounds(251, 92, 29, 20);
        panel_2_1.add(lblNewLabel_24_1);
        
        JLabel lblNewLabel_25_1 = new JLabel("-");
        lblNewLabel_25_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_25_1.setBounds(299, 84, 45, 36);
        panel_2_1.add(lblNewLabel_25_1);
        
        JLabel lblNewLabel_26_1 = new JLabel("CN La Latina");
        lblNewLabel_26_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_26_1.setBounds(328, 92, 110, 20);
        panel_2_1.add(lblNewLabel_26_1);
        
        JLabel lblNewLabel_27_1 = new JLabel("Urbat IKE");
        lblNewLabel_27_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_27_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_27_1.setBounds(87, 127, 110, 20);
        panel_2_1.add(lblNewLabel_27_1);
        
        JLabel lblNewLabel_28_1 = new JLabel("-");
        lblNewLabel_28_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_28_1.setBounds(214, 110, 45, 55);
        panel_2_1.add(lblNewLabel_28_1);
        
        JLabel lblNewLabel_29_1 = new JLabel("VS");
        lblNewLabel_29_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_29_1.setBounds(251, 117, 31, 41);
        panel_2_1.add(lblNewLabel_29_1);
        
        JLabel lblNewLabel_30_1 = new JLabel("-");
        lblNewLabel_30_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_30_1.setBounds(299, 110, 45, 55);
        panel_2_1.add(lblNewLabel_30_1);
        
        JLabel lblNewLabel_31_1 = new JLabel("Club Askartza");
        lblNewLabel_31_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_31_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_31_1.setBounds(328, 127, 123, 20);
        panel_2_1.add(lblNewLabel_31_1);
        
        JPanel panel_4 = new JPanel();
        tabbedPane.addTab("Jornada 3", null, panel_4, null);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        contentPane.add(scrollPane_1, BorderLayout.NORTH);
        contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{scrollPane, tabbedPane, panel, panel_1, lblEquipo1, lblNewLabel, lblNewLabel_1, lblNewLabel_5, lblNewLabel_2, lblNewLabel_3, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, lblNewLabel_13, lblNewLabel_14, lblNewLabel_15, panel_2, lblNewLabel_16, lblNewLabel_17, lblNewLabel_18, lblNewLabel_19, lblNewLabel_21, lblNewLabel_20, lblNewLabel_22, lblNewLabel_23, lblNewLabel_24, lblNewLabel_25, lblNewLabel_26, lblNewLabel_27, lblNewLabel_28, lblNewLabel_29, lblNewLabel_30, lblNewLabel_31, panel_3, lblNewLabel_32, lblNewLabel_6_1, lblNewLabel_1_1, lblNewLabel_5_1, lblNewLabel_2_1, lblNewLabel_15_1, lblNewLabel_10_1, lblNewLabel_11_1, lblNewLabel_7_1, lblNewLabel_14_1, lblNewLabel_5_1_1, lblNewLabel_5_1_1_1, lblNewLabel_2_1_1, lblNewLabel_2_1_1_1, lblNewLabel_3_1, lblEquipo1_1, panel_5, panel_4_1, lblNewLabel_16_1_1, lblNewLabel_31_1_1, lblNewLabel_18_1_1, lblNewLabel_19_1_1, lblNewLabel_21_1_1, lblNewLabel_26_1_1, lblNewLabel_27_1_1, lblNewLabel_23_1_1, lblNewLabel_29_1_1, lblNewLabel_25_1_2, lblNewLabel_20_1_1, lblNewLabel_22_1_1, lblNewLabel_28_1_1, lblNewLabel_24_1_1, lblNewLabel_25_1_1_1, lblNewLabel_17_1_1, panel_1_1_2, lblUrbatIke_1, lblJornada_1, lblNewLabel_1_2_2, lblNewLabel_5_2_2, lblNewLabel_2_2_2, lblNewLabel_3_2_2, lblNewLabel_6_2_2, lblNewLabel_7_2_2, lblNewLabel_8_1_2, lblNewLabel_9_1_2, lblNewLabel_10_2_2, lblNewLabel_11_2_2, lblNewLabel_12_1_2, lblNewLabel_13_1_2, lblNewLabel_14_2_2, lblNewLabel_15_2_2, panel_1_1_1_1, lblTenerifeEcheyde_1, lblJornada_2_1, lblNewLabel_1_2_1_1, lblNewLabel_5_2_1_1, lblNewLabel_2_2_1_1, lblNewLabel_3_2_1_1, lblNewLabel_6_2_1_1, lblNewLabel_7_2_1_1, lblNewLabel_8_1_1_1, lblNewLabel_9_1_1_1, lblNewLabel_10_2_1_1, lblNewLabel_11_2_1_1, lblNewLabel_12_1_1_1, lblNewLabel_13_1_1_1, lblNewLabel_14_2_1_1, lblNewLabel_15_2_1_1, panel_2_1, lblNewLabel_16_1, lblNewLabel_17_1, lblNewLabel_18_1, lblNewLabel_19_1, lblNewLabel_21_1, lblNewLabel_20_1, lblNewLabel_22_1, lblNewLabel_23_1, lblNewLabel_24_1, lblNewLabel_25_1, lblNewLabel_26_1, lblNewLabel_27_1, lblNewLabel_28_1, lblNewLabel_29_1, lblNewLabel_30_1, lblNewLabel_31_1, panel_4}));
        
        
        
       
    }
}