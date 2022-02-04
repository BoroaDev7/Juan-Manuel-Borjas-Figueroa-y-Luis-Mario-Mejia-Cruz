
package laboratorio3;

import java.util.ArrayList;


public class Rapiditos extends Transportes {
    private int numsillas;
    private ArrayList<Alumnos> alumnos=new ArrayList();
    private int capacidadmax =numsillas;

    public Rapiditos() {
        super();
    }

    public Rapiditos(String placa, String color,ArrayList<Transportistas>transportista,int numsillas,ArrayList<Alumnos>alumnos,int capacidadmax) {
        super(placa, color,transportista);
        this.numsillas=numsillas;
        this.capacidadmax=capacidadmax;
        this.alumnos=alumnos;
    }

    public int getNumsillas() {
        return numsillas;
    }

    public void setNumsillas(int numsillas) {
        this.numsillas = numsillas;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) { 
        this.alumnos = alumnos;
    }

    public int getCapacidadmax() {
        return capacidadmax;
    }

    public void setCapacidadmax(int capacidadmax) {
        this.capacidadmax = capacidadmax;
    }

    @Override
    public String toString() {
        return super.toString() + "Numero de sillas=" + numsillas + ", Alumnos=" + alumnos + ", Capacidad Max=" + capacidadmax ;
    }
    
    
    
    
    
    
}
