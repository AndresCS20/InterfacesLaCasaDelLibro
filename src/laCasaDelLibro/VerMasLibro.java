package laCasaDelLibro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class VerMasLibro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPane;
	private JLabel labelTitulo;
	private JLabel labelTituloListarLibros;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerMasLibro dialog = new VerMasLibro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerMasLibro() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); //PUEDE QUE ESTE EL PROBLEMA ACÁ
		setBounds(100, 100, 691, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(57, 81, 68), 17));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelInfoLibro = new JPanel();
		panelInfoLibro.setBounds(39, 105, 585, 298);
		contentPane.add(panelInfoLibro);
		panelInfoLibro.setLayout(null);
		//panelInfoLibro.add(panelInfoLibro);
		logo();
		
		tituloVentana();
		
//		try {
//			imagenLibro();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	private void logo() {
		ImageIcon imageIcon = new ImageIcon("./images/logo-b.png");
		JLabel labelImgLogo = new JLabel(imageIcon);
		labelImgLogo.setBounds(39, 28, 193, 65);
		contentPane.add(labelImgLogo);
	}

	private void tituloVentana() {
		labelTituloListarLibros = new JLabel("Ver Más  ");
		labelTituloListarLibros.setForeground(new Color(57, 81, 68));
		labelTituloListarLibros.setFont(new Font("Segoe UI", Font.BOLD, 32));
		labelTituloListarLibros.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTituloListarLibros.setBounds(386, 28, 259, 53);
		contentPane.add(labelTituloListarLibros);
		

		
	}
	
	
	private JLabel imagenLibro() throws MalformedURLException {
		URL enlaceImagen = new URL("https://imagessl9.casadellibro.com/a/l/s7/79/9788466649179.webp");
		
        ImageIcon icon = new ImageIcon(enlaceImagen);
        Image image = icon.getImage().getScaledInstance(contentPane.WIDTH,contentPane.HEIGHT, Image.SCALE_SMOOTH); // Ajusta el tamaño a 100x100
        icon = new ImageIcon(image);
        
		ImageIcon imageIllustration = new ImageIcon(enlaceImagen);
//		ImageIcon imageIllustration = new ImageIcon("./images/Bookshop-ill.png");

		JLabel labelImagenLibro = new JLabel(imageIllustration);
		return labelImagenLibro;
	}
	
	
}
