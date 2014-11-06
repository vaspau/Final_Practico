import javax.swing.JOptionPane;


public class TecladoT9 {
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
			char [] letras= linea.toCharArray();
			NoPalabras=letras.length;
			for(int i1=0; i1<NoPalabras; i1++){
				if(letras[i1] =='a'){
					texto+="2";
				}else if (letras[i1] =='b'){
					texto+="22";
				}else if (letras[i1] =='c'){
					texto+="222";
				}else  if(letras[i1] =='d'){
					texto+="3";
				}else if (letras[i1] =='e'){
					texto+="33";
				}else if (letras[i1] =='f'){
					texto+="333";
				}else if(letras[i1] =='g'){
					texto+="4";
				}else if (letras[i1] =='h'){
					texto+="44";
				}else if (letras[i1] =='i'){
					texto+="444";
				}else if(letras[i1] =='j'){
					texto+="5";
				}else if (letras[i1] =='k'){
					texto+="55";
				}else if (letras[i1] =='l'){
					texto+="555";
				}else if(letras[i1] =='m'){
					texto+="6";
				}else if (letras[i1] =='n'){
					texto+="66";
				}else if (letras[i1] =='o'){
					texto+="666";
				}else if(letras[i1] =='p'){
					texto+="7";
				}else if (letras[i1] =='q'){
					texto+="77";
				}else if (letras[i1] =='r'){
					texto+="777";
				}else if (letras[i1] =='s'){
					texto+="7777";
				}else if(letras[i1] =='t'){
					texto+="8";
				}else if (letras[i1] =='u'){
					texto+="88";
				}else if (letras[i1] =='v'){
					texto+="888";
				}else if(letras[i1] =='w'){
					texto+="9";
				}else if (letras[i1] =='x'){
					texto+="99";
				}else if (letras[i1] =='y'){
					texto+="999";
				}else if (letras[i1] =='z'){
					texto+="999";
				}else if (letras[i1] ==' '){
					texto+="0";
				}
			}
			
			texto+=nl;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"FormatException");
		}
		return texto;
	
}
}
