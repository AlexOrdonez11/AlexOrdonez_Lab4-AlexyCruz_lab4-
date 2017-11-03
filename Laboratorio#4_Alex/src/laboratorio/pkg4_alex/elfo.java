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
public class elfo extends Guerrero{
    private String arma,rango;

    public elfo() {
        super();
    }

    public elfo(String arma, String rango, String nombre, String nacimiento, int edad, int salud, int costo, int ataque) {
        super(nombre, nacimiento, edad, salud, costo, ataque);
        this.arma = arma;
        this.rango = rango;
    }

    

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString()+" elfo{" + "arma=" + arma + ", rango=" + rango + "}}";
    }
    @Override
    public void Atacar(jugador juga1, jugador juga2) {
        double salud=juga2.getGuerrero().getSalud()-juga1.getGuerrero().getAtaque();
        juga2.getGuerrero().setSalud(salud);
    }
    
}
