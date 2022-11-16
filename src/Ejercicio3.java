import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();
        Scanner num=new Scanner(System.in);
        int mayor=0;
        int menor=0;
        int res=0;

        //Ingresar los Elementos del Pila
        for(int f=0;f<10;f++){
            System.out.println("Ingresa los Elementos de la Pila :[ "+(f+1)+" ]");
            pila.push(num.nextInt());
        }
        //Imprimir los Elementos de la Pila Completa
            System.out.println(pila);

        mayor=pila.elementAt(0);
        menor=pila.elementAt(0);
        for(int f=0;f<pila.toArray().length;f++){
            if (pila.elementAt(f)>mayor) {
                mayor = pila.elementAt(f);
            }
            if(pila.elementAt(f)<menor){
                menor=pila.elementAt(f);
            }
        }
        System.out.println("El elemento Mayor de la Pila es :[ "+mayor+" ]");
        System.out.println("El elemento Menor de la Pila es :[ "+menor+" ]");
    }

}


