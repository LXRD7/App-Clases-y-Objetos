//Esta clase es la abstracción de un rectangulo.
package vista;

public class Rectangulo {
	private float base;
	private float altura;
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getArea() {
		return base*altura;
	}
}
