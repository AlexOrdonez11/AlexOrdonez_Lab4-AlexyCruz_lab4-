/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4_alex;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Alex Ordonez
 */
public class Laboratorio4_Alex {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Guerrero> guerreros=new ArrayList();
    static ArrayList<jugador> jugadores=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op=0;
        while(op!=6){
            op=Integer.parseInt(JOptionPane.showInputDialog("1. Crear Guerreros\n"
                + "2. Eliminar Guerreros\n"
                + "3. Registro de jugadores\n"
                + "4. Iniciar Partida\n"
                + "5. Listar Jugadores\n"
                + "6. Salir"));
            switch(op){
                case 1:
                    CrearGuerreros();
                    break;
                case 2:
                    EliminarGuerreros();
                    break;
                case 3:
                    registro();;
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    
            }
        }
        
    }
    public static void EliminarGuerreros(){
        for (int x=0;x<guerreros.size();x++) {
            System.out.println(x+". "+guerreros.get(x));
        }
        System.out.println("Ingrese la pocicion del guerrero que desea eliminar");
        int pos=sc.nextInt();
        guerreros.remove(pos);
    }
    public static void CrearGuerreros(){
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del guerrero:"));
        String nacimiento=JOptionPane.showInputDialog("Ingrese el lugar de nacimiento");
        int ataque=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el poder de ataque"));
        int salud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la salud"));
        int costo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo"));
        int tipo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de guerrero\n"
                + "1.mago\n"
                + "2.elfo\n"
                + "3.dragon\n"
                + "4.arqueros\n"
                + "5.bruja"));
        switch(tipo){
            case 1:
                String magia=JOptionPane.showInputDialog("Ingrese el tipo de magia");
                String elemento=JOptionPane.showInputDialog("Ingrese el elemento favorito");
                guerreros.add( new mago( magia, elemento, nombre,  nacimiento,  edad, salud, costo, ataque));
                break;
            case 2:
                String arma=JOptionPane.showInputDialog("Ingrese el tipo de arma");
                String rango=JOptionPane.showInputDialog("Ingrese el rango militar");
                guerreros.add(new elfo( arma,  rango, nombre,  nacimiento,  edad,  salud,  costo,  ataque));
                break;
            case 3:
                String color=JOptionPane.showInputDialog("Ingrese el color");
                String raza=JOptionPane.showInputDialog("Ingrese la raza");
                guerreros.add(new dragon( color,  raza,  nombre,  nacimiento,  edad,  salud,  costo,  ataque));
                break;
            case 4:
                String material=JOptionPane.showInputDialog("Ingrese el material del arco");
                String armadura=JOptionPane.showInputDialog("Ingrese el material de la armadura");
                guerreros.add(new arqueros( material,  armadura,  nombre,  nacimiento,  edad,  salud,  costo,  ataque));
                break;
            case 5:
                String siglo=JOptionPane.showInputDialog("Ingrese el siglo de nacimiento");
                String residencia=JOptionPane.showInputDialog("Ingrese el lugar de residencia");
                guerreros.add(new bruja( siglo,  residencia, nombre,  nacimiento,  edad,  salud,  costo,  ataque));
                break;
        }
    }
    public static void registro(){
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
        int dinero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dinero disponible"));
        int puntos=0;
        JOptionPane.showMessageDialog(null, "Ingrese el guerrero en la consola");
        for (int x=0;x<guerreros.size();x++) {
            System.out.println(x+". "+guerreros.get(x));
        }
        System.out.println("Ingrese la pocicion del guerrero que desea escoger");
        int pos=sc.nextInt();
        jugadores.add(new jugador( nombre, dinero, puntos, guerreros.get(pos)));
        guerreros.remove(pos);
        
    }
    public static void IniciarPartida(){
        boolean turno=false;
        boolean juego=false;
        for (int x=0;x<jugadores.size();x++) {
            System.out.println(x+". "+jugadores.get(x));
        }
        System.out.println("Ingrese la pocicion del jugador1 que desea escoger");
        int pos=sc.nextInt();
        jugador jugador1=jugadores.get(pos);
        System.out.println("Ingrese la pocicion del jugador2 que desea escoger");
        pos=sc.nextInt();
        jugador jugador2=jugadores.get(pos);
        while(juego==false){
            if(turno==false){
                JOptionPane.showMessageDialog(null, "jugador1 salud del guerrero: "+jugador1.getGuerrero().getSalud()+"\n"
                        + "jugador2 salud del guerrero: "+jugador2.getGuerrero().getSalud());
                JOptionPane.showMessageDialog(null,"Se realizara el ataque del jugador1");
                jugador1.getGuerrero().Atacar(jugador1, jugador2);
                turno=true;
            }else{
                JOptionPane.showMessageDialog(null, "jugador1 salud del guerrero: "+jugador1.getGuerrero().getSalud()+"\n"
                        + "jugador2 salud del guerrero: "+jugador2.getGuerrero().getSalud());
                JOptionPane.showMessageDialog(null,"Se realizara el ataque del jugador1");
                jugador1.getGuerrero().Atacar(jugador1, jugador2);
                turno=true;
            }
        }
    }
    
}
