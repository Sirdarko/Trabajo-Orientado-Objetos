/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 * Clase Idioma
 * Almacena el idioma que se habla en un país.
 */
public class IdiomaPais {

    //  Atributos
    private String idioma;          // Nombre del idioma
    private boolean esOficial;      // Indica si el idioma es oficial o no
    private double porcentaje;      // Porcentaje de la población que habla el idioma

    //  Constructor vacío
    public IdiomaPais() {
    }

    //  Constructor con parámetros
    public IdiomaPais(String idioma, boolean esOficial, double porcentaje) {
        this.idioma = idioma;
        this.esOficial = esOficial;
        this.porcentaje = porcentaje;
    }

    //  Métodos Getters y Setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isEsOficial() {
        return esOficial;
    }

    public void setEsOficial(boolean esOficial) {
         this.esOficial = esOficial;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    //  Método para mostrar información del idioma
    @Override
    public String toString() {
        String oficial = esOficial ? "Oficial" : "No oficial";
        return idioma + " (" + oficial + ", " + porcentaje + "% de la población)";
    }
}
