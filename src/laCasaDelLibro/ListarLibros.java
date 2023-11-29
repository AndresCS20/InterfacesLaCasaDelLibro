package laCasaDelLibro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

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
import java.awt.event.ActionEvent;

public class ListarLibros extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPane;
	private JLabel labelTitulo;
	private JLabel labelTituloListarLibros;
	private JTable table;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ListarLibros dialog = new ListarLibros();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ListarLibros() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // PUEDE QUE ESTE EL PROBLEMA ACÁ
		setBounds(100, 100, 691, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(57, 81, 68), 17));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		logo();

		tituloVentana();

	}

	private void logo() {
		ImageIcon imageIcon = new ImageIcon("./images/logo-b.png");
		JLabel labelImgLogo = new JLabel(imageIcon);
		labelImgLogo.setBounds(39, 28, 193, 65);
		contentPane.add(labelImgLogo);
	}

	private void tituloVentana() {
		labelTituloListarLibros = new JLabel("Listar Libros  ");
		labelTituloListarLibros.setForeground(new Color(57, 81, 68));
		labelTituloListarLibros.setFont(new Font("Segoe UI", Font.BOLD, 32));
		labelTituloListarLibros.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTituloListarLibros.setBounds(386, 28, 259, 53);
		contentPane.add(labelTituloListarLibros);

		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setBounds(39, 138, 592, 264);
		contentPane.add(table);

		JButton btnImportarCSV = new JButton("Importar CSV");
		btnImportarCSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CSV.importarCSV();
			}
		});
		btnImportarCSV.setBackground(new Color(170, 139, 86));
		btnImportarCSV.setBounds(386, 92, 115, 34);
		contentPane.add(btnImportarCSV);

		JButton btnExportarCsv = new JButton("Exportar CSV");
		btnExportarCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CSV.exportarCSV();
			}
		});
		btnExportarCsv.setBackground(new Color(170, 139, 86));
		btnExportarCsv.setBounds(511, 92, 115, 35);
		contentPane.add(btnExportarCsv);
	}
}
