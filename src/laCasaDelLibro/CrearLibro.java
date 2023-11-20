package laCasaDelLibro;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CrearLibro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldISBN;
	private JLabel labelTitulo;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CrearLibro frame = new CrearLibro();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public CrearLibro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //PUEDE QUE ESTE EL PROBLEMA ACÁ
		setBounds(100, 100, 691, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(57, 81, 68), 17));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		logo();
		
		isbn();
		

		
		labelTitulo = new JLabel("Titulo");
		labelTitulo.setBounds(39, 158, 81, 14);
		contentPane.add(labelTitulo);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(39, 174, 238, 27);
		contentPane.add(textField_1);
		
		lblNewLabel_3 = new JLabel("Nombre Autor");
		lblNewLabel_3.setBounds(39, 212, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		textField_2.setBounds(39, 228, 238, 27);
		contentPane.add(textField_2);
		
		lblNewLabel_4 = new JLabel("Cantidad");
		lblNewLabel_4.setBounds(39, 267, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setColumns(10);
		textField_3.setBounds(39, 283, 238, 27);
		contentPane.add(textField_3);
		
		lblNewLabel_5 = new JLabel("Enlace Imagen");
		lblNewLabel_5.setBounds(39, 320, 105, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setColumns(10);
		textField_4.setBounds(39, 336, 238, 27);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Crear Libro");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(57, 81, 68));
		btnNewButton.setBounds(39, 374, 238, 27);
		contentPane.add(btnNewButton);
		
		ImageIcon imageIllustration = new ImageIcon("./images/Bookshop-ill.png");
		JLabel lblNewLabel_6 = new JLabel(imageIllustration);
		lblNewLabel_6.setBounds(360, 103, 285, 298);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel = new JLabel("Crear Libro  ");
		lblNewLabel.setForeground(new Color(57, 81, 68));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(452, 28, 193, 53);
		contentPane.add(lblNewLabel);
	}

	private void isbn() {
		JLabel labelISBN = new JLabel("ISBN");
		labelISBN.setBounds(39, 104, 81, 14);
		contentPane.add(labelISBN);	
		
		textFieldISBN = new JTextField();
		textFieldISBN.setBounds(39, 120, 238, 27);
		contentPane.add(textFieldISBN);
		textFieldISBN.setColumns(10);
	}

	private void logo() {
		ImageIcon imageIcon = new ImageIcon("./images/logo-b.png");
		JLabel labelImgLogo = new JLabel(imageIcon);
		labelImgLogo.setBounds(39, 28, 193, 65);
		contentPane.add(labelImgLogo);
	}
}
