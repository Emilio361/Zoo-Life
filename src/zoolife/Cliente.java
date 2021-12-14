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
// Variables cliente
public class Cliente {

    private String nombre;
    private String correo;
    private int edad;
    private int costo;
//Constructor

    public Cliente(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.costo = precio(edad);
    }

    //Método precio
    public int precio(int edad) {
        if (edad < 6) {
            costo = 0;
        }
        if (6 <= edad && edad < 15) {
            costo = 7500;
        }
        if (15 <= edad && edad < 60) {
            costo = 9500;
        }
        if (edad >= 60) {
            costo = 4500;
        }
        return costo;

//Getter y Setters
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
//To String

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", correo=" + correo + ", edad=" + edad + ", costo=" + costo + '}';
    }

}
