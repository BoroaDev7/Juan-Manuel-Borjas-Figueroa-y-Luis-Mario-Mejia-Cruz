/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;

import java.util.ArrayList;
import java.util.Date;


public class Alumnos extends Beneficiarios {
    private int idestudiante;
    private ArrayList<Clases>clasesalumno=new ArrayList<Clases>();

    public Alumnos() {
        super();
    }

    public Alumnos( String nombrebene, int identidad, Date fechanacimiento,int idestudiante) {
        super(nombrebene, identidad, fechanacimiento);
        this.idestudiante = idestudiante;
        
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public ArrayList<Clases> getClases() {
        return clasesalumno;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clasesalumno = clases;
    }

    

    @Override
    public String toString() {
        return super.toString() + "ID del Estudiante=" + idestudiante + ", Clases=" + clasesalumno ;
    }

    
    
    
    
}
