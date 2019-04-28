package pruebas;
import javax.swing.*;

public class Sobrecarga {
	
	public static void main(String[] args) {
		/*visualizar("Hola");
		visualizar(3);
		visualizar(4.4);
		visualizar(3,7);
		visualizar(4,5,6);*/
		new Sobrecarga();
		visualizar(10);
		visualizar(10,20);
		visualizar(10,20,30);
		visualizar(10,20,30,40);
	}
	
	public Sobrecarga() {
		System.out.println("Hola");
	}
	public static void visualizar(int...a) {
		if (a.length>0) {
			String salida="";
			for(int dato:a)
				salida+=dato+" ";
			JOptionPane.showMessageDialog(null, salida);
		}
	}
	
	/*private static void visualizar(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	private static void visualizar(int numero) {
		JOptionPane.showMessageDialog(null, numero);
	}
	
	private static void visualizar(double f) {
		JOptionPane.showMessageDialog(null, f);
	}
	
	private static void visualizar(int a, int b) {
		JOptionPane.showMessageDialog(null, a+" "+b);
	}
	
	private static void visualizar(int a, int b,int c) {
		JOptionPane.showMessageDialog(null, a+" "+b+" "+c);
	}*/
}
