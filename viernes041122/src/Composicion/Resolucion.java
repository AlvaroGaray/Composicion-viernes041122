package Composicion;

public class Resolucion {

	private int altura;
	private int anchura;
	
	public Resolucion(int altura, int anchura) {
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public int mostrarAltura() {
		return altura;
	}
	public void cambiarAltura(int altura) {
		this.altura = altura;
	}
	public int mostrarAnchura() {
		return anchura;
	}
	public void cambiarAnchura(int anchura) {
		this.anchura = anchura;
	}
	
	
}
