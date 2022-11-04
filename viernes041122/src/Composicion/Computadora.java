package Composicion;

public class Computadora {

	private Case elcase;
	private Monitor monitor;
	private TarjetaMadre tarjetamadre;
	public Computadora(Case elcase, Monitor monitor, TarjetaMadre tarjetamadre) {
		this.elcase = elcase;
		this.monitor = monitor;
		this.tarjetamadre = tarjetamadre;
		
		
	
	}
	public Case mostrarElcase() {
		return elcase;
	}
	public void cambiarElcase(Case elcase) {
		this.elcase = elcase;
	}
	public Monitor mostrarMonitor() {
		return monitor;
	}
	public void cambiarMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public TarjetaMadre mostrarTarjetamadre() {
		return tarjetamadre;
	}
	public void cambiarTarjetamadre(TarjetaMadre tarjetamadre) {
		this.tarjetamadre = tarjetamadre;
	}
	
	
	
	
	
}
