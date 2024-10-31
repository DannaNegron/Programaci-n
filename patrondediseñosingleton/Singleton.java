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
private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instanciado.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
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

