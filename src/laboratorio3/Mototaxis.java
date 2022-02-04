
package laboratorio3;

import java.util.ArrayList;

public class Mototaxis extends Transportes {
    private int maxcap = 2;

    public Mototaxis() {
        super();
    }

    public Mototaxis(String placa, String color,ArrayList<Transportistas>transportista,int maxcap) {
       super(placa, color,transportista);
        this.maxcap = maxcap;
    }

    public int getMaxcap() {
        return maxcap;
    }

    public void setMaxcap(int maxcap) {
        this.maxcap = maxcap;
    }

    @Override
    public String toString() {
        return super.toString() + "maxcap=" + maxcap ;
    }

    
}
