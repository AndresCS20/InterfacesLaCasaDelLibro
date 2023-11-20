package laCasaDelLibro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(57, 81, 68));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon imageIcon = new ImageIcon("./images/logo-a.png");
		JLabel lblNewLabel = new JLabel(imageIcon);
		lblNewLabel.setBounds(268, 11, 118, 148);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Crear Libro");
		btnNewButton.setBackground(new Color(170, 139, 86));
		ImageIcon iconCreate = new ImageIcon("./images/create-icon.png"); // Reemplaza con la ruta de tu imagen
        btnNewButton.setIcon(iconCreate);
        btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
		
		btnNewButton.setBounds(71, 279, 118, 118);
		contentPane.add(btnNewButton);
		
		JButton btnListarLibros = new JButton("Listar Libros");
		ImageIcon iconListar = new ImageIcon("./images/list-icon.png"); // Reemplaza con la ruta de tu imagen
        btnListarLibros.setIcon(iconListar);
		btnListarLibros.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnListarLibros.setHorizontalTextPosition(SwingConstants.CENTER);
		btnListarLibros.setBackground(new Color(170, 139, 86));
		btnListarLibros.setBounds(268, 279, 118, 118);
		contentPane.add(btnListarLibros);
		
		JButton btnEliminarLibro = new JButton("Eliminar Libro");
		ImageIcon iconDelete = new ImageIcon("./images/delete-icon.png"); // Reemplaza con la ruta de tu imagen
        btnEliminarLibro.setIcon(iconDelete);
		btnEliminarLibro.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnEliminarLibro.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEliminarLibro.setBackground(new Color(170, 139, 86));
		btnEliminarLibro.setBounds(474, 279, 118, 118);
		contentPane.add(btnEliminarLibro);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(78, 108, 80));
		panel.setBounds(71, 168, 521, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\r\nCualquier problema contacta con el departamento de IT");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(20, 42, 501, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bienvenido a la Aplicación Interna de Gestión de Inventario.");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(20, 16, 501, 25);
		panel.add(lblNewLabel_1_1);
	}
}
