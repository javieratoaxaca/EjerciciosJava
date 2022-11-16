import java.util.Scanner;
import java.util.Stack;

public class Ejercicio5 {
    public static void main(String[] args) {

        Stack<Integer> pilaOri = new Stack<Integer>();
        Stack<Integer> pilaCop = new Stack<Integer>();

        Scanner num = new Scanner(System.in);

        int res = 0;
        int cont = 0;


        //Ingresar los Elementos del Pila
        for (int f = 0; f < 10; f++) {
            System.out.println("Ingresa los Elementos de la Pila :[ " + (f + 1) + " ]");
            pilaOri.push(num.nextInt());
        }

        //Saber si el Elemento de la Pila es Primo
        for (int f = 0; f < pilaOri.toArray().length; f++) {
            res = pilaOri.elementAt(f);
            boolean esPrimo = numPrimo(res);
            System.out.println("El elemento de la Pila: P[" + f + "]= " + "[" + res + "]" + " Es Primo?\t" + esPrimo);
        }


        //Sustituir la Pila Original con la Pila Modificada
        for (int f = 0; f < pilaOri.toArray().length; f++) {
            res = pilaOri.elementAt(f);
            if (res < 0) {
                pilaCop.push(0);
            }
            if (res > 0) {
                pilaCop.push(9);
                ;
            }
        }
            //Imprimir los Elementos de la Pila Completa
            System.out.println("Pila Original" + pilaOri);
            System.out.println("Pila Modificada" + pilaCop);
    }


    //Metodo para saber si es Primo un Numero
    public static boolean numPrimo(int numero) {
        boolean esPrimo = false;
        int numDiv = 0;
        int numDivPrimo = 2;

        for (int i = 1; i <= numero; i++)
            if (numero % i == 0)
                numDiv++;

        if (numDiv == numDivPrimo)
            esPrimo = true;

        return esPrimo;
    }
}

