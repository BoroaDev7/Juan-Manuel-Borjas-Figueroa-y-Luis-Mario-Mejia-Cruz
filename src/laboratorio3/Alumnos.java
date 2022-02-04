/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;

import java.util.Date;


public class Alumnos extends Beneficiarios {
    private int idestudiante;
    private Clases clases;

    public Alumnos() {
        super();
    }

    public Alumnos(int idestudiante, Clases clases, String nombrebene, int identidad, Date fechanacimiento) {
        super(nombrebene, identidad, fechanacimiento);
        this.idestudiante = idestudiante;
        this.clases = clases;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Clases getClases() {
        return clases;
    }

    public void setClases(Clases clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return super.toString() + "ID del Estudiante=" + idestudiante + ", Clases=" + clases ;
    }

    
    
    
    
}
