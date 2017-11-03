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
public class bruja extends Guerrero{
    private String siglo,residencia;

    public bruja() {
        super();
    }

    public bruja(String siglo, String residencia, String nombre, String nacimiento, int edad, double salud, double costo, double ataque) {
        super(nombre, nacimiento, edad, salud, costo, ataque);
        this.siglo = siglo;
        this.residencia = residencia;
    }

    

    public String getSiglo() {
        return siglo;
    }

    public void setSiglo(String siglo) {
        this.siglo = siglo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return super.toString()+" bruja{" + "siglo=" + siglo + ", residencia=" + residencia + "}}";
    }
    @Override
    public void Atacar(jugador juga1, jugador juga2) {
        double salud=juga2.getGuerrero().getSalud()-juga2.getGuerrero().getAtaque();
        juga2.getGuerrero().setAtaque(juga2.getGuerrero().getAtaque()+50);
        juga2.getGuerrero().setSalud(salud);
    }
}
