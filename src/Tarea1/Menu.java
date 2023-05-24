
package Tarea1;
import javax.swing.JOptionPane;

public class Menu {
    private Vectores gestion;
    public Menu() {
        this.gestion = new Vectores();
    }

    public void MostrarMenu() {
        String opcionMenu = "Manejo de vector númerico\n";
        opcionMenu += "A.Llenar la primera matriz \n";
        opcionMenu += "B.Llenar la segunda matriz\n";
        opcionMenu += "C.Juntar y ordenar Matrices\n";
        opcionMenu += "D.Salir\n";
        String dato = "";

        do {
            dato = JOptionPane.showInputDialog(opcionMenu);

            switch (dato) {

                case "A":
                    this.gestion.Definir_Vector1();
                    break;
                case "B":
                    this.gestion.Definir_Vector2();
                    break;
                case "C":this.gestion.juntarmatrices();
                    break;
                case "D":
                    JOptionPane.showMessageDialog(null, "Fin del programa");
                    break;
            }

        } while (!dato.equals("D"));
   }
}
