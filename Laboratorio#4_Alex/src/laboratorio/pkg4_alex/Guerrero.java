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
public abstract class Guerrero {
    private String nombre,nacimiento;
    private int edad;
    private double ataque,salud,costo;

    public Guerrero() {
    }

    public Guerrero(String nombre, String nacimiento, int edad, double salud, double costo, double ataque) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.salud = salud;
        this.costo = costo;
        this.ataque = ataque;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre:" + nombre + ", nacimiento:" + nacimiento + ", edad:" + edad + ", salud:" + salud + ", costo:" + costo + "tipo:";
    }
    public abstract void Atacar(jugador juga1,jugador juga2);
    
    
}
