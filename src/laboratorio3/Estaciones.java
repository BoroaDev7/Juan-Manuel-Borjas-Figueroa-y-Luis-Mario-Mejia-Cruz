/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;

/**
 *
 * @author famil
 */
public class Estaciones {
      private String nombreestacion;
    private int coordenada_x;
    private int coordenada_y;

    public Estaciones() {
    }

    public Estaciones(String nombreestacion, int coordenada_x, int coordenada_y) {
        this.nombreestacion = nombreestacion;
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }

    public String getNombreestacion() {
        return nombreestacion;
    }

    public void setNombreestacion(String nombreestacion) {
        this.nombreestacion = nombreestacion;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    @Override
    public String toString() {
        return "Estaciones{" + "nombreestacion=" + nombreestacion + ", coordenada_x=" + coordenada_x + ", coordenada_y=" + coordenada_y + '}';
    }
    
}
