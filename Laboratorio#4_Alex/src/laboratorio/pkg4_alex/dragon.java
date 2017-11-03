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
public class dragon extends Guerrero{
    private String color,raza;

    public dragon() {
    }

    public dragon(String color, String raza, String nombre, String nacimiento, int edad, int salud, int costo, int ataque) {
        super(nombre, nacimiento, edad, salud, costo, ataque);
        this.color = color;
        this.raza = raza;
    }

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString()+" dragon{" + "color=" + color + ", raza=" + raza + "}}";
    }
    @Override
    public void Atacar(jugador juga1, jugador juga2) {
        double salud=juga2.getGuerrero().getSalud()-juga1.getGuerrero().getAtaque();
        double ataque=juga2.getGuerrero().getAtaque()-(juga2.getGuerrero().getAtaque()*0.25);
        juga2.getGuerrero().setSalud(salud);
        juga2.getGuerrero().setAtaque(ataque);
    }
}
