package modelo;

public class Alumno {
	private String numeroControl;
	private String nombre;
	private String paterno;
	private String materno;
	private String genero;
	private byte edad;
	private String telefono;
	private Domicilio domicilio;
	public String getNumeroControl() {
		return numeroControl;
	}
	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	@Override
	public String toString() {
		return "\n[numeroControl=" + numeroControl + ", nombre=" + nombre + ", paterno=" + paterno + ", materno="
				+ materno + ", genero=" + genero + ", edad=" + edad + ", telefono=" + telefono + "\nDomicilio="
				+ domicilio + "]\n";
	}
	
	

}
