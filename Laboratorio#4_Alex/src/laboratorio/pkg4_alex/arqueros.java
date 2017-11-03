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
public class arqueros extends Guerrero{
    private String material,armadura;

    public arqueros() {
        super();
    }

    public arqueros(String material, String armadura, String nombre, String nacimiento, int edad, double salud, double costo, double ataque) {
        super(nombre, nacimiento, edad, salud, costo, ataque);
        this.material = material;
        this.armadura = armadura;
    }

    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    @Override
    public String toString() {
        return super.toString()+" arqueros{" + "material=" + material + ", armadura=" + armadura + "}}";
    }
    @Override
    public void Atacar(jugador juga1, jugador juga2) {
        double salud=juga2.getGuerrero().getSalud()-juga1.getGuerrero().getAtaque();
        juga1.getGuerrero().setSalud(juga1.getGuerrero().getSalud()+10);
        juga2.getGuerrero().setSalud(salud);
    }
    
}
