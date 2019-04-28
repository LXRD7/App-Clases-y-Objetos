package vista;

import static caja.herramientas.Utileria.*;
import modelo.Alumno;
import modelo.Domicilio;

public class Principal {
	public static void main(String[] args) {
		String numeroControl = leer("Ingrese el número de control");
		String nombre = leer("Ingrese el nombre");
		String paterno = leer("Ingrese el apellido paterno");
		String materno = leer("Ingrese el apellido materno");
		String genero = leer("Ingrese el genero");
		byte edad = leerByte("Ingrese la edad");
		String telefono = leer("Ingrese el número de telefono");
		Domicilio domicilio = new Domicilio();
		int numeroCasa = leerEntero("Ingresa el número de casa");
		String calle = leer("Ingrese la calle");
		String colonia = leer("Ingrese la colonia");
		String ciudad = leer("Ingrese la ciudad");
		String estado = leer("Ingrese el estado");
		String codigoPostal = leer("Ingrese el codigo postal");
		String pais = leer("Ingrese el país");
		domicilio.setNumeroCasa(numeroCasa);
		domicilio.setCalle(calle);
		domicilio.setColonia(colonia);
		domicilio.setCiudad(ciudad);
		domicilio.setEstado(estado);
		domicilio.setCodigoPostal(codigoPostal);
		domicilio.setPais(pais);
		Alumno alumno = new Alumno();
		alumno.setNumeroControl(numeroControl);
		alumno.setNombre(nombre);
		alumno.setPaterno(paterno);
		alumno.setMaterno(materno);
		alumno.setGenero(genero);
		alumno.setEdad(edad);
		alumno.setTelefono(telefono);
		alumno.setDomicilio(domicilio);
		visualizar("DATOS PERSONALES\n"+
		"\nNúmero de control: "+alumno.getNumeroControl()+
		"\nNombre: "+alumno.getNombre()+
		"\nApellido Paterno: "+alumno.getPaterno()+
		"\nApellido Materno: "+alumno.getMaterno()+
		"\nGenero: "+alumno.getGenero()+
		"\nNúmero Telefonico: "+alumno.getTelefono()+
		"\n\n\nDOMICILIO\n"+
		"\nNúmero de casa: "+alumno.getDomicilio().getNumeroCasa()+
		"\nCalle: "+alumno.getDomicilio().getCalle()+
		"\nColonia: "+alumno.getDomicilio().getColonia()+
		"\nCiudad: "+alumno.getDomicilio().getCiudad()+
		"\nEstado: "+alumno.getDomicilio().getEstado()+
		"\nCodigo Postal: "+alumno.getDomicilio().getCodigoPostal()+
		"\nPaís: "+alumno.getDomicilio().getPais());
	}
}
