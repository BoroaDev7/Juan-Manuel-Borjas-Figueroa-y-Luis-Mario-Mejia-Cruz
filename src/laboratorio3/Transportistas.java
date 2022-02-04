/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio3;

import java.util.Date;


public class Transportistas extends Beneficiarios {
    private int aniosexperiencia;
    private String apodo;

    public Transportistas() {
        super();
    }
    
    public Transportistas(int aniosexperiencia, String apodo, String nombrebene, int identidad, Date fechanacimiento) {
        super(nombrebene, identidad, fechanacimiento);
        this.aniosexperiencia = aniosexperiencia;
        this.apodo = apodo;
    }

    public int getAniosexperiencia() {
        return aniosexperiencia;
    }

    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return super.toString() + "Años de Experiencia=" + aniosexperiencia + ", Apodo=" + apodo ;
    }
    
    
    
    
    
    
}
