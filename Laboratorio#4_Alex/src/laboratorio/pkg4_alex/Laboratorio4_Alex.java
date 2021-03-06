/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4_alex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Alex Ordonez
 */
public class Laboratorio4_Alex {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Guerrero> guerreros = new ArrayList();
    static ArrayList<jugador> jugadores = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws exception {
        int op = 0;
        while (op != 6) {
            String u=JOptionPane.showInputDialog("1. Crear Guerreros\n"
                    + "2. Eliminar Guerreros\n"
                    + "3. Registro de jugadores\n"
                    + "4. Iniciar Partida\n"
                    + "5. Listar Jugadores\n"
                    + "6. Salir");
            while(enteros(u)==false){
                u=JOptionPane.showInputDialog("1. Crear Guerreros\n"
                    + "2. Eliminar Guerreros\n"
                    + "3. Registro de jugadores\n"
                    + "4. Iniciar Partida\n"
                    + "5. Listar Jugadores\n"
                    + "6. Salir");
            }
            op = Integer.parseInt(u);
            switch (op) {
                case 1:
                    CrearGuerreros();
                    break;
                case 2:
                    EliminarGuerreros();
                    break;
                case 3:
                    registro();
                    break;
                case 4:
                    IniciarPartida();
                    break;
                case 5:
                    for (int x = 0; x < jugadores.size(); x++) {
                        System.out.println(x + ". " + jugadores.get(x));
                    }
                    break;
                default:

            }
        }

    }

    public static void EliminarGuerreros() {
        for (int x = 0; x < guerreros.size(); x++) {
            System.out.println(x + ". " + guerreros.get(x));
        }
        try{
            System.out.println("Ingrese la pocicion del guerrero que desea eliminar");
            int pos = sc.nextInt();
            guerreros.remove(pos);
        }catch(InputMismatchException e){
            System.out.println("no ingreso un valor valido");
        }
            
        
    }

    public static void CrearGuerreros() throws exception {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del guerrero:"));
        String nacimiento = JOptionPane.showInputDialog("Ingrese el lugar de nacimiento");
        String ata=JOptionPane.showInputDialog("Ingrese el poder de ataque");
        while(enteros(ata)==false){
            ata=JOptionPane.showInputDialog("Ingrese el poder de ataque");
        }
        double ataque = Double.parseDouble(ata);
        String sal=JOptionPane.showInputDialog("Ingrese la salud");
        while(enteros(sal)==false){
            sal=JOptionPane.showInputDialog("Ingrese la salud");
        }
        double salud = Double.parseDouble(sal);
        String cos=JOptionPane.showInputDialog("Ingrese el costo");
        while(enteros(cos)==false){
            cos=JOptionPane.showInputDialog("Ingrese el costo");
        }
        double costo = Double.parseDouble(cos);
        
        String h=JOptionPane.showInputDialog("Ingrese el tipo de guerrero\n"
                + "1.mago\n"
                + "2.elfo\n"
                + "3.dragon\n"
                + "4.arqueros\n"
                + "5.bruja");
        while(enteros(h)==false){
            h=JOptionPane.showInputDialog("Ingrese el tipo de guerrero\n"
                + "1.mago\n"
                + "2.elfo\n"
                + "3.dragon\n"
                + "4.arqueros\n"
                + "5.bruja");
        }
        int tipo = Integer.parseInt(h);
        switch (tipo) {
            case 1:
                String magia = JOptionPane.showInputDialog("Ingrese el tipo de magia");
                String elemento = JOptionPane.showInputDialog("Ingrese el elemento favorito");
                guerreros.add(new mago(magia, elemento, nombre, nacimiento, edad, salud, costo, ataque));
                break;
            case 2:
                String arma = JOptionPane.showInputDialog("Ingrese el tipo de arma");
                String rango = JOptionPane.showInputDialog("Ingrese el rango militar");
                guerreros.add(new elfo(arma, rango, nombre, nacimiento, edad, salud, costo, ataque));
                break;
            case 3:
                String color = JOptionPane.showInputDialog("Ingrese el color");
                String raza = JOptionPane.showInputDialog("Ingrese la raza");
                guerreros.add(new dragon(color, raza, nombre, nacimiento, edad, salud, costo, ataque));
                break;
            case 4:
                String material = JOptionPane.showInputDialog("Ingrese el material del arco");
                String armadura = JOptionPane.showInputDialog("Ingrese el material de la armadura");
                guerreros.add(new arqueros(material, armadura, nombre, nacimiento, edad, salud, costo, ataque));
                break;
            case 5:
                String siglo = JOptionPane.showInputDialog("Ingrese el siglo de nacimiento");
                String residencia = JOptionPane.showInputDialog("Ingrese el lugar de residencia");
                guerreros.add(new bruja(siglo, residencia, nombre, nacimiento, edad, salud, costo, ataque));
                break;
        }
    }

