/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondediseñosingleton;

/**
 *
 * @author danna
 */
public class Singleton {
    public static void main(String[] args) {
        PatronDeDiseñoSingleton singleton = PatronDeDiseñoSingleton.getInstance();
        singleton.mostrarNombreClase();
        singleton.doSomething();
    }
}
