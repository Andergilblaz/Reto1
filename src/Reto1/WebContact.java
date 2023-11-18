package Reto1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WebContact extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSubject;
	private JTextField txtNumero;
	private JTextField txtEmail;
	private JTextField txtNombreYApellido;
	private JButton btnSubmit;
	private boolean enterPressed = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebContact frame = new WebContact();
					frame.setResizable (false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WebContact() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Spanish Waterpolo Results");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1016, 657);
		setLocationRelativeTo (null);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		JPanel contentPane = new JPanel(new BorderLayout());
	        setContentPane(contentPane);
		
		JPanel panelForm = new JPanel();
		contentPane.add(panelForm, BorderLayout.CENTER);
		panelForm.setLayout(null);
		 
		JLabel lblForm = new JLabel("Contact form");
		lblForm.setFont(new Font("Calibri", Font.BOLD, 26));
		lblForm.setBounds(427, 35, 148, 36);
		panelForm.add(lblForm, BorderLayout.CENTER);
		
		JLabel txtInstruccion = new JLabel("Fill in this form and an agent will get in touch with you before 24 business hours. ");
		txtInstruccion.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtInstruccion.setBounds(160, 81, 681, 48);
		panelForm.add(txtInstruccion,BorderLayout.CENTER);
			      
		JLabel txtNombre = new JLabel("Full name:");
		txtNombre.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNombre.setBounds(111, 161, 163, 36);
		panelForm.add(txtNombre,BorderLayout.CENTER);
		
		txtNombreYApellido = new JTextField();
		txtNombreYApellido.setText("First name and last name");
		txtNombreYApellido.setForeground(Color.GRAY);
		txtNombreYApellido.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNombreYApellido.setColumns(10);
		txtNombreYApellido.setBounds(214, 165, 253, 28);
		panelForm.add(txtNombreYApellido,BorderLayout.CENTER);
		
	
		txtNombreYApellido.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (txtNombreYApellido.getText().equals("First name and last name")) {
		            txtNombreYApellido.setText("");
		            txtNombreYApellido.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        if (txtNombreYApellido.getText().isEmpty()) {
		            txtNombreYApellido.setText("First name and last name");
		            txtNombreYApellido.setForeground(Color.GRAY);
		        }
		    }
		});
		
		JLabel lblNumeroDeTelfono = new JLabel("Phone number:");
		lblNumeroDeTelfono.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNumeroDeTelfono.setBounds(301, 207, 225, 36);
		panelForm.add(lblNumeroDeTelfono,BorderLayout.CENTER);
		
		txtNumero = new JTextField();
		txtNumero.setText("Your contact number");
		txtNumero.setForeground(Color.GRAY);
		txtNumero.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNumero.setColumns(10);
		txtNumero.setBounds(440, 211, 259, 28);
		panelForm.add(txtNumero,BorderLayout.CENTER);
		
		txtNumero.addFocusListener(new FocusListener() {
			    @Override
			    public void focusGained(FocusEvent e) {
			        if (txtNumero.getText().equals("Your contact number")) {
			            txtNumero.setText("");
			            txtNumero.setForeground(Color.BLACK); 
			        }
			    }

			    @Override
			    public void focusLost(FocusEvent e) {
			        if (txtNumero.getText().isEmpty()) {
			            txtNumero.setText("Your contact number");
			            txtNumero.setForeground(Color.GRAY);  
			        }
			    }
			});
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSubject.setBounds(371, 253, 120, 36);
		panelForm.add(lblSubject,BorderLayout.CENTER);
		
		txtSubject = new JTextField("Subject");
		txtSubject.setForeground(Color.GRAY);
		txtSubject.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtSubject.setColumns(10);
		txtSubject.setBounds(448, 257, 177, 28);
		panelForm.add(txtSubject,BorderLayout.CENTER);
		

	        txtSubject.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if (txtSubject.getText().equals("Subject")) {
	                    txtSubject.setText("");
	                    txtSubject.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtSubject.getText().isEmpty()) {
	                    txtSubject.setText("Subject");
	                    txtSubject.setForeground(Color.GRAY);
	                }
	            }
	        });
		

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblEmail.setBounds(502, 161, 58, 36);
		panelForm.add(lblEmail,BorderLayout.CENTER);

	        txtEmail = new JTextField("Email");
	        txtEmail.setForeground(Color.GRAY);
	        txtEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
	        txtEmail.setColumns(10);
	        txtEmail.setBounds(570, 165, 343, 28);
	        panelForm.add(txtEmail);

	        
	        txtEmail.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if (txtEmail.getText().equals("Email")) {
	                    txtEmail.setText("");
	                    txtEmail.setForeground(Color.BLACK); 
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtEmail.getText().isEmpty()) {
	                    txtEmail.setText("Email");
	                    txtEmail.setForeground(Color.GRAY);  
	                }
	            }
	        });

		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMessage.setBounds(460, 295, 82, 36);
		panelForm.add(lblMessage);
	      
		
		 JTextArea txtMessage = new JTextArea("Message");
		 txtMessage.setForeground(Color.GRAY);
	        txtMessage.setFont(new Font("Calibri", Font.PLAIN, 20));
	        txtMessage.setToolTipText("");
	        txtMessage.setLineWrap(true);
	        txtMessage.setWrapStyleWord(true);
	        JScrollPane scrollPane = new JScrollPane(txtMessage);
	        scrollPane.setToolTipText("10");
	        scrollPane.setBounds(312, 341, 377, 209);
	        panelForm.add(scrollPane, BorderLayout.CENTER);
	        

	        txtMessage.addFocusListener(new FocusListener() {
	     	    @Override
	     	    public void focusGained(FocusEvent e) {
	     	        if (txtMessage.getText().equals("Message")) {
	     	            txtMessage.setText("");
	     	            txtMessage.setForeground(Color.BLACK); 
	     	        }
	     	    }

	     	    @Override
	     	    public void focusLost(FocusEvent e) {
	     	        if (txtMessage.getText().isEmpty()) {
	     	            txtMessage.setText("Message");
	     	            txtMessage.setForeground(Color.GRAY);  
	     	        }
	     	    }
	     	});
	        btnSubmit = new JButton("Submit");
	        btnSubmit.setBounds(412, 560, 85, 21);
	        btnSubmit.addActionListener(null);
	        panelForm.add(btnSubmit);
	        
	        btnSubmit.addActionListener(new ActionListener() {
	     	    @Override
	     	    public void actionPerformed(ActionEvent e) {
	     			// TODO Auto-generated method stub
	     		    String nombre = txtNombreYApellido.getText();
	     		        String email = txtEmail.getText();
	     		        String Subject = txtSubject.getText();
	     		        String Message = "Than you " + nombre + " for contacting us. \n"+ "We will get in touch with you in the email " + email + ".";
	     			JOptionPane.showMessageDialog(WebContact.this,Message,"Message with subject '"+ Subject + "' was sended",JOptionPane.INFORMATION_MESSAGE,null); 
	     		}
	     	});
	        
	        JButton btnNew = new JButton("New");
	        btnNew.setBounds(511, 560, 85, 21);
	        panelForm.add(btnNew);
	   
	        btnNew.addActionListener(new ActionListener() {
	     	    @Override
	     	    public void actionPerformed(ActionEvent e) {
	     	        txtNombreYApellido.setText("First name and last name");
	     	        txtNombreYApellido.setForeground(Color.GRAY);
	     	        txtNumero.setText("Your contact number");
	     	        txtNumero.setForeground(Color.GRAY);
	     	        txtSubject.setText("Subject");
	     	        txtSubject.setForeground(Color.GRAY);
	     	        txtEmail.setText("Email");
	     	        txtEmail.setForeground(Color.GRAY);
	     	        txtMessage.setText("Message");
	     	        txtMessage.setForeground(Color.GRAY);
	     	    }
	     	});
	     

	        txtNombreYApellido.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (!enterPressed) {
	                    txtEmail.requestFocus();
	                    enterPressed = true;
	                }
	            }
	        });

	        txtEmail.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (!enterPressed) {
	                    txtNumero.requestFocus();
	                    enterPressed = true;
	                }
	            }
	        });

	        txtNumero.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (!enterPressed) {
	                    txtSubject.requestFocus();
	                    enterPressed = true;
	                }
	            }
	        });

	        txtSubject.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (!enterPressed) {
	                    txtMessage.requestFocus();
	                    enterPressed = true;
	                }
	            }
	        });

	        txtMessage.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyReleased(KeyEvent e) {
	                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.getSource() == txtMessage) {
	                    if (!enterPressed) {
	                        btnSubmit.doClick();
	                        enterPressed = true;
	                    }
	                } else {
	                    enterPressed = false;
	                }
	            }
	        });
	        
	        txtNombreYApellido.addFocusListener(new FocusAdapter() {
	             @Override
	             public void focusGained(FocusEvent e) {
	                 enterPressed = false;
	             }
	         });

	         txtEmail.addFocusListener(new FocusAdapter() {
	             @Override
	             public void focusGained(FocusEvent e) {
	                 enterPressed = false;
	             }
	         });

	         txtNumero.addFocusListener(new FocusAdapter() {
	             @Override
	             public void focusGained(FocusEvent e) {
	                 enterPressed = false;
	             }
	         });

	         txtSubject.addFocusListener(new FocusAdapter() {
	             @Override
	             public void focusGained(FocusEvent e) {
	                 enterPressed = false;
	             }
	         });

	         txtMessage.addKeyListener(new KeyAdapter() {
	             @Override
	             public void keyReleased(KeyEvent e) {
	                 if (e.getKeyCode() == KeyEvent.VK_ENTER && e.getSource() == txtMessage) {
	                     if (!enterPressed) {
	                         btnSubmit.doClick();
	                         enterPressed = true;
	                     }
	                 } else {
	                     enterPressed = false;
	                 }
	             }
	         });
	        
	      // Crea un DocumentFilter para limitar el campo txtNombreYApellido a 50 caracteres
	         AbstractDocument txtNombreYApellidoDocument = (AbstractDocument) txtNombreYApellido.getDocument();
	         txtNombreYApellidoDocument.setDocumentFilter(new DocumentFilter() {
	             @Override
	             public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
	                 if ((fb.getDocument().getLength() + text.length()) <= 50) {
	                     super.insertString(fb, offset, text, attr);
	                 }
	             }

	             @Override
	             public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
	                 if ((fb.getDocument().getLength() - length + text.length()) <= 50) {
	                     super.replace(fb, offset, length, text, attrs);
	                 }
	             }
	         });

	         // Crea un DocumentFilter para limitar el campo txtNumero a 21 caracteres
	         AbstractDocument txtNumeroDocument = (AbstractDocument) txtNumero.getDocument();
	         txtNumeroDocument.setDocumentFilter(new DocumentFilter() {
	             @Override
	             public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
	                 if ((fb.getDocument().getLength() + text.length()) <= 21) {
	                     super.insertString(fb, offset, text, attr);
	                 }
	             }

	             @Override
	             public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
	                 if ((fb.getDocument().getLength() - length + text.length()) <= 21) {
	                     super.replace(fb, offset, length, text, attrs);
	                 }
	             }
	         });
	         
	      // Crea un DocumentFilter para limitar el campo txtEmail a 50 caracteres
	         AbstractDocument txtEmailDocument = (AbstractDocument) txtEmail.getDocument();
	         txtEmailDocument.setDocumentFilter(new DocumentFilter() {
	             @Override
	             public void insertString(DocumentFilter.FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
	                 if ((fb.getDocument().getLength() + text.length()) <= 50) {
	                     super.insertString(fb, offset, text, attr);
	                 }
	             }

	             @Override
	             public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
	                 if ((fb.getDocument().getLength() - length + text.length()) <= 50) {
	                     super.replace(fb, offset, length, text, attrs);
	                 }
	             }
	         });
	        




	}
}
