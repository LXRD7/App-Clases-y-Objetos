package dao;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<String> cadenas = Cargador.cargarCadenas("/home/gxnter/eclipse-workspace/App Clases y Objetos/src/recursos/libros");
		System.out.println(cadenas.toString());
	}
}
