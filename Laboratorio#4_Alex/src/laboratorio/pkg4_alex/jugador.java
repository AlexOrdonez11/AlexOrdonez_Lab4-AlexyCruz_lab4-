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
public class jugador {
    private String nombre;
    private int dinero,puntos;
    private Guerrero guerrero;

    public jugador() {
    }

    public jugador(String nombre, int dinero, int puntos, Guerrero guerrero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.puntos = puntos;
        this.guerrero = guerrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Guerrero getGuerrero() {
        return guerrero;
    }

    public void setGuerrero(Guerrero guerrero) {
        this.guerrero = guerrero;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", dinero=" + dinero + ", puntos=" + puntos + ", guerrero=" + guerrero + "{ nombre="+ guerrero.getNombre()+", poder de ataque="+ guerrero.getAtaque()+", salud="+ guerrero.getSalud()+"}}";
    }
    
}