    public static void registro() throws exception {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String di=JOptionPane.showInputDialog("Ingrese el dinero disponible");
        while(enteros(di)==false){
            di=JOptionPane.showInputDialog("Ingrese el dinero disponible");
        }
        int dinero = Integer.parseInt(di);
        int puntos = 0;
        JOptionPane.showMessageDialog(null, "Ingrese el guerrero en la consola");
        for (int x = 0; x < guerreros.size(); x++) {
            System.out.println(x + ". " + guerreros.get(x));
        }
        System.out.println("Ingrese la pocicion del guerrero que desea escoger");
        int pos = sc.nextInt();
        jugadores.add(new jugador(nombre, dinero, puntos, guerreros.get(pos)));
        guerreros.remove(pos);

    }

    public static void IniciarPartida() throws exception {
        boolean turno = false;
        boolean juego = false;
        for (int x = 0; x < jugadores.size(); x++) {
            System.out.println(x + ". " + jugadores.get(x));
        }
            System.out.println("Ingrese la pocicion del jugador1 que desea escoger");
            String po = sc.next();
            while(enteros(po)==false){
                po=JOptionPane.showInputDialog("Ingrese la posicion");
            }
            int pos=Integer.parseInt(po);
            jugador jugador1 = jugadores.get(pos);
            System.out.println("Ingrese la pocicion del jugador2 que desea escoger");
            po = sc.next();
            while(enteros(po)==false){
                po=JOptionPane.showInputDialog("Ingrese la posicion");
            }
            pos=Integer.parseInt(po);
            jugador jugador2 = jugadores.get(pos);
        while (juego == false) {
            if (turno == false) {
                JOptionPane.showMessageDialog(null, "jugador1 salud del guerrero: " + jugador1.getGuerrero().getSalud() + "\n"
                        + "jugador2 salud del guerrero: " + jugador2.getGuerrero().getSalud());
                JOptionPane.showMessageDialog(null, "Se realizara el ataque del jugador1");
                jugador1.getGuerrero().Atacar(jugador1, jugador2);
                if (jugador2.getGuerrero().getSalud() <= 0) {
                    jugador2.getGuerrero().setSalud(0);
                    juego = true;
                } else {
                    turno = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "jugador2 salud del guerrero: " + jugador2.getGuerrero().getSalud() + "\n"
                        + "jugador1 salud del guerrero: " + jugador1.getGuerrero().getSalud());
                JOptionPane.showMessageDialog(null, "Se realizara el ataque del jugador2");
                jugador1.getGuerrero().Atacar(jugador2, jugador1);
                if (jugador1.getGuerrero().getSalud() <= 0) {
                    jugador1.getGuerrero().setSalud(0);
                    juego = true;
                } else {
                    turno = false;
                }

            }
        }
        if (turno == false) {
            JOptionPane.showMessageDialog(null, "jugador1 salud del guerrero: " + jugador1.getGuerrero().getSalud() + "\n"
                    + "jugador2 salud del guerrero: " + jugador2.getGuerrero().getSalud() + "\n"
                    + "El ganador es el jugador: " + jugador1.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "jugador2 salud del guerrero: " + jugador2.getGuerrero().getSalud() + "\n"
                    + "jugador2 salud del guerrero: " + jugador1.getGuerrero().getSalud() + "\n"
                    + "El ganador es el jugador: " + jugador2.getNombre());
        }
    }
    public static boolean enteros(String x)throws exception{
        boolean o=true;
        try{
            if(Character.isDigit(x.charAt(0))){
                
            }else{
                o=false;
                throw (new exception("Ha ingresado un numero"));
            }
            
        }catch(exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return o;
    }

}
