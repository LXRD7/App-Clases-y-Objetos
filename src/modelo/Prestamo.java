package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestamo {

	private String numeroControl;
	private String isbn;
	private LocalDate fechaPrestamo;
	private LocalDate fechaEntrega;
	private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");


	public Prestamo(String numeroControl,String isbn) {
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
		this.numeroControl = numeroControl;
		this.isbn = isbn;
	}

	public String getNumeroControl() {
		return numeroControl;
	}
	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getFechaPrestamo() {
		return fechaPrestamo.format(formatoFecha);
	}

	public String getFechaDevolucion() {
		return fechaEntrega.format(formatoFecha);
	}	
	
	
	@Override
	public String toString() {
		return "Prestamo [Número de Control=" + numeroControl + ", ISBN=" + isbn + ", Fecha de Prestamo="
				+ getFechaPrestamo() + ", Fecha de Devolucion=" + getFechaDevolucion() + "]\n";
	}

}
