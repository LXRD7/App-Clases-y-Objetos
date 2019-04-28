package modelo;

public class Estante {
	private Libro[] contenedor;
	private int capacidad;
	private int contador;
	
	public Estante() {
		this(100);
	}
	
	public Estante(int capacidad) {
		super();
		this.capacidad=capacidad;
		contador = 0;
		contenedor = new Libro[capacidad];
	}
	
	public boolean estaLleno() {
		return(contador==capacidad);
	}
	
	public boolean estaVacio() {
		return(contador==0);
	}
	
	public void agregar(Libro libro) {
		contenedor[contador]=libro;
		contador++;
	}
	
	public void moverLibros(Libro[] libros) {
		for (Libro libro : libros) {
			agregar(libro);
		}
	}
	
	public boolean existe(int posicion) {
		return posicion<contador;
	}
	
	public int buscarPosicion(String isbn) {
		for (int i=0;i<contador;i++) {
			if (contenedor[i].getIsbn().equals(isbn)) {
				return i;
			}
		}
		return contador;
	}
	
	public Libro getLibro(int posicion) {
		return contenedor[posicion];
	}
	
	public void eliminarLibro(int posicion) {
		for (int i = posicion; i < contador; i++) {
			contenedor[i] = contenedor[i+1];
		}
		contenedor[contador] = contenedor[contador+1];
		contador--;
	}
	
	public void modificarLibro(Libro libro) {
		int posicion = buscarPosicion(libro.getIsbn());
		contenedor[posicion] = libro;
	}

	@Override
	public String toString() {
		String salida = "Los libros del estante son\n";
		for (int i = 0; i < contador; i++) {
			salida+=contenedor[i];
		}
		return salida;
	}
		
}
