package modelo;

public class Domicilio {
	private int numeroCasa;
	private String calle;
	private String colonia;
	private String ciudad;
	private String estado;
	private String codigoPostal;
	private String pais;
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Domicilio [numeroCasa=" + numeroCasa + ", calle=" + calle + ", colonia=" + colonia + ", ciudad="
				+ ciudad + ", estado=" + estado + ", codigoPostal=" + codigoPostal + ", pais=" + pais + "]";
	}
	
	
	
}
