package Reto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;

public class ResultadosING extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadosING frame = new ResultadosING();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ResultadosING() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Spanish Water Polo Results");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 780, 498);
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
        tabbedPane.addTab("Week1", null, panel, null);
        
        JPanel panel_5 = new JPanel();
        tabbedPane.addTab("Week2", null, panel_5, null);
        panel_5.setLayout(null);
        
        JPanel panel_1_3_2 = new JPanel();
        panel_1_3_2.setLayout(null);
        panel_1_3_2.setBounds(92, 123, 565, 172);
        panel_5.add(panel_1_3_2);
        
        JLabel lblCnLaLatina_1_2 = new JLabel("CN Terrassa");
        lblCnLaLatina_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblCnLaLatina_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblCnLaLatina_1_2.setBounds(26, 51, 192, 25);
        panel_1_3_2.add(lblCnLaLatina_1_2);
        
        JLabel lblJornada_2_3 = new JLabel("Week 2");
        lblJornada_2_3.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2_3.setBounds(244, 13, 95, 25);
        panel_1_3_2.add(lblJornada_2_3);
        
        JLabel lblNewLabel_1_3_2 = new JLabel("-");
        lblNewLabel_1_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_3_2.setBounds(228, 57, 29, 13);
        panel_1_3_2.add(lblNewLabel_1_3_2);
        
        JLabel lblNewLabel_5_3_2 = new JLabel("VS");
        lblNewLabel_5_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_3_2.setBounds(267, 53, 31, 20);
        panel_1_3_2.add(lblNewLabel_5_3_2);
        
        JLabel lblNewLabel_2_3_2 = new JLabel("-");
        lblNewLabel_2_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_3_2.setBounds(323, 57, 29, 13);
        panel_1_3_2.add(lblNewLabel_2_3_2);
        
        JLabel lblNewLabel_3_3_2 = new JLabel("Tenerife Echeyde");
        lblNewLabel_3_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_3_2.setBounds(362, 53, 193, 20);
        panel_1_3_2.add(lblNewLabel_3_3_2);
        
        JLabel lblNewLabel_6_3_2 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_6_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_3_2.setBounds(26, 91, 192, 20);
        panel_1_3_2.add(lblNewLabel_6_3_2);
        
        JLabel lblNewLabel_7_3_2 = new JLabel("-");
        lblNewLabel_7_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_3_2.setBounds(228, 85, 29, 32);
        panel_1_3_2.add(lblNewLabel_7_3_2);
        
        JLabel lblNewLabel_8_3_2 = new JLabel("VS");
        lblNewLabel_8_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_3_2.setBounds(267, 86, 48, 30);
        panel_1_3_2.add(lblNewLabel_8_3_2);
        
        JLabel lblNewLabel_9_3_2 = new JLabel("-");
        lblNewLabel_9_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_3_2.setBounds(323, 80, 29, 47);
        panel_1_3_2.add(lblNewLabel_9_3_2);
        
        JLabel lblNewLabel_10_3_2 = new JLabel("CN La Latina");
        lblNewLabel_10_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_3_2.setBounds(362, 89, 193, 25);
        panel_1_3_2.add(lblNewLabel_10_3_2);
        
        JLabel lblNewLabel_11_3_2 = new JLabel("Urbat IKE");
        lblNewLabel_11_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_3_2.setBounds(26, 128, 192, 20);
        panel_1_3_2.add(lblNewLabel_11_3_2);
        
        JLabel lblNewLabel_12_3_2 = new JLabel("-");
        lblNewLabel_12_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_3_2.setBounds(228, 120, 45, 36);
        panel_1_3_2.add(lblNewLabel_12_3_2);
        
        JLabel lblNewLabel_13_3_2 = new JLabel("VS");
        lblNewLabel_13_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_3_2.setBounds(267, 128, 45, 20);
        panel_1_3_2.add(lblNewLabel_13_3_2);
        
        JLabel lblNewLabel_14_3_2 = new JLabel("-");
        lblNewLabel_14_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_3_2.setBounds(323, 124, 45, 30);
        panel_1_3_2.add(lblNewLabel_14_3_2);
        
        JLabel lblNewLabel_15_3_2 = new JLabel("Club Askartza");
        lblNewLabel_15_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_3_2.setBounds(362, 126, 193, 24);
        panel_1_3_2.add(lblNewLabel_15_3_2);
        
        JPanel panel_4 = new JPanel();
        tabbedPane.addTab("Week3", null, panel_4, null);
        panel_4.setLayout(null);
        
        JPanel panel_1_3_1_1 = new JPanel();
        panel_1_3_1_1.setLayout(null);
        panel_1_3_1_1.setBounds(92, 123, 565, 172);
        panel_4.add(panel_1_3_1_1);
        
        JLabel lblCnLaLatina_1_1_1 = new JLabel("CN La Latina");
        lblCnLaLatina_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblCnLaLatina_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblCnLaLatina_1_1_1.setBounds(10, 51, 197, 25);
        panel_1_3_1_1.add(lblCnLaLatina_1_1_1);
        
        JLabel lblJornada_2_2_1 = new JLabel("Week 3");
        lblJornada_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblJornada_2_2_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2_2_1.setBounds(222, 10, 121, 31);
        panel_1_3_1_1.add(lblJornada_2_2_1);
        
        JLabel lblNewLabel_1_3_1_1 = new JLabel("-");
        lblNewLabel_1_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_3_1_1.setBounds(228, 57, 29, 13);
        panel_1_3_1_1.add(lblNewLabel_1_3_1_1);
        
        JLabel lblNewLabel_5_3_1_1 = new JLabel("VS");
        lblNewLabel_5_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_3_1_1.setBounds(267, 53, 31, 20);
        panel_1_3_1_1.add(lblNewLabel_5_3_1_1);
        
        JLabel lblNewLabel_2_3_1_1 = new JLabel("-");
        lblNewLabel_2_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_3_1_1.setBounds(323, 57, 29, 13);
        panel_1_3_1_1.add(lblNewLabel_2_3_1_1);
        
        JLabel lblNewLabel_3_3_1_1 = new JLabel("Tenerife Echeyde");
        lblNewLabel_3_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_3_1_1.setBounds(362, 53, 193, 20);
        panel_1_3_1_1.add(lblNewLabel_3_3_1_1);
        
        JLabel lblNewLabel_6_3_1_1 = new JLabel("CN Terrassa");
        lblNewLabel_6_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_3_1_1.setBounds(10, 91, 197, 20);
        panel_1_3_1_1.add(lblNewLabel_6_3_1_1);
        
        JLabel lblNewLabel_7_3_1_1 = new JLabel("-");
        lblNewLabel_7_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_3_1_1.setBounds(228, 85, 29, 32);
        panel_1_3_1_1.add(lblNewLabel_7_3_1_1);
        
        JLabel lblNewLabel_8_3_1_1 = new JLabel("VS");
        lblNewLabel_8_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_3_1_1.setBounds(267, 86, 48, 30);
        panel_1_3_1_1.add(lblNewLabel_8_3_1_1);
        
        JLabel lblNewLabel_9_3_1_1 = new JLabel("-");
        lblNewLabel_9_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_3_1_1.setBounds(323, 80, 29, 47);
        panel_1_3_1_1.add(lblNewLabel_9_3_1_1);
        
        JLabel lblNewLabel_10_3_1_1 = new JLabel("Urbat IKE");
        lblNewLabel_10_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_3_1_1.setBounds(362, 89, 193, 25);
        panel_1_3_1_1.add(lblNewLabel_10_3_1_1);
        
        JLabel lblNewLabel_11_3_1_1 = new JLabel("Club Askartza");
        lblNewLabel_11_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_3_1_1.setBounds(10, 128, 197, 20);
        panel_1_3_1_1.add(lblNewLabel_11_3_1_1);
        
        JLabel lblNewLabel_12_3_1_1 = new JLabel("-");
        lblNewLabel_12_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_3_1_1.setBounds(228, 120, 45, 36);
        panel_1_3_1_1.add(lblNewLabel_12_3_1_1);
        
        JLabel lblNewLabel_13_3_1_1 = new JLabel("VS");
        lblNewLabel_13_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_3_1_1.setBounds(267, 128, 45, 20);
        panel_1_3_1_1.add(lblNewLabel_13_3_1_1);
        
        JLabel lblNewLabel_14_3_1_1 = new JLabel("-");
        lblNewLabel_14_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_3_1_1.setBounds(323, 124, 45, 30);
        panel_1_3_1_1.add(lblNewLabel_14_3_1_1);
        
        JLabel lblNewLabel_15_3_1_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_15_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_3_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_3_1_1.setBounds(362, 126, 193, 24);
        panel_1_3_1_1.add(lblNewLabel_15_3_1_1);
        panel.setSize(400,250);
        
        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Week4", null, panel_2, null);
        panel.setSize(400,250);
        
        JPanel panel_1_3_1 = new JPanel();
        panel_1_3_1.setLayout(null);
        panel_1_3_1.setBounds(92, 123, 565, 172);
        panel.add(panel_1_3_1);
        
        JLabel lblCnLaLatina_1_1 = new JLabel("CN Atlétic Barceloneta");
        lblCnLaLatina_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblCnLaLatina_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblCnLaLatina_1_1.setBounds(10, 51, 197, 25);
        panel_1_3_1.add(lblCnLaLatina_1_1);
        
        JLabel lblJornada_2_2 = new JLabel("Week 1");
        lblJornada_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblJornada_2_2.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2_2.setBounds(222, 10, 121, 31);
        panel_1_3_1.add(lblJornada_2_2);
        
        JLabel lblNewLabel_1_3_1 = new JLabel("-");
        lblNewLabel_1_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_3_1.setBounds(228, 57, 29, 13);
        panel_1_3_1.add(lblNewLabel_1_3_1);
        
        JLabel lblNewLabel_5_3_1 = new JLabel("VS");
        lblNewLabel_5_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_3_1.setBounds(267, 53, 31, 20);
        panel_1_3_1.add(lblNewLabel_5_3_1);
        
        JLabel lblNewLabel_2_3_1 = new JLabel("-");
        lblNewLabel_2_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_3_1.setBounds(323, 57, 29, 13);
        panel_1_3_1.add(lblNewLabel_2_3_1);
        
        JLabel lblNewLabel_3_3_1 = new JLabel("Urbat IKE");
        lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_3_1.setBounds(362, 53, 193, 20);
        panel_1_3_1.add(lblNewLabel_3_3_1);
        
        JLabel lblNewLabel_6_3_1 = new JLabel("CN La Latina");
        lblNewLabel_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_3_1.setBounds(26, 91, 174, 20);
        panel_1_3_1.add(lblNewLabel_6_3_1);
        
        JLabel lblNewLabel_7_3_1 = new JLabel("-");
        lblNewLabel_7_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_3_1.setBounds(228, 85, 29, 32);
        panel_1_3_1.add(lblNewLabel_7_3_1);
        
        JLabel lblNewLabel_8_3_1 = new JLabel("VS");
        lblNewLabel_8_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_3_1.setBounds(267, 86, 48, 30);
        panel_1_3_1.add(lblNewLabel_8_3_1);
        
        JLabel lblNewLabel_9_3_1 = new JLabel("-");
        lblNewLabel_9_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_3_1.setBounds(323, 80, 29, 47);
        panel_1_3_1.add(lblNewLabel_9_3_1);
        
        JLabel lblNewLabel_10_3_1 = new JLabel("CN Terrassa");
        lblNewLabel_10_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_3_1.setBounds(362, 89, 193, 25);
        panel_1_3_1.add(lblNewLabel_10_3_1);
        
        JLabel lblNewLabel_11_3_1 = new JLabel("Club Askartza");
        lblNewLabel_11_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_3_1.setBounds(26, 128, 187, 20);
        panel_1_3_1.add(lblNewLabel_11_3_1);
        
        JLabel lblNewLabel_12_3_1 = new JLabel("-");
        lblNewLabel_12_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_3_1.setBounds(228, 120, 45, 36);
        panel_1_3_1.add(lblNewLabel_12_3_1);
        
        JLabel lblNewLabel_13_3_1 = new JLabel("VS");
        lblNewLabel_13_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_3_1.setBounds(267, 128, 45, 20);
        panel_1_3_1.add(lblNewLabel_13_3_1);
        
        JLabel lblNewLabel_14_3_1 = new JLabel("-");
        lblNewLabel_14_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_3_1.setBounds(323, 124, 45, 30);
        panel_1_3_1.add(lblNewLabel_14_3_1);
        
        JLabel lblNewLabel_15_3_1 = new JLabel("Tenerife Echeyde");
        lblNewLabel_15_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_3_1.setBounds(362, 126, 193, 24);
        panel_1_3_1.add(lblNewLabel_15_3_1);
        panel_2.setLayout(null);
        
        JPanel panel_1_3_1_2 = new JPanel();
        panel_1_3_1_2.setLayout(null);
        panel_1_3_1_2.setBounds(92, 123, 565, 172);
        panel_2.add(panel_1_3_1_2);
        
        JLabel lblCnLaLatina_1_1_2 = new JLabel("Club Askartza");
        lblCnLaLatina_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblCnLaLatina_1_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblCnLaLatina_1_1_2.setBounds(10, 51, 197, 25);
        panel_1_3_1_2.add(lblCnLaLatina_1_1_2);
        
        JLabel lblJornada_2_2_2 = new JLabel("Week 4");
        lblJornada_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblJornada_2_2_2.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2_2_2.setBounds(222, 10, 121, 31);
        panel_1_3_1_2.add(lblJornada_2_2_2);
        
        JLabel lblNewLabel_1_3_1_2 = new JLabel("-");
        lblNewLabel_1_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_3_1_2.setBounds(228, 57, 29, 13);
        panel_1_3_1_2.add(lblNewLabel_1_3_1_2);
        
        JLabel lblNewLabel_5_3_1_2 = new JLabel("VS");
        lblNewLabel_5_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_3_1_2.setBounds(267, 53, 31, 20);
        panel_1_3_1_2.add(lblNewLabel_5_3_1_2);
        
        JLabel lblNewLabel_2_3_1_2 = new JLabel("-");
        lblNewLabel_2_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_3_1_2.setBounds(323, 57, 29, 13);
        panel_1_3_1_2.add(lblNewLabel_2_3_1_2);
        
        JLabel lblNewLabel_3_3_1_2 = new JLabel("CN La Latina");
        lblNewLabel_3_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_3_1_2.setBounds(362, 53, 193, 20);
        panel_1_3_1_2.add(lblNewLabel_3_3_1_2);
        
        JLabel lblNewLabel_6_3_1_2 = new JLabel("Urbat IKE");
        lblNewLabel_6_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_3_1_2.setBounds(10, 91, 197, 20);
        panel_1_3_1_2.add(lblNewLabel_6_3_1_2);
        
        JLabel lblNewLabel_7_3_1_2 = new JLabel("-");
        lblNewLabel_7_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_3_1_2.setBounds(228, 85, 29, 32);
        panel_1_3_1_2.add(lblNewLabel_7_3_1_2);
        
        JLabel lblNewLabel_8_3_1_2 = new JLabel("VS");
        lblNewLabel_8_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_3_1_2.setBounds(267, 86, 48, 30);
        panel_1_3_1_2.add(lblNewLabel_8_3_1_2);
        
        JLabel lblNewLabel_9_3_1_2 = new JLabel("-");
        lblNewLabel_9_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_3_1_2.setBounds(323, 80, 29, 47);
        panel_1_3_1_2.add(lblNewLabel_9_3_1_2);
        
        JLabel lblNewLabel_10_3_1_2 = new JLabel("Tenerife Echeyde");
        lblNewLabel_10_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_3_1_2.setBounds(362, 89, 193, 25);
        panel_1_3_1_2.add(lblNewLabel_10_3_1_2);
        
        JLabel lblNewLabel_11_3_1_2 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_11_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_3_1_2.setBounds(10, 128, 203, 20);
        panel_1_3_1_2.add(lblNewLabel_11_3_1_2);
        
        JLabel lblNewLabel_12_3_1_2 = new JLabel("-");
        lblNewLabel_12_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_3_1_2.setBounds(228, 120, 45, 36);
        panel_1_3_1_2.add(lblNewLabel_12_3_1_2);
        
        JLabel lblNewLabel_13_3_1_2 = new JLabel("VS");
        lblNewLabel_13_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_3_1_2.setBounds(267, 128, 45, 20);
        panel_1_3_1_2.add(lblNewLabel_13_3_1_2);
        
        JLabel lblNewLabel_14_3_1_2 = new JLabel("-");
        lblNewLabel_14_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_3_1_2.setBounds(323, 124, 45, 30);
        panel_1_3_1_2.add(lblNewLabel_14_3_1_2);
        
        JLabel lblNewLabel_15_3_1_2 = new JLabel("CN Terrassa");
        lblNewLabel_15_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_3_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_3_1_2.setBounds(362, 126, 193, 24);
        panel_1_3_1_2.add(lblNewLabel_15_3_1_2);
        
        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("Week5", null, panel_3, null);
        panel_3.setLayout(null);
        
        JPanel panel_1_1_2_1 = new JPanel();
        panel_1_1_2_1.setBounds(1129, 25, 1, 1);
        panel_3.add(panel_1_1_2_1);
        panel_1_1_2_1.setLayout(null);
        
        JLabel lblUrbatIke_1_1 = new JLabel("Urbat IKE");
        lblUrbatIke_1_1.setBounds(5, 8, 77, 25);
        lblUrbatIke_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblUrbatIke_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblUrbatIke_1_1);
        
        JLabel lblJornada_1_1 = new JLabel("Jornada 5");
        lblJornada_1_1.setBounds(87, 5, 100, 31);
        lblJornada_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
        panel_1_1_2_1.add(lblJornada_1_1);
        
        JLabel lblNewLabel_1_2_2_1 = new JLabel("-");
        lblNewLabel_1_2_2_1.setBounds(192, 8, 6, 25);
        lblNewLabel_1_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_1_2_2_1);
        
        JLabel lblNewLabel_5_2_2_1 = new JLabel("VS");
        lblNewLabel_5_2_2_1.setBounds(203, 8, 20, 25);
        lblNewLabel_5_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_5_2_2_1);
        
        JLabel lblNewLabel_2_2_2_1 = new JLabel("-");
        lblNewLabel_2_2_2_1.setBounds(228, 8, 6, 25);
        lblNewLabel_2_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_2_2_2_1);
        
        JLabel lblNewLabel_3_2_2_1 = new JLabel("CN La Latina");
        lblNewLabel_3_2_2_1.setBounds(239, 8, 103, 25);
        lblNewLabel_3_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_3_2_2_1);
        
        JLabel lblNewLabel_6_2_2_1 = new JLabel("Club Askartza");
        lblNewLabel_6_2_2_1.setBounds(347, 8, 111, 25);
        lblNewLabel_6_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_6_2_2_1);
        
        JLabel lblNewLabel_7_2_2_1 = new JLabel("-");
        lblNewLabel_7_2_2_1.setBounds(463, 8, 6, 25);
        lblNewLabel_7_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_7_2_2_1);
        
        JLabel lblNewLabel_8_1_2_1 = new JLabel("VS");
        lblNewLabel_8_1_2_1.setBounds(474, 8, 20, 25);
        lblNewLabel_8_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_8_1_2_1);
        
        JLabel lblNewLabel_9_1_2_1 = new JLabel("-");
        lblNewLabel_9_1_2_1.setBounds(499, 8, 6, 25);
        lblNewLabel_9_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_9_1_2_1);
        
        JLabel lblNewLabel_10_2_2_1 = new JLabel("CN Terrassa");
        lblNewLabel_10_2_2_1.setBounds(510, 8, 98, 25);
        lblNewLabel_10_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_10_2_2_1);
        
        JLabel lblNewLabel_11_2_2_1 = new JLabel("Tenerife Echeyde");
        lblNewLabel_11_2_2_1.setBounds(613, 8, 138, 25);
        lblNewLabel_11_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_11_2_2_1);
        
        JLabel lblNewLabel_12_1_2_1 = new JLabel("-");
        lblNewLabel_12_1_2_1.setBounds(756, 8, 6, 25);
        lblNewLabel_12_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_12_1_2_1);
        
        JLabel lblNewLabel_13_1_2_1 = new JLabel("VS");
        lblNewLabel_13_1_2_1.setBounds(767, 8, 20, 25);
        lblNewLabel_13_1_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_13_1_2_1);
        
        JLabel lblNewLabel_14_2_2_1 = new JLabel("-");
        lblNewLabel_14_2_2_1.setBounds(792, 8, 6, 25);
        lblNewLabel_14_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_14_2_2_1);
        
        JLabel lblNewLabel_15_2_2_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_15_2_2_1.setBounds(803, 8, 182, 25);
        lblNewLabel_15_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_2_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        panel_1_1_2_1.add(lblNewLabel_15_2_2_1);
        
        JPanel panel_1_1_2_3 = new JPanel();
        panel_1_1_2_3.setLayout(null);
        panel_1_1_2_3.setBounds(92, 123, 565, 172);
        panel_3.add(panel_1_1_2_3);
        
        JLabel lblUrbatIke_1_2 = new JLabel("Urbat IKE");
        lblUrbatIke_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblUrbatIke_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblUrbatIke_1_2.setBounds(25, 51, 188, 25);
        panel_1_1_2_3.add(lblUrbatIke_1_2);
        
        JLabel lblJornada_1_2 = new JLabel("Week 5");
        lblJornada_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblJornada_1_2.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_1_2.setBounds(232, 10, 100, 31);
        panel_1_1_2_3.add(lblJornada_1_2);
        
        JLabel lblNewLabel_1_2_2_2 = new JLabel("-");
        lblNewLabel_1_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_2_2_2.setBounds(228, 57, 29, 13);
        panel_1_1_2_3.add(lblNewLabel_1_2_2_2);
        
        JLabel lblNewLabel_5_2_2_2 = new JLabel("VS");
        lblNewLabel_5_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_2_2_2.setBounds(267, 53, 31, 20);
        panel_1_1_2_3.add(lblNewLabel_5_2_2_2);
        
        JLabel lblNewLabel_2_2_2_2 = new JLabel("-");
        lblNewLabel_2_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_2_2_2.setBounds(323, 57, 29, 13);
        panel_1_1_2_3.add(lblNewLabel_2_2_2_2);
        
        JLabel lblNewLabel_3_2_2_2 = new JLabel("CN La Latina");
        lblNewLabel_3_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_2_2_2.setBounds(362, 53, 193, 20);
        panel_1_1_2_3.add(lblNewLabel_3_2_2_2);
        
        JLabel lblNewLabel_6_2_2_2 = new JLabel("Club Askartza");
        lblNewLabel_6_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_2_2_2.setBounds(25, 91, 193, 20);
        panel_1_1_2_3.add(lblNewLabel_6_2_2_2);
        
        JLabel lblNewLabel_7_2_2_2 = new JLabel("-");
        lblNewLabel_7_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_2_2_2.setBounds(228, 85, 29, 32);
        panel_1_1_2_3.add(lblNewLabel_7_2_2_2);
        
        JLabel lblNewLabel_8_1_2_2 = new JLabel("VS");
        lblNewLabel_8_1_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_1_2_2.setBounds(267, 86, 48, 30);
        panel_1_1_2_3.add(lblNewLabel_8_1_2_2);
        
        JLabel lblNewLabel_9_1_2_2 = new JLabel("-");
        lblNewLabel_9_1_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_1_2_2.setBounds(323, 80, 29, 47);
        panel_1_1_2_3.add(lblNewLabel_9_1_2_2);
        
        JLabel lblNewLabel_10_2_2_2 = new JLabel("CN Terrassa");
        lblNewLabel_10_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_2_2_2.setBounds(362, 89, 193, 25);
        panel_1_1_2_3.add(lblNewLabel_10_2_2_2);
        
        JLabel lblNewLabel_11_2_2_2 = new JLabel("Tenerife Echeyde");
        lblNewLabel_11_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_2_2_2.setBounds(25, 128, 188, 20);
        panel_1_1_2_3.add(lblNewLabel_11_2_2_2);
        
        JLabel lblNewLabel_12_1_2_2 = new JLabel("-");
        lblNewLabel_12_1_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_1_2_2.setBounds(228, 120, 45, 36);
        panel_1_1_2_3.add(lblNewLabel_12_1_2_2);
        
        JLabel lblNewLabel_13_1_2_2 = new JLabel("VS");
        lblNewLabel_13_1_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_1_2_2.setBounds(267, 128, 45, 20);
        panel_1_1_2_3.add(lblNewLabel_13_1_2_2);
        
        JLabel lblNewLabel_14_2_2_2 = new JLabel("-");
        lblNewLabel_14_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_2_2_2.setBounds(323, 124, 45, 30);
        panel_1_1_2_3.add(lblNewLabel_14_2_2_2);
        
        JLabel lblNewLabel_15_2_2_2 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_15_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_2_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_2_2_2.setBounds(362, 126, 193, 24);
        panel_1_1_2_3.add(lblNewLabel_15_2_2_2);
        
        JPanel panel_6 = new JPanel();
        tabbedPane.addTab("Week6", null, panel_6, null);
        panel_6.setLayout(null);
        
        JPanel panel_1_1_1_1_2 = new JPanel();
        panel_1_1_1_1_2.setLayout(null);
        panel_1_1_1_1_2.setBounds(92, 123, 565, 172);
        panel_6.add(panel_1_1_1_1_2);
        
        JLabel lblTenerifeEcheyde_1_1 = new JLabel("Tenerife Echeyde");
        lblTenerifeEcheyde_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblTenerifeEcheyde_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblTenerifeEcheyde_1_1.setBounds(10, 51, 184, 25);
        panel_1_1_1_1_2.add(lblTenerifeEcheyde_1_1);
        
        JLabel lblJornada_2_1_1 = new JLabel("Week 6");
        lblJornada_2_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2_1_1.setBounds(243, 10, 88, 31);
        panel_1_1_1_1_2.add(lblJornada_2_1_1);
        
        JLabel lblNewLabel_1_2_1_1_1 = new JLabel("-");
        lblNewLabel_1_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_2_1_1_1.setBounds(228, 57, 29, 13);
        panel_1_1_1_1_2.add(lblNewLabel_1_2_1_1_1);
        
        JLabel lblNewLabel_5_2_1_1_1 = new JLabel("VS");
        lblNewLabel_5_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_2_1_1_1.setBounds(267, 53, 31, 20);
        panel_1_1_1_1_2.add(lblNewLabel_5_2_1_1_1);
        
        JLabel lblNewLabel_2_2_1_1_1 = new JLabel("-");
        lblNewLabel_2_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_2_1_1_1.setBounds(323, 57, 29, 13);
        panel_1_1_1_1_2.add(lblNewLabel_2_2_1_1_1);
        
        JLabel lblNewLabel_3_2_1_1_1 = new JLabel("Club Askartza");
        lblNewLabel_3_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_2_1_1_1.setBounds(362, 53, 193, 20);
        panel_1_1_1_1_2.add(lblNewLabel_3_2_1_1_1);
        
        JLabel lblNewLabel_6_2_1_1_1 = new JLabel("CN Terrassa");
        lblNewLabel_6_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_2_1_1_1.setBounds(10, 91, 184, 20);
        panel_1_1_1_1_2.add(lblNewLabel_6_2_1_1_1);
        
        JLabel lblNewLabel_7_2_1_1_1 = new JLabel("-");
        lblNewLabel_7_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_2_1_1_1.setBounds(228, 85, 29, 32);
        panel_1_1_1_1_2.add(lblNewLabel_7_2_1_1_1);
        
        JLabel lblNewLabel_8_1_1_1_1 = new JLabel("VS");
        lblNewLabel_8_1_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_1_1_1_1.setBounds(267, 86, 48, 30);
        panel_1_1_1_1_2.add(lblNewLabel_8_1_1_1_1);
        
        JLabel lblNewLabel_9_1_1_1_1 = new JLabel("-");
        lblNewLabel_9_1_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_1_1_1_1.setBounds(323, 80, 29, 47);
        panel_1_1_1_1_2.add(lblNewLabel_9_1_1_1_1);
        
        JLabel lblNewLabel_10_2_1_1_1 = new JLabel("CN La Latina");
        lblNewLabel_10_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_2_1_1_1.setBounds(362, 89, 193, 25);
        panel_1_1_1_1_2.add(lblNewLabel_10_2_1_1_1);
        
        JLabel lblNewLabel_11_2_1_1_1 = new JLabel("Urbat IKE");
        lblNewLabel_11_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_2_1_1_1.setBounds(10, 128, 190, 20);
        panel_1_1_1_1_2.add(lblNewLabel_11_2_1_1_1);
        
        JLabel lblNewLabel_12_1_1_1_1 = new JLabel("-");
        lblNewLabel_12_1_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_1_1_1_1.setBounds(228, 120, 45, 36);
        panel_1_1_1_1_2.add(lblNewLabel_12_1_1_1_1);
        
        JLabel lblNewLabel_13_1_1_1_1 = new JLabel("VS");
        lblNewLabel_13_1_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_1_1_1_1.setBounds(267, 128, 45, 20);
        panel_1_1_1_1_2.add(lblNewLabel_13_1_1_1_1);
        
        JLabel lblNewLabel_14_2_1_1_1 = new JLabel("-");
        lblNewLabel_14_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_2_1_1_1.setBounds(323, 124, 45, 30);
        panel_1_1_1_1_2.add(lblNewLabel_14_2_1_1_1);
        
        JLabel lblNewLabel_15_2_1_1_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_15_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_2_1_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_2_1_1_1.setBounds(362, 126, 193, 24);
        panel_1_1_1_1_2.add(lblNewLabel_15_2_1_1_1);
        
        JPanel panel_7 = new JPanel();
        tabbedPane.addTab("Week7", null, panel_7, null);
        panel_7.setLayout(null);
        
        JPanel panel_1_1_1_1 = new JPanel();
        panel_1_1_1_1.setLayout(null);
        panel_1_1_1_1.setBounds(92, 123, 565, 172);
        panel_7.add(panel_1_1_1_1);
        
        JLabel lblTenerifeEcheyde_1 = new JLabel("Tenerife Echeyde");
        lblTenerifeEcheyde_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblTenerifeEcheyde_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblTenerifeEcheyde_1.setBounds(10, 51, 198, 25);
        panel_1_1_1_1.add(lblTenerifeEcheyde_1);
        
        JLabel lblJornada_2_1 = new JLabel("Week 7");
        lblJornada_2_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2_1.setBounds(243, 10, 88, 31);
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
        
        JLabel lblNewLabel_3_2_1_1 = new JLabel("CN Terrassa");
        lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_2_1_1.setBounds(362, 53, 193, 20);
        panel_1_1_1_1.add(lblNewLabel_3_2_1_1);
        
        JLabel lblNewLabel_6_2_1_1 = new JLabel("CN La Latina");
        lblNewLabel_6_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_2_1_1.setBounds(10, 91, 198, 20);
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
        
        JLabel lblNewLabel_10_2_1_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_10_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_2_1_1.setBounds(362, 89, 193, 25);
        panel_1_1_1_1.add(lblNewLabel_10_2_1_1);
        
        JLabel lblNewLabel_11_2_1_1 = new JLabel("Club Askartza");
        lblNewLabel_11_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_2_1_1.setBounds(10, 128, 198, 20);
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
        
        JLabel lblNewLabel_15_2_1_1 = new JLabel("Urbat IKE");
        lblNewLabel_15_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_2_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_2_1_1.setBounds(362, 126, 193, 24);
        panel_1_1_1_1.add(lblNewLabel_15_2_1_1);
        
        JPanel panel_8 = new JPanel();
        tabbedPane.addTab("Week8", null, panel_8, null);
        panel_8.setLayout(null);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBounds(92, 123, 565, 172);
        panel_8.add(panel_1_1);
        
        JLabel lblUrbatIke = new JLabel("Urbat IKE");
        lblUrbatIke.setHorizontalAlignment(SwingConstants.CENTER);
        lblUrbatIke.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblUrbatIke.setBounds(10, 51, 203, 25);
        panel_1_1.add(lblUrbatIke);
        
        JLabel lblJornada = new JLabel("Week 8");
        lblJornada.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada.setBounds(243, 10, 88, 31);
        panel_1_1.add(lblJornada);
        
        JLabel lblNewLabel_1_1 = new JLabel("-");
        lblNewLabel_1_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_1.setBounds(228, 57, 29, 13);
        panel_1_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_5_1 = new JLabel("VS");
        lblNewLabel_5_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_1.setBounds(267, 53, 31, 20);
        panel_1_1.add(lblNewLabel_5_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("-");
        lblNewLabel_2_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_1.setBounds(323, 57, 29, 13);
        panel_1_1.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_3_1 = new JLabel("CN Terrassa");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_1.setBounds(362, 53, 193, 20);
        panel_1_1.add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_6_1 = new JLabel("Tenerife Echeyde");
        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_1.setBounds(10, 91, 203, 20);
        panel_1_1.add(lblNewLabel_6_1);
        
        JLabel lblNewLabel_7_1 = new JLabel("-");
        lblNewLabel_7_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_1.setBounds(228, 85, 29, 32);
        panel_1_1.add(lblNewLabel_7_1);
        
        JLabel lblNewLabel_8_1 = new JLabel("VS");
        lblNewLabel_8_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_1.setBounds(267, 86, 48, 30);
        panel_1_1.add(lblNewLabel_8_1);
        
        JLabel lblNewLabel_9_1 = new JLabel("-");
        lblNewLabel_9_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_1.setBounds(323, 80, 29, 47);
        panel_1_1.add(lblNewLabel_9_1);
        
        JLabel lblNewLabel_10_1 = new JLabel("CN La Latina");
        lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_1.setBounds(362, 89, 193, 25);
        panel_1_1.add(lblNewLabel_10_1);
        
        JLabel lblNewLabel_11_1 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_1.setBounds(10, 128, 203, 20);
        panel_1_1.add(lblNewLabel_11_1);
        
        JLabel lblNewLabel_12_1 = new JLabel("-");
        lblNewLabel_12_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_1.setBounds(228, 120, 45, 36);
        panel_1_1.add(lblNewLabel_12_1);
        
        JLabel lblNewLabel_13_1 = new JLabel("VS");
        lblNewLabel_13_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_1.setBounds(267, 128, 45, 20);
        panel_1_1.add(lblNewLabel_13_1);
        
        JLabel lblNewLabel_14_1 = new JLabel("-");
        lblNewLabel_14_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_1.setBounds(323, 124, 45, 30);
        panel_1_1.add(lblNewLabel_14_1);
        
        JLabel lblNewLabel_15_1 = new JLabel("Club Askartza");
        lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_1.setBounds(362, 124, 193, 24);
        panel_1_1.add(lblNewLabel_15_1);
        
        JPanel panel_9 = new JPanel();
        tabbedPane.addTab("Week9", null, panel_9, null);
        panel_9.setLayout(null);
        
        JPanel panel_1_2 = new JPanel();
        panel_1_2.setLayout(null);
        panel_1_2.setBounds(92, 123, 565, 172);
        panel_9.add(panel_1_2);
        
        JLabel lblCnLaLatina = new JLabel("CN La Latina");
        lblCnLaLatina.setHorizontalAlignment(SwingConstants.CENTER);
        lblCnLaLatina.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblCnLaLatina.setBounds(20, 51, 193, 25);
        panel_1_2.add(lblCnLaLatina);
        
        JLabel lblJornada_1 = new JLabel("Week 9");
        lblJornada_1.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_1.setBounds(243, 10, 83, 31);
        panel_1_2.add(lblJornada_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("-");
        lblNewLabel_1_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_2.setBounds(228, 57, 29, 13);
        panel_1_2.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_5_2 = new JLabel("VS");
        lblNewLabel_5_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_2.setBounds(267, 53, 31, 20);
        panel_1_2.add(lblNewLabel_5_2);
        
        JLabel lblNewLabel_2_2 = new JLabel("-");
        lblNewLabel_2_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_2.setBounds(323, 57, 29, 13);
        panel_1_2.add(lblNewLabel_2_2);
        
        JLabel lblNewLabel_3_2 = new JLabel("Club Askartza");
        lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_2.setBounds(362, 53, 193, 20);
        panel_1_2.add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_6_2 = new JLabel("Tenerife Echeyde");
        lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_2.setBounds(20, 91, 180, 20);
        panel_1_2.add(lblNewLabel_6_2);
        
        JLabel lblNewLabel_7_2 = new JLabel("-");
        lblNewLabel_7_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_2.setBounds(228, 85, 29, 32);
        panel_1_2.add(lblNewLabel_7_2);
        
        JLabel lblNewLabel_8_2 = new JLabel("VS");
        lblNewLabel_8_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_2.setBounds(267, 86, 48, 30);
        panel_1_2.add(lblNewLabel_8_2);
        
        JLabel lblNewLabel_9_2 = new JLabel("-");
        lblNewLabel_9_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_2.setBounds(323, 80, 29, 47);
        panel_1_2.add(lblNewLabel_9_2);
        
        JLabel lblNewLabel_10_2 = new JLabel("Urbat IKE");
        lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_2.setBounds(362, 89, 193, 25);
        panel_1_2.add(lblNewLabel_10_2);
        
        JLabel lblNewLabel_11_2 = new JLabel("CN Terrassa");
        lblNewLabel_11_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_2.setBounds(20, 128, 193, 20);
        panel_1_2.add(lblNewLabel_11_2);
        
        JLabel lblNewLabel_12_2 = new JLabel("-");
        lblNewLabel_12_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_2.setBounds(228, 120, 45, 36);
        panel_1_2.add(lblNewLabel_12_2);
        
        JLabel lblNewLabel_13_2 = new JLabel("VS");
        lblNewLabel_13_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_2.setBounds(267, 128, 45, 20);
        panel_1_2.add(lblNewLabel_13_2);
        
        JLabel lblNewLabel_14_2 = new JLabel("-");
        lblNewLabel_14_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_2.setBounds(323, 124, 45, 30);
        panel_1_2.add(lblNewLabel_14_2);
        
        JLabel lblNewLabel_15_2 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_15_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_2.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_2.setBounds(362, 126, 193, 24);
        panel_1_2.add(lblNewLabel_15_2);
        
        JPanel panel_10 = new JPanel();
        tabbedPane.addTab("Week10", null, panel_10, null);
        panel_10.setLayout(null);
        
        JPanel panel_1_3 = new JPanel();
        panel_1_3.setLayout(null);
        panel_1_3.setBounds(92, 123, 565, 172);
        panel_10.add(panel_1_3);
        
        JLabel lblCnLaLatina_1 = new JLabel("CN La Latina");
        lblCnLaLatina_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblCnLaLatina_1.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblCnLaLatina_1.setBounds(26, 51, 181, 25);
        panel_1_3.add(lblCnLaLatina_1);
        
        JLabel lblJornada_2 = new JLabel("Week 10");
        lblJornada_2.setFont(new Font("Calibri", Font.BOLD, 25));
        lblJornada_2.setBounds(236, 10, 102, 31);
        panel_1_3.add(lblJornada_2);
        
        JLabel lblNewLabel_1_3 = new JLabel("-");
        lblNewLabel_1_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_1_3.setBounds(228, 57, 29, 13);
        panel_1_3.add(lblNewLabel_1_3);
        
        JLabel lblNewLabel_5_3 = new JLabel("VS");
        lblNewLabel_5_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_5_3.setBounds(267, 53, 31, 20);
        panel_1_3.add(lblNewLabel_5_3);
        
        JLabel lblNewLabel_2_3 = new JLabel("-");
        lblNewLabel_2_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_2_3.setBounds(323, 57, 29, 13);
        panel_1_3.add(lblNewLabel_2_3);
        
        JLabel lblNewLabel_3_3 = new JLabel("Urbat IKE");
        lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_3_3.setBounds(362, 53, 193, 20);
        panel_1_3.add(lblNewLabel_3_3);
        
        JLabel lblNewLabel_6_3 = new JLabel("CN Terrassa");
        lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_6_3.setBounds(26, 91, 174, 20);
        panel_1_3.add(lblNewLabel_6_3);
        
        JLabel lblNewLabel_7_3 = new JLabel("-");
        lblNewLabel_7_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_7_3.setBounds(228, 85, 29, 32);
        panel_1_3.add(lblNewLabel_7_3);
        
        JLabel lblNewLabel_8_3 = new JLabel("VS");
        lblNewLabel_8_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_8_3.setBounds(267, 86, 48, 30);
        panel_1_3.add(lblNewLabel_8_3);
        
        JLabel lblNewLabel_9_3 = new JLabel("-");
        lblNewLabel_9_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_9_3.setBounds(323, 80, 29, 47);
        panel_1_3.add(lblNewLabel_9_3);
        
        JLabel lblNewLabel_10_3 = new JLabel("Club Askartza");
        lblNewLabel_10_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_10_3.setBounds(362, 89, 193, 25);
        panel_1_3.add(lblNewLabel_10_3);
        
        JLabel lblNewLabel_11_3 = new JLabel("CN Atlétic Barceloneta");
        lblNewLabel_11_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_11_3.setBounds(26, 128, 187, 20);
        panel_1_3.add(lblNewLabel_11_3);
        
        JLabel lblNewLabel_12_3 = new JLabel("-");
        lblNewLabel_12_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_12_3.setBounds(228, 120, 45, 36);
        panel_1_3.add(lblNewLabel_12_3);
        
        JLabel lblNewLabel_13_3 = new JLabel("VS");
        lblNewLabel_13_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_13_3.setBounds(267, 128, 45, 20);
        panel_1_3.add(lblNewLabel_13_3);
        
        JLabel lblNewLabel_14_3 = new JLabel("-");
        lblNewLabel_14_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_14_3.setBounds(323, 124, 45, 30);
        panel_1_3.add(lblNewLabel_14_3);
        
        JLabel lblNewLabel_15_3 = new JLabel("Tenerife Echeyde");
        lblNewLabel_15_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15_3.setFont(new Font("Calibri", Font.ITALIC, 20));
        lblNewLabel_15_3.setBounds(362, 126, 193, 24);
        panel_1_3.add(lblNewLabel_15_3);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        contentPane.add(scrollPane_1, BorderLayout.NORTH);
        contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{scrollPane, tabbedPane, panel, panel_5, panel_4, panel_2, panel_3, panel_1_1_2_3, lblUrbatIke_1_2, lblJornada_1_2, lblNewLabel_1_2_2_2, lblNewLabel_5_2_2_2, lblNewLabel_2_2_2_2, lblNewLabel_3_2_2_2, lblNewLabel_6_2_2_2, lblNewLabel_7_2_2_2, lblNewLabel_8_1_2_2, lblNewLabel_9_1_2_2, lblNewLabel_10_2_2_2, lblNewLabel_11_2_2_2, lblNewLabel_12_1_2_2, lblNewLabel_13_1_2_2, lblNewLabel_14_2_2_2, lblNewLabel_15_2_2_2, panel_6, panel_1_1_1_1_2, lblTenerifeEcheyde_1_1, lblJornada_2_1_1, lblNewLabel_1_2_1_1_1, lblNewLabel_5_2_1_1_1, lblNewLabel_2_2_1_1_1, lblNewLabel_3_2_1_1_1, lblNewLabel_6_2_1_1_1, lblNewLabel_7_2_1_1_1, lblNewLabel_8_1_1_1_1, lblNewLabel_9_1_1_1_1, lblNewLabel_10_2_1_1_1, lblNewLabel_11_2_1_1_1, lblNewLabel_12_1_1_1_1, lblNewLabel_13_1_1_1_1, lblNewLabel_14_2_1_1_1, lblNewLabel_15_2_1_1_1, panel_7, panel_1_1_1_1, lblTenerifeEcheyde_1, lblJornada_2_1, lblNewLabel_1_2_1_1, lblNewLabel_5_2_1_1, lblNewLabel_2_2_1_1, lblNewLabel_3_2_1_1, lblNewLabel_6_2_1_1, lblNewLabel_7_2_1_1, lblNewLabel_8_1_1_1, lblNewLabel_9_1_1_1, lblNewLabel_10_2_1_1, lblNewLabel_11_2_1_1, lblNewLabel_12_1_1_1, lblNewLabel_13_1_1_1, lblNewLabel_14_2_1_1, lblNewLabel_15_2_1_1, panel_8, panel_1_1, lblUrbatIke, lblJornada, lblNewLabel_1_1, lblNewLabel_5_1, lblNewLabel_2_1, lblNewLabel_3_1, lblNewLabel_6_1, lblNewLabel_7_1, lblNewLabel_8_1, lblNewLabel_9_1, lblNewLabel_10_1, lblNewLabel_11_1, lblNewLabel_12_1, lblNewLabel_13_1, lblNewLabel_14_1, lblNewLabel_15_1, panel_9, panel_1_2, lblCnLaLatina, lblJornada_1, lblNewLabel_1_2, lblNewLabel_5_2, lblNewLabel_2_2, lblNewLabel_3_2, lblNewLabel_6_2, lblNewLabel_7_2, lblNewLabel_8_2, lblNewLabel_9_2, lblNewLabel_10_2, lblNewLabel_11_2, lblNewLabel_12_2, lblNewLabel_13_2, lblNewLabel_14_2, lblNewLabel_15_2, panel_10, panel_1_3, lblCnLaLatina_1, lblJornada_2, lblNewLabel_1_3, lblNewLabel_5_3, lblNewLabel_2_3, lblNewLabel_3_3, lblNewLabel_6_3, lblNewLabel_7_3, lblNewLabel_8_3, lblNewLabel_9_3, lblNewLabel_10_3, lblNewLabel_11_3, lblNewLabel_12_3, lblNewLabel_13_3, lblNewLabel_14_3, lblNewLabel_15_3, panel_1_3_1, lblCnLaLatina_1_1, lblJornada_2_2, lblNewLabel_1_3_1, lblNewLabel_5_3_1, lblNewLabel_2_3_1, lblNewLabel_3_3_1, lblNewLabel_6_3_1, lblNewLabel_7_3_1, lblNewLabel_8_3_1, lblNewLabel_9_3_1, lblNewLabel_10_3_1, lblNewLabel_11_3_1, lblNewLabel_12_3_1, lblNewLabel_13_3_1, lblNewLabel_14_3_1, lblNewLabel_15_3_1, panel_1_3_2, lblCnLaLatina_1_2, lblJornada_2_3, lblNewLabel_1_3_2, lblNewLabel_5_3_2, lblNewLabel_2_3_2, lblNewLabel_3_3_2, lblNewLabel_6_3_2, lblNewLabel_7_3_2, lblNewLabel_8_3_2, lblNewLabel_9_3_2, lblNewLabel_10_3_2, lblNewLabel_11_3_2, lblNewLabel_12_3_2, lblNewLabel_13_3_2, lblNewLabel_14_3_2, lblNewLabel_15_3_2, panel_1_3_1_1, lblCnLaLatina_1_1_1, lblJornada_2_2_1, lblNewLabel_1_3_1_1, lblNewLabel_5_3_1_1, lblNewLabel_2_3_1_1, lblNewLabel_3_3_1_1, lblNewLabel_6_3_1_1, lblNewLabel_7_3_1_1, lblNewLabel_8_3_1_1, lblNewLabel_9_3_1_1, lblNewLabel_10_3_1_1, lblNewLabel_11_3_1_1, lblNewLabel_12_3_1_1, lblNewLabel_13_3_1_1, lblNewLabel_14_3_1_1, lblNewLabel_15_3_1_1, panel_1_3_1_2, lblCnLaLatina_1_1_2, lblJornada_2_2_2, lblNewLabel_1_3_1_2, lblNewLabel_5_3_1_2, lblNewLabel_2_3_1_2, lblNewLabel_3_3_1_2, lblNewLabel_6_3_1_2, lblNewLabel_7_3_1_2, lblNewLabel_8_3_1_2, lblNewLabel_9_3_1_2, lblNewLabel_10_3_1_2, lblNewLabel_11_3_1_2, lblNewLabel_12_3_1_2, lblNewLabel_13_3_1_2, lblNewLabel_14_3_1_2, lblNewLabel_15_3_1_2}));
        
        
        
       
    }
}