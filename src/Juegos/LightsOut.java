package Juegos;
import tools.Tablero;
public class LightsOut {

// MIS FUNCIONES	
	public void TableroAleatorio() {		
		double aleatorio = Math.random();
		for (int i=0;i<this.tablero.getNumFilas();i++) {
			for (int j=0;j<this.tablero.getNumColumnas();j++) 	{	
				aleatorio = Math.random();
				if (aleatorio>=0 & aleatorio<=0.5) {this.tablero.marcarCelda(i, j, 'X');}
				else if (aleatorio>0.5 & aleatorio<=1.0) {this.tablero.marcarCelda(i, j, ' ');}
								
				}
		}
				
	};
	
	public void resuelveMovimiento(int fila, int columna) {	
		if (this.tablero.leerCelda(fila, columna)=='X') {this.tablero.marcarCelda(fila, columna, ' ');}
		else if (this.tablero.leerCelda(fila, columna)==' ') {this.tablero.marcarCelda(fila, columna, 'X');}
		//ARRIBA
		if ((fila-1)>=0) {
			if (this.tablero.leerCelda(fila-1, columna)=='X') {this.tablero.marcarCelda(fila-1, columna, ' ');}
			else if (this.tablero.leerCelda(fila-1, columna)==' ') {this.tablero.marcarCelda(fila-1, columna, 'X');}
		}
		//ABAJO
		if ((fila+2)<=this.tablero.getNumFilas()) {
			if (this.tablero.leerCelda(fila+1, columna)=='X') {this.tablero.marcarCelda(fila+1, columna, ' ');}
			else if (this.tablero.leerCelda(fila+1, columna)==' ') {this.tablero.marcarCelda(fila+1, columna, 'X');}
		}
		//IZQUIERDA
		if ((columna-1)>=0) {
			if (this.tablero.leerCelda(fila, columna-1)=='X') {this.tablero.marcarCelda(fila, columna-1, ' ');}
			else if (this.tablero.leerCelda(fila, columna-1)==' ') {this.tablero.marcarCelda(fila, columna-1, 'X');}
		}
		//DERECHA
		if ((columna+2)<=this.tablero.getNumColumnas()) {
			if (this.tablero.leerCelda(fila, columna+1)=='X') {this.tablero.marcarCelda(fila, columna+1, ' ');}
			else if (this.tablero.leerCelda(fila, columna+1)==' ') {this.tablero.marcarCelda(fila, columna+1, 'X');}
		}
	};	
	
	
	
// EJ MAS MENOS SEGUN RAMON -------------------------------------------------------------------------------------------
	private int movimientos;
	private Tablero tablero;
	
	public LightsOut() {
		tablero=new Tablero(5,5,true);
		this.movimientos=0;		
	}
	
	public int getMovimientos() {
		return this.movimientos;		
	}
	
	public void setMovimientos(int movimientos) {
		this.movimientos=movimientos;

	}
	
	public void jugar() {
		
		// 1 . INICIALIZAR
		// 2 . ELEGIR NIVEL
		/*
		this.tablero.marcarCelda(2, 0, 'X');
		this.tablero.marcarCelda(2, 2, 'X');
		this.tablero.marcarCelda(2, 4, 'X');
		*/
		TableroAleatorio();
		// 3 . BUCLE JUGAR
		do {			
			this.tablero.mostrarTablero();											// Pintar el tablero			
			this.tablero.leeMovimiento();											// Pedir el movimiento (celda a pulsar)			
			resuelveMovimiento(this.tablero.getFila(),this.tablero.getColumna());	// Activar / desactivar las luces segun las reglas del juego			
			this.movimientos++;														// Actualizar los movimientos			
		} while (!this.tablero.isEmpty());											// Comprovar si hemos terminado
		// 4 . PRESENTAR RESULTADOS
		System.out.println("Tu puntuacion es : "+this.movimientos+" movimientos.");
	}

}
