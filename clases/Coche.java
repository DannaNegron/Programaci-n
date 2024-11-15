/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author danna
 */
class Coche extends Vehiculo {
    protected double combustible; 
    protected double autonomiaMaxima;
    
    public Coche(double combustible, double autonomiaMaxima){
        this.combustible = combustible;
        this.autonomiaMaxima = autonomiaMaxima;
        this.kilometrosRecorridos = 0;
    }
    
    @Override
    public void mover(double distancia){
        if(combustible > 0){
            if(distancia <= calcularAutonomia()){
                kilometrosRecorridos += distancia;
                combustible -= distancia/10;
                System.out.println("El coche ha recorrido " + distancia +"km");
            } else{
                System.out.println("No hay suficiente combustible para recorrer esa distancia.");
            }
        } else{
            System.out.println("El coche no tiene combustible.");
        }
    }
    @Override
    public double calcularAutonomia(){
        return combustible * 10; 
    }
}
