/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoolife;

/**
 *
 * @author Benjamín Igor 
 * @author Emilio Contreras 
 * @author Pablo Martínez
 */
//Clase Peluche
public class Peluche extends Producto {
    
    public Peluche(String nombre, int valor) {
        super(nombre, valor);
//Getters y Setters       
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}