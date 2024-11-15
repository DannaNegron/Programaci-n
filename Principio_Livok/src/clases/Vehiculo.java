/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author danna
 */

abstract class Vehiculo {
    protected double kilometrosRecorridos;
    
    public abstract void mover(double distancia);
    
    public abstract double calcularAutonomia();
}
