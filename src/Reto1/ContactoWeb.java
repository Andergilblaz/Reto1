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

public class ContactoWeb extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAsunto;
	private JTextField txtNumero;
	private JTextField txtEmail;
	private JTextField txtNombreYApellido;
	private JButton btnEnviar;
	private boolean enterPressed = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactoWeb frame = new ContactoWeb();
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
	public ContactoWeb() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(139, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Reto1/fotos/LogoWaterpolo.png"));
		setAlwaysOnTop(true);
		setTitle("Resultados Waterpolo Español");
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
		 
		JLabel lblForm = new JLabel("Formulario de contacto");
		lblForm.setFont(new Font("Calibri", Font.BOLD, 26));
		lblForm.setBounds(371, 35, 259, 36);
		panelForm.add(lblForm, BorderLayout.CENTER);
		
		JLabel txtInstruccion = new JLabel("Rellena este formulario y un representante se pondrá en contacto contigo antes de 24 horas laborales.");
		txtInstruccion.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtInstruccion.setBounds(75, 81, 871, 48);
		panelForm.add(txtInstruccion,BorderLayout.CENTER);
			      
		JLabel txtNombre = new JLabel("Nombre completo:");
		txtNombre.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNombre.setBounds(44, 161, 163, 36);
		panelForm.add(txtNombre,BorderLayout.CENTER);
		
		txtNombreYApellido = new JTextField();
		txtNombreYApellido.setText("Nombre y apellido");
		txtNombreYApellido.setForeground(Color.GRAY);
		txtNombreYApellido.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNombreYApellido.setColumns(10);
		txtNombreYApellido.setBounds(217, 165, 253, 28);
		panelForm.add(txtNombreYApellido,BorderLayout.CENTER);
		
	
		txtNombreYApellido.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (txtNombreYApellido.getText().equals("Nombre y apellido")) {
		            txtNombreYApellido.setText("");
		            txtNombreYApellido.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void focusLost(FocusEvent e) {
		        if (txtNombreYApellido.getText().isEmpty()) {
		            txtNombreYApellido.setText("Nombre y apellido");
		            txtNombreYApellido.setForeground(Color.GRAY);
		        }
		    }
		});
		
		JLabel lblNumeroDeTelfono = new JLabel("Número de teléfono:");
		lblNumeroDeTelfono.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNumeroDeTelfono.setBounds(272, 207, 225, 36);
		panelForm.add(lblNumeroDeTelfono,BorderLayout.CENTER);
		
		txtNumero = new JTextField();
		txtNumero.setText("Tu número de contacto");
		txtNumero.setForeground(Color.GRAY);
		txtNumero.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNumero.setColumns(10);
		txtNumero.setBounds(463, 211, 259, 28);
		panelForm.add(txtNumero,BorderLayout.CENTER);
		
		txtNumero.addFocusListener(new FocusListener() {
			    @Override
			    public void focusGained(FocusEvent e) {
			        if (txtNumero.getText().equals("Tu número de contacto")) {
			            txtNumero.setText("");
			            txtNumero.setForeground(Color.BLACK); 
			        }
			    }

			    @Override
			    public void focusLost(FocusEvent e) {
			        if (txtNumero.getText().isEmpty()) {
			            txtNumero.setText("Tu número de contacto");
			            txtNumero.setForeground(Color.GRAY);  
			        }
			    }
			});
		
		JLabel lblAsunto = new JLabel("Asunto:");
		lblAsunto.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblAsunto.setBounds(371, 253, 120, 36);
		panelForm.add(lblAsunto,BorderLayout.CENTER);
		
		txtAsunto = new JTextField("Asunto");
		txtAsunto.setForeground(Color.GRAY);
		txtAsunto.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtAsunto.setColumns(10);
		txtAsunto.setBounds(448, 257, 177, 28);
		panelForm.add(txtAsunto,BorderLayout.CENTER);
		

	        txtAsunto.addFocusListener(new FocusListener() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if (txtAsunto.getText().equals("Asunto")) {
	                    txtAsunto.setText("");
	                    txtAsunto.setForeground(Color.BLACK);
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtAsunto.getText().isEmpty()) {
	                    txtAsunto.setText("Asunto");
	                    txtAsunto.setForeground(Color.GRAY);
	                }
	            }
	        });
		

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblEmail.setBounds(494, 161, 58, 36);
		panelForm.add(lblEmail,BorderLayout.CENTER);

	        txtEmail = new JTextField("Email");
	        txtEmail.setForeground(Color.GRAY);
	        txtEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
	        txtEmail.setColumns(10);
	        txtEmail.setBounds(562, 165, 398, 28);
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

		
		JLabel lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMensaje.setBounds(460, 295, 82, 36);
		panelForm.add(lblMensaje);
	      
		
		 JTextArea txtMensaje = new JTextArea("Mensaje");
		 txtMensaje.setForeground(Color.GRAY);
	        txtMensaje.setFont(new Font("Calibri", Font.PLAIN, 20));
	        txtMensaje.setToolTipText("");
	        txtMensaje.setLineWrap(true);
	        txtMensaje.setWrapStyleWord(true);
	        JScrollPane scrollPane = new JScrollPane(txtMensaje);
	        scrollPane.setToolTipText("10");
	        scrollPane.setBounds(312, 341, 377, 209);
	        panelForm.add(scrollPane, BorderLayout.CENTER);
	        

	        txtMensaje.addFocusListener(new FocusListener() {
	     	    @Override
	     	    public void focusGained(FocusEvent e) {
	     	        if (txtMensaje.getText().equals("Mensaje")) {
	     	            txtMensaje.setText("");
	     	            txtMensaje.setForeground(Color.BLACK); 
	     	        }
	     	    }

	     	    @Override
	     	    public void focusLost(FocusEvent e) {
	     	        if (txtMensaje.getText().isEmpty()) {
	     	            txtMensaje.setText("Mensaje");
	     	            txtMensaje.setForeground(Color.GRAY);  
	     	        }
	     	    }
	     	});
	        btnEnviar = new JButton("Enviar");
	        btnEnviar.setBounds(412, 560, 85, 21);
	        btnEnviar.addActionListener(null);
	        panelForm.add(btnEnviar);
	        
	        btnEnviar.addActionListener(new ActionListener() {
	     	    @Override
	     	    public void actionPerformed(ActionEvent e) {
	     			// TODO Auto-generated method stub
	     		    String nombre = txtNombreYApellido.getText();
	     		        String email = txtEmail.getText();
	     		        String asunto = txtAsunto.getText();
	     		        String mensaje = "Gracias " + nombre + " por ponerte en contacto con nosotros. \n"+ "Pronto recibirás una respuesta en el correo " + email + ".";
	     			JOptionPane.showMessageDialog(ContactoWeb.this,mensaje,"Mensaje con asunto '"+ asunto + "' enviado",JOptionPane.INFORMATION_MESSAGE,null); 
	     		}
	     	});
	        
	        JButton btnNuevo = new JButton("Nuevo");
	        btnNuevo.setBounds(511, 560, 85, 21);
	        panelForm.add(btnNuevo);
	   
	        btnNuevo.addActionListener(new ActionListener() {
	     	    @Override
	     	    public void actionPerformed(ActionEvent e) {
	     	        txtNombreYApellido.setText("Nombre y apellido");
	     	        txtNombreYApellido.setForeground(Color.GRAY);
	     	        txtNumero.setText("Tu número de contacto");
	     	        txtNumero.setForeground(Color.GRAY);
	     	        txtAsunto.setText("Asunto");
	     	        txtAsunto.setForeground(Color.GRAY);
	     	        txtEmail.setText("Email");
	     	        txtEmail.setForeground(Color.GRAY);
	     	        txtMensaje.setText("Mensaje");
	     	        txtMensaje.setForeground(Color.GRAY);
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
	                    txtAsunto.requestFocus();
	                    enterPressed = true;
	                }
	            }
	        });

	        txtAsunto.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (!enterPressed) {
	                    txtMensaje.requestFocus();
	                    enterPressed = true;
	                }
	            }
	        });

	        txtMensaje.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyReleased(KeyEvent e) {
	                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.getSource() == txtMensaje) {
	                    if (!enterPressed) {
	                        btnEnviar.doClick();
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

	         txtAsunto.addFocusListener(new FocusAdapter() {
	             @Override
	             public void focusGained(FocusEvent e) {
	                 enterPressed = false;
	             }
	         });

	         txtMensaje.addKeyListener(new KeyAdapter() {
	             @Override
	             public void keyReleased(KeyEvent e) {
	                 if (e.getKeyCode() == KeyEvent.VK_ENTER && e.getSource() == txtMensaje) {
	                     if (!enterPressed) {
	                         btnEnviar.doClick();
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
