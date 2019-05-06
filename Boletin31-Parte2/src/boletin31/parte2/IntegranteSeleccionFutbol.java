/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31.parte2;

/**
 *
 * @author ifernandezblanco
 */
public interface IntegranteSeleccionFutbol {
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    
    default void entrevista(){
        System.out.println("ENtrevista");
        
    }
    default void videoPublicitario(){
        System.out.println("Publicidad");
    }
}
