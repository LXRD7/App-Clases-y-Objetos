package vista;

import static caja.herramientas.Utileria.*;

import modelo.Estante;
import modelo.Libro;

public class AppPrincipal {
	public static void main(String[] args) {
		Estante estante = new Estante(50);
		int seleccion = 0;
		do {
			seleccion=menu();
			switch (seleccion) {
			case 1:
				int opUsuarios = 0;
				do {
					opUsuarios=menuGenerico();
				} while (opUsuarios!=7);
				break;
			case 2:
				int opLibros = 0;
				do {
					opLibros=menuGenerico();
					switch (opLibros) {
					case 1:
						if(!estante.estaLleno()) {
							do {
								String isbn = leer("Digite el isbn");
								if(!estante.existe(estante.buscarPosicion(isbn))) {
									Libro libro = new Libro();
									libro.setIsbn(isbn);
									libro.setTitulo(leer("Ingrese el titulo"));
									libro.setAutor(leer("Ingresa el nombre del autor"));
									libro.setEditorial(leer("Ingresa el nombre de la editorial"));
									libro.setNumeroEdicion(leer("Ingresa el número de edición"));
									libro.setAnioEdicion(leerEntero("Ingresa el año de edición"));
									libro.setIdioma(leer("Ingresa el idioma"));
									libro.setPaisOrigen(leer("Ingresa el país de origen"));
									estante.agregar(libro);
									visualizar("Libro registrado con exito");
								}
								else
									visualizar("Este libro ya está registrado");
							} while (continuar("Desea ingresar otro libro"));
							break;
						}
						else 
							visualizar("El estante ya esta lleno");
					}
				} while (opLibros!=7);
				break;	
			}
		} while (seleccion!=5);
	}

	public static int menu() {
		String opciones ="Menu Principal POO \n";
		opciones+="1._Gestión de Usuarios\n";
		opciones+="2._Gestión de Libros\n";
		opciones+="3._Gestión de Prestamos\n";
		opciones+="4._Gestión de Devoluciones\n";
		opciones+="5._Salir\n";
		opciones+="Digite su opción";
		int opcion = 0;
		do {
			opcion=leerEntero(opciones);
		} while (opcion<1||opcion>5);
		return opcion;
	}

	public static int menuGenerico() {
		String opciones ="Gestion de Libros\n";
		opciones+="1._Registrar\n";
		opciones+="2._Consultar\n";
		opciones+="3._Modificar\n";
		opciones+="4._Eliminar\n";
		opciones+="5._Listar\n";
		opciones+="6._Ordenar\n";
		opciones+="7._Salir\n";
		opciones+="Digite su opción";
		int opcion = 0;
		do {
			opcion=leerEntero(opciones);
		} while (opcion<1||opcion>7);
		return opcion;
	}

}
