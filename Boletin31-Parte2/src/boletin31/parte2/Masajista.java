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
public class Masajista extends SeleccionFutbol {
    String formacion;
    int aniosExp;

    public Masajista() {
    }

    public Masajista(String formacion, int aniosExp, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.formacion = formacion;
        this.aniosExp = aniosExp;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getApelidos() {
        return apelidos;
    }

    @Override
    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    @Override
    public int getEdade() {
        return edade;
    }

    @Override
    public void setEdade(int edade) {
        this.edade = edade;
    }
public void darMasaje(){
    
}
    @Override
    public void concentrarse() {
        
    }

    @Override
    public void viajar() {
        
    }

    @Override
    public void entrenar() {
        
    }

    @Override
    public void jugarPartido() {
        
    }

    @Override
    public String toString() {
        return super.toString() + "Masajista{" + "formacion=" + formacion + ", aniosExp=" + aniosExp + '}';
    }
    
    
}
