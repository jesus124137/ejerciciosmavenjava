package co.com.maderojesus2198;

import co.com.maderojesus2198.modelo.casilla;
import co.com.maderojesus2198.modelo.color;
import co.com.maderojesus2198.modelo.jugador;
import co.com.maderojesus2198.modelo.tablero;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var jesus = new jugador("jesus madero", color.BLANCO);
        
        var javier = new jugador("javier merchan",color.NEGRO);
        
        var juego = new tablero(jesus, javier);
        
    }
}
