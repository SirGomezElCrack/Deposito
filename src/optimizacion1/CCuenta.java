/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizacion1;

/**
 *
 * @author SirGomez
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    private String nombre, cuenta;
    private double saldo, tipoInteres;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
    }
    
    public double estado(){
        return getSaldo();
    }
    
    public void ingresar(double ctd) throws Exception{
        if (ctd<0) {
            throw new Exception("No se puede ingresar un numero negativo");           
        }
        setSaldo(getSaldo() + ctd);
    }
    
    public void retirar(double ctd) throws Exception{
        if (ctd<=0) {
            throw new Exception("No se puede ingresar un numero negativo");
        }if (estado()<ctd) {
            throw new Exception("No hay suficiente saldo");           
        }
        setSaldo(getSaldo() - ctd);
    }
    
}
