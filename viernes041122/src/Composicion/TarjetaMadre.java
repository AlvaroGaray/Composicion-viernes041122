package Composicion;

public class TarjetaMadre {

	private String modelo;
	private String fabricante;
	private int bancosMemoria;
	private int bancoExpansion;
	private String nombreBios;
	
	
	public TarjetaMadre(String modelo, String fabricante, int bancosMemoria, int bancoExpansion,
			String nombreBios) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.bancosMemoria = bancosMemoria;
		this.bancoExpansion = bancoExpansion;
		this.nombreBios = nombreBios;
	}
	
	public void cargarPrograma(String programa) {
		System.out.println("El programa "+ programa+ " Esta cargando...");
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

	public int mostrarBancosMemoria() {
		return bancosMemoria;
	}

	public void cambiarBancosMemoria(int bancosMemoria) {
		this.bancosMemoria = bancosMemoria;
	}

	public int mostrarBancoExpansion() {
		return bancoExpansion;
	}

	public void cambiarBancoExpansion(int bancoExpansion) {
		this.bancoExpansion = bancoExpansion;
	}

	public String mostrarNombreBios() {
		return nombreBios;
	}

	public void cambiarNombreBios(String nombreBios) {
		this.nombreBios = nombreBios;
	}
	
	
	
	
	
		
		
}