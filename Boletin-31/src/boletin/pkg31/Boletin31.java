
package boletin.pkg31;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin31 {

    public static void main(String[] args) {
       ArrayList<SeleccionFutbol>lista = new ArrayList<>();
       SeleccionFutbol futbolista = new Futbolista(9,"Delantero",1234,"Jose","Perez Duarte", 18);
       SeleccionFutbol entrenador = new Entrenador(12,4321,"Antonio","Vazquez", 50);
       SeleccionFutbol masajista = new Masajista("MAsajista de pelo", 10,2341,"Mariano", "Revirado", 40);
       
       futbolista.concentrarse();
       entrenador.concentrarse();
       masajista.concentrarse();
       
       lista.add(futbolista);
       lista.add(entrenador);
       lista.add(masajista);
       
       for(SeleccionFutbol futbol: lista){
           JOptionPane.showMessageDialog(null, futbol);
       }
    }
    
}
