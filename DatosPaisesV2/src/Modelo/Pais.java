package Modelo;

import java.util.ArrayList;

public class Pais {

    protected int codigo;
    protected String nombrePais;
    protected String continente;
    protected int poblacion;

    // 🔹 Nuevos atributos
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Idioma> idiomas;

    public Pais() {
        ciudades = new ArrayList<>();
        idiomas = new ArrayList<>();
    }

    public Pais(int codigo, String nombrePais, String continente, int poblacion) {
        this.codigo = codigo;
        this.nombrePais = nombrePais;
        this.continente = continente;
        this.poblacion = poblacion;
        ciudades = new ArrayList<>();
        idiomas = new ArrayList<>();
    }

    // 🔹 Getters y Setters originales
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombrePais() { return nombrePais; }
    public void setNombrePais(String nombrePais) { this.nombrePais = nombrePais; }

    public String getContinente() { return continente; }
    public void setContinente(String continente) { this.continente = continente; }

    public int getPoblacion() { return poblacion; }
    public void setPoblacion(int poblacion) { this.poblacion = poblacion; }

    // 🔹 Nuevos métodos para idiomas
    public ArrayList<Idioma> getIdiomas() { return idiomas; }
    public void setIdiomas(ArrayList<Idioma> idiomas) { this.idiomas = idiomas; }
    public void agregarIdioma(Idioma idioma) { idiomas.add(idioma); }

    // 🔹 Nuevos métodos para ciudades
    public ArrayList<Ciudad> getCiudades() { return ciudades; }
    public void setCiudades(ArrayList<Ciudad> ciudades) { this.ciudades = ciudades; }
    public void agregarCiudad(Ciudad ciudad) { ciudades.add(ciudad); }
}
