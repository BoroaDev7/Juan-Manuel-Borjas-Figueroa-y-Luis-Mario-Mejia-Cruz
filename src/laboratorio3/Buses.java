/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;

import java.util.ArrayList;

public class Buses extends Transportes{
    private ArrayList<Alumnos> alumnos=new ArrayList<Alumnos>();
    private int numsillasbus;
    private int capacperdepie;
    private int capmax = numsillasbus + capacperdepie;

    public Buses() {
        super();
    }

    public Buses(int numsillasbus, int capacperdepie, String placa, String color, ArrayList<Transportistas> transportista) {
        super(placa, color, transportista);
        this.numsillasbus = numsillasbus;
        this.capacperdepie = capacperdepie;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public int getNumsillasbus() {
        return numsillasbus;
    }

    public void setNumsillasbus(int numsillasbus) {
        this.numsillasbus = numsillasbus;
    }

    public int getCapacperdepie() {
        return capacperdepie;
    }

    public void setCapacperdepie(int capacperdepie) {
        this.capacperdepie = capacperdepie;
    }

    public int getCapmax() {
        return capmax;
    }

    public void setCapmax(int capmax) {
        this.capmax = capmax;
    }

    @Override
    public String toString() {
        return super.toString() +"alumnos=" + alumnos + ", numsillasbus=" + numsillasbus + ", capacperdepie=" + capacperdepie + ", capmax=" + capmax ;
    }

   
    
    
    
}
