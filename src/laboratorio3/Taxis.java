
package laboratorio3;

import java.util.ArrayList;

public class Taxis extends Transportes {
    private int capacidadmax = 4;
    private int numtaxi;

    public Taxis() {
        super();
    }

    public Taxis(String placa, String color,ArrayList<Transportistas>transportista,int capacidadmax, int numtaxi) {
        super(placa, color,transportista);
        this.capacidadmax = capacidadmax;
        this.numtaxi = numtaxi;
    }

    public int getCapacidadmax() {
        return capacidadmax;
    }

    public void setCapacidadmax(int capacidadmax) {
        this.capacidadmax = capacidadmax;
    }

    public int getNumtaxi() {
        return numtaxi;
    }

    public void setNumtaxi(int numtaxi) {
        this.numtaxi = numtaxi;
    }

    @Override
    public String toString() {
        return super.toString() + "capacidad Maxima=" + capacidadmax + ", Numero de taxi=" + numtaxi  ;
    }
    
    
    
    
    
}
