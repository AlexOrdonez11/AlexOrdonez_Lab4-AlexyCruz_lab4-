/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4_alex;

/**
 *
 * @author Alex Ordonez
 */
public class mago extends Guerrero {
    private String magia,elemento;

    public mago() {
        super();
    }

    public mago(String magia, String elemento, String nombre, String nacimiento, int edad, double salud, double costo, double ataque) {
        super(nombre, nacimiento, edad, salud, costo, ataque);
        this.magia = magia;
        this.elemento = elemento;
    }

    
    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return super.toString()+" mago(" + "magia=" + magia + ", elemento=" + elemento + ")}";
    }

    @Override
    public void Atacar(jugador juga1, jugador juga2) {
        double salud=juga2.getGuerrero().getSalud()-juga1.getGuerrero().getAtaque()-(juga2.getGuerrero().getAtaque()/2);
        juga2.getGuerrero().setSalud(salud);
    }

    
    
    
}
