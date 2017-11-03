/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4_alex;

import javax.swing.JOptionPane;

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
        setAtaque(ataque);
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        if(ataque<=50){
            this.ataque = ataque;
        }else{
            JOptionPane.showMessageDialog(null, "Ataque no debe ser mayor que 50");
        }
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
        if(salud<=200&&salud>=100){
            this.salud = salud;
        }else{
            JOptionPane.showMessageDialog(null, "La salud no puede ser mayor a 200 o menor a 100");
        }        
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if(costo<=300){
            this.costo = costo;
        }else{
            JOptionPane.showMessageDialog(null, "costo no puede ser mayor a 300");
        }
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre:" + nombre + ", nacimiento:" + nacimiento + ", edad:" + edad + ", salud:" + salud + ", costo:" + costo + "tipo:";
    }
    public abstract void Atacar(jugador juga1,jugador juga2);
    
    
}
