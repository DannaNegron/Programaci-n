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
    private static PatronDeDiseñoSingleton instance;

    private PatronDeDiseñoSingleton() {
        System.out.println("Singleton instanciado.");
    }

    public static PatronDeDiseñoSingleton getInstance() {
        if (instance == null) {
            instance = new PatronDeDiseñoSingleton();
        }
        
        return instance;
    }
    
    public void doSomething() {
        System.out.println("Se realiza algo.");
    }
   
    public void mostrarNombreClase() {
        System.out.println("Clase: " + this.getClass().getSimpleName());
    }
}
