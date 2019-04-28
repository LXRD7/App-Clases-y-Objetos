package modelo;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private String numeroEdicion;
	private int anioEdicion;
	private String idioma;
	private String paisOrigen;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getNumeroEdicion() {
		return numeroEdicion;
	}
	public void setNumeroEdicion(String numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	public int getAnioEdicion() {
		return anioEdicion;
	}
	public void setAnioEdicion(int anioEdicion) {
		this.anioEdicion = anioEdicion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	@Override
	public String toString() {
		return "\n[isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", numeroEdicion=" + numeroEdicion + ", anioEdicion=" + anioEdicion + ", idioma=" + idioma
				+ ", paisOrigen=" + paisOrigen + "]";
	}
	
	
	
}
