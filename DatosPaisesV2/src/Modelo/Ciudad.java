/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Angel
 */
public class Ciudad {
    package Modelo;

/**
 * Clase Ciudad
 * Almacena información de las ciudades de cada país.
 */
}
public class Ciudad {

    // 🔹 Atributos
    private String nombre;
    private String pais;
    private String distrito;
    private int poblacion;

    // 🔹 Constructor vacío
    public Ciudad() {
    }

    // 🔹 Constructor con parámetros
    public Ciudad(String nombre, String pais, String distrito, int poblacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.distrito = distrito;
        this.poblacion = poblacion;
    }

    // 🔹 Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    // 🔹 Método opcional: muestra info de la ciudad como texto
    @Override
    public String toString() {
        return nombre + " (" + pais + "), Distrito: " + distrito + ", Población: " + poblacion;
    }
}


