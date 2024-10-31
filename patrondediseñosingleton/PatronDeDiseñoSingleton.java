/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrondediseñosingleton;

/**
 *
 * @author danna
 */
public class PatronDeDiseñoSingleton {
    
    public static void main(String[] args) {
        Singleton PatronDeDiseñoSingleton  = Singleton.getInstance();
        PatronDeDiseñoSingleton.mostrarNombreClase();
        PatronDeDiseñoSingleton.doSomething();
    }
}
    