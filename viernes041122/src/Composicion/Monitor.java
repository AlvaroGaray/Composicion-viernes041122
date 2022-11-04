package Composicion;

public class Monitor {

	private String modelo;
	private String fabricante;
	private int tamanio;
	private Resolucion resolucionNativa;  			// <-- ESTO ES COMPOSICION
	
	public Monitor(String modelo, String fabricante, int tamanio, Resolucion resolucionNativa) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.tamanio = tamanio;
		this.resolucionNativa = resolucionNativa;
	}

	public void dibujarPixelEn(int x, int y, String color) {
		System.out.println("Dibujando pixel en "+x+" , "+y+" En color "+ color);
		
	}
	
	
	public String mostrarModelo() {
		return modelo;
	}

	public void cambiarModelo(String modelo) {
		this.modelo = modelo;
	}

	public String mostrarFabricante() {
		return fabricante;
	}

	public void cambiarFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int mostrarTamanio() {
		return tamanio;
	}

	public void cambiarTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Resolucion mostrarResolucionNativa() {
		return resolucionNativa;
	}

	public void mostrarResolucionNativa(Resolucion resolucionNativa) {
		this.resolucionNativa = resolucionNativa;
	} 
	
	
	
	
}
