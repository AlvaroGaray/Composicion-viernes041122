package Composicion;

public class Case {

	private String modelo;
	private String fabricante;
	private String fuenteDePoder;
	private Dimensiones dimensiones;   // <-- ESTO ES COMPOSICION
	public Case(String modelo, String fabricante, String fuenteDePoder, Dimensiones dimensiones) {
		
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.fuenteDePoder = fuenteDePoder;
		this.dimensiones = dimensiones;
	}
	
	public void presionarBotonEncendido() {
		System.out.println("Boton de Encendido presionado");
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
	public String mostrarFuenteDePoder() {
		return fuenteDePoder;
	}
	public void cambiarFuenteDePoder(String fuenteDePoder) {
		this.fuenteDePoder = fuenteDePoder;
	}
	public Dimensiones mostrarDimensiones() {
		return dimensiones;
	}
	public void cambiarDimensiones(Dimensiones dimensiones) {
		this.dimensiones = dimensiones;
	}
	
	
	
	
	
}

