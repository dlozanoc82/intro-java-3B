package flujos;

import java.util.Scanner;

public class Flujo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int age = 18;
        boolean isAdult = age > 19;

        if(isAdult){
            System.out.println("Es mayor de edad ");
        } else if (age < 1) {
            System.out.println("Edad no valida");
        } else {
            System.out.println("Es menor de edad");
        }


        int estrato = 1;
        int kvh = 0;

        switch (estrato){
            case 1:
                System.out.println("Lunes");
                kvh = 200;
                break;
            case 2:
                System.out.println("Martes");
                kvh = 250;
                break;
            default:
                System.out.println("Este dia no existe");
        }
        */


        //FOR
        final int MAX_ITERATIONS = 10;
        System.out.println("Señor usuario escriba el numero de la tabla que quiere ver");
        int table = sc.nextInt();
        for (int numeroActual = 0; numeroActual < MAX_ITERATIONS; numeroActual++) {
            System.out.println(numeroActual + "*" + table + "=" + (numeroActual*table));
        }


    }
}
