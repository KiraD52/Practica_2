
package practica_2;

public class Calculadora implements ICalculadora{
     int x1,y1;

    public int Suma(int x, int y){
        return(x+y);
    }
    public int Resta(int x, int y){
        return(x-y);
    }
 public Calculadora(int x, int y){
     this.x1=x;
     this.y1=y;
 }
    @Override
    public int Division(int x, int y){
        return (x/y);
    }
    @Override
    public int Multiplicacion(int x, int y){
        return (x*y);
    }
    
}
