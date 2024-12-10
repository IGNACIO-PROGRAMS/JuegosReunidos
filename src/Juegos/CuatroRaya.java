package Juegos;
import tools.Tablero;

public class CuatroRaya {

	private Tablero tablero;
	public boolean Vjug = false;
	
	public void compruebaVictoria(int a, int b) {
		char Ini=this.tablero.leerCelda(a,b);
		
		// COMPRUEBO VERTICALMENTE
		if (a>=0 && a<=2) { 
			if (this.tablero.leerCelda((a+1),b)==Ini) {
				if (this.tablero.leerCelda((a+2),b)==Ini) {
					if (this.tablero.leerCelda((a+3),b)==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a<=5 && a>=3) { 
			if (this.tablero.leerCelda((a-1),b)==Ini) {
				if (this.tablero.leerCelda((a-2),b)==Ini) {
					if (this.tablero.leerCelda((a-3),b)==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a<=4 && a>=2) { 
			if (this.tablero.leerCelda((a+1),b)==Ini) {
				if (this.tablero.leerCelda((a-1),b)==Ini) {
					if (this.tablero.leerCelda((a-2),b)==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a<=3 && a>=1) { 
			if (this.tablero.leerCelda((a-1),b)==Ini) {
				if (this.tablero.leerCelda((a+1),b)==Ini) {
					if (this.tablero.leerCelda((a+2),b)==Ini) {
						Victoria = true;
					}
				}
			}
		}
		
		// COMPRUEBO HORIZONTALMENTE
		if (b<=3) { 
			if (this.tablero.leerCelda(a,(b+1))==Ini) {
				if (this.tablero.leerCelda(a,(b+2))==Ini) {
					if (this.tablero.leerCelda(a,(b+3))==Ini) {
						Victoria = true;
					}
				}
			}
		} 
		if (b>=3) { 
			if (this.tablero.leerCelda(a,(b-1))==Ini) {
				if (this.tablero.leerCelda(a,(b-2))==Ini) {
					if (this.tablero.leerCelda(a,(b-3))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (b>=1 && b<=4) { 
			if (this.tablero.leerCelda(a,(b-1))==Ini) {
				if (this.tablero.leerCelda(a,(b+1))==Ini) {
					if (this.tablero.leerCelda(a,(b+2))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (b<=5 && b>=2) { 
			if (this.tablero.leerCelda(a,(b+1))==Ini) {
				if (this.tablero.leerCelda(a,(b-1))==Ini) {
					if (this.tablero.leerCelda(a,(b-2))==Ini) {
						Victoria = true;
					}
				}
			}
		}	
		
		// COMPRUEBO DIAGONAL 1
		if (a>=0 && a<=2 && b>=0 && b<=3) { 
			if (this.tablero.leerCelda((a+1),(b+1))==Ini) {
				if (this.tablero.leerCelda((a+2),(b+2))==Ini) {
					if (this.tablero.leerCelda((a+3),(b+3))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a>=1 && a<=3 && b>=1 && b<=4) { 
			if (this.tablero.leerCelda((a-1),(b-1))==Ini) {
				if (this.tablero.leerCelda((a+1),(b+1))==Ini) {
					if (this.tablero.leerCelda((a+2),(b+2))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a>=2 && a<=4 && b>=2 && b<=5) { 
			if (this.tablero.leerCelda((a+1),(b+1))==Ini) {
				if (this.tablero.leerCelda((a-1),(b-1))==Ini) {
					if (this.tablero.leerCelda((a-2),(b-2))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a>=3 && a<=5 && b>=3 && b<=6) { 
			if (this.tablero.leerCelda((a-1),(b-1))==Ini) {
				if (this.tablero.leerCelda((a-2),(b-2))==Ini) {
					if (this.tablero.leerCelda((a-3),(b-3))==Ini) {
						Victoria = true;
					}
				}
			}
		}	
		
		// COMPRUEBO DIAGONAL 2	
		if (a>=3 && a<=5 && b>=0 && b<=3) { 
			if (this.tablero.leerCelda((a-1),(b+1))==Ini) {
				if (this.tablero.leerCelda((a-2),(b+2))==Ini) {
					if (this.tablero.leerCelda((a-3),(b+3))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a>=2 && a<=4 && b>=1 && b<=4) { 
			if (this.tablero.leerCelda((a+1),(b-1))==Ini) {
				if (this.tablero.leerCelda((a-1),(b+1))==Ini) {
					if (this.tablero.leerCelda((a-2),(b+2))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a>=1 && a<=3 && b>=2 && b<=5) { 
			if (this.tablero.leerCelda((a-1),(b+1))==Ini) {
				if (this.tablero.leerCelda((a+1),(b-1))==Ini) {
					if (this.tablero.leerCelda((a+2),(b-2))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		if (a>=0 && a<=2 && b>=3 && b<=6) { 
			if (this.tablero.leerCelda((a+1),(b-1))==Ini) {
				if (this.tablero.leerCelda((a+2),(b-2))==Ini) {
					if (this.tablero.leerCelda((a+3),(b-3))==Ini) {
						Victoria = true;
					}
				}
			}
		}
		
	if (Victoria) {		if (Ini=='X') {Vjug = true;	}}
	
	} 
	
	public void resuelveMovimiento(int columna) {  	
		int a;
		int b;
		for(int j=this.tablero.getNumFilas()-1; j>=0; j--) {  //COLOCA FICHA EN LA COLUMNA ELEGIDA EN EL HUECO MAS BAJO
			if (this.tablero.leerCelda(j,columna)==' ') {
				this.tablero.marcarCelda(j,columna, 'X'); a=j; b=columna;
				j=-20;  //Pongo esto porque me apetece hacerlo asi, si pone ficha le doy valor a j para que salga del for sin crear otras variables de salida o lo que sea.
				compruebaVictoria(a,b);													//Comprueba si has ganado
			}			
		}
		
		if (!Victoria) 		{													//Si no has ganado, juega la IA
		
		//COLOCA LA "IA" -----------------------------------------------------------------------------------------------------
		int IAcolumna = (int) (Math.random()*this.tablero.getNumColumnas());
		do {
		IAcolumna = (int) (Math.random()*this.tablero.getNumColumnas());		
		} while (this.tablero.leerCelda(0,(IAcolumna))!=' ');					//Si la columna esta llena elige otra
		
		System.out.println("La IA elige : "+(IAcolumna+1));
		
		for(int j=this.tablero.getNumFilas()-1; j>=0; j--) {  //COLOCA FICHA EN LA COLUMNA ELEGIDA EN EL HUECO MAS BAJO
			if (this.tablero.leerCelda(j,(IAcolumna))==' ') {
				this.tablero.marcarCelda(j,(IAcolumna), '0'); a=j; b=IAcolumna; 
				j=-20;
				compruebaVictoria(a,b);													//Comprueba si ha ganado la IA
			}			
		}	
		
							}
		
	};	//CIERRA resuelveMovimiento
		
		public CuatroRaya() {	tablero=new Tablero(6,7,true);	}     //Las dimensiones oficiales segun google
		public Boolean Victoria = false;
		
		public void jugar() {
			
			// 1 . INICIALIZAR			
			// 2 . BUCLE JUGAR
			do {			
				this.tablero.mostrarTableroVertical();											// Pintar el tablero									
				do {
					this.tablero.leeMovimientoVertical();										// Pide columna
					if (this.tablero.leerCelda(0,this.tablero.getColumna())!=' ') {System.out.print("Columna llena. Elige otra.");}
					} while (this.tablero.leerCelda(0,this.tablero.getColumna())!=' ');			// Si esta llena repite Pide columna
				
						
				resuelveMovimiento(this.tablero.getColumna());									// Coloca ficha segun las reglas del juego (y la IA tambien) 		
				
						
			} while ((!this.tablero.isFull()) && (!Victoria));											// Comprobar si el tablero esta lleno
			
			// 3 . PRESENTAR RESULTADOS
			if (this.tablero.isFull()) {												// Si el tablero esta lleno es empate.
				this.tablero.mostrarTableroVertical();
				System.out.println("Empate.");}
			else {
			this.tablero.mostrarTableroVertical();
			if (!Vjug) {		System.out.println("Perdiste.");	}
			else {	System.out.println("Ganaste.");	}
			}
		} // CIERRA JUGAR
		
} // CIERRA CLASS
