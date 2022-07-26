package co.com.maderojesus2198.modelo;

public class tablero {
    //atributos
    public jugador jugador1;
    public jugador jugador2;
    public casilla[][] casillas;
    
    //constructores
    public tablero(jugador jugador1,jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;

        inicializarcasillas();
        posicionarfichas();
    }

    private void posicionarfichas() {
        casillas[0][0].ocupadapor = new torre();
        casillas[0][0].ocupadapor.color = color.BLANCO;
    }

    //metodos
    private void inicializarcasillas(){
        casillas = new casilla[8][8];
        for (int fila =0; fila < 8; fila++){
            for (int columna =0; columna < 8; columna++){
                casillas[fila][columna] = new casilla(fila + 1,letracolumna(columna), colorcasilla(fila, columna));
            }
        }
    }
    private color colorcasilla(Integer fila, Integer columna){
        return (fila+columna)%2==0? color.NEGRO: color.BLANCO;
    }
    private Character letracolumna(Integer columna){
        switch(columna){
            case 0:
            return 'a';
            case 1:
            return 'b';
            case 2:
            return 'c';
            case 3:
            return 'd';
            case 4:
            return 'e';
            case 5:
            return 'f';
            case 6:
            return 'g';
            case 7:
            default:
            return 'h';
            
        }

    }
    public void enroque(){
        // TODO: pendiente implementar enroque
    }

    public void jaque (){
        // TODO: pendiente implementar jaque
    }

    public void jaquemate(){
        // TODO: pendiente implementar jaque mate
    }

}
