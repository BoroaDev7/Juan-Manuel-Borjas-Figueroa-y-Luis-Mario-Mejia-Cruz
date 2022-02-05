
package laboratorio3;

import java.util.ArrayList;

public class Transportes {
    private String placa;
    private String color;
    private ArrayList<Transportistas> transportista=new ArrayList();
    private ArrayList <Estaciones> estacion=new ArrayList();
    private ArrayList<Alumnos> alumnotrans=new ArrayList();
    private ArrayList<Buses> buses=new ArrayList();
    
    public Transportes() {
    }

    public Transportes(String placa, String color, ArrayList<Transportistas>transportista) {
        this.placa = placa;
        this.color = color;
        this.transportista=transportista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Transportistas> getTransportista() {
        return transportista;
    }

    public void setTransportista(ArrayList<Transportistas> transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Estaciones> getEstacion() {
        return estacion;
    }

    public void setEstacion(ArrayList<Estaciones> estacion) {
        this.estacion = estacion;
    }

    public ArrayList<Alumnos> getAlumnotrans() {
        return alumnotrans;
    }

    public void setAlumnotrans(ArrayList<Alumnos> alumnotrans) {
        this.alumnotrans = alumnotrans;
    }

    public ArrayList<Buses> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Buses> buses) {
        this.buses = buses;
    }
    

    @Override
    public String toString() {
        return  "placa=" + placa + ", color=" + color + ", transportista=" + transportista + "alumnos en el transporte"+alumnotrans;
    }
   
    
            
}
