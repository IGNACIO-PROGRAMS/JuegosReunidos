package Juegos;
import tools.*;


public class AppMain {
	
	public AppMain() {	} 
	
	public static void main(String[] args) {
		System.out.println("Iniciando Aplicacion");
		
		String[] op_juegos = {"LightsOut","CuatroRaya","TreasureHunt"};
		Menu menuJuegos = new Menu("JUEGOS REUNIDOS: Opciones disponibles: ",op_juegos);
		
		menuJuegos.mostrar();
		int opcElegida = menuJuegos.seleccionaOpc();
		
		switch(opcElegida) {  // abre switch
			case 1:
				System.out.println("");
				LightsOut lo = new LightsOut();
				lo.jugar();
				break;
			case 2:
				System.out.println("");
				CuatroRaya cr = new CuatroRaya();		
				cr.jugar();
				break;
			case 3:
				System.out.println("");
				System.out.println("Opcion : "+opcElegida + " no implementada.");
				break;			
			case 0:
				System.out.println("");
				System.out.println("Opcion : "+opcElegida + " no implementada.");
				break;	
		}  // cierra switch		
		
		System.out.println("Aplicacion Terminada");
		
	} // main

} // class


