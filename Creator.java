import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Creator {
FileWriter f;
String direccion;
	public Creator(String direccion, String texto){
		this.direccion=direccion;
		try {
			f=new FileWriter(direccion);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"No se encontro el archivo");
		}
		try {
			f.write(texto);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"No se creo el archivo");
		}
		try {
			f.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"No se cerro el archivo");
		}
	}
	
}
