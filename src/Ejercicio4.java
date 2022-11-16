
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int row; //Numero de Filas
        int column; // Numero de Columnas
        int m[][]; // La Matriz
        int res = 0;
        int mod = 0;
        int sumaImpar = 0;
        int sumaPar = 0;
        int posNum=0;
        int negNum=0;
        double prom=0, sum=0;



        Scanner num=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);

        System.out.println("Ingresa el Numero Filas:");
        row=num.nextInt();
        System.out.println("Ingresa el Numero Columnas:");
        column=num2.nextInt();

        m=new int[row][column];

        //Ingresar Elementos de la Matriz
        for(int f=0;f<row;f++){
            for (int c=0;c<column; c++){
                System.out.println("Ingresa los Elementos de la matriz:");
                m[f][c]= num.nextInt();
            }
        }
        //Imprimimos elementos de la Matriz
        for(int f=0;f<m.length;f++){
            for (int c=0;c<m[f].length;c++){
                System.out.print((m[f][c]) + " ");
            }
            System.out.println("\n");
        }
        //Sumatoria
        for(int f=0;f<row;f++){
            for (int c=0;c<column; c++){
                res = m[f][c];
                if (res > 0)
                {
                    mod = res % 2;
                    if ((mod == 1))
                       sumaImpar = sumaImpar + res;
                    else
                        sumaPar = sumaPar + res;
                }
            }
            System.out.println("\n");
        }
        ///Positivo / Negativo
        for(int f=0;f<row;f++){
            for (int c=0;c<column; c++){
                res = m[f][c];
                if (res > 0)
                    posNum++;
                else
                    negNum++;

            }
            System.out.println("\n");
        }
        //Promedio por Fila
        for(int f=0;f<m.length;f++){
            for (int c=0;c<m[f].length;c++){
                sum+=m[f][c];
            }
            prom=sum/m[f].length;
            System.out.println("Promedio por Fila: \t" + (f+1) + " = " +prom);
            sum=0;
        }
        //Promedio por Columna
        for(int f=0;f<m.length;f++){
            for (int c=0;c<m[f].length;c++){
                sum+=m[c][f];
            }
            prom=sum/m[f].length;
            System.out.println("Promedio por Columna: \t" + (f+1) + " = " +prom);
            sum=0;
        }


        System.out.println("\n");
        System.out.println("LA SUMATORIA IMPAR ES:\t" + sumaImpar + "\n");
        System.out.println("LA SUMATORIA PAR ES:\t" + sumaPar);
        System.out.println("\n");
        System.out.println("Numeros Positivos son:\t" + posNum + "\n");
        System.out.println("Numeros Negativos son:\t" + negNum);


    }
}