
package laboratorio3;


public class Clases {
    
    private String nombredeclase;
    private String codigodeclase;

    public Clases() {
    }

    public Clases(String nombredeclase, String codigodeclase) {
        this.nombredeclase = nombredeclase;
        this.codigodeclase = codigodeclase;
    }

    public String getNombredeclase() {
        return nombredeclase;
    }

    public void setNombredeclase(String nombredeclase) {
        this.nombredeclase = nombredeclase;
    }

    public String getCodigodeclase() {
        return codigodeclase;
    }

    public void setCodigodeclase(String codigodeclase) {
        this.codigodeclase = codigodeclase;
    }

    @Override
    public String toString() {
        return "Nombre de la Clase = " + nombredeclase + " Coodigo de Clase = " + codigodeclase ;
    }
    
            
}
