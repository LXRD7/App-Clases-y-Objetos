package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Alumno;
import modelo.Domicilio;
import modelo.Libro;

public class Cargador {
	public static List<String> cargarCadenas(String archivo) {
		File file = new File(archivo);
		try {
			Scanner entrada = new Scanner(file);
			List <String> cadenas = new ArrayList<>();
			while(entrada.hasNext()) {
				String cadena = entrada.nextLine();
				cadenas.add(cadena);
			}
			entrada.close();
			return cadenas;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static Libro[] cargarLibros(List<String> cadenas) {
		if (cadenas.size()>0) {
			Libro[] libros = new Libro[cadenas.size()];
			int i = 0;
			for (String cadena : cadenas) {
				String[] subCadenas = cadena.split("\t");
				Libro libro = new Libro();
				libro.setIsbn(subCadenas[0]);
				libro.setTitulo(subCadenas[1]);
				libro.setAutor(subCadenas[2]);
				libro.setEditorial(subCadenas[3]);
				libro.setNumeroEdicion(subCadenas[4]);
				libro.setAnioEdicion(Integer.parseInt(subCadenas[5]));
				libro.setIdioma(subCadenas[6]);
				libro.setPaisOrigen(subCadenas[7]);
				libros[i] = libro;
				i++;
			}
			return libros;
		}
		else
			return null;
	}
	
	public static Alumno[] cargarUsuarios(List<String> cadenas) {
		if (cadenas.size()>0) {
			Alumno[] alumnos = new Alumno[cadenas.size()];
			int i = 0;
			for (String cadena : cadenas) {
				String[] subCadenas = cadena.split("\t");
				Alumno alumno = new Alumno();
				Domicilio domicilio = new Domicilio();
				alumno.setNumeroControl(subCadenas[0]);
				alumno.setNombre(subCadenas[1]);
				alumno.setPaterno(subCadenas[2]);
				alumno.setMaterno(subCadenas[3]);
				alumno.setGenero(subCadenas[4]);
				alumno.setEdad(Byte.parseByte(subCadenas[5]));
				alumno.setTelefono(subCadenas[6]);
				domicilio.setNumeroCasa(Integer.parseInt(subCadenas[7]));
				domicilio.setCalle(subCadenas[8]);
				domicilio.setColonia(subCadenas[9]);
				domicilio.setCiudad(subCadenas[10]);
				domicilio.setEstado(subCadenas[11]);
				domicilio.setCodigoPostal(subCadenas[12]);
				domicilio.setPais(subCadenas[13]);
				alumno.setDomicilio(domicilio);
				alumnos[i] = alumno;
				i++;
			}
			return alumnos;
		}
		else
			return null;
	}
}
