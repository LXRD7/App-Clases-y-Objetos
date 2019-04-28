package modelo;

public class RegistroPrestamos {
	private Prestamo[] prestamos;
	private int capacidad;
	private int contador;
	
	public RegistroPrestamos() {
		this(200);
	}
	
	public RegistroPrestamos(int capacidad) {
		super();
		this.capacidad=capacidad;
		contador = 0;
		prestamos = new Prestamo[capacidad];
	}
	
	public boolean estaLleno() {
		return(contador==capacidad);
	}
	
	public boolean estaVacio() {
		return(contador==0);
	}
	
	public void agregar(Prestamo prestamo){
		prestamos[contador]=prestamo;
		contador++;
	}
	
	public void renovarPrestamo(Prestamo prestamo) {
		int posicion = buscarPosicionLibro(prestamo.getIsbn());
		prestamos[posicion] = prestamo;
	}
	
	public boolean existe(int posicion) {
		return posicion<contador;
	}
	
	public int buscarPosicionAlumno(String numeroControl) {
		for (int i=0;i<contador;i++) {
			if (prestamos[i].getNumeroControl().equals(numeroControl)) {
				return i;
			}
		}
		return contador;
	}
	
	public int buscarPosicionLibro(String isbn) {
		for (int i=0;i<contador;i++) {
			if (prestamos[i].getIsbn().equals(isbn)) {
				return i;
			}
		}
		return contador;
	}
	
	public Prestamo getPrestamo(int posicion) {
		return prestamos[posicion];
	}
	
	public Prestamo[] getPrestamos() {
		return prestamos;
	}
	
	public void eliminarPrestamo(int posicion) {
		for (int i = posicion; i < contador; i++) {
			prestamos[i] = prestamos[i+1];
		}
		prestamos[contador] = prestamos[contador+1];
		contador--;
	}
	
	@Override
	public String toString() {
		String salida = "Los libros prestados actualmente son\n";
		for (int i = 0; i < contador; i++) {
			salida+=prestamos[i];
		}
		return salida;
	}
	
}
