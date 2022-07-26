package co.com.maderojesus2198.modelo;

public class casilla {
     //atributos
     public Integer fila;
     public Character columna;
     public ficha ocupadapor;
     public color color;

    //constructores
       public casilla(Integer fila, Character columna, co.com.maderojesus2198.modelo.color color) {
      this.fila = fila;
      this.columna = columna;
      this.color = color;

      
    }

    public casilla(Integer fila, Character columna) {
        this.fila = fila;
        this.columna = columna;
        var columnas = "abcdefgh";
        this.color = ((fila+columnas.indexOf(columna))%2==0 ? color.NEGRO: color.BLANCO);
      }

    //metodos
    public Boolean estaocupada(){
      //TODO:  pendiente implementar esta ocupada
      return false;
    }

    
}
