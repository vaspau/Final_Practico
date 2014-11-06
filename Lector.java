import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Lector {
	private File archivo ;
	private FileReader lector;
	private BufferedReader blector;
	String Linea;
	String nl = System.getProperty("line.separator");
	public Lector(String direccion){
		archivo= new File(direccion);
		try {
			lector=new FileReader(archivo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"No se encuentra el archivo");
		}
		blector=new BufferedReader(lector);
	}
	
	public String leerLinea(){
		
		try {
			while (blector.ready()){
				
				if(!(Linea=blector.readLine()).equals(" ")){
					return Linea;
				}
			}
		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(null,"Headless");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"io");
		}
		try {
			blector.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"No se pudo cerrar");
		
	}	return "";
	}	
}
