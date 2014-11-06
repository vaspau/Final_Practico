import java.io.IOException;

import javax.swing.JOptionPane;


public class Maestro_Yoda{
	int casos, NoPalabras;
	String linea, direccion;
	String  texto="";
	String nl = System.getProperty("line.separator");
	
	
	public String leerArchivo(String direccion){
		
		this.direccion=direccion;
		Lector a= new Lector(direccion);
		
		try {
			casos=Integer.parseInt(a.leerLinea());
			for(int i=0;i<casos; i++){
			linea=a.leerLinea();
			String[] palabras = linea.split(" ");
			NoPalabras=palabras.length;
			for(int j =NoPalabras-1;j>-1;j--){
				texto+=palabras[j]+" ";
			}
			texto+=nl;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"FormatException");
		}
		System.out.println(texto);
		return texto;
	
}
}
