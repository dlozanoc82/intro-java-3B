package JOptionPane;
import javax.swing.*;

public class JOption {
    public static void main(String[] args) {
        /* MENSAJES
        JOptionPane.showMessageDialog(null, "Bienvenido señor usuario");
        JOptionPane.showMessageDialog(null, "Hola soy un mensaje");


        //PEDIR DATOS
        String name = JOptionPane.showInputDialog("Ingrese el nombre");
        String apellidos = JOptionPane.showInputDialog("Escriba el apellido");
        System.out.println("name = " + name);
        System.out.println("apellidos = " + apellidos);

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));

        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la temperatura"));

        int suma = numero1 + numero2;
        System.out.println("suma = " + suma);
*/

        //OPCIONES
        int opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar otro usuario ?");
        System.out.println("opcion = " + opcion);

    }
}
