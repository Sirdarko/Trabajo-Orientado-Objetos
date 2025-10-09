/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


 
public class IdiomaPais {

    // 🔹 Atributos
    private String nombre;      // Nombre de la ciudad
    private String pais;        // País al que pertenece
    private String distrito;    // Distrito o región
    private int poblacion;      // Cantidad de habitantes

    // 🔹 Constructor vacío
    public IdiomaPais() {
    }

    // 🔹 Constructor con parámetros
    public IdiomaPais(String nombre, String pais, String distrito, int poblacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.distrito = distrito;
        this.poblacion = poblacion;
    }

    // 🔹 Métodos Getters y Setters
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

    // 🔹 Método para mostrar los datos como texto
    @Override
    public String toString() {
        return "Ciudad: " + nombre + 
               ", País: " + pais + 
               ", Distrito: " + distrito + 
               ", Población: " + poblacion;
    }
}

