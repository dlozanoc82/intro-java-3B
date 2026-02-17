package constantes;

public class PracticaConstante {
    public static void main(String[] args) {
        // VARIABLES
        /*
        * HOLA ESTE ES UNA MANERA
        * DE DEFINIR VARIABLES
        *
        * */
        int age = 10;
        double salary = 10.0;
        String firstName = "Pepito";
        boolean isAdult = age > 20;


        float gravity = 9.8f;
        double time = 9.787;

        age = 20;
        age = 30;
        age = 40;


        if (isAdult){
            System.out.println("es adulto");
        }


        //COSTANTES
        final int CONSTANT = 10;
        final String NOMBRE_EMPRESA = "ITFIP";

        final double TAX_RATE;
        TAX_RATE = 3200;

        // CALCULAR LA PRIMERA NOTA DEL CORTE
        final double PORCENTAJE_PARCIAL = 0.6;
        final double PORCENTAJE_TRABAJOS = 0.4;

        double notaParcial = 3.0;
        double notaTrabajos = 4.0;

        double notaFinal = (PORCENTAJE_PARCIAL*notaParcial) + (PORCENTAJE_TRABAJOS*notaTrabajos);

        System.out.println("notaFinal = " + notaFinal);

    }
}
