import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Final extends JFrame {
	private JTextField txtArchivo;
	String direccion, texto, salida;
public Final(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 413, 330);
	JPanel contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	setVisible(true);
	
	JLabel lblArchivo = new JLabel("Archivo de Entrada");
	lblArchivo.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblArchivo.setBounds(29, 23, 154, 29);
	getContentPane().add(lblArchivo);
	
	txtArchivo = new JTextField();
	txtArchivo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	txtArchivo.setText("C:\\Users\\usuario\\Documents\\ejemplo.txt");
	txtArchivo.setBounds(29, 53, 337, 24);
	getContentPane().add(txtArchivo);
	txtArchivo.setColumns(10);
	
	JButton btnMaestroYoda = new JButton("Maestro Yoda");
	btnMaestroYoda.setFont(new Font("Tahoma", Font.PLAIN, 18));
	btnMaestroYoda.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			direccion=txtArchivo.getText();
			
			Maestro_Yoda MY = new Maestro_Yoda ();
			texto= MY.leerArchivo(direccion);
			Creator c = new Creator ("Output_MaestroYoda#201314745.txt", texto);
		}
	});
	btnMaestroYoda.setBounds(122, 109, 159, 43);
	getContentPane().add(btnMaestroYoda);
	
	JButton btnTecladoT = new JButton("Teclado T9");
	btnTecladoT.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			direccion=txtArchivo.getText();
			
			TecladoT9 t= new TecladoT9();
			texto= t.leerArchivo(direccion);
			Creator c = new Creator ("Output_TecladoT9#201314745.txt", texto);
		}
	});
	btnTecladoT.setFont(new Font("Tahoma", Font.PLAIN, 18));
	btnTecladoT.setBounds(132, 165, 125, 43);
	getContentPane().add(btnTecladoT);
	
	JButton btnNumeros = new JButton("Numeros");
	btnNumeros.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			direccion=txtArchivo.getText();
			
			Numero n= new Numero();
			texto= n.leerArchivo(direccion);
			Creator c = new Creator ("Output_Numero#201314745.txt", texto);
		}
	});
	btnNumeros.setFont(new Font("Tahoma", Font.PLAIN, 18));
	btnNumeros.setBounds(132, 221, 125, 43);
	getContentPane().add(btnNumeros);
}
}
