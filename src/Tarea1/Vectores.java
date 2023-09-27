
package Tarea1;

import java.util.Collections;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.util.Arrays;

public class Vectores {

    int valores[];
    String mensaje = "";
    int valores1[];
    String mensaje1 = "";

    public void Definir_Vector1() {
        valores = new int[5];

        for (int x = 0; x < 5; x++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite un numero"));

            valores[x] = numero;
        } // Fin del for
        mensaje = "";
        for (int i = 0; i < 5; i++) {
            mensaje += "El valor del vector[" + i + "] =" + valores[i] + "\n";
        } // Fin del for

        JOptionPane.showMessageDialog(null, mensaje);
    }// Fin del metodo para mostrar el orden original y llenar vector

    public void Definir_Vector2() {
        valores1 = new int[5];
        int x = 0;

        for (int x = 0; x < 5; x++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite un numero"));

            valores1[x] = numero;
        }
        mensaje = "";
        for (int i = 0; i < 5; i++) {
            mensaje += "El valor del vector[" + i + "] =" + valores1[i] + "\n";
        } // Fin del for

        JOptionPane.showMessageDialog(null, mensaje);
    }// Fin del metodo para mostrar el orden original y llenar vector2

    public void juntarmatrices() {
        int[] combinedArray = Arrays.copyOf(valores, valores.length + valores1.length);

        System.arraycopy(valores, 0, combinedArray, 0, valores.length);
        System.arraycopy(valores1, 0, combinedArray, valores1.length, valores1.length);

        Arrays.sort(combinedArray);
        JOptionPane.showMessageDialog(null, Arrays.toString(combinedArray));

    }// fin del metodo unir matrices

}// fin de la clase
