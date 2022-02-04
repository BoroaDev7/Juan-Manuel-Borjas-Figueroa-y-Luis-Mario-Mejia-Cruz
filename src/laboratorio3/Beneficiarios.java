
package laboratorio3;

import java.util.Date;

public class Beneficiarios {
    private String nombrebene;
    private int identidad;
    private Date fechanacimiento;

    public Beneficiarios() {
    }

    public Beneficiarios(String nombrebene, int identidad, Date fechanacimiento) {
        this.nombrebene = nombrebene;
        this.identidad = identidad;
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombrebene() {
        return nombrebene;
    }

    public void setNombrebene(String nombrebene) {
        this.nombrebene = nombrebene;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Nombre Beneficiario= " + nombrebene + " Identidad=" + identidad + ", Fecha de Nacimiento=" + fechanacimiento ;
    }
    
    
    
   
}
