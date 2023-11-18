package Reto1;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

public class FAQIngles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAQIngles frame = new FAQIngles();
					frame.setVisible(true);
					frame.setResizable (false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FAQIngles() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Reto1\\fotos\\LogoWaterpoloPequeña.png"));
		setAlwaysOnTop(true);
		setTitle("Spanish Waterpolo FAQ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("FAQ");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
        panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
        contentPane.add(panel_1, BorderLayout.CENTER);
        
        JScrollPane scrollPane = new JScrollPane(panel_1);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JLabel lblNewLabel_1 = new JLabel("<html>1: How to start using the application?<br>- After installing the application, you can use it immediately without registering.</html>");
        lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("<html>2: How to find the section with dates and results of the competition?<br>- To access the match schedule, results, etc., you can use the application menu.</html>");
        lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        panel_1.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("<html>3: How can I change the language of the application?<br>- There are currently 2 languages available to use the application: Spanish, English. To change <br> the language, use the \"Es/En\" menu.</html>");
        lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("<html>4: What should I do if the application is not working correctly?<br>- In that case, we recommend restarting the application, and also sending us a message through <br>the \"Contact\" menu, describing the problem.</html>");
        lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("<html>5: How to contact us?<br>- If you haven't found the answer to your question, you can always send us a message using <br>the \"Contact\" menu.</html>");
        lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("<html>6: How do I log in to the editor account?<br>- If you are an editor, developer and/or administrator of this project, you must have your own username <br>and personal password.<br>To log in to your account, use the \"Login menu \", then enter your personal name and password.</html>");
        lblNewLabel_6.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel_1.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("<html>7: What should I do if I don't have personal login information?<br>- If there is no account information, please contact us using the \"Contact\" menu.</html>");
        lblNewLabel_7.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        panel_1.add(lblNewLabel_7);
        JLabel lblNewLabel_8 = new JLabel("<html>8: I forgot my password, what should I do?<br>- If you lose your password, you must contact the \"Contact\" menu.</html>");
        lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 20));
        lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP); 
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT); 
        lblNewLabel_8.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        panel_1.add(lblNewLabel_8);
        
	}

}
