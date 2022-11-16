import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int m[][]=new int[2][3]; // La Matriz
        int res=0;
        int sum=0;
        Scanner num=new Scanner(System.in);
        //Ingresar Elementos de la Matriz
        for(int f=0;f<2;f++){
            for (int c=0;c<3; c++){
                System.out.println("Ingresa los Elementos de la matriz: m[Fila "+(f+1)+"][Columna 1"+(c+1)+"]");
                m[f][c]= num.nextInt();
            }
        }
        System.out.println("Los Elementos de la Matriz: ");
        //Imprimimos elementos de la Matriz
        for(int f=0;f<m.length;f++){
            for (int c=0;c<m[f].length;c++){
                System.out.print((m[f][c]) + " ");
            }
            System.out.println("\n");
        }
        for(int f=0;f<2;f++){
            for (int c=0;c<3; c++){
                res=m[f][c];
                boolean esPrimo = numPrimo(res);
                if (esPrimo==true)
                    System.out.println("El elemento de la matriz: m["+(f+1)+"]["+(c+1)+"]= "+"["+res+"]"+" Es Primo \t");
                else
                    System.out.println("El elemento de la matriz: m["+(f+1)+"]["+(c+1)+"]= "+"["+res+"]"+" No es Primo \t");
            }
            System.out.println("\n");
        }
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

