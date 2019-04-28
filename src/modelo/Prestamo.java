package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestamo {

	private Alumno alumno;
	private Libro libro;
	private LocalDate fechaPrestamo;
	private LocalDate fechaEntrega;
	private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");


	public Prestamo(Alumno alumno,Libro libro) {
		fechaPrestamo = LocalDate.now();
		switch (fechaPrestamo.getDayOfWeek()) {
		case WEDNESDAY:
			fechaEntrega = LocalDate.now().plusDays(5);
			break;
		case THURSDAY:
			fechaEntrega = LocalDate.now().plusDays(5);
			break;
		case FRIDAY:
			fechaEntrega = LocalDate.now().plusDays(5);
			break;
		case SATURDAY:
			fechaEntrega = LocalDate.now().plusDays(4);
			break;
		case SUNDAY:
			fechaEntrega = LocalDate.now().plusDays(3);
			break;
		default:
			fechaEntrega = LocalDate.now().plusDays(3);
			break;
		}
		this.alumno = alumno;
		this.libro = libro;
	}

	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public String getFechaPrestamo() {
		return fechaPrestamo.format(formatoFecha);
	}

	public String getFechaDevolucion() {
		return fechaEntrega.format(formatoFecha);
	}

	@Override
	public String toString() {
		return "[Alumno=" + alumno.getNombre() + " " + alumno.getPaterno() + " " + alumno.getMaterno() +
				"\nISBN=" + libro.getIsbn() + " Titulo= " + libro.getTitulo() + ", Autor= " + libro.getAutor() +
				"\nFecha de Prestamo=" + fechaPrestamo + ", Fecha de Entrega=" + fechaEntrega + "]\n\n";
	}

	

}
