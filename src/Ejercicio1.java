import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int vector[]=new int[10];
        int vector2[]=new int[10];
        int res=0;
        int sum=0;
        Scanner num=new Scanner(System.in);

        //Ingresar los Elementos del Vector
        for(int f=0;f<10;f++){
                System.out.println("Ingresa los Elementos del Vector"+(f+1)+":\t");
                vector[f]= num.nextInt();
        }
        //Imprimir los elementos del Vector
        for(int f=0;f<vector.length;f++){
                System.out.print((vector[f]) + "\t ");
            }

        for(int f=0;f<10;f++){
            res=vector[f];
            vector2[f]=res*res;
            sum+=vector2[f];
        }
        System.out.println();

        for(int f=0;f<vector2.length;f++){
            System.out.print(+(vector2[f]) + "\t");
        }

        System.out.println();
        System.out.println("La Sumatoria de los Cuadrados del Vector es:"+sum);
    }

}




