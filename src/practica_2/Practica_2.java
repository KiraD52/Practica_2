
package practica_2;
import java.util.*;

public class Practica_2 {

    
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner leer = new Scanner(System.in);
        Calculadora O = new Calculadora(a,b){};
        System.out.print("Introducir primer valor: ");
        a = leer.nextInt();
        System.out.print("\nIntroducir segundo valor: ");
        b = leer.nextInt();
       int opc;
        System.out.print("\n----------Menu----------\n1)Suma\n2)Resta\n3)Division\n4)Multiplicacion\nLa opcion es: ");
        opc = leer.nextInt();
        switch(opc){
            case 1: System.out.print("\nSuma: "+O.Suma(b, b)+"\n");
                    break;
            case 2: System.out.print("\nResta: "+O.Resta(b, b)+"\n");
                    break;
            case 3: System.out.print("\nDivision: "+O.Division(b, b)+"+\n");
                    break;
            case 4: System.out.print("\nMultiplicacion: "+O.Multiplicacion(b, b)+"\n");
                    break;
        }
    }
    
}
