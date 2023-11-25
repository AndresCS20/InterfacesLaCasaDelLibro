package laCasaDelLibro;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

public class EliminarLibro extends JDialog {

	private static final long serialVersionUID = 1L;
	private static JTextField tf_buscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarLibro dialog = new EliminarLibro();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public EliminarLibro() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel tv_cabecera = new JLabel("Eliminar libro");
		tv_cabecera.setFont(new Font("Tahoma", Font.PLAIN, 26));
		tv_cabecera.setBounds(254, 10, 158, 47);
		getContentPane().add(tv_cabecera);

		tf_buscar = new JTextField();
		tf_buscar.setBounds(275, 69, 96, 19);
		getContentPane().add(tf_buscar);
		tf_buscar.setColumns(10);

		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.setBounds(275, 113, 85, 21);
		getContentPane().add(btn_buscar);
		btn_buscar.addActionListener(e -> {
			buscarLibro(Main.listaLibros);
			errores();
			JLabel datos_libro = new JLabel("");
			datos_libro.setBounds(63, 42, 152, 155);
			getContentPane().add(datos_libro);
			Libro libroFinal = buscarLibro(Main.listaLibros);
			if (libroFinal != null) {
				String dl = "ISBN: " + libroFinal.getISBN() + "\nTítulo: " + libroFinal.getTitulo() + "\nAutor: "
						+ libroFinal.getAutor() + "\nStock " + libroFinal.getCantidad() + "\nURL"
						+ libroFinal.getUrlImagen();
				datos_libro.setText(dl);
			}
		});

		JButton btn_eliminar = new JButton("Eliminar libro");
		btn_eliminar.setBounds(275, 180, 109, 33);
		getContentPane().add(btn_eliminar);
		btn_eliminar.addActionListener(e -> {
			eliminarLibro(Main.listaLibros);
		});

	}

	public static Libro buscarLibro(ArrayList<Libro> listaLibros) {
		for (int i = 0; i < listaLibros.size(); i++) {
			if (listaLibros.get(i).getTitulo().equalsIgnoreCase(tf_buscar.getText())) {
				Libro libro = listaLibros.get(i);
				return libro;
			}
		}
		return null;
	}

	public static void eliminarLibro(ArrayList<Libro> listaLibros) {
		if (tf_buscar.getText().length() == 0) {
			errores();
		} else {
			for (int i = 0; i < listaLibros.size(); i++) {
				Libro libroTemp = buscarLibro(listaLibros);
				if (libroTemp != null) {
					if (buscarLibro(listaLibros).getTitulo().equalsIgnoreCase(listaLibros.get(i).getTitulo())) {
						listaLibros.remove(listaLibros.get(i));
						JOptionPane.showMessageDialog(null, "Libro eliminado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		}
	}
		

	public static void errores() {
		String error1 = "El libro no existe";
		String error2 = "Debe rellenar el campo";
		Libro l = buscarLibro(Main.listaLibros);
		if (l == null && tf_buscar.getText().length() != 0) {
			JOptionPane.showMessageDialog(null, error1, "Ha ocurrido un error", JOptionPane.WARNING_MESSAGE);
		}
		if (tf_buscar.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, error2, "Ha ocurrido un error", JOptionPane.WARNING_MESSAGE);
		}
	}
}
