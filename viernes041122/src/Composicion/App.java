package Composicion;

public class App {

	public static void main(String[] args) {

		Dimensiones dimensiones = new Dimensiones(20,20,5);
		Case cajon= new Case("220B", "Dell", "460", dimensiones);
		Monitor monitor= new Monitor("Lenovo", "LenovoS", 33, new Resolucion(2540,1440));
		TarjetaMadre tarjetamadre = new TarjetaMadre("nj-200", "Asus", 4, 6, "v2.44");
		
		Computadora pc = new Computadora(cajon, monitor, tarjetamadre);
		pc.mostrarMonitor().dibujarPixelEn(1500, 1200, "Rojo");
		pc.mostrarTarjetamadre().cargarPrograma("Linux xD");
		pc.mostrarElcase().presionarBotonEncendido();
			
				
	}

}
