package vista;

import static caja.herramientas.Utileria.continuar;
import static caja.herramientas.Utileria.leer;
import static caja.herramientas.Utileria.leerByte;
import static caja.herramientas.Utileria.leerEntero;
import static caja.herramientas.Utileria.visualizar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import dao.Cargador;
import modelo.Alumno;
import modelo.Domicilio;
import modelo.Estante;
import modelo.Libro;
import modelo.Prestamo;
import modelo.RegistroPrestamos;
import modelo.RegistroUsuarios;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private JMenuBar barra;
	
	private JMenu menuLibros;
	private JMenu menuAlumnos;
	private JMenu menuPrestamos;
	private JMenu menuDevoluciones;
	
	private JMenuItem opcionRegistrarLibros;
	private JMenuItem opcionConsultarLibros;
	private JMenuItem opcionEliminarLibros;
	private JMenuItem opcionModificarLibros;
	private JMenuItem opcionOrdenarLibros;
	private JMenuItem opcionListarLibros;
	private JMenuItem opcionCargarLibros;
	
	private JMenuItem opcionRegistrarAlumnos;
	private JMenuItem opcionConsultarAlumnos;
	private JMenuItem opcionEliminarAlumnos;
	private JMenuItem opcionModificarAlumnos;
	private JMenuItem opcionOrdenarAlumnos;
	private JMenuItem opcionListarAlumnos;
	private JMenuItem opcionCargarAlumnos;
	
	private JMenuItem opcionRegistrarPrestamos;
	private JMenuItem opcionConsultarPrestamos;
	private JMenuItem opcionRenovarPrestamos;
	private JMenuItem opcionListarPrestamos;
	
	private OyenteRegistrarLibros oyenteRegistrarLibros;
	private OyenteConsultarLibros oyenteConsultarLibros;
	private OyenteEliminarLibros oyenteEliminarLibros;
	private OyenteModificarLibros oyenteModificarLibros;
	private OyenteOrdenarLibros oyenteOrdenarLibros;
	private OyenteListarLibros oyenteListarLibros;
	private OyenteCargarLibros oyenteCargarLibros;
	
	private OyenteRegistrarAlumnos oyenteRegistrarAlumnos;
	private OyenteConsultarAlumnos oyenteConsultarAlumnos;
	private OyenteEliminarAlumnos oyenteEliminarAlumnos;
	private OyenteModificarAlumnos oyenteModificarAlumnos;
	private OyenteOrdenarAlumnos oyenteOrdenarAlumnos;
	private OyenteListarAlumnos oyenteListarAlumnos;
	private OyenteCargarAlumnos oyenteCargarAlumnos;
	
	private OyenteRegistrarPrestamos oyenteRegistrarPrestamos;
	private OyenteConsultarPrestamos oyenteConsultarPrestamos;
	private OyenteRenovarPrestamos oyenteRenovarPrestamos;
	private OyenteListarPrestamos oyenteListarPrestamos;
	
	private Estante estante;
	private RegistroUsuarios registroUsuarios;
	private RegistroPrestamos registroPrestamos;

	public Ventana() {
		super();
		estante = new Estante(50);
		registroUsuarios = new RegistroUsuarios(100);
		registroPrestamos = new RegistroPrestamos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(200, 100);
		//setSize(800, 500);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		barra = new JMenuBar();
		
		menuLibros = new JMenu("Control de Libros");
		menuAlumnos = new JMenu("Control de Alumnos");
		menuPrestamos = new JMenu("Control de Prestamos");
		menuDevoluciones = new JMenu("Control de Devoluciones");
		
		opcionRegistrarLibros = new JMenuItem("Registro de Libros");
		oyenteRegistrarLibros = new OyenteRegistrarLibros();
		opcionRegistrarLibros.addActionListener(oyenteRegistrarLibros);
		opcionConsultarLibros = new JMenuItem("Consultar Libros");
		oyenteConsultarLibros = new OyenteConsultarLibros();
		opcionConsultarLibros.addActionListener(oyenteConsultarLibros);
		opcionEliminarLibros = new JMenuItem("Eliminar Libros");
		oyenteEliminarLibros = new OyenteEliminarLibros();
		opcionEliminarLibros.addActionListener(oyenteEliminarLibros);
		opcionModificarLibros = new JMenuItem("Modificar Libros");
		oyenteModificarLibros = new OyenteModificarLibros();
		opcionModificarLibros.addActionListener(oyenteModificarLibros);
		opcionOrdenarLibros = new JMenuItem("Ordenar Libros");
		oyenteOrdenarLibros = new OyenteOrdenarLibros();
		opcionOrdenarLibros.addActionListener(oyenteOrdenarLibros);
		opcionListarLibros = new JMenuItem("Listar Libros");
		oyenteListarLibros = new OyenteListarLibros();
		opcionListarLibros.addActionListener(oyenteListarLibros);
		opcionCargarLibros = new JMenuItem("Cargar Libros desde archivo de texto");
		oyenteCargarLibros = new OyenteCargarLibros();
		opcionCargarLibros.addActionListener(oyenteCargarLibros);
		
		opcionRegistrarAlumnos = new JMenuItem("Registro de  Alumnos");
		oyenteRegistrarAlumnos = new OyenteRegistrarAlumnos();
		opcionRegistrarAlumnos.addActionListener(oyenteRegistrarAlumnos);
		opcionConsultarAlumnos = new JMenuItem("Consultar Alumnos");
		oyenteConsultarAlumnos = new OyenteConsultarAlumnos();
		opcionConsultarAlumnos.addActionListener(oyenteConsultarAlumnos);
		opcionEliminarAlumnos = new JMenuItem("Eliminar Alumnos");
		oyenteEliminarAlumnos = new OyenteEliminarAlumnos();
		opcionEliminarAlumnos.addActionListener(oyenteEliminarAlumnos);
		opcionModificarAlumnos = new JMenuItem("Modificar Alumnos");
		oyenteModificarAlumnos = new OyenteModificarAlumnos();
		opcionModificarAlumnos.addActionListener(oyenteModificarAlumnos);
		opcionOrdenarAlumnos = new JMenuItem("Ordenar Alumnos");
		oyenteOrdenarAlumnos = new OyenteOrdenarAlumnos();
		opcionOrdenarAlumnos.addActionListener(oyenteOrdenarAlumnos);
		opcionListarAlumnos = new JMenuItem("Listar Alumnos");
		oyenteListarAlumnos = new OyenteListarAlumnos();
		opcionListarAlumnos.addActionListener(oyenteListarAlumnos);
		opcionCargarAlumnos = new JMenuItem("Cargar Alumnos desde archivo de texto");
		oyenteCargarAlumnos = new OyenteCargarAlumnos();
		opcionCargarAlumnos.addActionListener(oyenteCargarAlumnos);
		
		opcionRegistrarPrestamos = new JMenuItem("Registrar nuevo prestamo");
		oyenteRegistrarPrestamos = new OyenteRegistrarPrestamos();
		opcionRegistrarPrestamos.addActionListener(oyenteRegistrarPrestamos);
		opcionConsultarPrestamos = new JMenuItem("Consultar prestamos");
		oyenteConsultarPrestamos = new OyenteConsultarPrestamos();
		opcionConsultarPrestamos.addActionListener(oyenteConsultarPrestamos);
		opcionRenovarPrestamos = new JMenuItem("Renovar Prestamo");
		oyenteRenovarPrestamos = new OyenteRenovarPrestamos();
		opcionRenovarPrestamos.addActionListener(oyenteRenovarPrestamos);
		opcionListarPrestamos = new JMenuItem("Listar Prestamos");
		oyenteListarPrestamos = new OyenteListarPrestamos();
		opcionListarPrestamos.addActionListener(oyenteListarPrestamos);
		
		menuLibros.add(opcionRegistrarLibros);
		menuLibros.add(opcionConsultarLibros);
		menuLibros.add(opcionEliminarLibros);
		menuLibros.add(opcionModificarLibros);
		menuLibros.add(opcionOrdenarLibros);
		menuLibros.add(opcionListarLibros);
		menuLibros.add(opcionCargarLibros);
		
		menuAlumnos.add(opcionRegistrarAlumnos);
		menuAlumnos.add(opcionConsultarAlumnos);
		menuAlumnos.add(opcionEliminarAlumnos);
		menuAlumnos.add(opcionModificarAlumnos);
		menuAlumnos.add(opcionOrdenarAlumnos);
		menuAlumnos.add(opcionListarAlumnos);
		menuAlumnos.add(opcionCargarAlumnos);
		
		menuPrestamos.add(opcionRegistrarPrestamos);
		menuPrestamos.add(opcionConsultarPrestamos);
		menuPrestamos.add(opcionRenovarPrestamos);
		menuPrestamos.add(opcionListarPrestamos);
		
		barra.add(menuLibros);
		barra.add(menuAlumnos);
		barra.add(menuPrestamos);
		barra.add(menuDevoluciones);
		
		setJMenuBar(barra);
		setVisible(true);
		setTitle("App Gestión de Bibliotecas");

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ventana miVentana = new Ventana();
	}

	private class OyenteRegistrarLibros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaLleno()) {
				do {
					String isbn=leer("Ingrese el ISBN");;
					if (!estante.existe(estante.buscarPosicion(isbn))) {
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
						visualizar("Este libro ya existe");
				} while (!estante.estaLleno() && continuar("¿Dese registrar otro libro?"));
			}
			else
				visualizar("El estante esta lleno");
		}
	}

	private class OyenteConsultarLibros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaVacio()) {
				do {
					String isbn = leer("Ingresa el isbn del libro que desea consultar");
					int posicion = estante.buscarPosicion(isbn);
					if (estante.existe(posicion)) {
						visualizar(estante.getLibro(posicion).toString());
					}
					else
						visualizar("Este libro no existe");
				} while (continuar("¿Dese consultar otro libro?"));
			}
			else
				visualizar("El estante esta vacio");
		}
	}

	private class OyenteEliminarLibros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaVacio()) {
				do {
					String isbn = leer("Ingresa el isbn del libro que desea eliminar");
					int posicion = estante.buscarPosicion(isbn);
					if (estante.existe(posicion)) {
						if(!registroPrestamos.existe(registroPrestamos.buscarPosicionLibro(isbn))){
							estante.eliminarLibro(posicion);
						}
						else
							visualizar("No se puede elimniar un libro prestado");
					}
					else
						visualizar("Este libro no existe");
				} while (continuar("¿Dese eliminar otro libro?"));
			}
			else
				visualizar("El estante esta vacio");
		}
	}
	
	private class OyenteModificarLibros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaVacio()) {
				do {
					String isbn = leer("Ingresa el isbn del libro que desea modificar");
					int posicion = estante.buscarPosicion(isbn);
					if (estante.existe(posicion)) {
						Libro libro = new Libro();
						libro.setIsbn(isbn);
						libro.setTitulo(leer("Ingrese el titulo"));
						libro.setAutor(leer("Ingresa el nombre del autor"));
						libro.setEditorial(leer("Ingresa el nombre de la editorial"));
						libro.setNumeroEdicion(leer("Ingresa el número de edición"));
						libro.setAnioEdicion(leerEntero("Ingresa el año de edición"));
						libro.setIdioma(leer("Ingresa el idioma"));
						libro.setPaisOrigen(leer("Ingresa el país de origen"));
						estante.modificarLibro(libro);
						visualizar("Libro modificado con exito");
					}
					else
						visualizar("Este libro no existe");
				} while (continuar("¿Dese modificar otro libro?"));
			}
			else
				visualizar("El estante esta vacio");
		}
	}
	
	private class OyenteOrdenarLibros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class OyenteListarLibros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaVacio()) {
				visualizar(estante.toString());
			}
			else
				visualizar("El estante esta vacio");
		}
	}

	private class OyenteCargarLibros implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			List<String> cadenas = Cargador.cargarCadenas("/home/gxnter/eclipse-workspace/App Clases y Objetos/src/recursos/libros");
			estante.moverLibros(Cargador.cargarLibros(cadenas));
			visualizar("Libros cargados con exito");
		}
	}
	
	private class OyenteRegistrarAlumnos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaLleno()) {
				do {
					String numeroControl=leer("Ingrese el Número de Control");;
					if (!registroUsuarios.existe(registroUsuarios.buscarPosicion(numeroControl))) {
						Alumno alumno= new Alumno();
						alumno.setNumeroControl(leer("Ingrese el número de control"));
						alumno.setNombre(leer("Ingrese el nombre"));
						alumno.setPaterno(leer("Ingrese el apellido paterno"));
						alumno.setMaterno(leer("Ingrese el apellido materno"));
						alumno.setGenero(leer("Ingrese el genero"));
						alumno.setEdad(leerByte("Ingrese la edad"));
						alumno.setTelefono(leer("Ingrese el número de telefono"));
						Domicilio domicilio = new Domicilio();
						domicilio.setNumeroCasa(leerEntero("Ingresa el número de casa"));       
						domicilio.setCalle(("Ingrese la calle"));                        
						domicilio.setColonia(leer("Ingrese la colonia"));                    
						domicilio.setCiudad(leer("Ingrese la ciudad"));                      
						domicilio.setEstado(leer("Ingrese el estado"));                      
						domicilio.setCodigoPostal(leer("Ingrese el codigo postal"));         
						domicilio.setPais(leer("Ingrese el país"));
						alumno.setDomicilio(domicilio);
						registroUsuarios.agregar(alumno);
						visualizar("Alumno registrado con exito");
					}
					else
						visualizar("Este usuario ya existe");
				} while (!estante.estaLleno() && continuar("¿Dese registrar otro usuario?"));
			}
			else
				visualizar("El estante esta lleno");
		}
	}

	private class OyenteConsultarAlumnos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!registroUsuarios.estaVacio()) {
				do {
					String numeroControl = leer("Ingresa el número de control del alumno que desea consultar");
					int posicion = registroUsuarios.buscarPosicion(numeroControl);
					if (registroUsuarios.existe(posicion)) {
						visualizar(registroUsuarios.getUsuario(posicion).toString());
					}
					else
						visualizar("Este usuario no existe");
				} while (continuar("¿Dese consultar otro usuario?"));
			}
			else
				visualizar("No hay usuarios registrados");
		}
	}

	private class OyenteEliminarAlumnos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!registroUsuarios.estaVacio()) {
				do {
					String numeroControl = leer("Ingresa el numero de control del alumno que desea eliminar");
					int posicion = registroUsuarios.buscarPosicion(numeroControl);
					if (registroUsuarios.existe(posicion)) {
						if(!registroPrestamos.existe(registroPrestamos.buscarPosicionAlumno(numeroControl))) {
						registroUsuarios.eliminarUsuario(posicion);
						}
						else
							visualizar("Este usuario se puede eliminar ya que tiene libros prestados");
					}
					else
						visualizar("Este usuario no existe");
				} while (continuar("¿Dese eliminar otro usuario?"));
			}
			else
				visualizar("No hay alumnos registrados");
		}
	}
	
	private class OyenteModificarAlumnos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!registroUsuarios.estaVacio()) {
				do {
					String numeroControl = leer("Ingrese el número de control del alumno que desea modificar");
					int posicion = registroUsuarios.buscarPosicion(numeroControl);
					if (registroUsuarios.existe(posicion)) {
						Alumno alumno = new Alumno();
						alumno.setNumeroControl(numeroControl);
						alumno.setNombre(leer("Ingrese el nombre"));
						alumno.setPaterno(leer("Ingrese el apellido paterno"));
						alumno.setMaterno(leer("Ingrese el apellido materno"));
						alumno.setGenero(leer("Ingrese el genero"));
						alumno.setEdad(leerByte("Ingrese la edad"));
						alumno.setTelefono(leer("Ingrese el número de telefono"));
						Domicilio domicilio = new Domicilio();
						domicilio.setNumeroCasa(leerEntero("Ingresa el número de casa"));       
						domicilio.setCalle(leer("Ingrese la calle"));                        
						domicilio.setColonia(leer("Ingrese la colonia"));                    
						domicilio.setCiudad(leer("Ingrese la ciudad"));                      
						domicilio.setEstado(leer("Ingrese el estado"));                      
						domicilio.setCodigoPostal(leer("Ingrese el codigo postal"));         
						domicilio.setPais(leer("Ingrese el país"));
						alumno.setDomicilio(domicilio);
						registroUsuarios.modificarUsuario(alumno);
						visualizar("Alumno modificado con exito");
					}
					else
						visualizar("Este usuario no existe");
				} while (continuar("¿Dese modificar otro usuario?"));
			}
			else
				visualizar("No hay usuarios registrados");
		}
	}
	
	private class OyenteOrdenarAlumnos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class OyenteListarAlumnos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!registroUsuarios.estaVacio()) {
				visualizar(registroUsuarios.toString());
			}
			else
				visualizar("No hay usuarios registrados");
		}
	}

	private class OyenteCargarAlumnos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			List<String> cadenas = Cargador.cargarCadenas("/home/gxnter/eclipse-workspace/App Clases y Objetos/src/recursos/usuarios");
			registroUsuarios.moverUsuarios(Cargador.cargarUsuarios(cadenas));
			visualizar("Usuarios cargados con exito");
		}
	}
	
	private class OyenteRegistrarPrestamos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaVacio()) {
				if(!registroUsuarios.estaVacio()) {
					do {
						String isbn=leer("Ingrese el ISBN del libro");
						if (estante.existe(estante.buscarPosicion(isbn))) {
							if(!registroPrestamos.existe(registroPrestamos.buscarPosicionLibro(isbn))) {
								String numeroControl = leer("Ingresa el número de control del alumno");
								if(registroUsuarios.existe(registroUsuarios.buscarPosicion(numeroControl))) {
									Prestamo prestamo = new Prestamo(numeroControl,isbn);
									registroPrestamos.agregar(prestamo);
									visualizar("Libro prestado con exito");
								}
								else
									visualizar("Este usuario no esta registrado");
							}
							else
								visualizar("Este libro ya esta registrado como prestado");
						}
						else
							visualizar("Este libro no existe en el estante");
					} while (!registroPrestamos.estaLleno() && continuar("¿Dese registrar otro prestamo?"));
				}
				else
					visualizar("No hay usuarios registrados");
			}
			else
				visualizar("El estante esta vacio");
		}
	}
	
	private class OyenteConsultarPrestamos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!estante.estaVacio()) {
				do {
					String numeroControl = leer("Ingresa el numero de control del alumno");
					int posicion = registroPrestamos.buscarPosicionAlumno(numeroControl);
					if (registroPrestamos.existe(posicion)) {
						visualizar(registroPrestamos.getPrestamo(posicion).toString());
					}
					else
						visualizar("Este usuario no tiene prestamos registrados");
				} while (continuar("¿Dese consultar otros prestamos?"));
			}
			else
				visualizar("El registro de prestamos esta vacio");
		}
	}
	
	private class OyenteRenovarPrestamos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!registroUsuarios.estaLleno()) {
				do {
					String isbn=leer("Ingrese el ISBN del libro");
					int posicion = registroPrestamos.buscarPosicionLibro(isbn);
					if (registroPrestamos.existe(posicion)) {
						Prestamo prestamo = registroPrestamos.getPrestamo(posicion);
						registroPrestamos.renovarPrestamo(prestamo);
						visualizar("Prestamo renovado con exito");
					}
					else
						visualizar("Este libro no se puede renovar");
				} while (!estante.estaLleno() && continuar("¿Dese renovar otro prestamo?"));
			}
			else
				visualizar("El registro de prestamos esta lleno");
		}
	}
	
	private class OyenteListarPrestamos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(!registroPrestamos.estaVacio()) {
				String mensaje = "";
				String numeroControl = "";
				String isbn = "";
				for (Prestamo prestamo: registroPrestamos.getPrestamos()) {
					numeroControl = prestamo.getNumeroControl();
					isbn = prestamo.getIsbn();
					mensaje += "\nNumero de Control: " + numeroControl +" Nombre del Alumno: "
					+registroUsuarios.getUsuario(registroUsuarios.buscarPosicion(numeroControl)).getNombre()+
					" ISBN: "+isbn+
					" Titulo del Libro: " + estante.getLibro(estante.buscarPosicion(isbn)).getTitulo()+
					" Nombre del Autor: " + estante.getLibro(estante.buscarPosicion(isbn)).getAutor();
					
				}
				visualizar(mensaje);;
			}
			else
				visualizar("El regitrso de prestamos esta vacio");
		}
	}
}
