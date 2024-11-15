/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author danna
 */
class Bicicleta extends Vehiculo {
    
    public Bicicleta(){
        this.kilometrosRecorridos = 0;
    }
    
    @Override
    public void mover(double distancia){
        kilometrosRecorridos += distancia;
        System.out.println("La bicicleta he recorrido " + distancia + "km.");
    }
    
    @Override
    public double calcularAutonomia(){
        return -1;
    }
}
