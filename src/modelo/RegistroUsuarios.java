package modelo;

public class RegistroUsuarios {
	private Alumno[] contenedor;
	private int capacidad;
	private int contador;
	
	public RegistroUsuarios() {
		this(100);
	}
	
	public RegistroUsuarios(int capacidad) {
		super();
		this.capacidad=capacidad;
		contador = 0;
		contenedor = new Alumno[capacidad];
	}
	
	public boolean estaLleno() {
		return(contador==capacidad);
	}
	
	public boolean estaVacio() {
		return(contador==0);
	}
	
	public void agregar(Alumno alumno) {
		contenedor[contador]=alumno;
		contador++;
	}
	
	public void moverUsuarios(Alumno[] contenedor) {
		for (Alumno alumno : contenedor) {
			agregar(alumno);
		}
	}
	
	public boolean existe(int posicion) {
		return posicion<contador;
	}
	
	public int buscarPosicion(String numeroControl) {
		for (int i=0;i<contador;i++) {
			if (contenedor[i].getNumeroControl().equals(numeroControl)) {
				return i;
			}
		}
		return contador;
	}
	
	public Alumno getUsuario(int posicion) {
		return contenedor[posicion];
	}
	
	public void eliminarUsuario(int posicion) {
		for (int i = posicion; i <= contador; i++) {
			contenedor[i] = contenedor[i+1];
		}
		contador--;
	}
	
	public void modificarUsuario(Alumno alumno) {
		int posicion = buscarPosicion(alumno.getNumeroControl());
		contenedor[posicion] = alumno;
	}

	@Override
	public String toString() {
		String salida = "Los contenedor del estante son\n";
		for (int i = 0; i < contador; i++) {
			salida+=contenedor[i];
		}
		return salida;
	}
}
